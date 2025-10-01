package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSummonProperties;
import com.winteremu.entity.mysql.dbc.MysqlDbcTalent;
import com.winteremu.entity.postgres.PgDbcSummonProperties;
import com.winteremu.entity.postgres.PgDbcTalent;
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
public class TableDbcTalentTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcTalentTest");

    @Test
    @Tag("dbc_talent")
    @DisplayName("dbc_talent.sql")
    @Description("Перелив данных для dbc_talent.sql")
    public void convertTableDbcSummonProperties() {
        Query<MysqlDbcTalent> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcTalent", MysqlDbcTalent.class);
        List<MysqlDbcTalent> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcTalent mysql = mysqlTable.get(i);
                PgDbcTalent pg = new PgDbcTalent();

                pg.setId(mysql.getId());
                pg.setTabId(mysql.getTabId());
                pg.setTierId(mysql.getTierId());
                pg.setColumnIndex(mysql.getColumnIndex());

                pg.setSpellRank1(mysql.getSpellRank1());
                pg.setSpellRank2(mysql.getSpellRank2());
                pg.setSpellRank3(mysql.getSpellRank3());
                pg.setSpellRank4(mysql.getSpellRank4());
                pg.setSpellRank5(mysql.getSpellRank5());
                pg.setSpellRank6(mysql.getSpellRank6());
                pg.setSpellRank7(mysql.getSpellRank7());
                pg.setSpellRank8(mysql.getSpellRank8());
                pg.setSpellRank9(mysql.getSpellRank9());

                pg.setPrereqTalent1(mysql.getPrereqTalent1());
                pg.setPrereqTalent2(mysql.getPrereqTalent2());
                pg.setPrereqTalent3(mysql.getPrereqTalent3());

                pg.setPrereqRank1(mysql.getPrereqRank1());
                pg.setPrereqRank2(mysql.getPrereqRank2());
                pg.setPrereqRank3(mysql.getPrereqRank3());

                pg.setFlags(mysql.getFlags());
                pg.setRequiredSpellId(mysql.getRequiredSpellId());
                pg.setCategoryMask1(mysql.getCategoryMask1());
                pg.setCategoryMask2(mysql.getCategoryMask2());

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
