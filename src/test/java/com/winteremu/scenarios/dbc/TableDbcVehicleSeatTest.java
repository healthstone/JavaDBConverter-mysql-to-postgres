package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcTransportRotation;
import com.winteremu.entity.mysql.dbc.MysqlDbcVehicleSeat;
import com.winteremu.entity.postgres.PgDbcTransportRotation;
import com.winteremu.entity.postgres.PgDbcVehicleSeat;
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
public class TableDbcVehicleSeatTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcVehicleSeatTest");

    @Test
    @Tag("dbc_vehicleseat")
    @DisplayName("dbc_vehicleseat.sql")
    @Description("Перелив данных для dbc_vehicleseat.sql")
    public void convertTableDbcVehicleSeat() {
        Query<MysqlDbcVehicleSeat> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcVehicleSeat", MysqlDbcVehicleSeat.class);
        List<MysqlDbcVehicleSeat> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcVehicleSeat mysql = mysqlTable.get(i);
                PgDbcVehicleSeat pg = new PgDbcVehicleSeat();

                pg.setId(mysql.getId());
                pg.setFlags(mysql.getFlags());
                pg.setAttachmentId(mysql.getAttachmentId());
                pg.setAttachmentOffsetX(mysql.getAttachmentOffsetX());
                pg.setAttachmentOffsetY(mysql.getAttachmentOffsetY());
                pg.setAttachmentOffsetZ(mysql.getAttachmentOffsetZ());

                pg.setEnterPreDelay(mysql.getEnterPreDelay());
                pg.setEnterSpeed(mysql.getEnterSpeed());
                pg.setEnterGravity(mysql.getEnterGravity());
                pg.setEnterMinDuration(mysql.getEnterMinDuration());
                pg.setEnterMaxDuration(mysql.getEnterMaxDuration());
                pg.setEnterMinArcHeight(mysql.getEnterMinArcHeight());
                pg.setEnterMaxArcHeight(mysql.getEnterMaxArcHeight());
                pg.setEnterAnimStart(mysql.getEnterAnimStart());
                pg.setEnterAnimLoop(mysql.getEnterAnimLoop());

                pg.setRideAnimStart(mysql.getRideAnimStart());
                pg.setRideAnimLoop(mysql.getRideAnimLoop());
                pg.setRideUpperAnimStart(mysql.getRideUpperAnimStart());
                pg.setRideUpperAnimLoop(mysql.getRideUpperAnimLoop());

                pg.setExitPreDelay(mysql.getExitPreDelay());
                pg.setExitSpeed(mysql.getExitSpeed());
                pg.setExitGravity(mysql.getExitGravity());
                pg.setExitMinDuration(mysql.getExitMinDuration());
                pg.setExitMaxDuration(mysql.getExitMaxDuration());
                pg.setExitMinArcHeight(mysql.getExitMinArcHeight());
                pg.setExitMaxArcHeight(mysql.getExitMaxArcHeight());
                pg.setExitAnimStart(mysql.getExitAnimStart());
                pg.setExitAnimLoop(mysql.getExitAnimLoop());
                pg.setExitAnimEnd(mysql.getExitAnimEnd());

                pg.setPassengerYaw(mysql.getPassengerYaw());
                pg.setPassengerPitch(mysql.getPassengerPitch());
                pg.setPassengerRoll(mysql.getPassengerRoll());
                pg.setPassengerAttachmentId(mysql.getPassengerAttachmentId());

                pg.setVehicleEnterAnim(mysql.getVehicleEnterAnim());
                pg.setVehicleExitAnim(mysql.getVehicleExitAnim());
                pg.setVehicleRideAnimLoop(mysql.getVehicleRideAnimLoop());
                pg.setVehicleEnterAnimBone(mysql.getVehicleEnterAnimBone());
                pg.setVehicleExitAnimBone(mysql.getVehicleExitAnimBone());
                pg.setVehicleRideAnimLoopBone(mysql.getVehicleRideAnimLoopBone());

                pg.setVehicleEnterAnimDelay(mysql.getVehicleEnterAnimDelay());
                pg.setVehicleExitAnimDelay(mysql.getVehicleExitAnimDelay());
                pg.setVehicleAbilityDisplay(mysql.getVehicleAbilityDisplay());

                pg.setEnterUiSoundId(mysql.getEnterUiSoundId());
                pg.setExitUiSoundId(mysql.getExitUiSoundId());

                pg.setUiSkin(mysql.getUiSkin());
                pg.setFlagsB(mysql.getFlagsB());

                pg.setCameraEnteringDelay(mysql.getCameraEnteringDelay());
                pg.setCameraEnteringDuration(mysql.getCameraEnteringDuration());
                pg.setCameraExitingDelay(mysql.getCameraExitingDelay());
                pg.setCameraExitingDuration(mysql.getCameraExitingDuration());

                pg.setCameraOffsetX(mysql.getCameraOffsetX());
                pg.setCameraOffsetY(mysql.getCameraOffsetY());
                pg.setCameraOffsetZ(mysql.getCameraOffsetZ());

                pg.setCameraPosChaseRate(mysql.getCameraPosChaseRate());
                pg.setCameraFacingChaseRate(mysql.getCameraFacingChaseRate());
                pg.setCameraEnteringZoom(mysql.getCameraEnteringZoom());
                pg.setCameraSeatZoomMin(mysql.getCameraSeatZoomMin());
                pg.setCameraSeatZoomMax(mysql.getCameraSeatZoomMax());

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
