package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcItemRandomSuffix;
import com.winteremu.entity.mysql.dbc.MysqlDbcItemSet;
import com.winteremu.entity.postgres.PgDbcItemRandomSuffix;
import com.winteremu.entity.postgres.PgDbcItemSet;
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
public class TableDbcItemSetTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcItemSetTest");

    @Test
    @Tag("dbc_itemset")
    @DisplayName("dbc_itemset.sql")
    @Description("Перелив данных для dbc_itemset.sql")
    public void convertTableDbcItemSet() {
        Query<MysqlDbcItemSet> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcItemSet", MysqlDbcItemSet.class);
        List<MysqlDbcItemSet> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcItemSet mysql = mysqlTable.get(i);
                PgDbcItemSet pg = new PgDbcItemSet();

                pg.setId(mysql.getId());

                pg.setNameLangEnus(mysql.getNameLangEnus());
                pg.setNameLangEngb(mysql.getNameLangEngb());
                pg.setNameLangKokr(mysql.getNameLangKokr());
                pg.setNameLangFrfr(mysql.getNameLangFrfr());
                pg.setNameLangDede(mysql.getNameLangDede());
                pg.setNameLangEncn(mysql.getNameLangEncn());
                pg.setNameLangZhcn(mysql.getNameLangZhcn());
                pg.setNameLangEntw(mysql.getNameLangEntw());
                pg.setNameLangZhtw(mysql.getNameLangZhtw());
                pg.setNameLangEses(mysql.getNameLangEses());
                pg.setNameLangEsmx(mysql.getNameLangEsmx());
                pg.setNameLangRuru(mysql.getNameLangRuru());
                pg.setNameLangPtpt(mysql.getNameLangPtpt());
                pg.setNameLangPtbr(mysql.getNameLangPtbr());
                pg.setNameLangItit(mysql.getNameLangItit());
                pg.setNameLangUnk(mysql.getNameLangUnk());

                pg.setNameLangMask(mysql.getNameLangMask());

// ItemIDs
                pg.setItemId1(mysql.getItemId1());
                pg.setItemId2(mysql.getItemId2());
                pg.setItemId3(mysql.getItemId3());
                pg.setItemId4(mysql.getItemId4());
                pg.setItemId5(mysql.getItemId5());
                pg.setItemId6(mysql.getItemId6());
                pg.setItemId7(mysql.getItemId7());
                pg.setItemId8(mysql.getItemId8());
                pg.setItemId9(mysql.getItemId9());
                pg.setItemId10(mysql.getItemId10());
                pg.setItemId11(mysql.getItemId11());
                pg.setItemId12(mysql.getItemId12());
                pg.setItemId13(mysql.getItemId13());
                pg.setItemId14(mysql.getItemId14());
                pg.setItemId15(mysql.getItemId15());
                pg.setItemId16(mysql.getItemId16());
                pg.setItemId17(mysql.getItemId17());

// SetSpellIDs
                pg.setSetSpellId1(mysql.getSetSpellId1());
                pg.setSetSpellId2(mysql.getSetSpellId2());
                pg.setSetSpellId3(mysql.getSetSpellId3());
                pg.setSetSpellId4(mysql.getSetSpellId4());
                pg.setSetSpellId5(mysql.getSetSpellId5());
                pg.setSetSpellId6(mysql.getSetSpellId6());
                pg.setSetSpellId7(mysql.getSetSpellId7());
                pg.setSetSpellId8(mysql.getSetSpellId8());

// SetThresholds
                pg.setSetThreshold1(mysql.getSetThreshold1());
                pg.setSetThreshold2(mysql.getSetThreshold2());
                pg.setSetThreshold3(mysql.getSetThreshold3());
                pg.setSetThreshold4(mysql.getSetThreshold4());
                pg.setSetThreshold5(mysql.getSetThreshold5());
                pg.setSetThreshold6(mysql.getSetThreshold6());
                pg.setSetThreshold7(mysql.getSetThreshold7());
                pg.setSetThreshold8(mysql.getSetThreshold8());

                pg.setRequiredSkill(mysql.getRequiredSkill());
                pg.setRequiredSkillRank(mysql.getRequiredSkillRank());

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
