package com.winteremu.framework.managers.databasemgr;

import com.winteremu.entity.postgres.*;
import com.winteremu.framework.config.database.DatabaseCfg;
import com.winteremu.framework.managers.configmgr.ConfigMgr;
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

@Singleton
public class PostgresDBMgr {
    private static final Logger logger = LoggerFactory.getLogger("PostgresDBMgr");

    @Getter
    private static SessionFactory sessionFactory;

    private static StandardServiceRegistry registry;

    public static void initialize() {
        DatabaseCfg databaseCfg = ConfigMgr.getConfig().getDatabase_postgres();
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
                            .addAnnotatedClass(PgDbcAchievement.class)
                            .addAnnotatedClass(PgDbcAchievementCriteria.class)
                            .addAnnotatedClass(PgDbcAreaTable.class)
                            .addAnnotatedClass(PgDbcAreaGroup.class)
                            .addAnnotatedClass(PgDbcAreaTrigger.class)
                            .addAnnotatedClass(PgDbcAuctionHouse.class)
                            .addAnnotatedClass(PgDbcBannedAddons.class)
                            .addAnnotatedClass(PgDbcBarbershopStyle.class)
                            .addAnnotatedClass(PgDbcCharacterFacialHairstyles.class)
                            .addAnnotatedClass(PgDbcCharSections.class)
                            .addAnnotatedClass(PgDbcCharTitles.class)
                            .addAnnotatedClass(PgDbcCreatureDisplayInfo.class)
                            .addAnnotatedClass(PgDbcCreatureDisplayInfoExtra.class)
                            .addAnnotatedClass(PgDbcCreatureFamily.class)
                            .addAnnotatedClass(PgDbcCreatureModelData.class)
                            .addAnnotatedClass(PgDbcCreatureSpellData.class)
                            .addAnnotatedClass(PgDbcDungeonEncounter.class)
                            .addAnnotatedClass(PgDbcDurabilityCosts.class)
                            .addAnnotatedClass(PgDbcEmotes.class)
                            .addAnnotatedClass(PgDbcEmotesText.class)
                            .addAnnotatedClass(PgDbcEmotesTextSound.class)
                            .addAnnotatedClass(PgDbcFaction.class)
                            .addAnnotatedClass(PgDbcFactionTemplate.class)
                            .addAnnotatedClass(PgDbcGameObjectDisplayInfo.class)
                            .addAnnotatedClass(PgDbcGemProperties.class)
                            .addAnnotatedClass(PgDbcGlyphProperties.class)
                            .addAnnotatedClass(PgDbcGtCombatRatings.class)
                            .addAnnotatedClass(PgDbcGtChanceToMeleeCrit.class)
                            .addAnnotatedClass(PgDbcGtChanceToSpellCrit.class)
                            .addAnnotatedClass(PgDbcGtoctClassCombatRatingScalar.class)
                            .addAnnotatedClass(PgDbcGtoctRegenHP.class)
                            .addAnnotatedClass(PgDbcGtoctRegenMP.class)
                            .addAnnotatedClass(PgDbcGtRegenHpPerSpt.class)
                            .addAnnotatedClass(PgDbcGtRegenMpPerSpt.class)
                            .addAnnotatedClass(PgDbcHolidays.class)
                            .addAnnotatedClass(PgDbcItem.class)
                            .addAnnotatedClass(PgDbcItemDisplayInfo.class)
                            .addAnnotatedClass(PgDbcItemExtendedCost.class)
                            .addAnnotatedClass(PgDbcItemLimitCategory.class)
                            .addAnnotatedClass(PgDbcItemRandomProperties.class)
                            .addAnnotatedClass(PgDbcItemRandomSuffix.class)
                            .addAnnotatedClass(PgDbcItemSet.class)
                            .addAnnotatedClass(PgDbcLfgDungeons.class)
                            .addAnnotatedClass(PgDbcLight.class)
                            .addAnnotatedClass(PgDbcLock.class)
                            .addAnnotatedClass(PgDbcMailTemplate.class)
                            .addAnnotatedClass(PgDbcMap.class)
                            .addAnnotatedClass(PgDbcMapDifficulty.class)
                            .addAnnotatedClass(PgDbcNamesProfanity.class)
                            .addAnnotatedClass(PgDbcNamesReserved.class)
                            .addAnnotatedClass(PgDbcPvPDifficulty.class)
                            .addAnnotatedClass(PgDbcQuestXp.class)
                            .addAnnotatedClass(PgDbcRandPropPoints.class)
                            .addAnnotatedClass(PgDbcSkillLine.class)
                            .addAnnotatedClass(PgDbcSkillRaceClassInfo.class)
                            .addAnnotatedClass(PgDbcCharStartOutfit.class)
                            .addAnnotatedClass(PostgresItemTemplate.class)
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
