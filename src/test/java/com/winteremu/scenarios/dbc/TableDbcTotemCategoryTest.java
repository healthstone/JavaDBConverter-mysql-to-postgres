package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcTeamContributionPoints;
import com.winteremu.entity.mysql.dbc.MysqlDbcTotemCategory;
import com.winteremu.entity.postgres.PgDbcTeamContributionPoints;
import com.winteremu.entity.postgres.PgDbcTotemCategory;
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
public class TableDbcTotemCategoryTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcTotemCategoryTest");

    @Test
    @Tag("dbc_totemcategory")
    @DisplayName("dbc_totemcategory.sql")
    @Description("Перелив данных для dbc_totemcategory.sql")
    public void convertTableDbcTotemCategory() {
        Query<MysqlDbcTotemCategory> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcTotemCategory", MysqlDbcTotemCategory.class);
        List<MysqlDbcTotemCategory> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcTotemCategory mysql = mysqlTable.get(i);
                PgDbcTotemCategory pg = new PgDbcTotemCategory();

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
                pg.setTotemCategoryType(mysql.getTotemCategoryType());
                pg.setTotemCategoryMask(mysql.getTotemCategoryMask());

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
