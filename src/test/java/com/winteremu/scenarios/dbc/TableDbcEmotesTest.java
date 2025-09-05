package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcDurabilityCosts;
import com.winteremu.entity.mysql.dbc.MysqlDbcEmotes;
import com.winteremu.entity.postgres.PgDbcDurabilityCosts;
import com.winteremu.entity.postgres.PgDbcEmotes;
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
public class TableDbcEmotesTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcEmotesTest");

    @Test
    @Tag("dbc_emotes")
    @DisplayName("dbc_emotes.sql")
    @Description("Перелив данных для dbc_emotes.sql")
    public void convertTableDbcEmotes() {
        Query<MysqlDbcEmotes> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcEmotes", MysqlDbcEmotes.class);
        List<MysqlDbcEmotes> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcEmotes mysql = mysqlTable.get(i);
                PgDbcEmotes postgres = new PgDbcEmotes();

                postgres.setId(mysql.getId());
                postgres.setEmoteSlashCommand(mysql.getEmoteSlashCommand());
                postgres.setAnimId(mysql.getAnimId());
                postgres.setEmoteFlags(mysql.getEmoteFlags());
                postgres.setEmoteSpecProc(mysql.getEmoteSpecProc());
                postgres.setEmoteSpecProcParam(mysql.getEmoteSpecProcParam());
                postgres.setEventSoundId(mysql.getEventSoundId());

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
