package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcGameObjectDisplayInfo;
import com.winteremu.entity.mysql.dbc.MysqlDbcGemProperties;
import com.winteremu.entity.postgres.PgDbcGameObjectDisplayInfo;
import com.winteremu.entity.postgres.PgDbcGemProperties;
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
public class TableDbcGemPropertiesTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcGemPropertiesTest");

    @Test
    @Tag("dbc_gemproperties")
    @DisplayName("dbc_gemproperties.sql")
    @Description("Перелив данных для dbc_gemproperties.sql")
    public void convertTableDbcGemProperties() {
        Query<MysqlDbcGemProperties> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcGemProperties", MysqlDbcGemProperties.class);
        List<MysqlDbcGemProperties> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcGemProperties mysql = mysqlTable.get(i);
                PgDbcGemProperties pg = new PgDbcGemProperties();

                pg.setId(mysql.getId());
                pg.setEnchantId(mysql.getEnchantId());
                pg.setMaxcountInv(mysql.getMaxcountInv());
                pg.setMaxcountItem(mysql.getMaxcountItem());
                pg.setType(mysql.getType());

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
