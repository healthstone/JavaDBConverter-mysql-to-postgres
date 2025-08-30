package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcAuctionHouse;
import com.winteremu.entity.mysql.dbc.MysqlDbcBannedAddons;
import com.winteremu.entity.postgres.PgDbcAuctionHouse;
import com.winteremu.entity.postgres.PgDbcBannedAddons;
import com.winteremu.framework.basetests.BaseTest;
import com.winteremu.framework.extensions.DatabaseExtension;
import io.qameta.allure.Description;
import org.hibernate.query.Query;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Tag("all-table")
@DisplayName("Заполнение данных таблиц из MySQL в PostgresSQL")
@ExtendWith(DatabaseExtension.class)
public class TableDbcBannedAddonsTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcBannedAddonsTest");

    @Test
    @Tag("dbc_bannedaddons")
    @DisplayName("dbc_bannedaddons.sql")
    @Description("Перелив данных для dbc_bannedaddons.sql")
    public void convertTableDbcBannedAddons() {
        Query<MysqlDbcBannedAddons> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcBannedAddons", MysqlDbcBannedAddons.class);
        List<MysqlDbcBannedAddons> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcBannedAddons mysql = mysqlTable.get(i);
                PgDbcBannedAddons postgres = new PgDbcBannedAddons();

                postgres.setId(mysql.getId());
                postgres.setNameMd51(mysql.getNameMd51());
                postgres.setNameMd52(mysql.getNameMd52());
                postgres.setNameMd53(mysql.getNameMd53());
                postgres.setNameMd54(mysql.getNameMd54());

                postgres.setVersionMd51(mysql.getVersionMd51());
                postgres.setVersionMd52(mysql.getVersionMd52());
                postgres.setVersionMd53(mysql.getVersionMd53());
                postgres.setVersionMd54(mysql.getVersionMd54());

                postgres.setLastModified(mysql.getLastModified());
                postgres.setFlags(mysql.getFlags());


                // Сохраняем в PostgreSQL
                postgresDatabaseSession.persist(postgres);

                batchCounter++;
                counter--;

                if (batchCounter.equals(batchSize) || counter.equals(0)) {
                    batchCounter = 0;
                    postgresDatabaseSession.beginTransaction();
                    postgresDatabaseSession.getTransaction().commit();

                    logger.info("remains {} rows", counter);
                    postgresDatabaseSession.clear();
                }
            }

            logger.info("postgresTable successfully handled");
        } catch (Exception ex) {
            logger.warn(ex.getMessage());
            postgresDatabaseSession.getTransaction().rollback();
        }
    }
}
