package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcItemRandomSuffix;
import com.winteremu.entity.postgres.PgDbcItemRandomSuffix;
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
public class TableDbcItemRandomSuffixTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcItemRandomSuffixTest");

    @Test
    @Tag("dbc_itemrandomsuffix")
    @DisplayName("dbc_itemrandomsuffix.sql")
    @Description("Перелив данных для dbc_itemrandomsuffix.sql")
    public void convertTableDbcItemRandomSuffix() {
        Query<MysqlDbcItemRandomSuffix> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcItemRandomSuffix", MysqlDbcItemRandomSuffix.class);
        List<MysqlDbcItemRandomSuffix> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcItemRandomSuffix mysql = mysqlTable.get(i);
                PgDbcItemRandomSuffix pg = new PgDbcItemRandomSuffix();

                pg.setId(mysql.getId());

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
                pg.setInternalName(mysql.getInternalName());

                pg.setEnchantment1(mysql.getEnchantment1());
                pg.setEnchantment2(mysql.getEnchantment2());
                pg.setEnchantment3(mysql.getEnchantment3());
                pg.setEnchantment4(mysql.getEnchantment4());
                pg.setEnchantment5(mysql.getEnchantment5());

                pg.setAllocationPct1(mysql.getAllocationPct1());
                pg.setAllocationPct2(mysql.getAllocationPct2());
                pg.setAllocationPct3(mysql.getAllocationPct3());
                pg.setAllocationPct4(mysql.getAllocationPct4());
                pg.setAllocationPct5(mysql.getAllocationPct5());

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
