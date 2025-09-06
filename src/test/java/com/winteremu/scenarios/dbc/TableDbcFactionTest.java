package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcEmotesText;
import com.winteremu.entity.mysql.dbc.MysqlDbcFaction;
import com.winteremu.entity.postgres.PgDbcEmotesText;
import com.winteremu.entity.postgres.PgDbcFaction;
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
public class TableDbcFactionTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcFactionTest");

    @Test
    @Tag("dbc_faction")
    @DisplayName("dbc_faction.sql")
    @Description("Перелив данных для dbc_faction.sql")
    public void convertTableDbcFaction() {
        Query<MysqlDbcFaction> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcFaction", MysqlDbcFaction.class);
        List<MysqlDbcFaction> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcFaction mysql = mysqlTable.get(i);
                PgDbcFaction pg = new PgDbcFaction();

                pg.setId(mysql.getId());
                pg.setReputationIndex(mysql.getReputationIndex());

                pg.setReputationRaceMask1(mysql.getReputationRaceMask1());
                pg.setReputationRaceMask2(mysql.getReputationRaceMask2());
                pg.setReputationRaceMask3(mysql.getReputationRaceMask3());
                pg.setReputationRaceMask4(mysql.getReputationRaceMask4());

                pg.setReputationClassMask1(mysql.getReputationClassMask1());
                pg.setReputationClassMask2(mysql.getReputationClassMask2());
                pg.setReputationClassMask3(mysql.getReputationClassMask3());
                pg.setReputationClassMask4(mysql.getReputationClassMask4());

                pg.setReputationBase1(mysql.getReputationBase1());
                pg.setReputationBase2(mysql.getReputationBase2());
                pg.setReputationBase3(mysql.getReputationBase3());
                pg.setReputationBase4(mysql.getReputationBase4());

                pg.setReputationFlags1(mysql.getReputationFlags1());
                pg.setReputationFlags2(mysql.getReputationFlags2());
                pg.setReputationFlags3(mysql.getReputationFlags3());
                pg.setReputationFlags4(mysql.getReputationFlags4());

                pg.setParentFactionId(mysql.getParentFactionId());
                pg.setParentFactionMod1(mysql.getParentFactionMod1());
                pg.setParentFactionMod2(mysql.getParentFactionMod2());
                pg.setParentFactionCap1(mysql.getParentFactionCap1());
                pg.setParentFactionCap2(mysql.getParentFactionCap2());

                // --- Names ---
                pg.setNameLangEnUs(mysql.getNameLangEnUs());
                pg.setNameLangEnGb(mysql.getNameLangEnGb());
                pg.setNameLangKoKr(mysql.getNameLangKoKr());
                pg.setNameLangFrFr(mysql.getNameLangFrFr());
                pg.setNameLangDeDe(mysql.getNameLangDeDe());
                pg.setNameLangEnCn(mysql.getNameLangEnCn());
                pg.setNameLangZhCn(mysql.getNameLangZhCn());
                pg.setNameLangEnTw(mysql.getNameLangEnTw());
                pg.setNameLangZhTw(mysql.getNameLangZhTw());
                pg.setNameLangEsEs(mysql.getNameLangEsEs());
                pg.setNameLangEsMx(mysql.getNameLangEsMx());
                pg.setNameLangRuRu(mysql.getNameLangRuRu());
                pg.setNameLangPtPt(mysql.getNameLangPtPt());
                pg.setNameLangPtBr(mysql.getNameLangPtBr());
                pg.setNameLangItIt(mysql.getNameLangItIt());
                pg.setNameLangUnk(mysql.getNameLangUnk());
                pg.setNameLangMask(mysql.getNameLangMask());

                // --- Descriptions ---
                pg.setDescriptionLangEnUs(mysql.getDescriptionLangEnUs());
                pg.setDescriptionLangEnGb(mysql.getDescriptionLangEnGb());
                pg.setDescriptionLangKoKr(mysql.getDescriptionLangKoKr());
                pg.setDescriptionLangFrFr(mysql.getDescriptionLangFrFr());
                pg.setDescriptionLangDeDe(mysql.getDescriptionLangDeDe());
                pg.setDescriptionLangEnCn(mysql.getDescriptionLangEnCn());
                pg.setDescriptionLangZhCn(mysql.getDescriptionLangZhCn());
                pg.setDescriptionLangEnTw(mysql.getDescriptionLangEnTw());
                pg.setDescriptionLangZhTw(mysql.getDescriptionLangZhTw());
                pg.setDescriptionLangEsEs(mysql.getDescriptionLangEsEs());
                pg.setDescriptionLangEsMx(mysql.getDescriptionLangEsMx());
                pg.setDescriptionLangRuRu(mysql.getDescriptionLangRuRu());
                pg.setDescriptionLangPtPt(mysql.getDescriptionLangPtPt());
                pg.setDescriptionLangPtBr(mysql.getDescriptionLangPtBr());
                pg.setDescriptionLangItIt(mysql.getDescriptionLangItIt());
                pg.setDescriptionLangUnk(mysql.getDescriptionLangUnk());
                pg.setDescriptionLangMask(mysql.getDescriptionLangMask());

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
