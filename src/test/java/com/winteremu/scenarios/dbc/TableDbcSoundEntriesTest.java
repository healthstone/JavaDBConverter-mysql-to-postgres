package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSkillRaceClassInfo;
import com.winteremu.entity.mysql.dbc.MysqlDbcSoundEntries;
import com.winteremu.entity.postgres.PgDbcSkillRaceClassInfo;
import com.winteremu.entity.postgres.PgDbcSoundEntries;
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
public class TableDbcSoundEntriesTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSoundEntriesTest");

    @Test
    @Tag("dbc_soundentries")
    @DisplayName("dbc_soundentries.sql")
    @Description("Перелив данных для dbc_soundentries.sql")
    public void convertTableDbcSoundEntries() {
        Query<MysqlDbcSoundEntries> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcSoundEntries", MysqlDbcSoundEntries.class);
        List<MysqlDbcSoundEntries> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSoundEntries mysql = mysqlTable.get(i);
                PgDbcSoundEntries pg = new PgDbcSoundEntries();

                pg.setId(mysql.getId());
                pg.setSoundType(mysql.getSoundType());
                pg.setName(mysql.getName());
                pg.setFile1(mysql.getFile1());
                pg.setFile2(mysql.getFile2());
                pg.setFile3(mysql.getFile3());
                pg.setFile4(mysql.getFile4());
                pg.setFile5(mysql.getFile5());
                pg.setFile6(mysql.getFile6());
                pg.setFile7(mysql.getFile7());
                pg.setFile8(mysql.getFile8());
                pg.setFile9(mysql.getFile9());
                pg.setFile10(mysql.getFile10());
                pg.setFreq1(mysql.getFreq1());
                pg.setFreq2(mysql.getFreq2());
                pg.setFreq3(mysql.getFreq3());
                pg.setFreq4(mysql.getFreq4());
                pg.setFreq5(mysql.getFreq5());
                pg.setFreq6(mysql.getFreq6());
                pg.setFreq7(mysql.getFreq7());
                pg.setFreq8(mysql.getFreq8());
                pg.setFreq9(mysql.getFreq9());
                pg.setFreq10(mysql.getFreq10());
                pg.setDirectoryBase(mysql.getDirectoryBase());
                pg.setVolumeFloat(mysql.getVolumeFloat());
                pg.setFlags(mysql.getFlags());
                pg.setMinDistance(mysql.getMinDistance());
                pg.setDistanceCutoff(mysql.getDistanceCutoff());
                pg.setEaxDef(mysql.getEaxDef());
                pg.setSoundEntriesAdvancedId(mysql.getSoundEntriesAdvancedId());

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
