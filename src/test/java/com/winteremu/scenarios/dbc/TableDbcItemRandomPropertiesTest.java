package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcItemLimitCategory;
import com.winteremu.entity.mysql.dbc.MysqlDbcItemRandomProperties;
import com.winteremu.entity.postgres.PgDbcItemLimitCategory;
import com.winteremu.entity.postgres.PgDbcItemRandomProperties;
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
public class TableDbcItemRandomPropertiesTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcItemLimitCategoryTest");

    @Test
    @Tag("dbc_itemrandomproperties")
    @DisplayName("dbc_itemrandomproperties.sql")
    @Description("Перелив данных для dbc_itemrandomproperties.sql")
    public void convertTableDbcItemRandomProperties() {
        Query<MysqlDbcItemRandomProperties> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcItemRandomProperties", MysqlDbcItemRandomProperties.class);
        List<MysqlDbcItemRandomProperties> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcItemRandomProperties mysql = mysqlTable.get(i);
                PgDbcItemRandomProperties pg = new PgDbcItemRandomProperties();

                pg.setId(mysql.getId());
                pg.setName(mysql.getName());
                pg.setEnchantment1(mysql.getEnchantment1());
                pg.setEnchantment2(mysql.getEnchantment2());
                pg.setEnchantment3(mysql.getEnchantment3());
                pg.setEnchantment4(mysql.getEnchantment4());
                pg.setEnchantment5(mysql.getEnchantment5());

                pg.setNameLangEnUS(mysql.getNameLangEnUS());
                pg.setNameLangEnGB(mysql.getNameLangEnGB());
                pg.setNameLangKoKR(mysql.getNameLangKoKR());
                pg.setNameLangFrFR(mysql.getNameLangFrFR());
                pg.setNameLangDeDE(mysql.getNameLangDeDE());
                pg.setNameLangEnCN(mysql.getNameLangEnCN());
                pg.setNameLangZhCN(mysql.getNameLangZhCN());
                pg.setNameLangEnTW(mysql.getNameLangEnTW());
                pg.setNameLangZhTW(mysql.getNameLangZhTW());
                pg.setNameLangEsES(mysql.getNameLangEsES());
                pg.setNameLangEsMX(mysql.getNameLangEsMX());
                pg.setNameLangRuRU(mysql.getNameLangRuRU());
                pg.setNameLangPtPT(mysql.getNameLangPtPT());
                pg.setNameLangPtBR(mysql.getNameLangPtBR());
                pg.setNameLangItIT(mysql.getNameLangItIT());
                pg.setNameLangUnk(mysql.getNameLangUnk());
                pg.setNameLangMask(mysql.getNameLangMask());

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
