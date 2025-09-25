package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSoundEntries;
import com.winteremu.entity.mysql.dbc.MysqlDbcSpellCastTimes;
import com.winteremu.entity.postgres.PgDbcSoundEntries;
import com.winteremu.entity.postgres.PgDbcSpellCastTimes;
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
public class TableDbcSpellCastTimesTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSpellCastTimesTest");

    @Test
    @Tag("dbc_spellcasttimes")
    @DisplayName("dbc_spellcasttimes.sql")
    @Description("Перелив данных для dbc_spellcasttimes.sql")
    public void convertTableDbcSpellCastTimes() {
        Query<MysqlDbcSpellCastTimes> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcSpellCastTimes", MysqlDbcSpellCastTimes.class);
        List<MysqlDbcSpellCastTimes> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSpellCastTimes mysql = mysqlTable.get(i);
                PgDbcSpellCastTimes pg = new PgDbcSpellCastTimes();

                pg.setId(mysql.getId());
                pg.setBase(mysql.getBase());
                pg.setPerLevel(mysql.getPerLevel());
                pg.setMinimum(mysql.getMinimum());

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
