package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.MysqlDbcSkillLine;
import com.winteremu.entity.postgres.PgDbcSkillLine;
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
public class TableDbcSKillLineTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSKillLineTest");

    @Test
    @Tag("dbc_skillline")
    @DisplayName("dbc_skillline.sql")
    @Description("Перелив данных для dbc_skillline.sql")
    public void convertTableDbcSKillLine() {
        Query<MysqlDbcSkillLine> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcSkillLine", MysqlDbcSkillLine.class);
        List<MysqlDbcSkillLine> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSkillLine mysql = mysqlTable.get(i);
                PgDbcSkillLine postgres = new PgDbcSkillLine();

                postgres.setId(mysql.getId());
                postgres.setCategoryId(mysql.getCategoryId());
                postgres.setSkillCostsId(mysql.getSkillCostsId());

                // DisplayName
                postgres.setDisplayNameEnUS(mysql.getDisplayNameEnUS());
                postgres.setDisplayNameEnGB(mysql.getDisplayNameEnGB());
                postgres.setDisplayNameKoKR(mysql.getDisplayNameKoKR());
                postgres.setDisplayNameFrFR(mysql.getDisplayNameFrFR());
                postgres.setDisplayNameDeDE(mysql.getDisplayNameDeDE());
                postgres.setDisplayNameEnCN(mysql.getDisplayNameEnCN());
                postgres.setDisplayNameZhCN(mysql.getDisplayNameZhCN());
                postgres.setDisplayNameEnTW(mysql.getDisplayNameEnTW());
                postgres.setDisplayNameZhTW(mysql.getDisplayNameZhTW());
                postgres.setDisplayNameEsES(mysql.getDisplayNameEsES());
                postgres.setDisplayNameEsMX(mysql.getDisplayNameEsMX());
                postgres.setDisplayNameRuRU(mysql.getDisplayNameRuRU());
                postgres.setDisplayNamePtPT(mysql.getDisplayNamePtPT());
                postgres.setDisplayNamePtBR(mysql.getDisplayNamePtBR());
                postgres.setDisplayNameItIT(mysql.getDisplayNameItIT());
                postgres.setDisplayNameUnk(mysql.getDisplayNameUnk());
                postgres.setDisplayNameMask(mysql.getDisplayNameMask());

                // Description
                postgres.setDescriptionEnUS(mysql.getDescriptionEnUS());
                postgres.setDescriptionEnGB(mysql.getDescriptionEnGB());
                postgres.setDescriptionKoKR(mysql.getDescriptionKoKR());
                postgres.setDescriptionFrFR(mysql.getDescriptionFrFR());
                postgres.setDescriptionDeDE(mysql.getDescriptionDeDE());
                postgres.setDescriptionEnCN(mysql.getDescriptionEnCN());
                postgres.setDescriptionZhCN(mysql.getDescriptionZhCN());
                postgres.setDescriptionEnTW(mysql.getDescriptionEnTW());
                postgres.setDescriptionZhTW(mysql.getDescriptionZhTW());
                postgres.setDescriptionEsES(mysql.getDescriptionEsES());
                postgres.setDescriptionEsMX(mysql.getDescriptionEsMX());
                postgres.setDescriptionRuRU(mysql.getDescriptionRuRU());
                postgres.setDescriptionPtPT(mysql.getDescriptionPtPT());
                postgres.setDescriptionPtBR(mysql.getDescriptionPtBR());
                postgres.setDescriptionItIT(mysql.getDescriptionItIT());
                postgres.setDescriptionUnk(mysql.getDescriptionUnk());
                postgres.setDescriptionMask(mysql.getDescriptionMask());

                // SpellIcon
                postgres.setSpellIconId(mysql.getSpellIconId());

                // AlternateVerb
                postgres.setAlternateVerbEnUS(mysql.getAlternateVerbEnUS());
                postgres.setAlternateVerbEnGB(mysql.getAlternateVerbEnGB());
                postgres.setAlternateVerbKoKR(mysql.getAlternateVerbKoKR());
                postgres.setAlternateVerbFrFR(mysql.getAlternateVerbFrFR());
                postgres.setAlternateVerbDeDE(mysql.getAlternateVerbDeDE());
                postgres.setAlternateVerbEnCN(mysql.getAlternateVerbEnCN());
                postgres.setAlternateVerbZhCN(mysql.getAlternateVerbZhCN());
                postgres.setAlternateVerbEnTW(mysql.getAlternateVerbEnTW());
                postgres.setAlternateVerbZhTW(mysql.getAlternateVerbZhTW());
                postgres.setAlternateVerbEsES(mysql.getAlternateVerbEsES());
                postgres.setAlternateVerbEsMX(mysql.getAlternateVerbEsMX());
                postgres.setAlternateVerbRuRU(mysql.getAlternateVerbRuRU());
                postgres.setAlternateVerbPtPT(mysql.getAlternateVerbPtPT());
                postgres.setAlternateVerbPtBR(mysql.getAlternateVerbPtBR());
                postgres.setAlternateVerbItIT(mysql.getAlternateVerbItIT());
                postgres.setAlternateVerbUnk(mysql.getAlternateVerbUnk());
                postgres.setAlternateVerbMask(mysql.getAlternateVerbMask());

                // CanLink
                postgres.setCanLink(mysql.getCanLink());

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
