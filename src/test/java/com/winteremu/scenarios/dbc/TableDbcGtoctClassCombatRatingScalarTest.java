package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcGtCombatRatings;
import com.winteremu.entity.mysql.dbc.MysqlDbcGtoctClassCombatRatingScalar;
import com.winteremu.entity.postgres.PgDbcGtCombatRatings;
import com.winteremu.entity.postgres.PgDbcGtoctClassCombatRatingScalar;
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
public class TableDbcGtoctClassCombatRatingScalarTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcGtoctClassCombatRatingScalarTest");

    @Test
    @Tag("dbc_gtoctclasscombatratingscalar")
    @DisplayName("dbc_gtoctclasscombatratingscalar.sql")
    @Description("Перелив данных для dbc_gtoctclasscombatratingscalar.sql")
    public void convertTableDbcGtoctClassCombatRatingScalar() {
        Query<MysqlDbcGtoctClassCombatRatingScalar> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcGtoctClassCombatRatingScalar", MysqlDbcGtoctClassCombatRatingScalar.class);
        List<MysqlDbcGtoctClassCombatRatingScalar> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcGtoctClassCombatRatingScalar mysql = mysqlTable.get(i);
                PgDbcGtoctClassCombatRatingScalar pg = new PgDbcGtoctClassCombatRatingScalar();

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
