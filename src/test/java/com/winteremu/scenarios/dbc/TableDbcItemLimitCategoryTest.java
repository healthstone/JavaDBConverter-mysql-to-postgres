package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcGtRegenMpPerSpt;
import com.winteremu.entity.mysql.dbc.MysqlDbcItemLimitCategory;
import com.winteremu.entity.postgres.PgDbcGtRegenMpPerSpt;
import com.winteremu.entity.postgres.PgDbcItemLimitCategory;
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
public class TableDbcItemLimitCategoryTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcItemLimitCategoryTest");

    @Test
    @Tag("dbc_itemlimitcategory")
    @DisplayName("dbc_itemlimitcategory.sql")
    @Description("Перелив данных для dbc_itemlimitcategory.sql")
    public void convertTableDbcItemLimitCategory() {
        Query<MysqlDbcItemLimitCategory> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcItemLimitCategory", MysqlDbcItemLimitCategory.class);
        List<MysqlDbcItemLimitCategory> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcItemLimitCategory mysql = mysqlTable.get(i);
                PgDbcItemLimitCategory pg = new PgDbcItemLimitCategory();

                pg.setId(mysql.getId());

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
                pg.setQuantity(mysql.getQuantity());
                pg.setFlags(mysql.getFlags());

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
