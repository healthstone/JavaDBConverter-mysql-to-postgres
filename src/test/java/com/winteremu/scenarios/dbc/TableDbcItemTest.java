package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcGtRegenMpPerSpt;
import com.winteremu.entity.mysql.dbc.MysqlDbcItem;
import com.winteremu.entity.postgres.PgDbcGtRegenMpPerSpt;
import com.winteremu.entity.postgres.PgDbcItem;
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
public class TableDbcItemTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcItemTest");

    @Test
    @Tag("dbc_item")
    @DisplayName("dbc_item.sql")
    @Description("Перелив данных для dbc_item.sql")
    public void convertTableDbcItem() {
        Query<MysqlDbcItem> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcItem", MysqlDbcItem.class);
        List<MysqlDbcItem> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcItem mysql = mysqlTable.get(i);
                PgDbcItem pg = new PgDbcItem();

                // Прямое копирование всех полей
                pg.setId(mysql.getId());
                pg.setClassId(mysql.getClassId());
                pg.setSubclassId(mysql.getSubclassId());
                pg.setSoundOverrideSubclassId(mysql.getSoundOverrideSubclassId());
                pg.setMaterial(mysql.getMaterial());
                pg.setDisplayInfoId(mysql.getDisplayInfoId());
                pg.setInventoryType(mysql.getInventoryType());
                pg.setSheatheType(mysql.getSheatheType());

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
