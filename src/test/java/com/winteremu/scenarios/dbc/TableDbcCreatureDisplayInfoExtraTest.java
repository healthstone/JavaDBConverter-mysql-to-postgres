package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcCreatureDisplayInfoExtra;
import com.winteremu.entity.postgres.PgDbcCreatureDisplayInfoExtra;
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
public class TableDbcCreatureDisplayInfoExtraTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcCreatureDisplayInfoExtraTest");

    @Test
    @Tag("dbc_creaturedisplayinfoextra")
    @DisplayName("dbc_creaturedisplayinfoextra.sql")
    @Description("Перелив данных для dbc_creaturedisplayinfoextra.sql")
    public void convertTableDbcCreatureDisplayInfo() {
        Query<MysqlDbcCreatureDisplayInfoExtra> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcCreatureDisplayInfoExtra", MysqlDbcCreatureDisplayInfoExtra.class);
        List<MysqlDbcCreatureDisplayInfoExtra> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcCreatureDisplayInfoExtra mysql = mysqlTable.get(i);
                PgDbcCreatureDisplayInfoExtra postgres = new PgDbcCreatureDisplayInfoExtra();

                // Перенос всех полей
                // Перенос всех полей
                postgres.setId(mysql.getId());
                postgres.setDisplayRaceID(mysql.getDisplayRaceID());
                postgres.setDisplaySexID(mysql.getDisplaySexID());
                postgres.setSkinID(mysql.getSkinID());
                postgres.setFaceID(mysql.getFaceID());
                postgres.setHairStyleID(mysql.getHairStyleID());
                postgres.setHairColorID(mysql.getHairColorID());
                postgres.setFacialHairID(mysql.getFacialHairID());
                postgres.setNpcItemDisplay1(mysql.getNpcItemDisplay1());
                postgres.setNpcItemDisplay2(mysql.getNpcItemDisplay2());
                postgres.setNpcItemDisplay3(mysql.getNpcItemDisplay3());
                postgres.setNpcItemDisplay4(mysql.getNpcItemDisplay4());
                postgres.setNpcItemDisplay5(mysql.getNpcItemDisplay5());
                postgres.setNpcItemDisplay6(mysql.getNpcItemDisplay6());
                postgres.setNpcItemDisplay7(mysql.getNpcItemDisplay7());
                postgres.setNpcItemDisplay8(mysql.getNpcItemDisplay8());
                postgres.setNpcItemDisplay9(mysql.getNpcItemDisplay9());
                postgres.setNpcItemDisplay10(mysql.getNpcItemDisplay10());
                postgres.setNpcItemDisplay11(mysql.getNpcItemDisplay11());
                postgres.setFlags(mysql.getFlags());
                postgres.setBakeName(mysql.getBakeName());

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
