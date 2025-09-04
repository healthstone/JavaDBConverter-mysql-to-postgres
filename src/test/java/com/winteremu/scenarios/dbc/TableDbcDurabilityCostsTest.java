package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcDungeonEncounter;
import com.winteremu.entity.mysql.dbc.MysqlDbcDurabilityCosts;
import com.winteremu.entity.postgres.PgDbcDungeonEncounter;
import com.winteremu.entity.postgres.PgDbcDurabilityCosts;
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
public class TableDbcDurabilityCostsTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcDurabilityCostsTest");

    @Test
    @Tag("dbc_durabilitycosts")
    @DisplayName("dbc_durabilitycosts.sql")
    @Description("Перелив данных для dbc_durabilitycosts.sql")
    public void convertTableDbcDurabilityCosts() {
        Query<MysqlDbcDurabilityCosts> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcDurabilityCosts", MysqlDbcDurabilityCosts.class);
        List<MysqlDbcDurabilityCosts> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcDurabilityCosts mysql = mysqlTable.get(i);
                PgDbcDurabilityCosts postgres = new PgDbcDurabilityCosts();

                postgres.setId(mysql.getId());

                postgres.setWeaponSubClassCost1(mysql.getWeaponSubClassCost1());
                postgres.setWeaponSubClassCost2(mysql.getWeaponSubClassCost2());
                postgres.setWeaponSubClassCost3(mysql.getWeaponSubClassCost3());
                postgres.setWeaponSubClassCost4(mysql.getWeaponSubClassCost4());
                postgres.setWeaponSubClassCost5(mysql.getWeaponSubClassCost5());
                postgres.setWeaponSubClassCost6(mysql.getWeaponSubClassCost6());
                postgres.setWeaponSubClassCost7(mysql.getWeaponSubClassCost7());
                postgres.setWeaponSubClassCost8(mysql.getWeaponSubClassCost8());
                postgres.setWeaponSubClassCost9(mysql.getWeaponSubClassCost9());
                postgres.setWeaponSubClassCost10(mysql.getWeaponSubClassCost10());
                postgres.setWeaponSubClassCost11(mysql.getWeaponSubClassCost11());
                postgres.setWeaponSubClassCost12(mysql.getWeaponSubClassCost12());
                postgres.setWeaponSubClassCost13(mysql.getWeaponSubClassCost13());
                postgres.setWeaponSubClassCost14(mysql.getWeaponSubClassCost14());
                postgres.setWeaponSubClassCost15(mysql.getWeaponSubClassCost15());
                postgres.setWeaponSubClassCost16(mysql.getWeaponSubClassCost16());
                postgres.setWeaponSubClassCost17(mysql.getWeaponSubClassCost17());
                postgres.setWeaponSubClassCost18(mysql.getWeaponSubClassCost18());
                postgres.setWeaponSubClassCost19(mysql.getWeaponSubClassCost19());
                postgres.setWeaponSubClassCost20(mysql.getWeaponSubClassCost20());
                postgres.setWeaponSubClassCost21(mysql.getWeaponSubClassCost21());

                postgres.setArmorSubClassCost1(mysql.getArmorSubClassCost1());
                postgres.setArmorSubClassCost2(mysql.getArmorSubClassCost2());
                postgres.setArmorSubClassCost3(mysql.getArmorSubClassCost3());
                postgres.setArmorSubClassCost4(mysql.getArmorSubClassCost4());
                postgres.setArmorSubClassCost5(mysql.getArmorSubClassCost5());
                postgres.setArmorSubClassCost6(mysql.getArmorSubClassCost6());
                postgres.setArmorSubClassCost7(mysql.getArmorSubClassCost7());
                postgres.setArmorSubClassCost8(mysql.getArmorSubClassCost8());

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
