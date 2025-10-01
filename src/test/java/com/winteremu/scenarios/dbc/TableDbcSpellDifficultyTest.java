package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSpellCategory;
import com.winteremu.entity.mysql.dbc.MysqlDbcSpellDifficulty;
import com.winteremu.entity.postgres.PgDbcSpellCategory;
import com.winteremu.entity.postgres.PgDbcSpellDifficulty;
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
public class TableDbcSpellDifficultyTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSpellDifficultyTest");

    @Test
    @Tag("dbc_spelldifficulty")
    @DisplayName("dbc_spelldifficulty.sql")
    @Description("Перелив данных для dbc_spelldifficulty.sql")
    public void convertTableDbcSpellCategory() {
        Query<MysqlDbcSpellDifficulty> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcSpellDifficulty", MysqlDbcSpellDifficulty.class);
        List<MysqlDbcSpellDifficulty> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSpellDifficulty mysql = mysqlTable.get(i);
                PgDbcSpellDifficulty pg = new PgDbcSpellDifficulty();

                pg.setId(mysql.getId());
                pg.setDifficultySpellId1(mysql.getDifficultySpellId1());
                pg.setDifficultySpellId2(mysql.getDifficultySpellId2());
                pg.setDifficultySpellId3(mysql.getDifficultySpellId3());
                pg.setDifficultySpellId4(mysql.getDifficultySpellId4());

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
