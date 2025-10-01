package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcTeamContributionPoints;
import com.winteremu.entity.mysql.dbc.MysqlDbcWorldMapArea;
import com.winteremu.entity.postgres.PgDbcTeamContributionPoints;
import com.winteremu.entity.postgres.PgDbcWorldMapArea;
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
public class TableDbcWorldMapAreaTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcWorldMapAreaTest");

    @Test
    @Tag("dbc_worldmaparea")
    @DisplayName("dbc_worldmaparea.sql")
    @Description("Перелив данных для dbc_worldmaparea.sql")
    public void convertTableDbcWorldMapArea() {
        Query<MysqlDbcWorldMapArea> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcWorldMapArea", MysqlDbcWorldMapArea.class);
        List<MysqlDbcWorldMapArea> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcWorldMapArea mysql = mysqlTable.get(i);
                PgDbcWorldMapArea pg = new PgDbcWorldMapArea();

                pg.setId(mysql.getId());
                pg.setMapId(mysql.getMapId());
                pg.setAreaId(mysql.getAreaId());
                pg.setAreaName(mysql.getAreaName());
                pg.setLocLeft(mysql.getLocLeft());
                pg.setLocRight(mysql.getLocRight());
                pg.setLocTop(mysql.getLocTop());
                pg.setLocBottom(mysql.getLocBottom());
                pg.setDisplayMapId(mysql.getDisplayMapId());
                pg.setDefaultDungeonFloor(mysql.getDefaultDungeonFloor());
                pg.setParentWorldMapId(mysql.getParentWorldMapId());

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
