package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcTransportRotation;
import com.winteremu.entity.mysql.dbc.MysqlDbcVehicle;
import com.winteremu.entity.postgres.PgDbcTransportRotation;
import com.winteremu.entity.postgres.PgDbcVehicle;
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
public class TableDbcVehicleTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcVehicleTest");

    @Test
    @Tag("dbc_vehicle")
    @DisplayName("dbc_vehicle.sql")
    @Description("Перелив данных для dbc_vehicle.sql")
    public void convertTableDbcVehicle() {
        Query<MysqlDbcVehicle> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcVehicle", MysqlDbcVehicle.class);
        List<MysqlDbcVehicle> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcVehicle mysql = mysqlTable.get(i);
                PgDbcVehicle pg = new PgDbcVehicle();

                pg.setId(mysql.getId());
                pg.setFlags(mysql.getFlags());
                pg.setTurnSpeed(mysql.getTurnSpeed());
                pg.setPitchSpeed(mysql.getPitchSpeed());
                pg.setPitchMin(mysql.getPitchMin());
                pg.setPitchMax(mysql.getPitchMax());

                pg.setSeatId1(mysql.getSeatId1());
                pg.setSeatId2(mysql.getSeatId2());
                pg.setSeatId3(mysql.getSeatId3());
                pg.setSeatId4(mysql.getSeatId4());
                pg.setSeatId5(mysql.getSeatId5());
                pg.setSeatId6(mysql.getSeatId6());
                pg.setSeatId7(mysql.getSeatId7());
                pg.setSeatId8(mysql.getSeatId8());

                pg.setMouseLookOffsetPitch(mysql.getMouseLookOffsetPitch());
                pg.setCameraFadeDistScalarMin(mysql.getCameraFadeDistScalarMin());
                pg.setCameraFadeDistScalarMax(mysql.getCameraFadeDistScalarMax());
                pg.setCameraPitchOffset(mysql.getCameraPitchOffset());
                pg.setFacingLimitRight(mysql.getFacingLimitRight());
                pg.setFacingLimitLeft(mysql.getFacingLimitLeft());

                pg.setMsslTrgtTurnLingering(mysql.getMsslTrgtTurnLingering());
                pg.setMsslTrgtPitchLingering(mysql.getMsslTrgtPitchLingering());
                pg.setMsslTrgtMouseLingering(mysql.getMsslTrgtMouseLingering());
                pg.setMsslTrgtEndOpacity(mysql.getMsslTrgtEndOpacity());
                pg.setMsslTrgtArcSpeed(mysql.getMsslTrgtArcSpeed());
                pg.setMsslTrgtArcRepeat(mysql.getMsslTrgtArcRepeat());
                pg.setMsslTrgtArcWidth(mysql.getMsslTrgtArcWidth());

                pg.setMsslTrgtImpactRadius1(mysql.getMsslTrgtImpactRadius1());
                pg.setMsslTrgtImpactRadius2(mysql.getMsslTrgtImpactRadius2());

                pg.setMsslTrgtArcTexture(mysql.getMsslTrgtArcTexture());
                pg.setMsslTrgtImpactTexture(mysql.getMsslTrgtImpactTexture());
                pg.setMsslTrgtImpactModel1(mysql.getMsslTrgtImpactModel1());
                pg.setMsslTrgtImpactModel2(mysql.getMsslTrgtImpactModel2());

                pg.setCameraYawOffset(mysql.getCameraYawOffset());
                pg.setUiLocomotionType(mysql.getUiLocomotionType());
                pg.setMsslTrgtImpactTexRadius(mysql.getMsslTrgtImpactTexRadius());
                pg.setVehicleUIIndicatorId(mysql.getVehicleUiIndicatorId());

                pg.setPowerDisplayId1(mysql.getPowerDisplayId1());
                pg.setPowerDisplayId2(mysql.getPowerDisplayId2());
                pg.setPowerDisplayId3(mysql.getPowerDisplayId3());

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
