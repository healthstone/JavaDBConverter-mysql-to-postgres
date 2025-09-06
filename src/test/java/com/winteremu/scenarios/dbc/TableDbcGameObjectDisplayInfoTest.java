package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcFaction;
import com.winteremu.entity.mysql.dbc.MysqlDbcGameObjectDisplayInfo;
import com.winteremu.entity.postgres.PgDbcFaction;
import com.winteremu.entity.postgres.PgDbcGameObjectDisplayInfo;
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
public class TableDbcGameObjectDisplayInfoTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcGameObjectDisplayInfoTest");

    @Test
    @Tag("dbc_gameobjectdisplayinfo")
    @DisplayName("dbc_gameobjectdisplayinfo.sql")
    @Description("Перелив данных для dbc_gameobjectdisplayinfo.sql")
    public void convertTableDbcGameObjectDisplayInfo() {
        Query<MysqlDbcGameObjectDisplayInfo> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcGameObjectDisplayInfo", MysqlDbcGameObjectDisplayInfo.class);
        List<MysqlDbcGameObjectDisplayInfo> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcGameObjectDisplayInfo mysql = mysqlTable.get(i);
                PgDbcGameObjectDisplayInfo pg = new PgDbcGameObjectDisplayInfo();

                pg.setId(mysql.getId());
                pg.setModelName(mysql.getModelName());

                pg.setSound1(mysql.getSound1());
                pg.setSound2(mysql.getSound2());
                pg.setSound3(mysql.getSound3());
                pg.setSound4(mysql.getSound4());
                pg.setSound5(mysql.getSound5());
                pg.setSound6(mysql.getSound6());
                pg.setSound7(mysql.getSound7());
                pg.setSound8(mysql.getSound8());
                pg.setSound9(mysql.getSound9());
                pg.setSound10(mysql.getSound10());

                pg.setGeoBoxMinX(mysql.getGeoBoxMinX());
                pg.setGeoBoxMinY(mysql.getGeoBoxMinY());
                pg.setGeoBoxMinZ(mysql.getGeoBoxMinZ());
                pg.setGeoBoxMaxX(mysql.getGeoBoxMaxX());
                pg.setGeoBoxMaxY(mysql.getGeoBoxMaxY());
                pg.setGeoBoxMaxZ(mysql.getGeoBoxMaxZ());

                pg.setObjectEffectPackageId(mysql.getObjectEffectPackageID());

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
