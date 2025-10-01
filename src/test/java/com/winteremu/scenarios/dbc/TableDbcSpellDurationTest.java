package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSpellDifficulty;
import com.winteremu.entity.mysql.dbc.MysqlDbcSpellDuration;
import com.winteremu.entity.postgres.PgDbcSpellDifficulty;
import com.winteremu.entity.postgres.PgDbcSpellDuration;
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
public class TableDbcSpellDurationTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSpellDurationTest");

    @Test
    @Tag("dbc_spellduration")
    @DisplayName("dbc_spellduration.sql")
    @Description("Перелив данных для dbc_spellduration.sql")
    public void convertTableDbcSpellDuration() {
        Query<MysqlDbcSpellDuration> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcSpellDuration", MysqlDbcSpellDuration.class);
        List<MysqlDbcSpellDuration> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSpellDuration mysql = mysqlTable.get(i);
                PgDbcSpellDuration pg = new PgDbcSpellDuration();

                pg.setId(mysql.getId());
                pg.setDuration(mysql.getDuration());
                pg.setDurationPerLevel(mysql.getDurationPerLevel());
                pg.setMaxDuration(mysql.getMaxDuration());

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
