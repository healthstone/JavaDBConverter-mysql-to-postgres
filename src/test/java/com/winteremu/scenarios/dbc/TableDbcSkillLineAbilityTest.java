package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcScalingStatValues;
import com.winteremu.entity.mysql.dbc.MysqlDbcSkillLineAbility;
import com.winteremu.entity.postgres.PgDbcScalingStatValues;
import com.winteremu.entity.postgres.PgDbcSkillLineAbility;
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
public class TableDbcSkillLineAbilityTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSkillLineAbilityTest");

    @Test
    @Tag("dbc_skilllineability")
    @DisplayName("dbc_skilllineability.sql")
    @Description("Перелив данных для dbc_skilllineability.sql")
    public void convertTableDbcSkillLineAbility() {
        Query<MysqlDbcSkillLineAbility> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcSkillLineAbility", MysqlDbcSkillLineAbility.class);
        List<MysqlDbcSkillLineAbility> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSkillLineAbility mysql = mysqlTable.get(i);
                PgDbcSkillLineAbility pg = new PgDbcSkillLineAbility();

                pg.setId(mysql.getId());
                pg.setSkillLine(mysql.getSkillLine());
                pg.setSpell(mysql.getSpell());
                pg.setRaceMask(mysql.getRaceMask());
                pg.setClassMask(mysql.getClassMask());
                pg.setExcludeRace(mysql.getExcludeRace());
                pg.setExcludeClass(mysql.getExcludeClass());
                pg.setMinSkillLineRank(mysql.getMinSkillLineRank());
                pg.setSupercededBySpell(mysql.getSupercededBySpell());
                pg.setAcquireMethod(mysql.getAcquireMethod());
                pg.setTrivialSkillLineRankHigh(mysql.getTrivialSkillLineRankHigh());
                pg.setTrivialSkillLineRankLow(mysql.getTrivialSkillLineRankLow());
                pg.setTradeSkillCategoryId(mysql.getTradeSkillCategoryId());

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
