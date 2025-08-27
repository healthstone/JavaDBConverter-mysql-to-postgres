package com.winteremu.scenarios;

import com.winteremu.entity.mysql.MysqlDbcSkillRaceClassInfo;
import com.winteremu.entity.postgres.PgDbcSkillRaceClassInfo;
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
public class TableDbcSkillRaceClassInfoTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableConverter");

    @Test
    @Tag("dbc_skillraceclassinfo")
    @DisplayName("dbc_skillraceclassinfo.sql")
    @Description("Перелив данных для dbc_skillraceclassinfo.sql")
    public void convertTableDbcSkillRaceClassInfo() {
        Query<MysqlDbcSkillRaceClassInfo> query = mysqlDatabaseSession.createQuery("from MysqlDbcSkillRaceClassInfo", MysqlDbcSkillRaceClassInfo.class);
        List<MysqlDbcSkillRaceClassInfo> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSkillRaceClassInfo mysql = mysqlTable.get(i);
                PgDbcSkillRaceClassInfo postgres = new PgDbcSkillRaceClassInfo();
                postgres.setId(mysql.getId());
                postgres.setSkillId(mysql.getSkillId());
                postgres.setRaceMask(mysql.getRaceMask());
                postgres.setClassMask(mysql.getClassMask());
                postgres.setFlags(mysql.getFlags());
                postgres.setMinLevel(mysql.getMinLevel());
                postgres.setSkillTierId(mysql.getSkillTierId());
                postgres.setSkillCostIndex(mysql.getSkillCostIndex());

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
