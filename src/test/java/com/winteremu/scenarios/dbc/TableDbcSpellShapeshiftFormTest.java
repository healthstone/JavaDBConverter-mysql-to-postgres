package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSpellRuneCost;
import com.winteremu.entity.mysql.dbc.MysqlDbcSpellShapeshiftForm;
import com.winteremu.entity.postgres.PgDbcSpellRuneCost;
import com.winteremu.entity.postgres.PgDbcSpellShapeshiftForm;
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
public class TableDbcSpellShapeshiftFormTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSpellRuneCostTest");

    @Test
    @Tag("dbc_spellshapeshiftform")
    @DisplayName("dbc_spellshapeshiftform.sql")
    @Description("Перелив данных для dbc_spellshapeshiftform.sql")
    public void convertTableDbcSpellShapeshiftForm() {
        Query<MysqlDbcSpellShapeshiftForm> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcSpellShapeshiftForm", MysqlDbcSpellShapeshiftForm.class);
        List<MysqlDbcSpellShapeshiftForm> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSpellShapeshiftForm mysql = mysqlTable.get(i);
                PgDbcSpellShapeshiftForm pg = new PgDbcSpellShapeshiftForm();

                pg.setId(mysql.getId());
                pg.setBonusActionBar(mysql.getBonusActionBar());

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
                pg.setFlags(mysql.getFlags());
                pg.setCreatureType(mysql.getCreatureType());
                pg.setAttackIconId(mysql.getAttackIconId());
                pg.setCombatRoundTime(mysql.getCombatRoundTime());

                pg.setCreatureDisplayId1(mysql.getCreatureDisplayId1());
                pg.setCreatureDisplayId2(mysql.getCreatureDisplayId2());
                pg.setCreatureDisplayId3(mysql.getCreatureDisplayId3());
                pg.setCreatureDisplayId4(mysql.getCreatureDisplayId4());

                pg.setPresetSpellId1(mysql.getPresetSpellId1());
                pg.setPresetSpellId2(mysql.getPresetSpellId2());
                pg.setPresetSpellId3(mysql.getPresetSpellId3());
                pg.setPresetSpellId4(mysql.getPresetSpellId4());
                pg.setPresetSpellId5(mysql.getPresetSpellId5());
                pg.setPresetSpellId6(mysql.getPresetSpellId6());
                pg.setPresetSpellId7(mysql.getPresetSpellId7());
                pg.setPresetSpellId8(mysql.getPresetSpellId8());

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
