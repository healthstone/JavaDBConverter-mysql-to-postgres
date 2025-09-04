package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcCreatureModelData;
import com.winteremu.entity.mysql.dbc.MysqlDbcCreatureSpellData;
import com.winteremu.entity.postgres.PgDbcCreatureModelData;
import com.winteremu.entity.postgres.PgDbcCreatureSpellData;
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
public class TableDbcCreatureSpellDataTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcCreatureSpellDataTest");

    @Test
    @Tag("dbc_creaturespelldata")
    @DisplayName("dbc_creaturespelldata.sql")
    @Description("Перелив данных для dbc_creaturespelldata.sql")
    public void convertTableDbcCreatureModelData() {
        Query<MysqlDbcCreatureSpellData> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcCreatureSpellData", MysqlDbcCreatureSpellData.class);
        List<MysqlDbcCreatureSpellData> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcCreatureSpellData mysql = mysqlTable.get(i);
                PgDbcCreatureSpellData postgres = new PgDbcCreatureSpellData();

                postgres.setId(mysql.getId());

                postgres.setSpells1(mysql.getSpells1());
                postgres.setSpells2(mysql.getSpells2());
                postgres.setSpells3(mysql.getSpells3());
                postgres.setSpells4(mysql.getSpells4());

                postgres.setAvailability1(mysql.getAvailability1());
                postgres.setAvailability2(mysql.getAvailability2());
                postgres.setAvailability3(mysql.getAvailability3());
                postgres.setAvailability4(mysql.getAvailability4());

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
