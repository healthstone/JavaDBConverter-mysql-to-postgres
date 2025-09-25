package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcScalingStatDistribution;
import com.winteremu.entity.mysql.dbc.MysqlDbcScalingStatValues;
import com.winteremu.entity.postgres.PgDbcScalingStatDistribution;
import com.winteremu.entity.postgres.PgDbcScalingStatValues;
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
public class TableDbcScalingStatValuesTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcScalingStatValuesTest");

    @Test
    @Tag("dbc_scalingstatvalues")
    @DisplayName("dbc_scalingstatvalues.sql")
    @Description("Перелив данных для dbc_scalingstatvalues.sql")
    public void convertTableDbcScalingStatValues() {
        Query<MysqlDbcScalingStatValues> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcScalingStatValues", MysqlDbcScalingStatValues.class);
        List<MysqlDbcScalingStatValues> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcScalingStatValues mysql = mysqlTable.get(i);
                PgDbcScalingStatValues pg = new PgDbcScalingStatValues();

                pg.setId(mysql.getId());
                pg.setCharLevel(mysql.getCharLevel());
                pg.setShoulderBudget(mysql.getShoulderBudget());
                pg.setTrinketBudget(mysql.getTrinketBudget());
                pg.setWeaponBudget1H(mysql.getWeaponBudget1H());
                pg.setRangedBudget(mysql.getRangedBudget());
                pg.setClothShoulderArmor(mysql.getClothShoulderArmor());
                pg.setLeatherShoulderArmor(mysql.getLeatherShoulderArmor());
                pg.setMailShoulderArmor(mysql.getMailShoulderArmor());
                pg.setPlateShoulderArmor(mysql.getPlateShoulderArmor());
                pg.setWeaponDps1H(mysql.getWeaponDps1H());
                pg.setWeaponDps2H(mysql.getWeaponDps2H());
                pg.setSpellcasterDps1H(mysql.getSpellcasterDps1H());
                pg.setSpellcasterDps2H(mysql.getSpellcasterDps2H());
                pg.setRangedDps(mysql.getRangedDps());
                pg.setWandDps(mysql.getWandDps());
                pg.setSpellPower(mysql.getSpellPower());
                pg.setPrimaryBudget(mysql.getPrimaryBudget());
                pg.setTertiaryBudget(mysql.getTertiaryBudget());
                pg.setClothCloakArmor(mysql.getClothCloakArmor());
                pg.setClothChestArmor(mysql.getClothChestArmor());
                pg.setLeatherChestArmor(mysql.getLeatherChestArmor());
                pg.setMailChestArmor(mysql.getMailChestArmor());
                pg.setPlateChestArmor(mysql.getPlateChestArmor());

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
