package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spell", schema = "dbc")
@Data
public class PgDbcSpell {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "category", nullable = false)
    private Long category = 0L;

    @Column(name = "dispeltype", nullable = false)
    private Long dispelType = 0L;

    @Column(name = "mechanic", nullable = false)
    private Long mechanic = 0L;

    @Column(name = "attributes", nullable = false)
    private Long attributes = 0L;

    @Column(name = "attributesex", nullable = false)
    private Long attributesEx = 0L;

    @Column(name = "attributesexb", nullable = false)
    private Long attributesExB = 0L;

    @Column(name = "attributesexc", nullable = false)
    private Long attributesExC = 0L;

    @Column(name = "attributesexd", nullable = false)
    private Long attributesExD = 0L;

    @Column(name = "attributesexe", nullable = false)
    private Long attributesExE = 0L;

    @Column(name = "attributesexf", nullable = false)
    private Long attributesExF = 0L;

    @Column(name = "attributesexg", nullable = false)
    private Long attributesExG = 0L;

    @Column(name = "shapeshiftmask_1", nullable = false)
    private Long shapeshiftMask1 = 0L;

    @Column(name = "shapeshiftmask_2", nullable = false)
    private Long shapeshiftMask2 = 0L;

    @Column(name = "shapeshiftexclude_1", nullable = false)
    private Long shapeshiftExclude1 = 0L;

    @Column(name = "shapeshiftexclude_2", nullable = false)
    private Long shapeshiftExclude2 = 0L;

    @Column(name = "targets", nullable = false)
    private Long targets = 0L;

    @Column(name = "targetcreaturetype", nullable = false)
    private Long targetCreatureType = 0L;

    @Column(name = "requiresspellfocus", nullable = false)
    private Long requiresSpellFocus = 0L;

    @Column(name = "facingcasterflags", nullable = false)
    private Long facingCasterFlags = 0L;

    @Column(name = "casteraurastate", nullable = false)
    private Long casterAuraState = 0L;

    @Column(name = "targetaurastate", nullable = false)
    private Long targetAuraState = 0L;

    @Column(name = "excludecasteraurastate", nullable = false)
    private Long excludeCasterAuraState = 0L;

    @Column(name = "excludetargetaurastate", nullable = false)
    private Long excludeTargetAuraState = 0L;

    @Column(name = "casterauraspell", nullable = false)
    private Long casterAuraSpell = 0L;

    @Column(name = "targetauraspell", nullable = false)
    private Long targetAuraSpell = 0L;

    @Column(name = "excludecasterauraspell", nullable = false)
    private Long excludeCasterAuraSpell = 0L;

    @Column(name = "excludetargetauraspell", nullable = false)
    private Long excludeTargetAuraSpell = 0L;

    @Column(name = "castingtimeindex", nullable = false)
    private Long castingTimeIndex = 0L;

    @Column(name = "recoverytime", nullable = false)
    private Long recoveryTime = 0L;

    @Column(name = "categoryrecoverytime", nullable = false)
    private Long categoryRecoveryTime = 0L;

    @Column(name = "interruptflags", nullable = false)
    private Long interruptFlags = 0L;

    @Column(name = "aurainterruptflags", nullable = false)
    private Long auraInterruptFlags = 0L;

    @Column(name = "channelinterruptflags", nullable = false)
    private Long channelInterruptFlags = 0L;

    @Column(name = "proctypemask", nullable = false)
    private Long procTypeMask = 0L;

    @Column(name = "procchance", nullable = false)
    private Long procChance = 0L;

    @Column(name = "proccharges", nullable = false)
    private Long procCharges = 0L;

    @Column(name = "maxlevel", nullable = false)
    private Long maxLevel = 0L;

    @Column(name = "baselevel", nullable = false)
    private Long baseLevel = 0L;

    @Column(name = "spelllevel", nullable = false)
    private Long spellLevel = 0L;

    @Column(name = "durationindex", nullable = false)
    private Long durationIndex = 0L;

    @Column(name = "powertype", nullable = false)
    private Long powerType = 0L;

    @Column(name = "manacost", nullable = false)
    private Long manaCost = 0L;

    @Column(name = "manacostperlevel", nullable = false)
    private Long manaCostPerLevel = 0L;

    @Column(name = "manapersecond", nullable = false)
    private Long manaPerSecond = 0L;

    @Column(name = "manapersecondperlevel", nullable = false)
    private Long manaPerSecondPerLevel = 0L;

    @Column(name = "rangeindex", nullable = false)
    private Long rangeIndex = 0L;

    @Column(name = "speed", nullable = false)
    private Float speed = 0f;

    @Column(name = "modalnextspell", nullable = false)
    private Long modalNextSpell = 0L;

    @Column(name = "cumulativeaura", nullable = false)
    private Long cumulativeAura = 0L;

    @Column(name = "totem_1", nullable = false)
    private Long totem1 = 0L;

    @Column(name = "totem_2", nullable = false)
    private Long totem2 = 0L;

    @Column(name = "reagent_1", nullable = false)
    private Long reagent1 = 0L;

    @Column(name = "reagent_2", nullable = false)
    private Long reagent2 = 0L;

    @Column(name = "reagent_3", nullable = false)
    private Long reagent3 = 0L;

    @Column(name = "reagent_4", nullable = false)
    private Long reagent4 = 0L;

    @Column(name = "reagent_5", nullable = false)
    private Long reagent5 = 0L;

    @Column(name = "reagent_6", nullable = false)
    private Long reagent6 = 0L;

    @Column(name = "reagent_7", nullable = false)
    private Long reagent7 = 0L;

    @Column(name = "reagent_8", nullable = false)
    private Long reagent8 = 0L;

    @Column(name = "reagentcount_1", nullable = false)
    private Long reagentCount1 = 0L;

    @Column(name = "reagentcount_2", nullable = false)
    private Long reagentCount2 = 0L;

    @Column(name = "reagentcount_3", nullable = false)
    private Long reagentCount3 = 0L;

    @Column(name = "reagentcount_4", nullable = false)
    private Long reagentCount4 = 0L;

    @Column(name = "reagentcount_5", nullable = false)
    private Long reagentCount5 = 0L;

    @Column(name = "reagentcount_6", nullable = false)
    private Long reagentCount6 = 0L;

    @Column(name = "reagentcount_7", nullable = false)
    private Long reagentCount7 = 0L;

    @Column(name = "reagentcount_8", nullable = false)
    private Long reagentCount8 = 0L;

    @Column(name = "equippeditemclass", nullable = false)
    private Long equippedItemClass = 0L;

    @Column(name = "equippeditemsubclass", nullable = false)
    private Long equippedItemSubclass = 0L;

    @Column(name = "equippediteminvtypes", nullable = false)
    private Long equippedItemInvTypes = 0L;

    @Column(name = "effect_1", nullable = false)
    private Long effect1 = 0L;

    @Column(name = "effect_2", nullable = false)
    private Long effect2 = 0L;

    @Column(name = "effect_3", nullable = false)
    private Long effect3 = 0L;

    @Column(name = "effectdiesides_1", nullable = false)
    private Long effectDieSides1 = 0L;

    @Column(name = "effectdiesides_2", nullable = false)
    private Long effectDieSides2 = 0L;

    @Column(name = "effectdiesides_3", nullable = false)
    private Long effectDieSides3 = 0L;

    @Column(name = "effectrealpointsperlevel_1", nullable = false)
    private Float effectRealPointsPerLevel1 = 0f;

    @Column(name = "effectrealpointsperlevel_2", nullable = false)
    private Float effectRealPointsPerLevel2 = 0f;

    @Column(name = "effectrealpointsperlevel_3", nullable = false)
    private Float effectRealPointsPerLevel3 = 0f;

    @Column(name = "effectbasepoints_1", nullable = false)
    private Long effectBasePoints1 = 0L;

    @Column(name = "effectbasepoints_2", nullable = false)
    private Long effectBasePoints2 = 0L;

    @Column(name = "effectbasepoints_3", nullable = false)
    private Long effectBasePoints3 = 0L;

    @Column(name = "effectmechanic_1", nullable = false)
    private Long effectMechanic1 = 0L;

    @Column(name = "effectmechanic_2", nullable = false)
    private Long effectMechanic2 = 0L;

    @Column(name = "effectmechanic_3", nullable = false)
    private Long effectMechanic3 = 0L;

    @Column(name = "implicittargeta_1", nullable = false)
    private Long implicitTargetA1 = 0L;

    @Column(name = "implicittargeta_2", nullable = false)
    private Long implicitTargetA2 = 0L;

    @Column(name = "implicittargeta_3", nullable = false)
    private Long implicitTargetA3 = 0L;

    @Column(name = "implicittargetb_1", nullable = false)
    private Long implicitTargetB1 = 0L;

    @Column(name = "implicittargetb_2", nullable = false)
    private Long implicitTargetB2 = 0L;

    @Column(name = "implicittargetb_3", nullable = false)
    private Long implicitTargetB3 = 0L;

    @Column(name = "effectradiusindex_1", nullable = false)
    private Long effectRadiusIndex1 = 0L;

    @Column(name = "effectradiusindex_2", nullable = false)
    private Long effectRadiusIndex2 = 0L;

    @Column(name = "effectradiusindex_3", nullable = false)
    private Long effectRadiusIndex3 = 0L;

    @Column(name = "effectaura_1", nullable = false)
    private Long effectAura1 = 0L;

    @Column(name = "effectaura_2", nullable = false)
    private Long effectAura2 = 0L;

    @Column(name = "effectaura_3", nullable = false)
    private Long effectAura3 = 0L;

    @Column(name = "effectauraperiod_1", nullable = false)
    private Long effectAuraPeriod1 = 0L;

    @Column(name = "effectauraperiod_2", nullable = false)
    private Long effectAuraPeriod2 = 0L;

    @Column(name = "effectauraperiod_3", nullable = false)
    private Long effectAuraPeriod3 = 0L;

    @Column(name = "effectamplitude_1", nullable = false)
    private Float effectAmplitude1 = 0f;

    @Column(name = "effectamplitude_2", nullable = false)
    private Float effectAmplitude2 = 0f;

    @Column(name = "effectamplitude_3", nullable = false)
    private Float effectAmplitude3 = 0f;

    @Column(name = "effectchaintargets_1", nullable = false)
    private Long effectChainTargets1 = 0L;

    @Column(name = "effectchaintargets_2", nullable = false)
    private Long effectChainTargets2 = 0L;

    @Column(name = "effectchaintargets_3", nullable = false)
    private Long effectChainTargets3 = 0L;

    @Column(name = "effectitemtype_1", nullable = false)
    private Long effectItemType1 = 0L;

    @Column(name = "effectitemtype_2", nullable = false)
    private Long effectItemType2 = 0L;

    @Column(name = "effectitemtype_3", nullable = false)
    private Long effectItemType3 = 0L;

    @Column(name = "effectmiscvalue_1", nullable = false)
    private Long effectMiscValue1 = 0L;

    @Column(name = "effectmiscvalue_2", nullable = false)
    private Long effectMiscValue2 = 0L;

    @Column(name = "effectmiscvalue_3", nullable = false)
    private Long effectMiscValue3 = 0L;

    @Column(name = "effectmiscvalueb_1", nullable = false)
    private Long effectMiscValueB1 = 0L;

    @Column(name = "effectmiscvalueb_2", nullable = false)
    private Long effectMiscValueB2 = 0L;

    @Column(name = "effectmiscvalueb_3", nullable = false)
    private Long effectMiscValueB3 = 0L;

    @Column(name = "effecttriggerspell_1", nullable = false)
    private Long effectTriggerSpell1 = 0L;

    @Column(name = "effecttriggerspell_2", nullable = false)
    private Long effectTriggerSpell2 = 0L;

    @Column(name = "effecttriggerspell_3", nullable = false)
    private Long effectTriggerSpell3 = 0L;

    @Column(name = "effectpointspercombo_1", nullable = false)
    private Float effectPointsPerCombo1 = 0f;

    @Column(name = "effectpointspercombo_2", nullable = false)
    private Float effectPointsPerCombo2 = 0f;

    @Column(name = "effectpointspercombo_3", nullable = false)
    private Float effectPointsPerCombo3 = 0f;

    @Column(name = "effectspellclassmaska_1", nullable = false)
    private Long effectSpellClassMaskA1 = 0L;

    @Column(name = "effectspellclassmaska_2", nullable = false)
    private Long effectSpellClassMaskA2 = 0L;

    @Column(name = "effectspellclassmaska_3", nullable = false)
    private Long effectSpellClassMaskA3 = 0L;

    @Column(name = "effectspellclassmaskb_1", nullable = false)
    private Long effectSpellClassMaskB1 = 0L;

    @Column(name = "effectspellclassmaskb_2", nullable = false)
    private Long effectSpellClassMaskB2 = 0L;

    @Column(name = "effectspellclassmaskb_3", nullable = false)
    private Long effectSpellClassMaskB3 = 0L;

    @Column(name = "effectspellclassmaskc_1", nullable = false)
    private Long effectSpellClassMaskC1 = 0L;

    @Column(name = "effectspellclassmaskc_2", nullable = false)
    private Long effectSpellClassMaskC2 = 0L;

    @Column(name = "effectspellclassmaskc_3", nullable = false)
    private Long effectSpellClassMaskC3 = 0L;

    @Column(name = "spellvisualid_1", nullable = false)
    private Long spellVisualID1 = 0L;

    @Column(name = "spellvisualid_2", nullable = false)
    private Long spellVisualID2 = 0L;

    @Column(name = "spelliconid", nullable = false)
    private Long spellIconID = 0L;

    @Column(name = "activeiconid", nullable = false)
    private Long activeIconID = 0L;

    @Column(name = "spellpriority", nullable = false)
    private Long spellPriority = 0L;

    @Column(name = "name_lang_enus")
    private String nameLangEnUS;

    @Column(name = "name_lang_engb")
    private String nameLangEnGB;

    @Column(name = "name_lang_kokr")
    private String nameLangKoKR;

    @Column(name = "name_lang_frfr")
    private String nameLangFrFR;

    @Column(name = "name_lang_dede")
    private String nameLangDeDE;

    @Column(name = "name_lang_encn")
    private String nameLangEnCN;

    @Column(name = "name_lang_zhcn")
    private String nameLangZhCN;

    @Column(name = "name_lang_entw")
    private String nameLangEnTW;

    @Column(name = "name_lang_zhtw")
    private String nameLangZhTW;

    @Column(name = "name_lang_eses")
    private String nameLangEsES;

    @Column(name = "name_lang_esmx")
    private String nameLangEsMX;

    @Column(name = "name_lang_ruru")
    private String nameLangRuRU;

    @Column(name = "name_lang_ptpt")
    private String nameLangPtPT;

    @Column(name = "name_lang_ptbr")
    private String nameLangPtBR;

    @Column(name = "name_lang_itit")
    private String nameLangItIT;

    @Column(name = "name_lang_unk")
    private String nameLangUnk;

    @Column(name = "name_lang_mask", nullable = false)
    private Long nameLangMask = 0L;

    // namesubtext fields
    @Column(name = "namesubtext_lang_enus")
    private String nameSubtextLangEnUS;

    @Column(name = "namesubtext_lang_engb")
    private String nameSubtextLangEnGB;

    @Column(name = "namesubtext_lang_kokr")
    private String nameSubtextLangKoKR;

    @Column(name = "namesubtext_lang_frfr")
    private String nameSubtextLangFrFR;

    @Column(name = "namesubtext_lang_dede")
    private String nameSubtextLangDeDE;

    @Column(name = "namesubtext_lang_encn")
    private String nameSubtextLangEnCN;

    @Column(name = "namesubtext_lang_zhcn")
    private String nameSubtextLangZhCN;

    @Column(name = "namesubtext_lang_entw")
    private String nameSubtextLangEnTW;

    @Column(name = "namesubtext_lang_zhtw")
    private String nameSubtextLangZhTW;

    @Column(name = "namesubtext_lang_eses")
    private String nameSubtextLangEsES;

    @Column(name = "namesubtext_lang_esmx")
    private String nameSubtextLangEsMX;

    @Column(name = "namesubtext_lang_ruru")
    private String nameSubtextLangRuRU;

    @Column(name = "namesubtext_lang_ptpt")
    private String nameSubtextLangPtPT;

    @Column(name = "namesubtext_lang_ptbr")
    private String nameSubtextLangPtBR;

    @Column(name = "namesubtext_lang_itit")
    private String nameSubtextLangItIT;

    @Column(name = "namesubtext_lang_unk")
    private String nameSubtextLangUnk;

    @Column(name = "namesubtext_lang_mask", nullable = false)
    private Long nameSubtextLangMask = 0L;

    // description fields
    @Column(name = "description_lang_enus")
    private String descriptionLangEnUS;

    @Column(name = "description_lang_engb")
    private String descriptionLangEnGB;

    @Column(name = "description_lang_kokr")
    private String descriptionLangKoKR;

    @Column(name = "description_lang_frfr")
    private String descriptionLangFrFR;

    @Column(name = "description_lang_dede")
    private String descriptionLangDeDE;

    @Column(name = "description_lang_encn")
    private String descriptionLangEnCN;

    @Column(name = "description_lang_zhcn")
    private String descriptionLangZhCN;

    @Column(name = "description_lang_entw")
    private String descriptionLangEnTW;

    @Column(name = "description_lang_zhtw")
    private String descriptionLangZhTW;

    @Column(name = "description_lang_eses")
    private String descriptionLangEsES;

    @Column(name = "description_lang_esmx")
    private String descriptionLangEsMX;

    @Column(name = "description_lang_ruru")
    private String descriptionLangRuRU;

    @Column(name = "description_lang_ptpt")
    private String descriptionLangPtPT;

    @Column(name = "description_lang_ptbr")
    private String descriptionLangPtBR;

    @Column(name = "description_lang_itit")
    private String descriptionLangItIT;

    @Column(name = "description_lang_unk")
    private String descriptionLangUnk;

    @Column(name = "description_lang_mask", nullable = false)
    private Long descriptionLangMask = 0L;

    // auradescription fields
    @Column(name = "auradescription_lang_enus")
    private String auraDescriptionLangEnUS;

    @Column(name = "auradescription_lang_engb")
    private String auraDescriptionLangEnGB;

    @Column(name = "auradescription_lang_kokr")
    private String auraDescriptionLangKoKR;

    @Column(name = "auradescription_lang_frfr")
    private String auraDescriptionLangFrFR;

    @Column(name = "auradescription_lang_dede")
    private String auraDescriptionLangDeDE;

    @Column(name = "auradescription_lang_encn")
    private String auraDescriptionLangEnCN;

    @Column(name = "auradescription_lang_zhcn")
    private String auraDescriptionLangZhCN;

    @Column(name = "auradescription_lang_entw")
    private String auraDescriptionLangEnTW;

    @Column(name = "auradescription_lang_zhtw")
    private String auraDescriptionLangZhTW;

    @Column(name = "auradescription_lang_eses")
    private String auraDescriptionLangEsES;

    @Column(name = "auradescription_lang_esmx")
    private String auraDescriptionLangEsMX;

    @Column(name = "auradescription_lang_ruru")
    private String auraDescriptionLangRuRU;

    @Column(name = "auradescription_lang_ptpt")
    private String auraDescriptionLangPtPT;

    @Column(name = "auradescription_lang_ptbr")
    private String auraDescriptionLangPtBR;

    @Column(name = "auradescription_lang_itit")
    private String auraDescriptionLangItIT;

    @Column(name = "auradescription_lang_unk")
    private String auraDescriptionLangUnk;

    @Column(name = "auradescription_lang_mask", nullable = false)
    private Long auraDescriptionLangMask = 0L;

    @Column(name = "manacostpct", nullable = false)
    private Long manaCostPct = 0L;

    @Column(name = "startrecoverycategory", nullable = false)
    private Long startRecoveryCategory = 0L;

    @Column(name = "startrecoverytime", nullable = false)
    private Long startRecoveryTime = 0L;

    @Column(name = "maxtargetlevel", nullable = false)
    private Long maxTargetLevel = 0L;

    @Column(name = "spellclassset", nullable = false)
    private Long spellClassSet = 0L;

    @Column(name = "spellclassmask_1", nullable = false)
    private Long spellClassMask1 = 0L;

    @Column(name = "spellclassmask_2", nullable = false)
    private Long spellClassMask2 = 0L;

    @Column(name = "spellclassmask_3", nullable = false)
    private Long spellClassMask3 = 0L;

    @Column(name = "maxtargets", nullable = false)
    private Long maxTargets = 0L;

    @Column(name = "defensetype", nullable = false)
    private Long defenseType = 0L;

    @Column(name = "preventiontype", nullable = false)
    private Long preventionType = 0L;

    @Column(name = "stancebarorder", nullable = false)
    private Long stanceBarOrder = 0L;

    @Column(name = "effectchainamplitude_1", nullable = false)
    private Float effectChainAmplitude1 = 0f;

    @Column(name = "effectchainamplitude_2", nullable = false)
    private Float effectChainAmplitude2 = 0f;

    @Column(name = "effectchainamplitude_3", nullable = false)
    private Float effectChainAmplitude3 = 0f;

    @Column(name = "minfactionid", nullable = false)
    private Long minFactionId = 0L;

    @Column(name = "minreputation", nullable = false)
    private Long minReputation = 0L;

    @Column(name = "requiredauravision", nullable = false)
    private Long requiredAuraVision = 0L;

    @Column(name = "requiredtotemcategoryid_1", nullable = false)
    private Long requiredTotemCategoryId1 = 0L;

    @Column(name = "requiredtotemcategoryid_2", nullable = false)
    private Long requiredTotemCategoryId2 = 0L;

    @Column(name = "requiredareasid", nullable = false)
    private Long requiredAreasId = 0L;

    @Column(name = "schoolmask", nullable = false)
    private Long schoolMask = 0L;

    @Column(name = "runecostid", nullable = false)
    private Long runeCostId = 0L;

    @Column(name = "spellmissileid", nullable = false)
    private Long spellMissileId = 0L;

    @Column(name = "powerdisplayid", nullable = false)
    private Long powerDisplayId = 0L;

    @Column(name = "effectbonuscoefficient_1", nullable = false)
    private Float effectBonusCoefficient1 = 0f;

    @Column(name = "effectbonuscoefficient_2", nullable = false)
    private Float effectBonusCoefficient2 = 0f;

    @Column(name = "effectbonuscoefficient_3", nullable = false)
    private Float effectBonusCoefficient3 = 0f;

    @Column(name = "spelldescriptionvariableid", nullable = false)
    private Long spellDescriptionVariableId = 0L;

    @Column(name = "spelldifficultyid", nullable = false)
    private Long spellDifficultyId = 0L;
}
