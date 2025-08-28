package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.MysqlDbcAchievement;
import com.winteremu.entity.mysql.MysqlDbcAchievementCriteria;
import com.winteremu.entity.postgres.PgDbcAchievement;
import com.winteremu.entity.postgres.PgDbcAchievementCriteria;
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
public class TableDbcAchievementCriteriaTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcAchievementCriteriaTest");

    @Test
    @Tag("dbc_achievement_criteria")
    @DisplayName("dbc_achievement_criteria.sql")
    @Description("Перелив данных для dbc_achievement_criteria.sql")
    public void convertTableDbcAchievementCriteria() {
        Query<MysqlDbcAchievementCriteria> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcAchievementCriteria", MysqlDbcAchievementCriteria.class);
        List<MysqlDbcAchievementCriteria> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcAchievementCriteria mysql = mysqlTable.get(i);
                PgDbcAchievementCriteria postgres = new PgDbcAchievementCriteria();

                // Простые числовые поля
                postgres.setId(mysql.getId());
                postgres.setAchievementId(mysql.getAchievementId());
                postgres.setType(mysql.getType());
                postgres.setAssetId(mysql.getAssetId());
                postgres.setQuantity(mysql.getQuantity());
                postgres.setStartEvent(mysql.getStartEvent());
                postgres.setStartAsset(mysql.getStartAsset());
                postgres.setFailEvent(mysql.getFailEvent());
                postgres.setFailAsset(mysql.getFailAsset());
                postgres.setFlags(mysql.getFlags());
                postgres.setTimerStartEvent(mysql.getTimerStartEvent());
                postgres.setTimerAssetId(mysql.getTimerAssetId());
                postgres.setTimerTime(mysql.getTimerTime());
                postgres.setUiOrder(mysql.getUiOrder());
                postgres.setDescriptionLangMask(mysql.getDescriptionLangMask());

                // Локализованные описания
                postgres.setDescriptionLangEnUS(mysql.getDescriptionEnUS());
                postgres.setDescriptionLangEnGB(mysql.getDescriptionEnGB());
                postgres.setDescriptionLangKoKR(mysql.getDescriptionKoKR());
                postgres.setDescriptionLangFrFR(mysql.getDescriptionFrFR());
                postgres.setDescriptionLangDeDE(mysql.getDescriptionDeDE());
                postgres.setDescriptionLangEnCN(mysql.getDescriptionEnCN());
                postgres.setDescriptionLangZhCN(mysql.getDescriptionZhCN());
                postgres.setDescriptionLangEnTW(mysql.getDescriptionEnTW());
                postgres.setDescriptionLangZhTW(mysql.getDescriptionZhTW());
                postgres.setDescriptionLangEsES(mysql.getDescriptionEsES());
                postgres.setDescriptionLangEsMX(mysql.getDescriptionEsMX());
                postgres.setDescriptionLangRuRU(mysql.getDescriptionRuRU());
                postgres.setDescriptionLangPtPT(mysql.getDescriptionPtPT());
                postgres.setDescriptionLangPtBR(mysql.getDescriptionPtBR());
                postgres.setDescriptionLangItIT(mysql.getDescriptionItIT());
                postgres.setDescriptionLangUnk(mysql.getDescriptionUnk());

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
