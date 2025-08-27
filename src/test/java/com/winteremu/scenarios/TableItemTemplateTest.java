package com.winteremu.scenarios;

import com.winteremu.entity.mysql.MysqlItemTemplate;
import com.winteremu.entity.postgres.PostgresItemTemplate;
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
public class TableItemTemplateTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableConverter");

    @Test
    @Tag("item_template")
    @DisplayName("item_template.sql")
    @Description("Перелив данных для item_template.sql")
    public void convertTableItemTemplate() {
        Query<MysqlItemTemplate> query = mysqlDatabaseSession.createQuery("from MysqlItemTemplate", MysqlItemTemplate.class);
        List<MysqlItemTemplate> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlItemTemplate mysql = mysqlTable.get(i);
                PostgresItemTemplate postgres = new PostgresItemTemplate();

                // Перенос всех полей
                postgres.setEntry(mysql.getEntry());
                postgres.setClass_(mysql.getClass_());
                postgres.setSubclass(mysql.getSubclass());
                postgres.setSoundOverrideSubclass(mysql.getSoundOverrideSubclass());
                postgres.setName(mysql.getName());
                postgres.setDisplayId(mysql.getDisplayId().intValue());
                postgres.setQuality(mysql.getQuality());
                postgres.setFlags(mysql.getFlags().intValue());
                postgres.setFlagsExtra(mysql.getFlagsExtra().intValue());
                postgres.setBuyCount(mysql.getBuyCount());
                postgres.setBuyPrice(mysql.getBuyPrice());
                postgres.setSellPrice(mysql.getSellPrice().intValue());
                postgres.setInventoryType(mysql.getInventoryType());
                postgres.setAllowableClass(mysql.getAllowableClass());
                postgres.setAllowableRace(mysql.getAllowableRace());
                postgres.setItemLevel(mysql.getItemLevel().shortValue());
                postgres.setRequiredLevel(mysql.getRequiredLevel());
                postgres.setRequiredSkill(mysql.getRequiredSkill().shortValue());
                postgres.setRequiredSkillRank(mysql.getRequiredSkillRank().shortValue());
                postgres.setRequiredSpell(mysql.getRequiredSpell().intValue());
                postgres.setRequiredHonorRank(mysql.getRequiredHonorRank().intValue());
                postgres.setRequiredCityRank(mysql.getRequiredCityRank().intValue());
                postgres.setRequiredReputationFaction(mysql.getRequiredReputationFaction().shortValue());
                postgres.setRequiredReputationRank(mysql.getRequiredReputationRank().shortValue());
                postgres.setMaxCount(mysql.getMaxCount());
                postgres.setStackable(mysql.getStackable());
                postgres.setContainerSlots(mysql.getContainerSlots());
                postgres.setStatsCount(mysql.getStatsCount());

                // Статы
                postgres.setStatType1(mysql.getStatType1());
                postgres.setStatValue1(mysql.getStatValue1());
                postgres.setStatType2(mysql.getStatType2());
                postgres.setStatValue2(mysql.getStatValue2());
                postgres.setStatType3(mysql.getStatType3());
                postgres.setStatValue3(mysql.getStatValue3());
                postgres.setStatType4(mysql.getStatType4());
                postgres.setStatValue4(mysql.getStatValue4());
                postgres.setStatType5(mysql.getStatType5());
                postgres.setStatValue5(mysql.getStatValue5());
                postgres.setStatType6(mysql.getStatType6());
                postgres.setStatValue6(mysql.getStatValue6());
                postgres.setStatType7(mysql.getStatType7());
                postgres.setStatValue7(mysql.getStatValue7());
                postgres.setStatType8(mysql.getStatType8());
                postgres.setStatValue8(mysql.getStatValue8());
                postgres.setStatType9(mysql.getStatType9());
                postgres.setStatValue9(mysql.getStatValue9());
                postgres.setStatType10(mysql.getStatType10());
                postgres.setStatValue10(mysql.getStatValue10());

                postgres.setScalingStatDistribution(mysql.getScalingStatDistribution());
                postgres.setScalingStatValue(mysql.getScalingStatValue().intValue());

                // Урон
                postgres.setDmgMin1(mysql.getDmgMin1());
                postgres.setDmgMax1(mysql.getDmgMax1());
                postgres.setDmgType1(mysql.getDmgType1());
                postgres.setDmgMin2(mysql.getDmgMin2());
                postgres.setDmgMax2(mysql.getDmgMax2());
                postgres.setDmgType2(mysql.getDmgType2());

                postgres.setArmor(mysql.getArmor().shortValue());
                postgres.setHolyRes(mysql.getHolyRes());
                postgres.setFireRes(mysql.getFireRes());
                postgres.setNatureRes(mysql.getNatureRes());
                postgres.setFrostRes(mysql.getFrostRes());
                postgres.setShadowRes(mysql.getShadowRes());
                postgres.setArcaneRes(mysql.getArcaneRes());

                postgres.setDelay(mysql.getDelay().shortValue());
                postgres.setAmmoType(mysql.getAmmoType());
                postgres.setRangedModRange(mysql.getRangedModRange());

                // Заклинания 1
                postgres.setSpellId1(mysql.getSpellId1());
                postgres.setSpellTrigger1(mysql.getSpellTrigger1());
                postgres.setSpellCharges1(mysql.getSpellCharges1());
                postgres.setSpellPpmRate1(mysql.getSpellPpmRate1());
                postgres.setSpellCooldown1(mysql.getSpellCooldown1());
                postgres.setSpellCategory1(mysql.getSpellCategory1().shortValue());
                postgres.setSpellCategoryCooldown1(mysql.getSpellCategoryCooldown1());

                // Заклинания 2
                postgres.setSpellId2(mysql.getSpellId2());
                postgres.setSpellTrigger2(mysql.getSpellTrigger2());
                postgres.setSpellCharges2(mysql.getSpellCharges2());
                postgres.setSpellPpmRate2(mysql.getSpellPpmRate2());
                postgres.setSpellCooldown2(mysql.getSpellCooldown2());
                postgres.setSpellCategory2(mysql.getSpellCategory2().shortValue());
                postgres.setSpellCategoryCooldown2(mysql.getSpellCategoryCooldown2());

                // Заклинания 3
                postgres.setSpellId3(mysql.getSpellId3());
                postgres.setSpellTrigger3(mysql.getSpellTrigger3());
                postgres.setSpellCharges3(mysql.getSpellCharges3());
                postgres.setSpellPpmRate3(mysql.getSpellPpmRate3());
                postgres.setSpellCooldown3(mysql.getSpellCooldown3());
                postgres.setSpellCategory3(mysql.getSpellCategory3().shortValue());
                postgres.setSpellCategoryCooldown3(mysql.getSpellCategoryCooldown3());

                // Заклинания 4
                postgres.setSpellId4(mysql.getSpellId4());
                postgres.setSpellTrigger4(mysql.getSpellTrigger4());
                postgres.setSpellCharges4(mysql.getSpellCharges4());
                postgres.setSpellPpmRate4(mysql.getSpellPpmRate4());
                postgres.setSpellCooldown4(mysql.getSpellCooldown4());
                postgres.setSpellCategory4(mysql.getSpellCategory4().shortValue());
                postgres.setSpellCategoryCooldown4(mysql.getSpellCategoryCooldown4());

                // Заклинания 5
                postgres.setSpellId5(mysql.getSpellId5());
                postgres.setSpellTrigger5(mysql.getSpellTrigger5());
                postgres.setSpellCharges5(mysql.getSpellCharges5());
                postgres.setSpellPpmRate5(mysql.getSpellPpmRate5());
                postgres.setSpellCooldown5(mysql.getSpellCooldown5());
                postgres.setSpellCategory5(mysql.getSpellCategory5().shortValue());
                postgres.setSpellCategoryCooldown5(mysql.getSpellCategoryCooldown5());

                postgres.setBonding(mysql.getBonding());
                postgres.setDescription(mysql.getDescription());
                postgres.setPageText(mysql.getPageText().intValue());
                postgres.setLanguageId(mysql.getLanguageId());
                postgres.setPageMaterial(mysql.getPageMaterial());
                postgres.setStartQuest(mysql.getStartQuest().intValue());
                postgres.setLockId(mysql.getLockId().intValue());
                postgres.setMaterial(mysql.getMaterial());
                postgres.setSheath(mysql.getSheath());
                postgres.setRandomProperty(mysql.getRandomProperty());
                postgres.setRandomSuffix(mysql.getRandomSuffix().intValue());
                postgres.setBlock(mysql.getBlock().intValue());
                postgres.setItemSet(mysql.getItemSet().intValue());
                postgres.setMaxDurability(mysql.getMaxDurability().shortValue());
                postgres.setArea(mysql.getArea().intValue());
                postgres.setMap(mysql.getMap());
                postgres.setBagFamily(mysql.getBagFamily());
                postgres.setTotemCategory(mysql.getTotemCategory());

                // Сокеты
                postgres.setSocketColor1((short) mysql.getSocketColor1());
                postgres.setSocketContent1(mysql.getSocketContent1());
                postgres.setSocketColor2((short) mysql.getSocketColor2());
                postgres.setSocketContent2(mysql.getSocketContent2());
                postgres.setSocketColor3((short) mysql.getSocketColor3());
                postgres.setSocketContent3(mysql.getSocketContent3());

                postgres.setSocketBonus(mysql.getSocketBonus());
                postgres.setGemProperties(mysql.getGemProperties());
                postgres.setRequiredDisenchantSkill(mysql.getRequiredDisenchantSkill());
                postgres.setArmorDamageModifier(mysql.getArmorDamageModifier());
                postgres.setDuration(mysql.getDuration().intValue());
                postgres.setItemLimitCategory(mysql.getItemLimitCategory());
                postgres.setHolidayId(mysql.getHolidayId().intValue());
                postgres.setScriptName(mysql.getScriptName());
                postgres.setDisenchantId(mysql.getDisenchantId().intValue());
                postgres.setFoodType(mysql.getFoodType());
                postgres.setMinMoneyLoot(mysql.getMinMoneyLoot().intValue());
                postgres.setMaxMoneyLoot(mysql.getMaxMoneyLoot().intValue());
                postgres.setFlagsCustom(mysql.getFlagsCustom().intValue());
                postgres.setVerifiedBuild(mysql.getVerifiedBuild());
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
