package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSummonProperties;
import com.winteremu.entity.mysql.dbc.MysqlDbcTeamContributionPoints;
import com.winteremu.entity.postgres.PgDbcSummonProperties;
import com.winteremu.entity.postgres.PgDbcTeamContributionPoints;
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
public class TableDbcTeamContributionPointsTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcTeamContributionPointsTest");

    @Test
    @Tag("dbc_teamcontributionpoints")
    @DisplayName("dbc_teamcontributionpoints.sql")
    @Description("Перелив данных для dbc_teamcontributionpoints.sql")
    public void convertTableDbcTeamContributionPoints() {
        Query<MysqlDbcTeamContributionPoints> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcTeamContributionPoints", MysqlDbcTeamContributionPoints.class);
        List<MysqlDbcTeamContributionPoints> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcTeamContributionPoints mysql = mysqlTable.get(i);
                PgDbcTeamContributionPoints pg = new PgDbcTeamContributionPoints();

                pg.setId(mysql.getId());
                pg.setData(mysql.getData());

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
