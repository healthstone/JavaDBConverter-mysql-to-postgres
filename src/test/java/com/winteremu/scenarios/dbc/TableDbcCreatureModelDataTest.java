package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcCreatureModelData;
import com.winteremu.entity.mysql.dbc.MysqlDbcSkillLine;
import com.winteremu.entity.postgres.PgDbcCreatureModelData;
import com.winteremu.entity.postgres.PgDbcSkillLine;
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
public class TableDbcCreatureModelDataTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSKillLineTest");

    @Test
    @Tag("dbc_creaturemodeldata")
    @DisplayName("dbc_creaturemodeldata.sql")
    @Description("Перелив данных для dbc_creaturemodeldata.sql")
    public void convertTableDbcCreatureModelData() {
        Query<MysqlDbcCreatureModelData> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcCreatureModelData", MysqlDbcCreatureModelData.class);
        List<MysqlDbcCreatureModelData> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcCreatureModelData mysql = mysqlTable.get(i);
                PgDbcCreatureModelData postgres = new PgDbcCreatureModelData();

                postgres.setId(mysql.getId());
                postgres.setFlags(mysql.getFlags());
                postgres.setModelName(mysql.getModelName());
                postgres.setSizeClass(mysql.getSizeClass());
                postgres.setModelScale(mysql.getModelScale());
                postgres.setBloodId(mysql.getBloodId());
                postgres.setFootprintTextureId(mysql.getFootprintTextureId());
                postgres.setFootprintTextureLength(mysql.getFootprintTextureLength());
                postgres.setFootprintTextureWidth(mysql.getFootprintTextureWidth());
                postgres.setFootprintParticleScale(mysql.getFootprintParticleScale());
                postgres.setFoleyMaterialId(mysql.getFoleyMaterialId());
                postgres.setFootstepShakeSize(mysql.getFootstepShakeSize());
                postgres.setDeathThudShakeSize(mysql.getDeathThudShakeSize());
                postgres.setSoundId(mysql.getSoundId());
                postgres.setCollisionWidth(mysql.getCollisionWidth());
                postgres.setCollisionHeight(mysql.getCollisionHeight());
                postgres.setMountHeight(mysql.getMountHeight());
                postgres.setGeoBoxMinX(mysql.getGeoBoxMinX());
                postgres.setGeoBoxMinY(mysql.getGeoBoxMinY());
                postgres.setGeoBoxMinZ(mysql.getGeoBoxMinZ());
                postgres.setGeoBoxMaxX(mysql.getGeoBoxMaxX());
                postgres.setGeoBoxMaxY(mysql.getGeoBoxMaxY());
                postgres.setGeoBoxMaxZ(mysql.getGeoBoxMaxZ());
                postgres.setWorldEffectScale(mysql.getWorldEffectScale());
                postgres.setAttachedEffectScale(mysql.getAttachedEffectScale());
                postgres.setMissileCollisionRadius(mysql.getMissileCollisionRadius());
                postgres.setMissileCollisionPush(mysql.getMissileCollisionPush());
                postgres.setMissileCollisionRaise(mysql.getMissileCollisionRaise());

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
