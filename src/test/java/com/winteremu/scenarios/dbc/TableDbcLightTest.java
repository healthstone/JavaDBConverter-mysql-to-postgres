package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcGtRegenMpPerSpt;
import com.winteremu.entity.mysql.dbc.MysqlDbcLight;
import com.winteremu.entity.postgres.PgDbcGtRegenMpPerSpt;
import com.winteremu.entity.postgres.PgDbcLight;
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
public class TableDbcLightTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcLightTest");

    @Test
    @Tag("dbc_light")
    @DisplayName("dbc_light.sql")
    @Description("Перелив данных для dbc_light.sql")
    public void convertTableDbcLight() {
        Query<MysqlDbcLight> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcLight", MysqlDbcLight.class);
        List<MysqlDbcLight> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcLight mysql = mysqlTable.get(i);
                PgDbcLight pg = new PgDbcLight();

                pg.setId(mysql.getId());
                pg.setContinentId(mysql.getContinentId());
                pg.setX(mysql.getX());
                pg.setY(mysql.getY());
                pg.setZ(mysql.getZ());
                pg.setFalloffStart(mysql.getFalloffStart());
                pg.setFalloffEnd(mysql.getFalloffEnd());
                pg.setLightParamsId1(mysql.getLightParamsId1());
                pg.setLightParamsId2(mysql.getLightParamsId2());
                pg.setLightParamsId3(mysql.getLightParamsId3());
                pg.setLightParamsId4(mysql.getLightParamsId4());
                pg.setLightParamsId5(mysql.getLightParamsId5());
                pg.setLightParamsId6(mysql.getLightParamsId6());
                pg.setLightParamsId7(mysql.getLightParamsId7());
                pg.setLightParamsId8(mysql.getLightParamsId8());

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
