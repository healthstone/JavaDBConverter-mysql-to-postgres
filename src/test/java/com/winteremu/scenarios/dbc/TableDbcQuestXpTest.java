package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcPvpDifficulty;
import com.winteremu.entity.mysql.dbc.MysqlDbcQuestXp;
import com.winteremu.entity.postgres.PgDbcPvPDifficulty;
import com.winteremu.entity.postgres.PgDbcQuestXp;
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
public class TableDbcQuestXpTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcQuestXpTest");

    @Test
    @Tag("dbc_questxp")
    @DisplayName("dbc_questxp.sql")
    @Description("Перелив данных для dbc_questxp.sql")
    public void convertTableDbcQuestXp() {
        Query<MysqlDbcQuestXp> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcQuestXp", MysqlDbcQuestXp.class);
        List<MysqlDbcQuestXp> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcQuestXp mysql = mysqlTable.get(i);
                PgDbcQuestXp pg = new PgDbcQuestXp();

                pg.setId(mysql.getId());
                pg.setDifficulty1(mysql.getDifficulty1());
                pg.setDifficulty2(mysql.getDifficulty2());
                pg.setDifficulty3(mysql.getDifficulty3());
                pg.setDifficulty4(mysql.getDifficulty4());
                pg.setDifficulty5(mysql.getDifficulty5());
                pg.setDifficulty6(mysql.getDifficulty6());
                pg.setDifficulty7(mysql.getDifficulty7());
                pg.setDifficulty8(mysql.getDifficulty8());
                pg.setDifficulty9(mysql.getDifficulty9());
                pg.setDifficulty10(mysql.getDifficulty10());

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
