package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.MysqlDbcAchievement;
import com.winteremu.entity.postgres.PgDbcAchievement;
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
public class TableDbcAchievementTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcAchievementTest");

    @Test
    @Tag("dbc_achievement")
    @DisplayName("dbc_achievement.sql")
    @Description("Перелив данных для dbc_achievement.sql")
    public void convertTableDbcAchievement() {
        Query<MysqlDbcAchievement> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcAchievement", MysqlDbcAchievement.class);
        List<MysqlDbcAchievement> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcAchievement mysql = mysqlTable.get(i);
                PgDbcAchievement postgres = new PgDbcAchievement();
                // Простые числовые поля
                postgres.setId(mysql.getId());
                postgres.setFaction(mysql.getFaction());
                postgres.setInstanceId(mysql.getInstanceId());
                postgres.setSupercedes(mysql.getSupercedes());
                postgres.setTitleMask(mysql.getTitleMask());
                postgres.setDescriptionMask(mysql.getDescriptionMask());
                postgres.setCategory(mysql.getCategory());
                postgres.setPoints(mysql.getPoints());
                postgres.setUiOrder(mysql.getUiOrder());
                postgres.setFlags(mysql.getFlags());
                postgres.setIconId(mysql.getIconId());
                postgres.setRewardMask(mysql.getRewardMask());
                postgres.setMinimumCriteria(mysql.getMinimumCriteria());
                postgres.setSharesCriteria(mysql.getSharesCriteria());

                // Title
                postgres.setTitleEnUS(mysql.getTitleEnUS());
                postgres.setTitleEnGB(mysql.getTitleEnGB());
                postgres.setTitleKoKR(mysql.getTitleKoKR());
                postgres.setTitleFrFR(mysql.getTitleFrFR());
                postgres.setTitleDeDE(mysql.getTitleDeDE());
                postgres.setTitleEnCN(mysql.getTitleEnCN());
                postgres.setTitleZhCN(mysql.getTitleZhCN());
                postgres.setTitleEnTW(mysql.getTitleEnTW());
                postgres.setTitleZhTW(mysql.getTitleZhTW());
                postgres.setTitleEsES(mysql.getTitleEsES());
                postgres.setTitleEsMX(mysql.getTitleEsMX());
                postgres.setTitleRuRU(mysql.getTitleRuRU());
                postgres.setTitlePtPT(mysql.getTitlePtPT());
                postgres.setTitlePtBR(mysql.getTitlePtBR());
                postgres.setTitleItIT(mysql.getTitleItIT());
                postgres.setTitleUnk(mysql.getTitleUnk());

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

                // Reward
                postgres.setRewardEnUS(mysql.getRewardEnUS());
                postgres.setRewardEnGB(mysql.getRewardEnGB());
                postgres.setRewardKoKR(mysql.getRewardKoKR());
                postgres.setRewardFrFR(mysql.getRewardFrFR());
                postgres.setRewardDeDE(mysql.getRewardDeDE());
                postgres.setRewardEnCN(mysql.getRewardEnCN());
                postgres.setRewardZhCN(mysql.getRewardZhCN());
                postgres.setRewardEnTW(mysql.getRewardEnTW());
                postgres.setRewardZhTW(mysql.getRewardZhTW());
                postgres.setRewardEsES(mysql.getRewardEsES());
                postgres.setRewardEsMX(mysql.getRewardEsMX());
                postgres.setRewardRuRU(mysql.getRewardRuRU());
                postgres.setRewardPtPT(mysql.getRewardPtPT());
                postgres.setRewardPtBR(mysql.getRewardPtBR());
                postgres.setRewardItIT(mysql.getRewardItIT());
                postgres.setRewardUnk(mysql.getRewardUnk());

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
