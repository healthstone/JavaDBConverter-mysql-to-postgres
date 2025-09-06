package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcGemProperties;
import com.winteremu.entity.mysql.dbc.MysqlDbcGlyphProperties;
import com.winteremu.entity.postgres.PgDbcGemProperties;
import com.winteremu.entity.postgres.PgDbcGlyphProperties;
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
public class TableDbcGlyphPropertiesTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcGlyphPropertiesTest");

    @Test
    @Tag("dbc_glyphproperties")
    @DisplayName("dbc_glyphproperties.sql")
    @Description("Перелив данных для dbc_glyphproperties.sql")
    public void convertTableDbcGlyphProperties() {
        Query<MysqlDbcGlyphProperties> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcGlyphProperties", MysqlDbcGlyphProperties.class);
        List<MysqlDbcGlyphProperties> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcGlyphProperties mysql = mysqlTable.get(i);
                PgDbcGlyphProperties pg = new PgDbcGlyphProperties();

                pg.setId(mysql.getId());
                pg.setSpellId(mysql.getSpellId());
                pg.setGlyphSlotFlags(mysql.getGlyphSlotFlags());
                pg.setSpellIconId(mysql.getSpellIconId());

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
