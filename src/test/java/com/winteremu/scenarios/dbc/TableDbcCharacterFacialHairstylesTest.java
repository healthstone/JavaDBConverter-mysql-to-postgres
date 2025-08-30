package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcAuctionHouse;
import com.winteremu.entity.mysql.dbc.MysqlDbcCharacterFacialHairStyles;
import com.winteremu.entity.postgres.PgDbcAuctionHouse;
import com.winteremu.entity.postgres.PgDbcCharacterFacialHairstyles;
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
public class TableDbcCharacterFacialHairstylesTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcCharacterFacialHairstylesTest");

    @Test
    @Tag("dbc_characterfacialhairstyles")
    @DisplayName("dbc_characterfacialhairstyles.sql")
    @Description("Перелив данных для dbc_characterfacialhairstyles.sql")
    public void convertTableDbcCharacterFacialHairstyles() {
        Query<MysqlDbcCharacterFacialHairStyles> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcCharacterFacialHairStyles", MysqlDbcCharacterFacialHairStyles.class);
        List<MysqlDbcCharacterFacialHairStyles> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcCharacterFacialHairStyles mysql = mysqlTable.get(i);
                PgDbcCharacterFacialHairstyles postgres = new PgDbcCharacterFacialHairstyles();

                postgres.setId(mysql.getId());
                postgres.setRaceId(mysql.getRaceId());
                postgres.setSexId(mysql.getSexId());
                postgres.setVariationId(mysql.getVariationId());
                postgres.setGeoset1(mysql.getGeoset1());
                postgres.setGeoset2(mysql.getGeoset2());
                postgres.setGeoset3(mysql.getGeoset3());
                postgres.setGeoset4(mysql.getGeoset4());
                postgres.setGeoset5(mysql.getGeoset5());

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
