package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcAreaTrigger;
import com.winteremu.entity.mysql.dbc.MysqlDbcAuctionHouse;
import com.winteremu.entity.postgres.PgDbcAreaTrigger;
import com.winteremu.entity.postgres.PgDbcAuctionHouse;
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
public class TableDbcAuctionHouseTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcAuctionHouseTest");

    @Test
    @Tag("dbc_auctionhouse")
    @DisplayName("dbc_auctionhouse.sql")
    @Description("Перелив данных для dbc_auctionhouse.sql")
    public void convertTableDbcAuctionHouse() {
        Query<MysqlDbcAuctionHouse> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcAuctionHouse", MysqlDbcAuctionHouse.class);
        List<MysqlDbcAuctionHouse> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcAuctionHouse mysql = mysqlTable.get(i);
                PgDbcAuctionHouse postgres = new PgDbcAuctionHouse();

                postgres.setId(mysql.getId());
                postgres.setFactionId(mysql.getFactionId());
                postgres.setDepositRate(mysql.getDepositRate());
                postgres.setConsignmentRate(mysql.getConsignmentRate());

                postgres.setNameLangEnUS(mysql.getNameLangEnUS());
                postgres.setNameLangEnGB(mysql.getNameLangEnGB());
                postgres.setNameLangKoKR(mysql.getNameLangKoKR());
                postgres.setNameLangFrFR(mysql.getNameLangFrFR());
                postgres.setNameLangDeDE(mysql.getNameLangDeDE());
                postgres.setNameLangEnCN(mysql.getNameLangEnCN());
                postgres.setNameLangZhCN(mysql.getNameLangZhCN());
                postgres.setNameLangEnTW(mysql.getNameLangEnTW());
                postgres.setNameLangZhTW(mysql.getNameLangZhTW());
                postgres.setNameLangEsES(mysql.getNameLangEsES());
                postgres.setNameLangEsMX(mysql.getNameLangEsMX());
                postgres.setNameLangRuRU(mysql.getNameLangRuRU());
                postgres.setNameLangPtPT(mysql.getNameLangPtPT());
                postgres.setNameLangPtBR(mysql.getNameLangPtBR());
                postgres.setNameLangItIT(mysql.getNameLangItIT());
                postgres.setNameLangUnk(mysql.getNameLangUnk());

                postgres.setNameLangMask(mysql.getNameLangMask());


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
