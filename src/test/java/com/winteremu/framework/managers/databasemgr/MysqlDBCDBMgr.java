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
                            .addAnnotatedClass(MysqlDbcSkillLine.class)
                            .addAnnotatedClass(MysqlDbcSkillRaceClassInfo.class)
                            .addAnnotatedClass(MysqlDbcCharStartOutfit.class)
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
