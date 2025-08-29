package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcAreaTable;
import com.winteremu.entity.postgres.PgDbcAreaTable;
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
public class TableDbcAreaTableTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcAreaTableTest");

    @Test
    @Tag("dbc_areatable")
    @DisplayName("dbc_areatable.sql")
    @Description("Перелив данных для dbc_areatable.sql")
    public void convertTableDbcAchievement() {
        Query<MysqlDbcAreaTable> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcAreaTable", MysqlDbcAreaTable.class);
        List<MysqlDbcAreaTable> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcAreaTable mysql = mysqlTable.get(i);
                PgDbcAreaTable postgres = new PgDbcAreaTable();

                postgres.setId(mysql.getId());
                postgres.setContinentId(mysql.getContinentId());
                postgres.setParentAreaId(mysql.getParentAreaId());
                postgres.setAreaBit(mysql.getAreaBit());
                postgres.setFlags(mysql.getFlags());
                postgres.setSoundProviderPref(mysql.getSoundProviderPref());
                postgres.setSoundProviderPrefUnderwater(mysql.getSoundProviderPrefUnderwater());
                postgres.setAmbienceId(mysql.getAmbienceId());
                postgres.setZoneMusic(mysql.getZoneMusic());
                postgres.setIntroSound(mysql.getIntroSound());
                postgres.setExplorationLevel(mysql.getExplorationLevel());

                postgres.setAreaNameLangEnUS(mysql.getAreaNameLangEnUS());
                postgres.setAreaNameLangEnGB(mysql.getAreaNameLangEnGB());
                postgres.setAreaNameLangKoKR(mysql.getAreaNameLangKoKR());
                postgres.setAreaNameLangFrFR(mysql.getAreaNameLangFrFR());
                postgres.setAreaNameLangDeDE(mysql.getAreaNameLangDeDE());
                postgres.setAreaNameLangEnCN(mysql.getAreaNameLangEnCN());
                postgres.setAreaNameLangZhCN(mysql.getAreaNameLangZhCN());
                postgres.setAreaNameLangEnTW(mysql.getAreaNameLangEnTW());
                postgres.setAreaNameLangZhTW(mysql.getAreaNameLangZhTW());
                postgres.setAreaNameLangEsES(mysql.getAreaNameLangEsES());
                postgres.setAreaNameLangEsMX(mysql.getAreaNameLangEsMX());
                postgres.setAreaNameLangRuRU(mysql.getAreaNameLangRuRU());
                postgres.setAreaNameLangPtPT(mysql.getAreaNameLangPtPT());
                postgres.setAreaNameLangPtBR(mysql.getAreaNameLangPtBR());
                postgres.setAreaNameLangItIT(mysql.getAreaNameLangItIT());
                postgres.setAreaNameLangUnk(mysql.getAreaNameLangUnk());

                postgres.setAreaNameLangMask(mysql.getAreaNameLangMask());
                postgres.setFactionGroupMask(mysql.getFactionGroupMask());
                postgres.setLiquidTypeId1(mysql.getLiquidTypeId1());
                postgres.setLiquidTypeId2(mysql.getLiquidTypeId2());
                postgres.setLiquidTypeId3(mysql.getLiquidTypeId3());
                postgres.setLiquidTypeId4(mysql.getLiquidTypeId4());
                postgres.setMinElevation(mysql.getMinElevation());
                postgres.setAmbientMultiplier(mysql.getAmbientMultiplier());
                postgres.setLightId(mysql.getLightId());

                // Сохраняем в PostgreSQL
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
