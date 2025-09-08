package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcGtRegenMpPerSpt;
import com.winteremu.entity.mysql.dbc.MysqlDbcItemExtendedCost;
import com.winteremu.entity.postgres.PgDbcGtRegenMpPerSpt;
import com.winteremu.entity.postgres.PgDbcItemExtendedCost;
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
public class TableDbcItemExtendedCostTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcItemExtendedCostTest");

    @Test
    @Tag("dbc_itemextendedcost")
    @DisplayName("dbc_itemextendedcost.sql")
    @Description("Перелив данных для dbc_itemextendedcost.sql")
    public void convertTableDbcItemExtendedCost() {
        Query<MysqlDbcItemExtendedCost> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcItemExtendedCost", MysqlDbcItemExtendedCost.class);
        List<MysqlDbcItemExtendedCost> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcItemExtendedCost mysql = mysqlTable.get(i);
                PgDbcItemExtendedCost pg = new PgDbcItemExtendedCost();

                pg.setId(mysql.getId());
                pg.setHonorPoints(mysql.getHonorPoints());
                pg.setArenaPoints(mysql.getArenaPoints());
                pg.setArenaBracket(mysql.getArenaBracket());

                pg.setItemId1(mysql.getItemId1());
                pg.setItemId2(mysql.getItemId2());
                pg.setItemId3(mysql.getItemId3());
                pg.setItemId4(mysql.getItemId4());
                pg.setItemId5(mysql.getItemId5());

                pg.setItemCount1(mysql.getItemCount1());
                pg.setItemCount2(mysql.getItemCount2());
                pg.setItemCount3(mysql.getItemCount3());
                pg.setItemCount4(mysql.getItemCount4());
                pg.setItemCount5(mysql.getItemCount5());

                pg.setRequiredArenaRating(mysql.getRequiredArenaRating());
                pg.setItemPurchaseGroup(mysql.getItemPurchaseGroup());

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
