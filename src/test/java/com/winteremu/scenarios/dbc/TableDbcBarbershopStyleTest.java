package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcBarbershopStyle;
import com.winteremu.entity.postgres.PgDbcBarbershopStyle;
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
public class TableDbcBarbershopStyleTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcBarbershopStyleTest");

    @Test
    @Tag("dbc_barbershopstyle")
    @DisplayName("dbc_barbershopstyle.sql")
    @Description("Перелив данных для dbc_barbershopstyle.sql")
    public void convertTableDbcBarbershopStyle() {
        Query<MysqlDbcBarbershopStyle> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcBarbershopStyle", MysqlDbcBarbershopStyle.class);
        List<MysqlDbcBarbershopStyle> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcBarbershopStyle mysql = mysqlTable.get(i);
                PgDbcBarbershopStyle postgres = new PgDbcBarbershopStyle();

                postgres.setId(mysql.getId());
                postgres.setType(mysql.getType());

                postgres.setDisplayNameLangEnUS(mysql.getDisplayNameEnUs());
                postgres.setDisplayNameLangEnGB(mysql.getDisplayNameEnGb());
                postgres.setDisplayNameLangKoKR(mysql.getDisplayNameKoKr());
                postgres.setDisplayNameLangFrFR(mysql.getDisplayNameFrFr());
                postgres.setDisplayNameLangDeDE(mysql.getDisplayNameDeDe());
                postgres.setDisplayNameLangEnCN(mysql.getDisplayNameEnCn());
                postgres.setDisplayNameLangZhCN(mysql.getDisplayNameZhCn());
                postgres.setDisplayNameLangEnTW(mysql.getDisplayNameEnTw());
                postgres.setDisplayNameLangZhTW(mysql.getDisplayNameZhTw());
                postgres.setDisplayNameLangEsES(mysql.getDisplayNameEsEs());
                postgres.setDisplayNameLangEsMX(mysql.getDisplayNameEsMx());
                postgres.setDisplayNameLangRuRU(mysql.getDisplayNameRuRu());
                postgres.setDisplayNameLangPtPT(mysql.getDisplayNamePtPt());
                postgres.setDisplayNameLangPtBR(mysql.getDisplayNamePtBr());
                postgres.setDisplayNameLangItIT(mysql.getDisplayNameItIt());
                postgres.setDisplayNameLangUnk(mysql.getDisplayNameUnk());
                postgres.setDisplayNameLangMask(mysql.getDisplayNameLangMask());

                postgres.setDescriptionLangEnUS(mysql.getDescriptionEnUs());
                postgres.setDescriptionLangEnGB(mysql.getDescriptionEnGb());
                postgres.setDescriptionLangKoKR(mysql.getDescriptionKoKr());
                postgres.setDescriptionLangFrFR(mysql.getDescriptionFrFr());
                postgres.setDescriptionLangDeDE(mysql.getDescriptionDeDe());
                postgres.setDescriptionLangEnCN(mysql.getDescriptionEnCn());
                postgres.setDescriptionLangZhCN(mysql.getDescriptionZhCn());
                postgres.setDescriptionLangEnTW(mysql.getDescriptionEnTw());
                postgres.setDescriptionLangZhTW(mysql.getDescriptionZhTw());
                postgres.setDescriptionLangEsES(mysql.getDescriptionEsEs());
                postgres.setDescriptionLangEsMX(mysql.getDescriptionEsMx());
                postgres.setDescriptionLangRuRU(mysql.getDescriptionRuRu());
                postgres.setDescriptionLangPtPT(mysql.getDescriptionPtPt());
                postgres.setDescriptionLangPtBR(mysql.getDescriptionPtBr());
                postgres.setDescriptionLangItIT(mysql.getDescriptionItIt());
                postgres.setDescriptionLangUnk(mysql.getDescriptionUnk());
                postgres.setDescriptionLangMask(mysql.getDescriptionLangMask());

                postgres.setCostModifier(mysql.getCostModifier());
                postgres.setRace(mysql.getRace());
                postgres.setSex(mysql.getSex());
                postgres.setData(mysql.getData());

                // Сохраняем в PostgreSQL
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
