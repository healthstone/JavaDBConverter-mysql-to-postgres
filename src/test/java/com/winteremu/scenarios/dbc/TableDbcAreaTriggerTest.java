package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcAreaTrigger;
import com.winteremu.entity.postgres.PgDbcAreaTrigger;
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
public class TableDbcAreaTriggerTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcAreaTriggerTest");

    @Test
    @Tag("dbc_areatrigger")
    @DisplayName("dbc_areatrigger.sql")
    @Description("Перелив данных для dbc_areatrigger.sql")
    public void convertTableDbcAreaTrigger() {
        Query<MysqlDbcAreaTrigger> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcAreaTrigger", MysqlDbcAreaTrigger.class);
        List<MysqlDbcAreaTrigger> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcAreaTrigger mysql = mysqlTable.get(i);
                PgDbcAreaTrigger postgres = new PgDbcAreaTrigger();

                postgres.setId(mysql.getId());
                postgres.setContinentId(mysql.getContinentId());
                postgres.setX(mysql.getX());
                postgres.setY(mysql.getY());
                postgres.setZ(mysql.getZ());
                postgres.setRadius(mysql.getRadius());
                postgres.setBoxLength(mysql.getBoxLength());
                postgres.setBoxWidth(mysql.getBoxWidth());
                postgres.setBoxHeight(mysql.getBoxHeight());
                postgres.setBoxYaw(mysql.getBoxYaw());

                // Сохраняем в PostgreSQL
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
