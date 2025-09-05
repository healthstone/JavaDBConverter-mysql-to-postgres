package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcEmotes;
import com.winteremu.entity.mysql.dbc.MysqlDbcEmotesText;
import com.winteremu.entity.postgres.PgDbcEmotes;
import com.winteremu.entity.postgres.PgDbcEmotesText;
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
public class TableDbcEmotesTextTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcEmotesTextTest");

    @Test
    @Tag("dbc_emotestext")
    @DisplayName("dbc_emotestext.sql")
    @Description("Перелив данных для dbc_emotestext.sql")
    public void convertTableDbcEmotesText() {
        Query<MysqlDbcEmotesText> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcEmotesText", MysqlDbcEmotesText.class);
        List<MysqlDbcEmotesText> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcEmotesText mysql = mysqlTable.get(i);
                PgDbcEmotesText postgres = new PgDbcEmotesText();

                postgres.setId(mysql.getId());
                postgres.setName(mysql.getName());
                postgres.setEmoteId(mysql.getEmoteId());

                postgres.setEmoteText1(mysql.getEmoteText1());
                postgres.setEmoteText2(mysql.getEmoteText2());
                postgres.setEmoteText3(mysql.getEmoteText3());
                postgres.setEmoteText4(mysql.getEmoteText4());
                postgres.setEmoteText5(mysql.getEmoteText5());
                postgres.setEmoteText6(mysql.getEmoteText6());
                postgres.setEmoteText7(mysql.getEmoteText7());
                postgres.setEmoteText8(mysql.getEmoteText8());
                postgres.setEmoteText9(mysql.getEmoteText9());
                postgres.setEmoteText10(mysql.getEmoteText10());
                postgres.setEmoteText11(mysql.getEmoteText11());
                postgres.setEmoteText12(mysql.getEmoteText12());
                postgres.setEmoteText13(mysql.getEmoteText13());
                postgres.setEmoteText14(mysql.getEmoteText14());
                postgres.setEmoteText15(mysql.getEmoteText15());
                postgres.setEmoteText16(mysql.getEmoteText16());

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
