package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcPvpDifficulty;
import com.winteremu.entity.postgres.PgDbcPvPDifficulty;
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
public class TableDbcPvPDifficultyTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcPvPDifficultyTest");

    @Test
    @Tag("dbc_pvpdifficulty")
    @DisplayName("dbc_pvpdifficulty.sql")
    @Description("Перелив данных для dbc_pvpdifficulty.sql")
    public void convertTableDbcPvPDifficulty() {
        Query<MysqlDbcPvpDifficulty> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcPvpDifficulty", MysqlDbcPvpDifficulty.class);
        List<MysqlDbcPvpDifficulty> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcPvpDifficulty mysql = mysqlTable.get(i);
                PgDbcPvPDifficulty pg = new PgDbcPvPDifficulty();

                pg.setId(mysql.getId());
                pg.setMapId(mysql.getMapId());
                pg.setRangeIndex(mysql.getRangeIndex());
                pg.setMinLevel(mysql.getMinLevel());
                pg.setMaxLevel(mysql.getMaxLevel());
                pg.setDifficulty(mysql.getDifficulty());

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
