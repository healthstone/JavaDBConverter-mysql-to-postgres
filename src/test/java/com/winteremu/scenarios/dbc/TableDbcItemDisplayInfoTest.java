package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcGtRegenMpPerSpt;
import com.winteremu.entity.mysql.dbc.MysqlDbcItemDisplayInfo;
import com.winteremu.entity.postgres.PgDbcGtRegenMpPerSpt;
import com.winteremu.entity.postgres.PgDbcItemDisplayInfo;
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
public class TableDbcItemDisplayInfoTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcItemDisplayInfoTest");

    @Test
    @Tag("dbc_itemdisplayinfo")
    @DisplayName("dbc_itemdisplayinfo.sql")
    @Description("Перелив данных для dbc_itemdisplayinfo.sql")
    public void convertTableDbcItemDisplayInfo() {
        Query<MysqlDbcItemDisplayInfo> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcItemDisplayInfo", MysqlDbcItemDisplayInfo.class);
        List<MysqlDbcItemDisplayInfo> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcItemDisplayInfo mysql = mysqlTable.get(i);
                PgDbcItemDisplayInfo pg = new PgDbcItemDisplayInfo();

                pg.setId(mysql.getId());

                pg.setModelName1(mysql.getModelName1());
                pg.setModelName2(mysql.getModelName2());

                pg.setModelTexture1(mysql.getModelTexture1());
                pg.setModelTexture2(mysql.getModelTexture2());

                pg.setInventoryIcon1(mysql.getInventoryIcon1());
                pg.setInventoryIcon2(mysql.getInventoryIcon2());

                pg.setGeosetGroup1(mysql.getGeosetGroup1());
                pg.setGeosetGroup2(mysql.getGeosetGroup2());
                pg.setGeosetGroup3(mysql.getGeosetGroup3());

                pg.setFlags(mysql.getFlags());
                pg.setSpellVisualId(mysql.getSpellVisualId());
                pg.setGroupSoundIndex(mysql.getGroupSoundIndex());

                pg.setHelmetGeosetVis1(mysql.getHelmetGeosetVis1());
                pg.setHelmetGeosetVis2(mysql.getHelmetGeosetVis2());

                pg.setTexture1(mysql.getTexture1());
                pg.setTexture2(mysql.getTexture2());
                pg.setTexture3(mysql.getTexture3());
                pg.setTexture4(mysql.getTexture4());
                pg.setTexture5(mysql.getTexture5());
                pg.setTexture6(mysql.getTexture6());
                pg.setTexture7(mysql.getTexture7());
                pg.setTexture8(mysql.getTexture8());

                pg.setItemVisual(mysql.getItemVisual());
                pg.setParticleColorId(mysql.getParticleColorId());

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
