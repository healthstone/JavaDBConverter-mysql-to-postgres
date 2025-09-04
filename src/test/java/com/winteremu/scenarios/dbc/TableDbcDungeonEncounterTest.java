package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcCreatureSpellData;
import com.winteremu.entity.mysql.dbc.MysqlDbcDungeonEncounter;
import com.winteremu.entity.postgres.PgDbcCreatureSpellData;
import com.winteremu.entity.postgres.PgDbcDungeonEncounter;
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
public class TableDbcDungeonEncounterTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcCreatureSpellDataTest");

    @Test
    @Tag("dbc_dungeonencounter")
    @DisplayName("dbc_dungeonencounter.sql")
    @Description("Перелив данных для dbc_dungeonencounter.sql")
    public void convertTableDbcDungeonEncounter() {
        Query<MysqlDbcDungeonEncounter> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcDungeonEncounter", MysqlDbcDungeonEncounter.class);
        List<MysqlDbcDungeonEncounter> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcDungeonEncounter mysql = mysqlTable.get(i);
                PgDbcDungeonEncounter postgres = new PgDbcDungeonEncounter();

                postgres.setId(mysql.getId());
                postgres.setMapId(mysql.getMapId());
                postgres.setDifficulty(mysql.getDifficulty());
                postgres.setOrderIndex(mysql.getOrderIndex());
                postgres.setBit(mysql.getBit());
                postgres.setNameLangEnUS(mysql.getNameLangEnUS());
                postgres.setNameLangEnGB(mysql.getNameLangEnGB());
                postgres.setNameLangKoKR(mysql.getNameLangKoKR());
                postgres.setNameLangFrFR(mysql.getNameLangFrFR());
                postgres.setNameLangDeDE(mysql.getNameLangDeDE());
                postgres.setNameLangEnCN(mysql.getNameLangEnCN());
                postgres.setNameLangZhCN(mysql.getNameLangZhCN());
                postgres.setNameLangEnTW(mysql.getNameLangEnTW());
                postgres.setNameLangZhTW(mysql.getNameLangZhTW());
                postgres.setNameLangEsES(mysql.getNameLangEsES());
                postgres.setNameLangEsMX(mysql.getNameLangEsMX());
                postgres.setNameLangRuRU(mysql.getNameLangRuRU());
                postgres.setNameLangPtPT(mysql.getNameLangPtPT());
                postgres.setNameLangPtBR(mysql.getNameLangPtBR());
                postgres.setNameLangItIT(mysql.getNameLangItIT());
                postgres.setNameLangUnk(mysql.getNameLangUnk());
                postgres.setNameLangMask(mysql.getNameLangMask());
                postgres.setSpellIconId(mysql.getSpellIconId());

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
