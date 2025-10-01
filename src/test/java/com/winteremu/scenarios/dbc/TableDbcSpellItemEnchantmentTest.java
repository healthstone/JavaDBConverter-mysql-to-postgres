package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSpellFocusObject;
import com.winteremu.entity.mysql.dbc.MysqlDbcSpellItemEnchantment;
import com.winteremu.entity.postgres.PgDbcSpellFocusObject;
import com.winteremu.entity.postgres.PgDbcSpellItemEnchantment;
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
public class TableDbcSpellItemEnchantmentTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSpellItemEnchantmentTest");

    @Test
    @Tag("dbc_spellitemenchantment")
    @DisplayName("dbc_spellitemenchantment.sql")
    @Description("Перелив данных для dbc_spellitemenchantment.sql")
    public void convertTableDbcSpellItemEnchantment() {
        Query<MysqlDbcSpellItemEnchantment> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcSpellItemEnchantment", MysqlDbcSpellItemEnchantment.class);
        List<MysqlDbcSpellItemEnchantment> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSpellItemEnchantment mysql = mysqlTable.get(i);
                PgDbcSpellItemEnchantment pg = new PgDbcSpellItemEnchantment();

                pg.setId(mysql.getId());
                pg.setCharges(mysql.getCharges());

                pg.setEffect1(mysql.getEffect1());
                pg.setEffect2(mysql.getEffect2());
                pg.setEffect3(mysql.getEffect3());

                pg.setEffectPointsMin1(mysql.getEffectPointsMin1());
                pg.setEffectPointsMin2(mysql.getEffectPointsMin2());
                pg.setEffectPointsMin3(mysql.getEffectPointsMin3());

                pg.setEffectPointsMax1(mysql.getEffectPointsMax1());
                pg.setEffectPointsMax2(mysql.getEffectPointsMax2());
                pg.setEffectPointsMax3(mysql.getEffectPointsMax3());

                pg.setEffectArg1(mysql.getEffectArg1());
                pg.setEffectArg2(mysql.getEffectArg2());
                pg.setEffectArg3(mysql.getEffectArg3());

                pg.setNameLangEnus(mysql.getNameLangEnUs());
                pg.setNameLangEngb(mysql.getNameLangEnGb());
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
                pg.setItemVisual(mysql.getItemVisual());
                pg.setFlags(mysql.getFlags());
                pg.setSrcItemId(mysql.getSrcItemId());
                pg.setConditionId(mysql.getConditionId());
                pg.setRequiredSkillId(mysql.getRequiredSkillId());
                pg.setRequiredSkillRank(mysql.getRequiredSkillRank());
                pg.setMinLevel(mysql.getMinLevel());

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
