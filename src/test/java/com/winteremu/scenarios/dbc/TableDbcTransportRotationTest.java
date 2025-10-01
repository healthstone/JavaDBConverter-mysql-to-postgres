package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcTransportAnimation;
import com.winteremu.entity.mysql.dbc.MysqlDbcTransportRotation;
import com.winteremu.entity.postgres.PgDbcTransportAnimation;
import com.winteremu.entity.postgres.PgDbcTransportRotation;
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
public class TableDbcTransportRotationTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcTransportRotationTest");

    @Test
    @Tag("dbc_transportrotation")
    @DisplayName("dbc_transportrotation.sql")
    @Description("Перелив данных для dbc_transportrotation.sql")
    public void convertTableDbcTransportRotation() {
        Query<MysqlDbcTransportRotation> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcTransportRotation", MysqlDbcTransportRotation.class);
        List<MysqlDbcTransportRotation> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcTransportRotation mysql = mysqlTable.get(i);
                PgDbcTransportRotation pg = new PgDbcTransportRotation();

                pg.setId(mysql.getId());
                pg.setGameObjectsId(mysql.getGameObjectsId());
                pg.setTimeIndex(mysql.getTimeIndex());
                pg.setRotX(mysql.getRotX());
                pg.setRotY(mysql.getRotY());
                pg.setRotZ(mysql.getRotZ());
                pg.setRotW(mysql.getRotW());

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
