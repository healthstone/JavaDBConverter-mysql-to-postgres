package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcCreatureDisplayInfo;
import com.winteremu.entity.mysql.dbc.MysqlDbcCreatureFamily;
import com.winteremu.entity.postgres.PgDbcCreatureDisplayInfo;
import com.winteremu.entity.postgres.PgDbcCreatureFamily;
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
public class TableDbcCreatureFamilyTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcCreatureDisplayInfoTest");

    @Test
    @Tag("dbc_creaturefamily")
    @DisplayName("dbc_creaturefamily.sql")
    @Description("Перелив данных для dbc_creaturefamily.sql")
    public void convertTableDbcCreatureFamily() {
        Query<MysqlDbcCreatureFamily> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcCreatureFamily", MysqlDbcCreatureFamily.class);
        List<MysqlDbcCreatureFamily> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcCreatureFamily mysql = mysqlTable.get(i);
                PgDbcCreatureFamily postgres = new PgDbcCreatureFamily();

                // Перенос числовых полей
                postgres.setId(mysql.getId());
                postgres.setMinScale(mysql.getMinScale());
                postgres.setMinScaleLevel(mysql.getMinScaleLevel());
                postgres.setMaxScale(mysql.getMaxScale());
                postgres.setMaxScaleLevel(mysql.getMaxScaleLevel());
                postgres.setSkillLine1(mysql.getSkillLine1());
                postgres.setSkillLine2(mysql.getSkillLine2());
                postgres.setPetFoodMask(mysql.getPetFoodMask());
                postgres.setPetTalentType(mysql.getPetTalentType());
                postgres.setCategoryEnumId(mysql.getCategoryEnumId());

// Перенос строк с локализациями
                postgres.setNameLangEnUs(mysql.getNameLangEnUS());
                postgres.setNameLangEnGb(mysql.getNameLangEnGB());
                postgres.setNameLangKoKr(mysql.getNameLangKoKR());
                postgres.setNameLangFrFr(mysql.getNameLangFrFR());
                postgres.setNameLangDeDe(mysql.getNameLangDeDE());
                postgres.setNameLangEnCn(mysql.getNameLangEnCN());
                postgres.setNameLangZhCn(mysql.getNameLangZhCN());
                postgres.setNameLangEnTw(mysql.getNameLangEnTW());
                postgres.setNameLangZhTw(mysql.getNameLangZhTW());
                postgres.setNameLangEsEs(mysql.getNameLangEsES());
                postgres.setNameLangEsMx(mysql.getNameLangEsMX());
                postgres.setNameLangRuRu(mysql.getNameLangRuRU());
                postgres.setNameLangPtPt(mysql.getNameLangPtPT());
                postgres.setNameLangPtBr(mysql.getNameLangPtBR());
                postgres.setNameLangItIt(mysql.getNameLangItIT());
                postgres.setNameLangUnk(mysql.getNameLangUnk());

// Перенос маски (unsigned → Long в postgres)
                postgres.setNameLangMask(mysql.getNameLangMask());

// Перенос иконки
                postgres.setIconFile(mysql.getIconFile());

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
