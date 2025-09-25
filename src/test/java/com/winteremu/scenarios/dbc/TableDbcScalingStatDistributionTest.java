package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcRandPropPoints;
import com.winteremu.entity.mysql.dbc.MysqlDbcScalingStatDistribution;
import com.winteremu.entity.postgres.PgDbcRandPropPoints;
import com.winteremu.entity.postgres.PgDbcScalingStatDistribution;
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
public class TableDbcScalingStatDistributionTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcScalingStatDistributionTest");

    @Test
    @Tag("dbc_scalingstatdistribution")
    @DisplayName("dbc_scalingstatdistribution.sql")
    @Description("Перелив данных для dbc_scalingstatdistribution.sql")
    public void convertTableDbcScalingStatDistribution() {
        Query<MysqlDbcScalingStatDistribution> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcScalingStatDistribution", MysqlDbcScalingStatDistribution.class);
        List<MysqlDbcScalingStatDistribution> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcScalingStatDistribution mysql = mysqlTable.get(i);
                PgDbcScalingStatDistribution pg = new PgDbcScalingStatDistribution();

                pg.setId(mysql.getId());

                pg.setStatId1(mysql.getStatId1());
                pg.setStatId2(mysql.getStatId2());
                pg.setStatId3(mysql.getStatId3());
                pg.setStatId4(mysql.getStatId4());
                pg.setStatId5(mysql.getStatId5());
                pg.setStatId6(mysql.getStatId6());
                pg.setStatId7(mysql.getStatId7());
                pg.setStatId8(mysql.getStatId8());
                pg.setStatId9(mysql.getStatId9());
                pg.setStatId10(mysql.getStatId10());

                pg.setBonus1(mysql.getBonus1());
                pg.setBonus2(mysql.getBonus2());
                pg.setBonus3(mysql.getBonus3());
                pg.setBonus4(mysql.getBonus4());
                pg.setBonus5(mysql.getBonus5());
                pg.setBonus6(mysql.getBonus6());
                pg.setBonus7(mysql.getBonus7());
                pg.setBonus8(mysql.getBonus8());
                pg.setBonus9(mysql.getBonus9());
                pg.setBonus10(mysql.getBonus10());

                pg.setMaxLevel(mysql.getMaxLevel());

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
