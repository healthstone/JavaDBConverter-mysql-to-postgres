package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcCreatureDisplayInfo;
import com.winteremu.entity.postgres.PgDbcCreatureDisplayInfo;
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
public class TableDbcCreatureDisplayInfoTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcCreatureDisplayInfoTest");

    @Test
    @Tag("dbc_creaturedisplayinfo")
    @DisplayName("dbc_creaturedisplayinfo.sql")
    @Description("Перелив данных для dbc_creaturedisplayinfo.sql")
    public void convertTableDbcCreatureDisplayInfo() {
        Query<MysqlDbcCreatureDisplayInfo> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcCreatureDisplayInfo", MysqlDbcCreatureDisplayInfo.class);
        List<MysqlDbcCreatureDisplayInfo> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcCreatureDisplayInfo mysql = mysqlTable.get(i);
                PgDbcCreatureDisplayInfo postgres = new PgDbcCreatureDisplayInfo();

                // Перенос всех полей
                postgres.setId(mysql.getId());
                postgres.setModelId(mysql.getModelId());
                postgres.setSoundId(mysql.getSoundId());
                postgres.setExtendedDisplayInfoId(mysql.getExtendedDisplayInfoId());
                postgres.setCreatureModelScale(mysql.getCreatureModelScale());
                postgres.setCreatureModelAlpha(mysql.getCreatureModelAlpha());
                postgres.setTextureVariation1(mysql.getTextureVariation1());
                postgres.setTextureVariation2(mysql.getTextureVariation2());
                postgres.setTextureVariation3(mysql.getTextureVariation3());
                postgres.setPortraitTextureName(mysql.getPortraitTextureName());
                postgres.setBloodLevel(mysql.getBloodLevel());
                postgres.setBloodId(mysql.getBloodId());
                postgres.setNpcSoundId(mysql.getNpcSoundId());
                postgres.setParticleColorId(mysql.getParticleColorId());
                postgres.setCreatureGeosetData(mysql.getCreatureGeosetData());
                postgres.setObjectEffectPackageId(mysql.getObjectEffectPackageId());

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
