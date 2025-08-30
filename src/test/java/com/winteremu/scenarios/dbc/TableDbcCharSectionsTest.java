package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcCharSections;
import com.winteremu.entity.postgres.PgDbcCharSections;
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
public class TableDbcCharSectionsTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcCharSectionsTest");

    @Test
    @Tag("dbc_charsections")
    @DisplayName("dbc_charsections.sql")
    @Description("Перелив данных для dbc_charsections.sql")
    public void convertTableDbcCharSections() {
        Query<MysqlDbcCharSections> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcCharSections", MysqlDbcCharSections.class);
        List<MysqlDbcCharSections> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcCharSections mysql = mysqlTable.get(i);
                PgDbcCharSections postgres = new PgDbcCharSections();

                postgres.setId(mysql.getId());
                postgres.setRaceId(mysql.getRaceId());
                postgres.setSexId(mysql.getSexId());
                postgres.setBaseSection(mysql.getBaseSection());

                postgres.setTextureName1(mysql.getTextureName1());
                postgres.setTextureName2(mysql.getTextureName2());
                postgres.setTextureName3(mysql.getTextureName3());

                postgres.setFlags(mysql.getFlags());
                postgres.setVariationIndex(mysql.getVariationIndex());
                postgres.setColorIndex(mysql.getColorIndex());

                // Сохраняем в PostgreSQL
                postgresDatabaseSession.persist(postgres);

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
