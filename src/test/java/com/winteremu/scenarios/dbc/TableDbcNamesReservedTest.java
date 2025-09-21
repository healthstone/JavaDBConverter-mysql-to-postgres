package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcNamesProfanity;
import com.winteremu.entity.mysql.dbc.MysqlDbcNamesReserved;
import com.winteremu.entity.postgres.PgDbcNamesProfanity;
import com.winteremu.entity.postgres.PgDbcNamesReserved;
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
public class TableDbcNamesReservedTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcMapDifficultyTest");

    @Test
    @Tag("dbc_namesreserved")
    @DisplayName("dbc_namesreserved.sql")
    @Description("Перелив данных для dbc_namesreserved.sql")
    public void convertTableDbcNamesReserved() {
        Query<MysqlDbcNamesReserved> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcNamesReserved", MysqlDbcNamesReserved.class);
        List<MysqlDbcNamesReserved> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcNamesReserved mysql = mysqlTable.get(i);
                PgDbcNamesReserved pg = new PgDbcNamesReserved();

                pg.setId(mysql.getId());
                pg.setName(mysql.getName());
                pg.setLanguage(mysql.getLanguage());

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
