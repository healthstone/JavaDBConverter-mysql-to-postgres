package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcQuestXp;
import com.winteremu.entity.mysql.dbc.MysqlDbcRandPropPoints;
import com.winteremu.entity.postgres.PgDbcQuestXp;
import com.winteremu.entity.postgres.PgDbcRandPropPoints;
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
public class TableDbcRandPropPointsTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcQuestXpTest");

    @Test
    @Tag("dbc_randproppoints")
    @DisplayName("dbc_randproppoints.sql")
    @Description("Перелив данных для dbc_randproppoints.sql")
    public void convertTableDbcRandPropPoints() {
        Query<MysqlDbcRandPropPoints> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcRandPropPoints", MysqlDbcRandPropPoints.class);
        List<MysqlDbcRandPropPoints> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcRandPropPoints mysql = mysqlTable.get(i);
                PgDbcRandPropPoints pg = new PgDbcRandPropPoints();

                pg.setId(mysql.getId());

                pg.setEpic1(mysql.getEpic1());
                pg.setEpic2(mysql.getEpic2());
                pg.setEpic3(mysql.getEpic3());
                pg.setEpic4(mysql.getEpic4());
                pg.setEpic5(mysql.getEpic5());

                pg.setSuperior1(mysql.getSuperior1());
                pg.setSuperior2(mysql.getSuperior2());
                pg.setSuperior3(mysql.getSuperior3());
                pg.setSuperior4(mysql.getSuperior4());
                pg.setSuperior5(mysql.getSuperior5());

                pg.setGood1(mysql.getGood1());
                pg.setGood2(mysql.getGood2());
                pg.setGood3(mysql.getGood3());
                pg.setGood4(mysql.getGood4());
                pg.setGood5(mysql.getGood5());

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
