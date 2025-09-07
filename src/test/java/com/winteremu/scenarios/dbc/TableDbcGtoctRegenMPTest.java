package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcGtoctRegenHP;
import com.winteremu.entity.mysql.dbc.MysqlDbcGtoctRegenMP;
import com.winteremu.entity.postgres.PgDbcGtoctRegenHP;
import com.winteremu.entity.postgres.PgDbcGtoctRegenMP;
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
public class TableDbcGtoctRegenMPTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcGtoctRegenMPTest");

    @Test
    @Tag("dbc_gtoctregenmp")
    @DisplayName("dbc_gtoctregenmp.sql")
    @Description("Перелив данных для dbc_gtoctregenmp.sql")
    public void convertTableDbcGtoctRegenMP() {
        Query<MysqlDbcGtoctRegenMP> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcGtoctRegenMP", MysqlDbcGtoctRegenMP.class);
        List<MysqlDbcGtoctRegenMP> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcGtoctRegenMP mysql = mysqlTable.get(i);
                PgDbcGtoctRegenMP pg = new PgDbcGtoctRegenMP();

                pg.setId(mysql.getId());
                pg.setData(mysql.getData());

                postgresDatabaseSession.persist(pg);

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
