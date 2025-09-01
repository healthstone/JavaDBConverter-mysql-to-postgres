package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcCharStartOutfit;
import com.winteremu.entity.mysql.dbc.MysqlDbcCharTitles;
import com.winteremu.entity.postgres.PgDbcCharStartOutfit;
import com.winteremu.entity.postgres.PgDbcCharTitles;
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
public class TableDbcCharTitlesTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcCharTitlesTest");

    @Test
    @Tag("dbc_chartitles")
    @DisplayName("dbc_chartitles.sql")
    @Description("Перелив данных для dbc_chartitles.sql")
    public void convertTableDbcCharTitles() {
        Query<MysqlDbcCharTitles> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcCharTitles", MysqlDbcCharTitles.class);
        List<MysqlDbcCharTitles> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcCharTitles mysql = mysqlTable.get(i);
                PgDbcCharTitles postgres = new PgDbcCharTitles();

                // Перенос всех полей
                postgres.setId(mysql.getId());
                postgres.setConditionId(mysql.getConditionId());

                postgres.setNameLangEnUs(mysql.getNameLangEnUs());
                postgres.setNameLangEnGb(mysql.getNameLangEnGb());
                postgres.setNameLangKoKr(mysql.getNameLangKoKr());
                postgres.setNameLangFrFr(mysql.getNameLangFrFr());
                postgres.setNameLangDeDe(mysql.getNameLangDeDe());
                postgres.setNameLangEnCn(mysql.getNameLangEnCn());
                postgres.setNameLangZhCn(mysql.getNameLangZhCn());
                postgres.setNameLangEnTw(mysql.getNameLangEnTw());
                postgres.setNameLangZhTw(mysql.getNameLangZhTw());
                postgres.setNameLangEsEs(mysql.getNameLangEsEs());
                postgres.setNameLangEsMx(mysql.getNameLangEsMx());
                postgres.setNameLangRuRu(mysql.getNameLangRuRu());
                postgres.setNameLangPtPt(mysql.getNameLangPtPt());
                postgres.setNameLangPtBr(mysql.getNameLangPtBr());
                postgres.setNameLangItIt(mysql.getNameLangItIt());
                postgres.setNameLangUnk(mysql.getNameLangUnk());
                postgres.setNameLangMask(mysql.getNameLangMask());

                postgres.setName1LangEnUs(mysql.getName1LangEnUs());
                postgres.setName1LangEnGb(mysql.getName1LangEnGb());
                postgres.setName1LangKoKr(mysql.getName1LangKoKr());
                postgres.setName1LangFrFr(mysql.getName1LangFrFr());
                postgres.setName1LangDeDe(mysql.getName1LangDeDe());
                postgres.setName1LangEnCn(mysql.getName1LangEnCn());
                postgres.setName1LangZhCn(mysql.getName1LangZhCn());
                postgres.setName1LangEnTw(mysql.getName1LangEnTw());
                postgres.setName1LangZhTw(mysql.getName1LangZhTw());
                postgres.setName1LangEsEs(mysql.getName1LangEsEs());
                postgres.setName1LangEsMx(mysql.getName1LangEsMx());
                postgres.setName1LangRuRu(mysql.getName1LangRuRu());
                postgres.setName1LangPtPt(mysql.getName1LangPtPt());
                postgres.setName1LangPtBr(mysql.getName1LangPtBr());
                postgres.setName1LangItIt(mysql.getName1LangItIt());
                postgres.setName1LangUnk(mysql.getName1LangUnk());
                postgres.setName1LangMask(mysql.getName1LangMask());

                postgres.setMaskId(mysql.getMaskId());

                postgresDatabaseSession.persist(postgres);

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
