package com.winteremu.entity.mysql;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "item_template")
@Data
public class MysqlItemTemplate {
    @Id
    @Column(name = "entry", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer entry;

    @Column(name = "class", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short class_;

    @Column(name = "subclass", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short subclass;

    @Column(name = "SoundOverrideSubclass", columnDefinition = "TINYINT NOT NULL DEFAULT '-1'")
    private Byte soundOverrideSubclass;

    @Column(name = "name", columnDefinition = "VARCHAR(255) NOT NULL DEFAULT ''")
    private String name;

    @Column(name = "displayid", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long displayId;

    @Column(name = "Quality", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short quality;

    @Column(name = "Flags", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long flags;

    @Column(name = "FlagsExtra", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long flagsExtra;

    @Column(name = "BuyCount", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '1'")
    private Short buyCount;

    @Column(name = "BuyPrice", columnDefinition = "BIGINT NOT NULL DEFAULT '0'")
    private Long buyPrice;

    @Column(name = "SellPrice", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long sellPrice;

    @Column(name = "InventoryType", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short inventoryType;

    @Column(name = "AllowableClass", columnDefinition = "INT NOT NULL DEFAULT '-1'")
    private Integer allowableClass;

    @Column(name = "AllowableRace", columnDefinition = "INT NOT NULL DEFAULT '-1'")
    private Integer allowableRace;

    @Column(name = "ItemLevel", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer itemLevel;

    @Column(name = "RequiredLevel", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short requiredLevel;

    @Column(name = "RequiredSkill", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer requiredSkill;

    @Column(name = "RequiredSkillRank", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer requiredSkillRank;

    @Column(name = "requiredspell", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long requiredSpell;

    @Column(name = "requiredhonorrank", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long requiredHonorRank;

    @Column(name = "RequiredCityRank", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long requiredCityRank;

    @Column(name = "RequiredReputationFaction", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer requiredReputationFaction;

    @Column(name = "RequiredReputationRank", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer requiredReputationRank;

    @Column(name = "maxcount", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer maxCount;

    @Column(name = "stackable", columnDefinition = "INT DEFAULT '1'")
    private Integer stackable;

    @Column(name = "ContainerSlots", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short containerSlots;

    @Column(name = "StatsCount", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short statsCount;

    // Статистические характеристики 1-10
    @Column(name = "stat_type1", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short statType1;

    @Column(name = "stat_value1", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short statValue1;

    @Column(name = "stat_type2", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short statType2;

    @Column(name = "stat_value2", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short statValue2;

    @Column(name = "stat_type3", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short statType3;

    @Column(name = "stat_value3", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short statValue3;

    @Column(name = "stat_type4", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short statType4;

    @Column(name = "stat_value4", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short statValue4;

    @Column(name = "stat_type5", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short statType5;

    @Column(name = "stat_value5", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short statValue5;

    @Column(name = "stat_type6", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short statType6;

    @Column(name = "stat_value6", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short statValue6;

    @Column(name = "stat_type7", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short statType7;

    @Column(name = "stat_value7", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short statValue7;

    @Column(name = "stat_type8", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short statType8;

    @Column(name = "stat_value8", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short statValue8;

    @Column(name = "stat_type9", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short statType9;

    @Column(name = "stat_value9", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short statValue9;

    @Column(name = "stat_type10", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short statType10;

    @Column(name = "stat_value10", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short statValue10;

    @Column(name = "ScalingStatDistribution", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short scalingStatDistribution;

    @Column(name = "ScalingStatValue", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long scalingStatValue;

    // Поля урона
    @Column(name = "dmg_min1", columnDefinition = "FLOAT NOT NULL DEFAULT '0'")
    private Float dmgMin1;

    @Column(name = "dmg_max1", columnDefinition = "FLOAT NOT NULL DEFAULT '0'")
    private Float dmgMax1;

    @Column(name = "dmg_type1", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short dmgType1;

    @Column(name = "dmg_min2", columnDefinition = "FLOAT NOT NULL DEFAULT '0'")
    private Float dmgMin2;

    @Column(name = "dmg_max2", columnDefinition = "FLOAT NOT NULL DEFAULT '0'")
    private Float dmgMax2;

    @Column(name = "dmg_type2", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short dmgType2;

    @Column(name = "armor", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer armor;

    // Сопротивления
    @Column(name = "holy_res", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short holyRes;

    @Column(name = "fire_res", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short fireRes;

    @Column(name = "nature_res", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short natureRes;

    @Column(name = "frost_res", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short frostRes;

    @Column(name = "shadow_res", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short shadowRes;

    @Column(name = "arcane_res", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short arcaneRes;

    @Column(name = "delay", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '1000'")
    private Integer delay;

    @Column(name = "ammo_type", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short ammoType;

    @Column(name = "RangedModRange", columnDefinition = "FLOAT NOT NULL DEFAULT '0'")
    private Float rangedModRange;

    // Заклинания 1-5
    @Column(name = "spellid_1", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer spellId1;

    @Column(name = "spelltrigger_1", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short spellTrigger1;

    @Column(name = "spellcharges_1", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short spellCharges1;

    @Column(name = "spellppmRate_1", columnDefinition = "FLOAT NOT NULL DEFAULT '0'")
    private Float spellPpmRate1;

    @Column(name = "spellcooldown_1", columnDefinition = "INT NOT NULL DEFAULT '-1'")
    private Integer spellCooldown1;

    @Column(name = "spellcategory_1", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer spellCategory1;

    @Column(name = "spellcategorycooldown_1", columnDefinition = "INT NOT NULL DEFAULT '-1'")
    private Integer spellCategoryCooldown1;


    @Column(name = "spellid_2", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer spellId2;

    @Column(name = "spelltrigger_2", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short spellTrigger2;

    @Column(name = "spellcharges_2", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short spellCharges2;

    @Column(name = "spellppmRate_2", columnDefinition = "FLOAT NOT NULL DEFAULT '0'")
    private Float spellPpmRate2;

    @Column(name = "spellcooldown_2", columnDefinition = "INT NOT NULL DEFAULT '-1'")
    private Integer spellCooldown2;

    @Column(name = "spellcategory_2", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer spellCategory2;

    @Column(name = "spellcategorycooldown_2", columnDefinition = "INT NOT NULL DEFAULT '-1'")
    private Integer spellCategoryCooldown2;


    @Column(name = "spellid_3", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer spellId3;

    @Column(name = "spelltrigger_3", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short spellTrigger3;

    @Column(name = "spellcharges_3", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short spellCharges3;

    @Column(name = "spellppmRate_3", columnDefinition = "FLOAT NOT NULL DEFAULT '0'")
    private Float spellPpmRate3;

    @Column(name = "spellcooldown_3", columnDefinition = "INT NOT NULL DEFAULT '-1'")
    private Integer spellCooldown3;

    @Column(name = "spellcategory_3", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer spellCategory3;

    @Column(name = "spellcategorycooldown_3", columnDefinition = "INT NOT NULL DEFAULT '-1'")
    private Integer spellCategoryCooldown3;


    @Column(name = "spellid_4", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer spellId4;

    @Column(name = "spelltrigger_4", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short spellTrigger4;

    @Column(name = "spellcharges_4", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short spellCharges4;

    @Column(name = "spellppmRate_4", columnDefinition = "FLOAT NOT NULL DEFAULT '0'")
    private Float spellPpmRate4;

    @Column(name = "spellcooldown_4", columnDefinition = "INT NOT NULL DEFAULT '-1'")
    private Integer spellCooldown4;

    @Column(name = "spellcategory_4", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer spellCategory4;

    @Column(name = "spellcategorycooldown_4", columnDefinition = "INT NOT NULL DEFAULT '-1'")
    private Integer spellCategoryCooldown4;


    @Column(name = "spellid_5", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer spellId5;

    @Column(name = "spelltrigger_5", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short spellTrigger5;

    @Column(name = "spellcharges_5", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short spellCharges5;

    @Column(name = "spellppmRate_5", columnDefinition = "FLOAT NOT NULL DEFAULT '0'")
    private Float spellPpmRate5;

    @Column(name = "spellcooldown_5", columnDefinition = "INT NOT NULL DEFAULT '-1'")
    private Integer spellCooldown5;

    @Column(name = "spellcategory_5", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer spellCategory5;

    @Column(name = "spellcategorycooldown_5", columnDefinition = "INT NOT NULL DEFAULT '-1'")
    private Integer spellCategoryCooldown5;


    @Column(name = "bonding", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short bonding;

    @Column(name = "description", columnDefinition = "VARCHAR(255) NOT NULL DEFAULT ''")
    private String description;

    @Column(name = "PageText", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long pageText;

    @Column(name = "LanguageID", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short languageId;

    @Column(name = "PageMaterial", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short pageMaterial;

    @Column(name = "startquest", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long startQuest;

    @Column(name = "lockid", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long lockId;

    @Column(name = "Material", columnDefinition = "TINYINT NOT NULL DEFAULT '0'")
    private Short material;

    @Column(name = "sheath", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short sheath;

    @Column(name = "RandomProperty", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer randomProperty;

    @Column(name = "RandomSuffix", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long randomSuffix;

    @Column(name = "block", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long block;

    @Column(name = "itemset", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long itemSet;

    @Column(name = "MaxDurability", columnDefinition = "SMALLINT UNSIGNED NOT NULL DEFAULT '0'")
    private Integer maxDurability;

    @Column(name = "area", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long area;

    @Column(name = "Map", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short map;

    @Column(name = "BagFamily", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer bagFamily;

    @Column(name = "TotemCategory", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer totemCategory;

    // Сокеты
    @Column(name = "socketColor_1", columnDefinition = "TINYINT NOT NULL DEFAULT '0'")
    private Byte socketColor1;

    @Column(name = "socketContent_1", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer socketContent1;

    @Column(name = "socketColor_2", columnDefinition = "TINYINT NOT NULL DEFAULT '0'")
    private Byte socketColor2;

    @Column(name = "socketContent_2", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer socketContent2;

    @Column(name = "socketColor_3", columnDefinition = "TINYINT NOT NULL DEFAULT '0'")
    private Byte socketColor3;

    @Column(name = "socketContent_3", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer socketContent3;


    @Column(name = "socketBonus", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer socketBonus;

    @Column(name = "GemProperties", columnDefinition = "INT NOT NULL DEFAULT '0'")
    private Integer gemProperties;

    @Column(name = "RequiredDisenchantSkill", columnDefinition = "SMALLINT NOT NULL DEFAULT '-1'")
    private Short requiredDisenchantSkill;

    @Column(name = "ArmorDamageModifier", columnDefinition = "FLOAT NOT NULL DEFAULT '0'")
    private Float armorDamageModifier;

    @Column(name = "duration", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long duration;

    @Column(name = "ItemLimitCategory", columnDefinition = "SMALLINT NOT NULL DEFAULT '0'")
    private Short itemLimitCategory;

    @Column(name = "HolidayId", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long holidayId;

    @Column(name = "ScriptName", columnDefinition = "VARCHAR(64) NOT NULL DEFAULT ''")
    private String scriptName;

    @Column(name = "DisenchantID", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long disenchantId;

    @Column(name = "FoodType", columnDefinition = "TINYINT UNSIGNED NOT NULL DEFAULT '0'")
    private Short foodType;

    @Column(name = "minMoneyLoot", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long minMoneyLoot;

    @Column(name = "maxMoneyLoot", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long maxMoneyLoot;

    @Column(name = "flagsCustom", columnDefinition = "INT UNSIGNED NOT NULL DEFAULT '0'")
    private Long flagsCustom;

    @Column(name = "VerifiedBuild", columnDefinition = "INT")
    private Integer verifiedBuild;
}