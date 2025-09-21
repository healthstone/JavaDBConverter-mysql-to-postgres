package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcGtRegenHpPerSpt;
import com.winteremu.entity.mysql.dbc.MysqlDbcMap;
import com.winteremu.entity.postgres.PgDbcGtRegenHpPerSpt;
import com.winteremu.entity.postgres.PgDbcMap;
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
public class TableDbcMapTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcMapTest");

    @Test
    @Tag("dbc_map")
    @DisplayName("dbc_map.sql")
    @Description("Перелив данных для dbc_map.sql")
    public void convertTableDbcMap() {
        Query<MysqlDbcMap> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcMap", MysqlDbcMap.class);
        List<MysqlDbcMap> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcMap mysql = mysqlTable.get(i);
                PgDbcMap pg = new PgDbcMap();

                pg.setId(mysql.getId());
                pg.setDirectory(mysql.getDirectory());
                pg.setInstanceType(mysql.getInstanceType());
                pg.setFlags(mysql.getFlags());
                pg.setPvp(mysql.getPvp());

                pg.setMapNameLangEnUs(mysql.getMapNameLangEnUs());
                pg.setMapNameLangEnGb(mysql.getMapNameLangEnGb());
                pg.setMapNameLangKoKr(mysql.getMapNameLangKoKr());
                pg.setMapNameLangFrFr(mysql.getMapNameLangFrFr());
                pg.setMapNameLangDeDe(mysql.getMapNameLangDeDe());
                pg.setMapNameLangEnCn(mysql.getMapNameLangEnCn());
                pg.setMapNameLangZhCn(mysql.getMapNameLangZhCn());
                pg.setMapNameLangEnTw(mysql.getMapNameLangEnTw());
                pg.setMapNameLangZhTw(mysql.getMapNameLangZhTw());
                pg.setMapNameLangEsEs(mysql.getMapNameLangEsEs());
                pg.setMapNameLangEsMx(mysql.getMapNameLangEsMx());
                pg.setMapNameLangRuRu(mysql.getMapNameLangRuRu());
                pg.setMapNameLangPtPt(mysql.getMapNameLangPtPt());
                pg.setMapNameLangPtBr(mysql.getMapNameLangPtBr());
                pg.setMapNameLangItIt(mysql.getMapNameLangItIt());
                pg.setMapNameLangUnk(mysql.getMapNameLangUnk());
                pg.setMapNameLangMask(mysql.getMapNameLangMask());

                pg.setAreaTableId(mysql.getAreaTableId());

                pg.setMapDescription0LangEnUs(mysql.getMapDescription0LangEnUs());
                pg.setMapDescription0LangEnGb(mysql.getMapDescription0LangEnGb());
                pg.setMapDescription0LangKoKr(mysql.getMapDescription0LangKoKr());
                pg.setMapDescription0LangFrFr(mysql.getMapDescription0LangFrFr());
                pg.setMapDescription0LangDeDe(mysql.getMapDescription0LangDeDe());
                pg.setMapDescription0LangEnCn(mysql.getMapDescription0LangEnCn());
                pg.setMapDescription0LangZhCn(mysql.getMapDescription0LangZhCn());
                pg.setMapDescription0LangEnTw(mysql.getMapDescription0LangEnTw());
                pg.setMapDescription0LangZhTw(mysql.getMapDescription0LangZhTw());
                pg.setMapDescription0LangEsEs(mysql.getMapDescription0LangEsEs());
                pg.setMapDescription0LangEsMx(mysql.getMapDescription0LangEsMx());
                pg.setMapDescription0LangRuRu(mysql.getMapDescription0LangRuRu());
                pg.setMapDescription0LangPtPt(mysql.getMapDescription0LangPtPt());
                pg.setMapDescription0LangPtBr(mysql.getMapDescription0LangPtBr());
                pg.setMapDescription0LangItIt(mysql.getMapDescription0LangItIt());
                pg.setMapDescription0LangUnk(mysql.getMapDescription0LangUnk());
                pg.setMapDescription0LangMask(mysql.getMapDescription0LangMask());

                pg.setMapDescription1LangEnUs(mysql.getMapDescription1LangEnUs());
                pg.setMapDescription1LangEnGb(mysql.getMapDescription1LangEnGb());
                pg.setMapDescription1LangKoKr(mysql.getMapDescription1LangKoKr());
                pg.setMapDescription1LangFrFr(mysql.getMapDescription1LangFrFr());
                pg.setMapDescription1LangDeDe(mysql.getMapDescription1LangDeDe());
                pg.setMapDescription1LangEnCn(mysql.getMapDescription1LangEnCn());
                pg.setMapDescription1LangZhCn(mysql.getMapDescription1LangZhCn());
                pg.setMapDescription1LangEnTw(mysql.getMapDescription1LangEnTw());
                pg.setMapDescription1LangZhTw(mysql.getMapDescription1LangZhTw());
                pg.setMapDescription1LangEsEs(mysql.getMapDescription1LangEsEs());
                pg.setMapDescription1LangEsMx(mysql.getMapDescription1LangEsMx());
                pg.setMapDescription1LangRuRu(mysql.getMapDescription1LangRuRu());
                pg.setMapDescription1LangPtPt(mysql.getMapDescription1LangPtPt());
                pg.setMapDescription1LangPtBr(mysql.getMapDescription1LangPtBr());
                pg.setMapDescription1LangItIt(mysql.getMapDescription1LangItIt());
                pg.setMapDescription1LangUnk(mysql.getMapDescription1LangUnk());
                pg.setMapDescription1LangMask(mysql.getMapDescription1LangMask());

                pg.setLoadingScreenId(mysql.getLoadingScreenId());
                pg.setMinimapIconScale(mysql.getMinimapIconScale());
                pg.setCorpseMapId(mysql.getCorpseMapId());
                pg.setCorpseX(mysql.getCorpseX());
                pg.setCorpseY(mysql.getCorpseY());
                pg.setTimeOfDayOverride(mysql.getTimeOfDayOverride());
                pg.setExpansionId(mysql.getExpansionId());
                pg.setRaidOffset(mysql.getRaidOffset());
                pg.setMaxPlayers(mysql.getMaxPlayers());

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
