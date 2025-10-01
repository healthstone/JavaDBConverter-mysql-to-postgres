package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcWorldMapArea;
import com.winteremu.entity.mysql.dbc.MysqlDbcWorldMapOverlay;
import com.winteremu.entity.postgres.PgDbcWorldMapArea;
import com.winteremu.entity.postgres.PgDbcWorldMapOverlay;
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
public class TableDbcWorldMapOverlayTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcWorldMapOverlayTest");

    @Test
    @Tag("dbc_worldmapoverlay")
    @DisplayName("dbc_worldmapoverlay.sql")
    @Description("Перелив данных для dbc_worldmapoverlay.sql")
    public void convertTableDbcWorldMapOverlay() {
        Query<MysqlDbcWorldMapOverlay> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcWorldMapOverlay", MysqlDbcWorldMapOverlay.class);
        List<MysqlDbcWorldMapOverlay> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcWorldMapOverlay mysql = mysqlTable.get(i);
                PgDbcWorldMapOverlay pg = new PgDbcWorldMapOverlay();

                pg.setId(mysql.getId());
                pg.setMapAreaId(mysql.getMapAreaId());
                pg.setAreaId1(mysql.getAreaId1());
                pg.setAreaId2(mysql.getAreaId2());
                pg.setAreaId3(mysql.getAreaId3());
                pg.setAreaId4(mysql.getAreaId4());
                pg.setMapPointX(mysql.getMapPointX());
                pg.setMapPointY(mysql.getMapPointY());
                pg.setTextureName(mysql.getTextureName());
                pg.setTextureWidth(mysql.getTextureWidth());
                pg.setTextureHeight(mysql.getTextureHeight());
                pg.setOffsetX(mysql.getOffsetX());
                pg.setOffsetY(mysql.getOffsetY());
                pg.setHitRectTop(mysql.getHitRectTop());
                pg.setHitRectLeft(mysql.getHitRectLeft());
                pg.setHitRectBottom(mysql.getHitRectBottom());
                pg.setHitRectRight(mysql.getHitRectRight());

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
