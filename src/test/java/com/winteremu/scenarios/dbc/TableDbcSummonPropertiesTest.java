package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSpellVisual;
import com.winteremu.entity.mysql.dbc.MysqlDbcSummonProperties;
import com.winteremu.entity.postgres.PgDbcSpellVisual;
import com.winteremu.entity.postgres.PgDbcSummonProperties;
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
public class TableDbcSummonPropertiesTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSummonPropertiesTest");

    @Test
    @Tag("dbc_summonproperties")
    @DisplayName("dbc_summonproperties.sql")
    @Description("Перелив данных для dbc_summonproperties.sql")
    public void convertTableDbcSummonProperties() {
        Query<MysqlDbcSummonProperties> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcSummonProperties", MysqlDbcSummonProperties.class);
        List<MysqlDbcSummonProperties> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSummonProperties mysql = mysqlTable.get(i);
                PgDbcSummonProperties pg = new PgDbcSummonProperties();

                pg.setId(mysql.getId());
                pg.setControl(mysql.getControl());
                pg.setFaction(mysql.getFaction());
                pg.setTitle(mysql.getTitle());
                pg.setSlot(mysql.getSlot());
                pg.setFlags(mysql.getFlags());

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
