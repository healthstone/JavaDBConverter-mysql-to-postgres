package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSummonProperties;
import com.winteremu.entity.mysql.dbc.MysqlDbcTaxiPathNode;
import com.winteremu.entity.postgres.PgDbcSummonProperties;
import com.winteremu.entity.postgres.PgDbcTaxiPathNode;
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
public class TableDbcTaxiPathNodeTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcTaxiPathNodeTest");

    @Test
    @Tag("dbc_taxipathnode")
    @DisplayName("dbc_taxipathnode.sql")
    @Description("Перелив данных для dbc_taxipathnode.sql")
    public void convertTableDbcTaxiPathNode() {
        Query<MysqlDbcTaxiPathNode> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcTaxiPathNode", MysqlDbcTaxiPathNode.class);
        List<MysqlDbcTaxiPathNode> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcTaxiPathNode mysql = mysqlTable.get(i);
                PgDbcTaxiPathNode pg = new PgDbcTaxiPathNode();

                pg.setId(mysql.getId());
                pg.setPathId(mysql.getPathId());
                pg.setNodeIndex(mysql.getNodeIndex());
                pg.setContinentId(mysql.getContinentId());
                pg.setLocX(mysql.getLocX());
                pg.setLocY(mysql.getLocY());
                pg.setLocZ(mysql.getLocZ());
                pg.setFlags(mysql.getFlags());
                pg.setDelay(mysql.getDelay());
                pg.setArrivalEventId(mysql.getArrivalEventId());
                pg.setDepartureEventId(mysql.getDepartureEventId());

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
