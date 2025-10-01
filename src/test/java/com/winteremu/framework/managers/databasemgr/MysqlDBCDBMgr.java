package com.winteremu.framework.managers.databasemgr;

import com.winteremu.entity.mysql.dbc.*;
import jakarta.inject.Singleton;
import jakarta.persistence.EntityManager;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.winteremu.framework.config.database.DatabaseCfg;
import com.winteremu.framework.managers.configmgr.ConfigMgr;

@Singleton
public class MysqlDBCDBMgr {
    private static final Logger logger = LoggerFactory.getLogger("MysqlDBCDBMgr");

    @Getter
    private static SessionFactory sessionFactory;

    private static StandardServiceRegistry registry;

    public static void initialize() {
        DatabaseCfg databaseCfg = ConfigMgr.getConfig().getDatabase_mysql_dbc();
        if (databaseCfg != null && !StringUtils.isEmpty(databaseCfg.getDatasource())) {
            loadConfigFile("databases/" + databaseCfg.getDatasource());
            createSessionFactory();
        }
        else {
            logger.info("DBMgr has been disabled");
        }
    }

    public static void closeSessionFactoryIfNeed() {
        if (sessionFactory != null) {
            sessionFactory.close();
            logger.info("factory has been successfully closed");
        }
    }

    public static Session createSession() {
        return sessionFactory.openSession();
    }

