package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSpellItemEnchantment;
import com.winteremu.entity.mysql.dbc.MysqlDbcSpellRuneCost;
import com.winteremu.entity.postgres.PgDbcSpellItemEnchantment;
import com.winteremu.entity.postgres.PgDbcSpellRuneCost;
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
public class TableDbcSpellRuneCostTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSpellRuneCostTest");

    @Test
    @Tag("dbc_spellrunecost")
    @DisplayName("dbc_spellrunecost.sql")
    @Description("Перелив данных для dbc_spellrunecost.sql")
    public void convertTableDbcSpellRuneCost() {
        Query<MysqlDbcSpellRuneCost> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcSpellRuneCost", MysqlDbcSpellRuneCost.class);
        List<MysqlDbcSpellRuneCost> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSpellRuneCost mysql = mysqlTable.get(i);
                PgDbcSpellRuneCost pg = new PgDbcSpellRuneCost();

                pg.setId(mysql.getId());
                pg.setBlood(mysql.getBlood());
                pg.setUnholy(mysql.getUnholy());
                pg.setFrost(mysql.getFrost());
                pg.setRunicPower(mysql.getRunicPower());

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
