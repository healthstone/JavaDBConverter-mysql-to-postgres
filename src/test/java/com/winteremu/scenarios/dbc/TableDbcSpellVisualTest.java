package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSpellRuneCost;
import com.winteremu.entity.mysql.dbc.MysqlDbcSpellVisual;
import com.winteremu.entity.postgres.PgDbcSpellRuneCost;
import com.winteremu.entity.postgres.PgDbcSpellVisual;
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
public class TableDbcSpellVisualTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSpellVisualTest");

    @Test
    @Tag("dbc_spellvisual")
    @DisplayName("dbc_spellvisual.sql")
    @Description("Перелив данных для dbc_spellvisual.sql")
    public void convertTableDbcSpellVisual() {
        Query<MysqlDbcSpellVisual> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcSpellVisual", MysqlDbcSpellVisual.class);
        List<MysqlDbcSpellVisual> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSpellVisual mysql = mysqlTable.get(i);
                PgDbcSpellVisual pg = new PgDbcSpellVisual();

                pg.setId(mysql.getId());
                pg.setPrecastKit(mysql.getPrecastKit());
                pg.setCastKit(mysql.getCastKit());
                pg.setImpactKit(mysql.getImpactKit());
                pg.setStateKit(mysql.getStateKit());
                pg.setStateDoneKit(mysql.getStateDoneKit());
                pg.setChannelKit(mysql.getChannelKit());
                pg.setHasMissile(mysql.getHasMissile());
                pg.setMissileModel(mysql.getMissileModel());
                pg.setMissilePathType(mysql.getMissilePathType());
                pg.setMissileDestinationAttachment(mysql.getMissileDestinationAttachment());
                pg.setMissileSound(mysql.getMissileSound());
                pg.setAnimEventSoundId(mysql.getAnimEventSoundId());
                pg.setFlags(mysql.getFlags());
                pg.setCasterImpactKit(mysql.getCasterImpactKit());
                pg.setTargetImpactKit(mysql.getTargetImpactKit());
                pg.setMissileAttachment(mysql.getMissileAttachment());
                pg.setMissileFollowGroundHeight(mysql.getMissileFollowGroundHeight());
                pg.setMissileFollowGroundDropSpeed(mysql.getMissileFollowGroundDropSpeed());
                pg.setMissileFollowGroundApproach(mysql.getMissileFollowGroundApproach());
                pg.setMissileFollowGroundFlags(mysql.getMissileFollowGroundFlags());
                pg.setMissileMotion(mysql.getMissileMotion());
                pg.setMissileTargetingKit(mysql.getMissileTargetingKit());
                pg.setInstantAreaKit(mysql.getInstantAreaKit());
                pg.setImpactAreaKit(mysql.getImpactAreaKit());
                pg.setPersistentAreaKit(mysql.getPersistentAreaKit());
                pg.setMissileCastOffsetX(mysql.getMissileCastOffsetX());
                pg.setMissileCastOffsetY(mysql.getMissileCastOffsetY());
                pg.setMissileCastOffsetZ(mysql.getMissileCastOffsetZ());
                pg.setMissileImpactOffsetX(mysql.getMissileImpactOffsetX());
                pg.setMissileImpactOffsetY(mysql.getMissileImpactOffsetY());
                pg.setMissileImpactOffsetZ(mysql.getMissileImpactOffsetZ());

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