    public static void closeSession(Session session) {
        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    public static EntityManager createEntityManager() {
        return sessionFactory.createEntityManager();
    }

    private static void loadConfigFile(String configFileName) {
        registry =
                new StandardServiceRegistryBuilder()
                        .configure(configFileName)
                        .build();
    }

    private static void createSessionFactory() {
        try {
            sessionFactory =
                    new MetadataSources(registry)
                            .addAnnotatedClass(MysqlDbcAchievement.class)
                            .addAnnotatedClass(MysqlDbcAchievementCriteria.class)
                            .addAnnotatedClass(MysqlDbcAreaTable.class)
                            .addAnnotatedClass(MysqlDbcAreaGroup.class)
                            .addAnnotatedClass(MysqlDbcAreaTrigger.class)
                            .addAnnotatedClass(MysqlDbcAuctionHouse.class)
                            .addAnnotatedClass(MysqlDbcBannedAddons.class)
                            .addAnnotatedClass(MysqlDbcBarbershopStyle.class)
                            .addAnnotatedClass(MysqlDbcCharacterFacialHairStyles.class)
                            .addAnnotatedClass(MysqlDbcCharSections.class)
                            .addAnnotatedClass(MysqlDbcCharTitles.class)
                            .addAnnotatedClass(MysqlDbcCreatureDisplayInfo.class)
                            .addAnnotatedClass(MysqlDbcCreatureDisplayInfoExtra.class)
                            .addAnnotatedClass(MysqlDbcCreatureFamily.class)
                            .addAnnotatedClass(MysqlDbcCreatureModelData.class)
                            .addAnnotatedClass(MysqlDbcCreatureSpellData.class)
                            .addAnnotatedClass(MysqlDbcDungeonEncounter.class)
                            .addAnnotatedClass(MysqlDbcDurabilityCosts.class)
                            .addAnnotatedClass(MysqlDbcEmotes.class)
                            .addAnnotatedClass(MysqlDbcEmotesText.class)
                            .addAnnotatedClass(MysqlDbcEmotesTextSound.class)
                            .addAnnotatedClass(MysqlDbcFaction.class)
                            .addAnnotatedClass(MysqlDbcFactionTemplate.class)
                            .addAnnotatedClass(MysqlDbcGameObjectDisplayInfo.class)
                            .addAnnotatedClass(MysqlDbcGemProperties.class)
                            .addAnnotatedClass(MysqlDbcGlyphProperties.class)
                            .addAnnotatedClass(MysqlDbcGtCombatRatings.class)
                            .addAnnotatedClass(MysqlDbcGtChanceToMeleeCrit.class)
                            .addAnnotatedClass(MysqlDbcGtChanceToSpellCrit.class)
                            .addAnnotatedClass(MysqlDbcGtoctClassCombatRatingScalar.class)
                            .addAnnotatedClass(MysqlDbcGtoctRegenHP.class)
                            .addAnnotatedClass(MysqlDbcGtoctRegenMP.class)
                            .addAnnotatedClass(MysqlDbcGtRegenHpPerSpt.class)
                            .addAnnotatedClass(MysqlDbcGtRegenMpPerSpt.class)
                            .addAnnotatedClass(MysqlDbcHolidays.class)
                            .addAnnotatedClass(MysqlDbcItem.class)
                            .addAnnotatedClass(MysqlDbcItemDisplayInfo.class)
                            .addAnnotatedClass(MysqlDbcItemExtendedCost.class)
                            .addAnnotatedClass(MysqlDbcItemLimitCategory.class)
                            .addAnnotatedClass(MysqlDbcItemRandomProperties.class)
                            .addAnnotatedClass(MysqlDbcItemRandomSuffix.class)
                            .addAnnotatedClass(MysqlDbcItemSet.class)
                            .addAnnotatedClass(MysqlDbcLfgDungeons.class)
                            .addAnnotatedClass(MysqlDbcLight.class)
                            .addAnnotatedClass(MysqlDbcLock.class)
                            .addAnnotatedClass(MysqlDbcMailTemplate.class)
                            .addAnnotatedClass(MysqlDbcMap.class)
                            .addAnnotatedClass(MysqlDbcMapDifficulty.class)
                            .addAnnotatedClass(MysqlDbcNamesProfanity.class)
                            .addAnnotatedClass(MysqlDbcNamesReserved.class)
                            .addAnnotatedClass(MysqlDbcPvpDifficulty.class)
                            .addAnnotatedClass(MysqlDbcQuestXp.class)
                            .addAnnotatedClass(MysqlDbcRandPropPoints.class)
                            .addAnnotatedClass(MysqlDbcScalingStatDistribution.class)
                            .addAnnotatedClass(MysqlDbcScalingStatValues.class)
                            .addAnnotatedClass(MysqlDbcSkillLine.class)
                            .addAnnotatedClass(MysqlDbcSkillLineAbility.class)
                            .addAnnotatedClass(MysqlDbcSkillRaceClassInfo.class)
                            .addAnnotatedClass(MysqlDbcCharStartOutfit.class)
                            .addAnnotatedClass(MysqlDbcSoundEntries.class)
                            .addAnnotatedClass(MysqlDbcSpell.class)
                            .addAnnotatedClass(MysqlDbcSpellCastTimes.class)
                            .addAnnotatedClass(MysqlDbcSpellCategory.class)
                            .addAnnotatedClass(MysqlDbcSpellDifficulty.class)
                            .addAnnotatedClass(MysqlDbcSpellDuration.class)
                            .addAnnotatedClass(MysqlDbcSpellFocusObject.class)
                            .addAnnotatedClass(MysqlDbcSpellRuneCost.class)
                            .addAnnotatedClass(MysqlDbcSpellShapeshiftForm.class)
                            .addAnnotatedClass(MysqlDbcSpellVisual.class)
                            .addAnnotatedClass(MysqlDbcSummonProperties.class)
                            .addAnnotatedClass(MysqlDbcTalent.class)
                            .addAnnotatedClass(MysqlDbcTalentTab.class)
                            .addAnnotatedClass(MysqlDbcTaxiNodes.class)
                            .addAnnotatedClass(MysqlDbcTaxiPath.class)
                            .addAnnotatedClass(MysqlDbcTaxiPathNode.class)
                            .addAnnotatedClass(MysqlDbcTeamContributionPoints.class)
                            .addAnnotatedClass(MysqlDbcTotemCategory.class)
                            .addAnnotatedClass(MysqlDbcTransportAnimation.class)
                            .addAnnotatedClass(MysqlDbcTransportRotation.class)
                            .addAnnotatedClass(MysqlDbcVehicle.class)
                            .addAnnotatedClass(MysqlDbcVehicleSeat.class)
                            .addAnnotatedClass(MysqlDbcWmoAreaTable.class)
                            .addAnnotatedClass(MysqlDbcWorldMapArea.class)
                            .addAnnotatedClass(MysqlDbcWorldMapOverlay.class)
                            .addAnnotatedClass(MysqlDbcWorldSafeLocs.class)
                            .addAnnotatedClass(MysqlDbcSpellItemEnchantment.class)
                            .buildMetadata()
                            .buildSessionFactory();
            logger.info("has been initialized successfully");
        } catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we
            // had trouble building the SessionFactory so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
            logger.info("has been initialize failed: " + e.getMessage());
        }
    }
}
