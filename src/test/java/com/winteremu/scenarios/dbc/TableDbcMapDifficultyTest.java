package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcMapDifficulty;
import com.winteremu.entity.postgres.PgDbcMapDifficulty;
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
public class TableDbcMapDifficultyTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcMapDifficultyTest");

    @Test
    @Tag("dbc_mapdifficulty")
    @DisplayName("dbc_mapdifficulty.sql")
    @Description("Перелив данных для dbc_mapdifficulty.sql")
    public void convertTableDbcMapDifficulty() {
        Query<MysqlDbcMapDifficulty> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcMapDifficulty", MysqlDbcMapDifficulty.class);
        List<MysqlDbcMapDifficulty> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcMapDifficulty mysql = mysqlTable.get(i);
                PgDbcMapDifficulty pg = new PgDbcMapDifficulty();

                pg.setId(mysql.getId());
                pg.setMapId(mysql.getMapId());
                pg.setDifficulty(mysql.getDifficulty());

                pg.setMessageLangEnUs(mysql.getMessageLangEnUs());
                pg.setMessageLangEnGb(mysql.getMessageLangEnGb());
                pg.setMessageLangKoKr(mysql.getMessageLangKoKr());
                pg.setMessageLangFrFr(mysql.getMessageLangFrFr());
                pg.setMessageLangDeDe(mysql.getMessageLangDeDe());
                pg.setMessageLangEnCn(mysql.getMessageLangEnCn());
                pg.setMessageLangZhCn(mysql.getMessageLangZhCn());
                pg.setMessageLangEnTw(mysql.getMessageLangEnTw());
                pg.setMessageLangZhTw(mysql.getMessageLangZhTw());
                pg.setMessageLangEsEs(mysql.getMessageLangEsEs());
                pg.setMessageLangEsMx(mysql.getMessageLangEsMx());
                pg.setMessageLangRuRu(mysql.getMessageLangRuRu());
                pg.setMessageLangPtPt(mysql.getMessageLangPtPt());
                pg.setMessageLangPtBr(mysql.getMessageLangPtBr());
                pg.setMessageLangItIt(mysql.getMessageLangItIt());
                pg.setMessageLangUnk(mysql.getMessageLangUnk());

                pg.setMessageLangMask(mysql.getMessageLangMask()); // int unsigned → Long
                pg.setRaidDuration(mysql.getRaidDuration());
                pg.setMaxPlayers(mysql.getMaxPlayers());
                pg.setDifficultyString(mysql.getDifficultyString());

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
