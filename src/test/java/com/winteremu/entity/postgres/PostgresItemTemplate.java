package com.winteremu.entity.postgres;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "item_template", schema = "world")
@Data
public class PostgresItemTemplate {
    @Id
    @Column(name = "entry", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer entry;

    @Column(name = "class", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short class_;

    @Column(name = "subclass", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short subclass;

    @Column(name = "soundoverridesubclass", nullable = false, columnDefinition = "int2 DEFAULT '-1'::integer NOT NULL")
    private Short soundOverrideSubclass;

    @Column(name = "name", nullable = false, columnDefinition = "varchar(255) DEFAULT ''::character varying NOT NULL")
    private String name;

    @Column(name = "displayid", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer displayId;

    @Column(name = "quality", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short quality;

    @Column(name = "flags", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer flags;

    @Column(name = "flagsextra", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer flagsExtra;

    @Column(name = "buycount", nullable = false, columnDefinition = "int2 DEFAULT 1 NOT NULL")
    private Short buyCount;

    @Column(name = "buyprice", nullable = false, columnDefinition = "int8 DEFAULT 0 NOT NULL")
    private Long buyPrice;

    @Column(name = "sellprice", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer sellPrice;

    @Column(name = "inventorytype", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short inventoryType;

    @Column(name = "allowableclass", nullable = false, columnDefinition = "int4 DEFAULT '-1'::integer NOT NULL")
    private Integer allowableClass;

    @Column(name = "allowablerace", nullable = false, columnDefinition = "int4 DEFAULT '-1'::integer NOT NULL")
    private Integer allowableRace;

    @Column(name = "itemlevel", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short itemLevel;

    @Column(name = "requiredlevel", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short requiredLevel;

    @Column(name = "requiredskill", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short requiredSkill;

    @Column(name = "requiredskillrank", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short requiredSkillRank;

    @Column(name = "requiredspell", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer requiredSpell;

    @Column(name = "requiredhonorrank", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer requiredHonorRank;

    @Column(name = "requiredcityrank", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer requiredCityRank;

    @Column(name = "requiredreputationfaction", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short requiredReputationFaction;

    @Column(name = "requiredreputationrank", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short requiredReputationRank;

    @Column(name = "maxcount", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer maxCount;

    @Column(name = "stackable", columnDefinition = "int4 DEFAULT 1")
    private Integer stackable;

    @Column(name = "containerslots", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short containerSlots;

    @Column(name = "statscount", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statsCount;

    @Column(name = "stat_type1", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statType1;

    @Column(name = "stat_value1", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statValue1;

    @Column(name = "stat_type2", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statType2;

    @Column(name = "stat_value2", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statValue2;

    @Column(name = "stat_type3", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statType3;

    @Column(name = "stat_value3", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statValue3;

    @Column(name = "stat_type4", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statType4;

    @Column(name = "stat_value4", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statValue4;

    @Column(name = "stat_type5", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statType5;

    @Column(name = "stat_value5", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statValue5;

    @Column(name = "stat_type6", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statType6;

    @Column(name = "stat_value6", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statValue6;

    @Column(name = "stat_type7", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statType7;

    @Column(name = "stat_value7", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statValue7;

    @Column(name = "stat_type8", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statType8;

    @Column(name = "stat_value8", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statValue8;

    @Column(name = "stat_type9", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statType9;

    @Column(name = "stat_value9", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statValue9;

    @Column(name = "stat_type10", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statType10;

    @Column(name = "stat_value10", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short statValue10;

    @Column(name = "scalingstatdistribution", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short scalingStatDistribution;

    @Column(name = "scalingstatvalue", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer scalingStatValue;

    @Column(name = "dmg_min1", nullable = false, columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float dmgMin1;

    @Column(name = "dmg_max1", nullable = false, columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float dmgMax1;

    @Column(name = "dmg_type1", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short dmgType1;

    @Column(name = "dmg_min2", nullable = false, columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float dmgMin2;

    @Column(name = "dmg_max2", nullable = false, columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float dmgMax2;

    @Column(name = "dmg_type2", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short dmgType2;

    @Column(name = "armor", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short armor;

    @Column(name = "holy_res", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short holyRes;

    @Column(name = "fire_res", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short fireRes;

    @Column(name = "nature_res", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short natureRes;

    @Column(name = "frost_res", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short frostRes;

    @Column(name = "shadow_res", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short shadowRes;

    @Column(name = "arcane_res", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short arcaneRes;

    @Column(name = "delay", nullable = false, columnDefinition = "int2 DEFAULT 1000 NOT NULL")
    private Short delay;

    @Column(name = "ammo_type", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short ammoType;

    @Column(name = "rangedmodrange", nullable = false, columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float rangedModRange;

    @Column(name = "spellid_1", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer spellId1;

    @Column(name = "spelltrigger_1", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellTrigger1;

    @Column(name = "spellcharges_1", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellCharges1;

    @Column(name = "spellppmrate_1", nullable = false, columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float spellPpmRate1;

    @Column(name = "spellcooldown_1", nullable = false, columnDefinition = "int4 DEFAULT '-1'::integer NOT NULL")
    private Integer spellCooldown1;

    @Column(name = "spellcategory_1", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellCategory1;

    @Column(name = "spellcategorycooldown_1", nullable = false, columnDefinition = "int4 DEFAULT '-1'::integer NOT NULL")
    private Integer spellCategoryCooldown1;

    @Column(name = "spellid_2", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer spellId2;

    @Column(name = "spelltrigger_2", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellTrigger2;

    @Column(name = "spellcharges_2", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellCharges2;

    @Column(name = "spellppmrate_2", nullable = false, columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float spellPpmRate2;

    @Column(name = "spellcooldown_2", nullable = false, columnDefinition = "int4 DEFAULT '-1'::integer NOT NULL")
    private Integer spellCooldown2;

    @Column(name = "spellcategory_2", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellCategory2;

    @Column(name = "spellcategorycooldown_2", nullable = false, columnDefinition = "int4 DEFAULT '-1'::integer NOT NULL")
    private Integer spellCategoryCooldown2;

    @Column(name = "spellid_3", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer spellId3;

    @Column(name = "spelltrigger_3", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellTrigger3;

    @Column(name = "spellcharges_3", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellCharges3;

    @Column(name = "spellppmrate_3", nullable = false, columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float spellPpmRate3;

    @Column(name = "spellcooldown_3", nullable = false, columnDefinition = "int4 DEFAULT '-1'::integer NOT NULL")
    private Integer spellCooldown3;

    @Column(name = "spellcategory_3", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellCategory3;

    @Column(name = "spellcategorycooldown_3", nullable = false, columnDefinition = "int4 DEFAULT '-1'::integer NOT NULL")
    private Integer spellCategoryCooldown3;

    @Column(name = "spellid_4", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer spellId4;

    @Column(name = "spelltrigger_4", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellTrigger4;

    @Column(name = "spellcharges_4", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellCharges4;

    @Column(name = "spellppmrate_4", nullable = false, columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float spellPpmRate4;

    @Column(name = "spellcooldown_4", nullable = false, columnDefinition = "int4 DEFAULT '-1'::integer NOT NULL")
    private Integer spellCooldown4;

    @Column(name = "spellcategory_4", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellCategory4;

    @Column(name = "spellcategorycooldown_4", nullable = false, columnDefinition = "int4 DEFAULT '-1'::integer NOT NULL")
    private Integer spellCategoryCooldown4;

    @Column(name = "spellid_5", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer spellId5;

    @Column(name = "spelltrigger_5", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellTrigger5;

    @Column(name = "spellcharges_5", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellCharges5;

    @Column(name = "spellppmrate_5", nullable = false, columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float spellPpmRate5;

    @Column(name = "spellcooldown_5", nullable = false, columnDefinition = "int4 DEFAULT '-1'::integer NOT NULL")
    private Integer spellCooldown5;

    @Column(name = "spellcategory_5", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short spellCategory5;

    @Column(name = "spellcategorycooldown_5", nullable = false, columnDefinition = "int4 DEFAULT '-1'::integer NOT NULL")
    private Integer spellCategoryCooldown5;

    @Column(name = "bonding", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short bonding;

    @Column(name = "description", nullable = false, columnDefinition = "varchar(255) DEFAULT ''::character varying NOT NULL")
    private String description;

    @Column(name = "pagetext", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer pageText;

    @Column(name = "languageid", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short languageId;

    @Column(name = "pagematerial", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short pageMaterial;

    @Column(name = "startquest", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer startQuest;

    @Column(name = "lockid", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer lockId;

    @Column(name = "material", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short material;

    @Column(name = "sheath", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short sheath;

    @Column(name = "randomproperty", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer randomProperty;

    @Column(name = "randomsuffix", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer randomSuffix;

    @Column(name = "block", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer block;

    @Column(name = "itemset", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer itemSet;

    @Column(name = "maxdurability", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short maxDurability;

    @Column(name = "area", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer area;

    @Column(name = "map", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short map;

    @Column(name = "bagfamily", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer bagFamily;

    @Column(name = "totemcategory", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer totemCategory;

    @Column(name = "socketcolor_1", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short socketColor1;

    @Column(name = "socketcontent_1", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer socketContent1;

    @Column(name = "socketcolor_2", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short socketColor2;

    @Column(name = "socketcontent_2", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer socketContent2;

    @Column(name = "socketcolor_3", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short socketColor3;

    @Column(name = "socketcontent_3", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer socketContent3;

    @Column(name = "socketbonus", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer socketBonus;

    @Column(name = "gemproperties", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer gemProperties;

    @Column(name = "requireddisenchantskill", nullable = false, columnDefinition = "int2 DEFAULT '-1'::integer NOT NULL")
    private Short requiredDisenchantSkill;

    @Column(name = "armordamagemodifier", nullable = false, columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float armorDamageModifier;

    @Column(name = "duration", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer duration;

    @Column(name = "itemlimitcategory", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short itemLimitCategory;

    @Column(name = "holidayid", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer holidayId;

    @Column(name = "scriptname", nullable = false, columnDefinition = "varchar(64) DEFAULT ''::character varying NOT NULL")
    private String scriptName;

    @Column(name = "disenchantid", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer disenchantId;

    @Column(name = "foodtype", nullable = false, columnDefinition = "int2 DEFAULT 0 NOT NULL")
    private Short foodType;

    @Column(name = "minmoneyloot", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer minMoneyLoot;

    @Column(name = "maxmoneyloot", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer maxMoneyLoot;

    @Column(name = "flagscustom", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer flagsCustom;

    @Column(name = "verifiedbuild", columnDefinition = "int4")
    private Integer verifiedBuild;
}