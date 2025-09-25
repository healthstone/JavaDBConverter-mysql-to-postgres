package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spell")
@Data
public class MysqlDbcSpell {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "Category", nullable = false)
    private Long category;

    @Column(name = "DispelType", nullable = false)
    private Long dispelType;

    @Column(name = "Mechanic", nullable = false)
    private Long mechanic;

    @Column(name = "Attributes", nullable = false)
    private Long attributes;

    @Column(name = "AttributesEx", nullable = false)
    private Long attributesEx;

    @Column(name = "AttributesExB", nullable = false)
    private Long attributesExB;

    @Column(name = "AttributesExC", nullable = false)
    private Long attributesExC;

    @Column(name = "AttributesExD", nullable = false)
    private Long attributesExD;

    @Column(name = "AttributesExE", nullable = false)
    private Long attributesExE;

    @Column(name = "AttributesExF", nullable = false)
    private Long attributesExF;

    @Column(name = "AttributesExG", nullable = false)
    private Long attributesExG;

    @Column(name = "ShapeshiftMask_1", nullable = false)
    private Long shapeshiftMask_1;

    @Column(name = "ShapeshiftMask_2", nullable = false)
    private Long shapeshiftMask_2;

    @Column(name = "ShapeshiftExclude_1", nullable = false)
    private Long shapeshiftExclude_1;

    @Column(name = "ShapeshiftExclude_2", nullable = false)
    private Long shapeshiftExclude_2;

    @Column(name = "Targets", nullable = false)
    private Long targets;

    @Column(name = "TargetCreatureType", nullable = false)
    private Long targetCreatureType;

    @Column(name = "RequiresSpellFocus", nullable = false)
    private Long requiresSpellFocus;

    @Column(name = "FacingCasterFlags", nullable = false)
    private Long facingCasterFlags;

    @Column(name = "CasterAuraState", nullable = false)
    private Long casterAuraState;

    @Column(name = "TargetAuraState", nullable = false)
    private Long targetAuraState;

    @Column(name = "ExcludeCasterAuraState", nullable = false)
    private Long excludeCasterAuraState;

    @Column(name = "ExcludeTargetAuraState", nullable = false)
    private Long excludeTargetAuraState;

    @Column(name = "CasterAuraSpell", nullable = false)
    private Long casterAuraSpell;

    @Column(name = "TargetAuraSpell", nullable = false)
    private Long targetAuraSpell;

    @Column(name = "ExcludeCasterAuraSpell", nullable = false)
    private Long excludeCasterAuraSpell;

    @Column(name = "ExcludeTargetAuraSpell", nullable = false)
    private Long excludeTargetAuraSpell;

    @Column(name = "CastingTimeIndex", nullable = false)
    private Long castingTimeIndex;

    @Column(name = "RecoveryTime", nullable = false)
    private Long recoveryTime;

    @Column(name = "CategoryRecoveryTime", nullable = false)
    private Long categoryRecoveryTime;

    @Column(name = "InterruptFlags", nullable = false)
    private Long interruptFlags;

    @Column(name = "AuraInterruptFlags", nullable = false)
    private Long auraInterruptFlags;

    @Column(name = "ChannelInterruptFlags", nullable = false)
    private Long channelInterruptFlags;

    @Column(name = "ProcTypeMask", nullable = false)
    private Long procTypeMask;

    @Column(name = "ProcChance", nullable = false)
    private Long procChance;

    @Column(name = "ProcCharges", nullable = false)
    private Long procCharges;

    @Column(name = "MaxLevel", nullable = false)
    private Long maxLevel;

    @Column(name = "BaseLevel", nullable = false)
    private Long baseLevel;

    @Column(name = "SpellLevel", nullable = false)
    private Long spellLevel;

    @Column(name = "DurationIndex", nullable = false)
    private Long durationIndex;

    @Column(name = "PowerType", nullable = false)
    private Long powerType;

    @Column(name = "ManaCost", nullable = false)
    private Long manaCost;

    @Column(name = "ManaCostPerLevel", nullable = false)
    private Long manaCostPerLevel;

    @Column(name = "ManaPerSecond", nullable = false)
    private Long manaPerSecond;

    @Column(name = "ManaPerSecondPerLevel", nullable = false)
    private Long manaPerSecondPerLevel;

    @Column(name = "RangeIndex", nullable = false)
    private Long rangeIndex;

    @Column(name = "Speed", nullable = false)
    private Float speed;

    @Column(name = "ModalNextSpell", nullable = false)
    private Long modalNextSpell;

    @Column(name = "CumulativeAura", nullable = false)
    private Long cumulativeAura;

    @Column(name = "Totem_1", nullable = false)
    private Long totem_1;

    @Column(name = "Totem_2", nullable = false)
    private Long totem_2;

    @Column(name = "Reagent_1", nullable = false)
    private Long reagent_1;

    @Column(name = "Reagent_2", nullable = false)
    private Long reagent_2;

    @Column(name = "Reagent_3", nullable = false)
    private Long reagent_3;

    @Column(name = "Reagent_4", nullable = false)
    private Long reagent_4;

    @Column(name = "Reagent_5", nullable = false)
    private Long reagent_5;

    @Column(name = "Reagent_6", nullable = false)
    private Long reagent_6;

    @Column(name = "Reagent_7", nullable = false)
    private Long reagent_7;

    @Column(name = "Reagent_8", nullable = false)
    private Long reagent_8;

    @Column(name = "ReagentCount_1", nullable = false)
    private Long reagentCount_1;

    @Column(name = "ReagentCount_2", nullable = false)
    private Long reagentCount_2;

    @Column(name = "ReagentCount_3", nullable = false)
    private Long reagentCount_3;

    @Column(name = "ReagentCount_4", nullable = false)
    private Long reagentCount_4;

    @Column(name = "ReagentCount_5", nullable = false)
    private Long reagentCount_5;

    @Column(name = "ReagentCount_6", nullable = false)
    private Long reagentCount_6;

    @Column(name = "ReagentCount_7", nullable = false)
    private Long reagentCount_7;

    @Column(name = "ReagentCount_8", nullable = false)
    private Long reagentCount_8;

    @Column(name = "EquippedItemClass", nullable = false)
    private Long equippedItemClass;

    @Column(name = "EquippedItemSubclass", nullable = false)
    private Long equippedItemSubclass;

    @Column(name = "EquippedItemInvTypes", nullable = false)
    private Long equippedItemInvTypes;

    @Column(name = "Effect_1", nullable = false)
    private Long effect_1;

    @Column(name = "Effect_2", nullable = false)
    private Long effect_2;

    @Column(name = "Effect_3", nullable = false)
    private Long effect_3;

    @Column(name = "EffectDieSides_1", nullable = false)
    private Long effectDieSides_1;

    @Column(name = "EffectDieSides_2", nullable = false)
    private Long effectDieSides_2;

    @Column(name = "EffectDieSides_3", nullable = false)
    private Long effectDieSides_3;

    @Column(name = "EffectRealPointsPerLevel_1", nullable = false)
    private Float effectRealPointsPerLevel_1;

    @Column(name = "EffectRealPointsPerLevel_2", nullable = false)
    private Float effectRealPointsPerLevel_2;

    @Column(name = "EffectRealPointsPerLevel_3", nullable = false)
    private Float effectRealPointsPerLevel_3;

    @Column(name = "EffectBasePoints_1", nullable = false)
    private Long effectBasePoints_1;

    @Column(name = "EffectBasePoints_2", nullable = false)
    private Long effectBasePoints_2;

    @Column(name = "EffectBasePoints_3", nullable = false)
    private Long effectBasePoints_3;

    @Column(name = "EffectMechanic_1", nullable = false)
    private Long effectMechanic_1;

    @Column(name = "EffectMechanic_2", nullable = false)
    private Long effectMechanic_2;

    @Column(name = "EffectMechanic_3", nullable = false)
    private Long effectMechanic_3;

    @Column(name = "ImplicitTargetA_1", nullable = false)
    private Long implicitTargetA_1;

    @Column(name = "ImplicitTargetA_2", nullable = false)
    private Long implicitTargetA_2;

    @Column(name = "ImplicitTargetA_3", nullable = false)
    private Long implicitTargetA_3;

    @Column(name = "ImplicitTargetB_1", nullable = false)
    private Long implicitTargetB_1;

    @Column(name = "ImplicitTargetB_2", nullable = false)
    private Long implicitTargetB_2;

    @Column(name = "ImplicitTargetB_3", nullable = false)
    private Long implicitTargetB_3;

    @Column(name = "EffectRadiusIndex_1", nullable = false)
    private Long effectRadiusIndex_1;

    @Column(name = "EffectRadiusIndex_2", nullable = false)
    private Long effectRadiusIndex_2;

    @Column(name = "EffectRadiusIndex_3", nullable = false)
    private Long effectRadiusIndex_3;

    @Column(name = "EffectAura_1", nullable = false)
    private Long effectAura_1;

    @Column(name = "EffectAura_2", nullable = false)
    private Long effectAura_2;

    @Column(name = "EffectAura_3", nullable = false)
    private Long effectAura_3;

    @Column(name = "EffectAuraPeriod_1", nullable = false)
    private Long effectAuraPeriod_1;

    @Column(name = "EffectAuraPeriod_2", nullable = false)
    private Long effectAuraPeriod_2;

    @Column(name = "EffectAuraPeriod_3", nullable = false)
    private Long effectAuraPeriod_3;

    @Column(name = "EffectAmplitude_1", nullable = false)
    private Float effectAmplitude_1;

    @Column(name = "EffectAmplitude_2", nullable = false)
    private Float effectAmplitude_2;

    @Column(name = "EffectAmplitude_3", nullable = false)
    private Float effectAmplitude_3;

    @Column(name = "EffectChainTargets_1", nullable = false)
    private Long effectChainTargets_1;

    @Column(name = "EffectChainTargets_2", nullable = false)
    private Long effectChainTargets_2;

    @Column(name = "EffectChainTargets_3", nullable = false)
    private Long effectChainTargets_3;

    @Column(name = "EffectItemType_1", nullable = false)
    private Long effectItemType_1;

    @Column(name = "EffectItemType_2", nullable = false)
    private Long effectItemType_2;

    @Column(name = "EffectItemType_3", nullable = false)
    private Long effectItemType_3;

    @Column(name = "EffectMiscValue_1", nullable = false)
    private Long effectMiscValue_1;

    @Column(name = "EffectMiscValue_2", nullable = false)
    private Long effectMiscValue_2;

    @Column(name = "EffectMiscValue_3", nullable = false)
    private Long effectMiscValue_3;

    @Column(name = "EffectMiscValueB_1", nullable = false)
    private Long effectMiscValueB_1;

    @Column(name = "EffectMiscValueB_2", nullable = false)
    private Long effectMiscValueB_2;

    @Column(name = "EffectMiscValueB_3", nullable = false)
    private Long effectMiscValueB_3;

    @Column(name = "EffectTriggerSpell_1", nullable = false)
    private Long effectTriggerSpell_1;

    @Column(name = "EffectTriggerSpell_2", nullable = false)
    private Long effectTriggerSpell_2;

    @Column(name = "EffectTriggerSpell_3", nullable = false)
    private Long effectTriggerSpell_3;

    @Column(name = "EffectPointsPerCombo_1", nullable = false)
    private Float effectPointsPerCombo_1;

    @Column(name = "EffectPointsPerCombo_2", nullable = false)
    private Float effectPointsPerCombo_2;

    @Column(name = "EffectPointsPerCombo_3", nullable = false)
    private Float effectPointsPerCombo_3;

    @Column(name = "EffectSpellClassMaskA_1", nullable = false)
    private Long effectSpellClassMaskA_1;

    @Column(name = "EffectSpellClassMaskA_2", nullable = false)
    private Long effectSpellClassMaskA_2;

    @Column(name = "EffectSpellClassMaskA_3", nullable = false)
    private Long effectSpellClassMaskA_3;

    @Column(name = "EffectSpellClassMaskB_1", nullable = false)
    private Long effectSpellClassMaskB_1;

    @Column(name = "EffectSpellClassMaskB_2", nullable = false)
    private Long effectSpellClassMaskB_2;

    @Column(name = "EffectSpellClassMaskB_3", nullable = false)
    private Long effectSpellClassMaskB_3;

    @Column(name = "EffectSpellClassMaskC_1", nullable = false)
    private Long effectSpellClassMaskC_1;

    @Column(name = "EffectSpellClassMaskC_2", nullable = false)
    private Long effectSpellClassMaskC_2;

    @Column(name = "EffectSpellClassMaskC_3", nullable = false)
    private Long effectSpellClassMaskC_3;

    @Column(name = "SpellVisualID_1", nullable = false)
    private Long spellVisualID_1;

    @Column(name = "SpellVisualID_2", nullable = false)
    private Long spellVisualID_2;

    @Column(name = "SpellIconID", nullable = false)
    private Long spellIconID;

    @Column(name = "ActiveIconID", nullable = false)
    private Long activeIconID;

    @Column(name = "SpellPriority", nullable = false)
    private Long spellPriority;

    @Column(name = "Name_Lang_enUS", nullable = true)
    private String name_Lang_enUS;

    @Column(name = "Name_Lang_enGB", nullable = true)
    private String name_Lang_enGB;

    @Column(name = "Name_Lang_koKR", nullable = true)
    private String name_Lang_koKR;

    @Column(name = "Name_Lang_frFR", nullable = true)
    private String name_Lang_frFR;

    @Column(name = "Name_Lang_deDE", nullable = true)
    private String name_Lang_deDE;

    @Column(name = "Name_Lang_enCN", nullable = true)
    private String name_Lang_enCN;

    @Column(name = "Name_Lang_zhCN", nullable = true)
    private String name_Lang_zhCN;

    @Column(name = "Name_Lang_enTW", nullable = true)
    private String name_Lang_enTW;

    @Column(name = "Name_Lang_zhTW", nullable = true)
    private String name_Lang_zhTW;

    @Column(name = "Name_Lang_esES", nullable = true)
    private String name_Lang_esES;

    @Column(name = "Name_Lang_esMX", nullable = true)
    private String name_Lang_esMX;

    @Column(name = "Name_Lang_ruRU", nullable = true)
    private String name_Lang_ruRU;

    @Column(name = "Name_Lang_ptPT", nullable = true)
    private String name_Lang_ptPT;

    @Column(name = "Name_Lang_ptBR", nullable = true)
    private String name_Lang_ptBR;

    @Column(name = "Name_Lang_itIT", nullable = true)
    private String name_Lang_itIT;

    @Column(name = "Name_Lang_Unk", nullable = true)
    private String name_Lang_Unk;

    @Column(name = "Name_Lang_Mask", nullable = false)
    private Long name_Lang_Mask;

    @Column(name = "NameSubtext_Lang_enUS", nullable = true)
    private String nameSubtext_Lang_enUS;

    @Column(name = "NameSubtext_Lang_enGB", nullable = true)
    private String nameSubtext_Lang_enGB;

    @Column(name = "NameSubtext_Lang_koKR", nullable = true)
    private String nameSubtext_Lang_koKR;

    @Column(name = "NameSubtext_Lang_frFR", nullable = true)
    private String nameSubtext_Lang_frFR;

    @Column(name = "NameSubtext_Lang_deDE", nullable = true)
    private String nameSubtext_Lang_deDE;

    @Column(name = "NameSubtext_Lang_enCN", nullable = true)
    private String nameSubtext_Lang_enCN;

    @Column(name = "NameSubtext_Lang_zhCN", nullable = true)
    private String nameSubtext_Lang_zhCN;

    @Column(name = "NameSubtext_Lang_enTW", nullable = true)
    private String nameSubtext_Lang_enTW;

    @Column(name = "NameSubtext_Lang_zhTW", nullable = true)
    private String nameSubtext_Lang_zhTW;

    @Column(name = "NameSubtext_Lang_esES", nullable = true)
    private String nameSubtext_Lang_esES;

    @Column(name = "NameSubtext_Lang_esMX", nullable = true)
    private String nameSubtext_Lang_esMX;

    @Column(name = "NameSubtext_Lang_ruRU", nullable = true)
    private String nameSubtext_Lang_ruRU;

    @Column(name = "NameSubtext_Lang_ptPT", nullable = true)
    private String nameSubtext_Lang_ptPT;

    @Column(name = "NameSubtext_Lang_ptBR", nullable = true)
    private String nameSubtext_Lang_ptBR;

    @Column(name = "NameSubtext_Lang_itIT", nullable = true)
    private String nameSubtext_Lang_itIT;

    @Column(name = "NameSubtext_Lang_Unk", nullable = true)
    private String nameSubtext_Lang_Unk;

    @Column(name = "NameSubtext_Lang_Mask", nullable = false)
    private Long nameSubtext_Lang_Mask;

    @Column(name = "Description_Lang_enUS", nullable = true)
    private String description_Lang_enUS;

    @Column(name = "Description_Lang_enGB", nullable = true)
    private String description_Lang_enGB;

    @Column(name = "Description_Lang_koKR", nullable = true)
    private String description_Lang_koKR;

    @Column(name = "Description_Lang_frFR", nullable = true)
    private String description_Lang_frFR;

    @Column(name = "Description_Lang_deDE", nullable = true)
    private String description_Lang_deDE;

    @Column(name = "Description_Lang_enCN", nullable = true)
    private String description_Lang_enCN;

    @Column(name = "Description_Lang_zhCN", nullable = true)
    private String description_Lang_zhCN;

    @Column(name = "Description_Lang_enTW", nullable = true)
    private String description_Lang_enTW;

    @Column(name = "Description_Lang_zhTW", nullable = true)
    private String description_Lang_zhTW;

    @Column(name = "Description_Lang_esES", nullable = true)
    private String description_Lang_esES;

    @Column(name = "Description_Lang_esMX", nullable = true)
    private String description_Lang_esMX;

    @Column(name = "Description_Lang_ruRU", nullable = true)
    private String description_Lang_ruRU;

    @Column(name = "Description_Lang_ptPT", nullable = true)
    private String description_Lang_ptPT;

    @Column(name = "Description_Lang_ptBR", nullable = true)
    private String description_Lang_ptBR;

    @Column(name = "Description_Lang_itIT", nullable = true)
    private String description_Lang_itIT;

    @Column(name = "Description_Lang_Unk", nullable = true)
    private String description_Lang_Unk;

    @Column(name = "Description_Lang_Mask", nullable = false)
    private Long description_Lang_Mask;

    @Column(name = "AuraDescription_Lang_enUS", nullable = true)
    private String auraDescription_Lang_enUS;

    @Column(name = "AuraDescription_Lang_enGB", nullable = true)
    private String auraDescription_Lang_enGB;

    @Column(name = "AuraDescription_Lang_koKR", nullable = true)
    private String auraDescription_Lang_koKR;

    @Column(name = "AuraDescription_Lang_frFR", nullable = true)
    private String auraDescription_Lang_frFR;

    @Column(name = "AuraDescription_Lang_deDE", nullable = true)
    private String auraDescription_Lang_deDE;

    @Column(name = "AuraDescription_Lang_enCN", nullable = true)
    private String auraDescription_Lang_enCN;

    @Column(name = "AuraDescription_Lang_zhCN", nullable = true)
    private String auraDescription_Lang_zhCN;

    @Column(name = "AuraDescription_Lang_enTW", nullable = true)
    private String auraDescription_Lang_enTW;

    @Column(name = "AuraDescription_Lang_zhTW", nullable = true)
    private String auraDescription_Lang_zhTW;

    @Column(name = "AuraDescription_Lang_esES", nullable = true)
    private String auraDescription_Lang_esES;

    @Column(name = "AuraDescription_Lang_esMX", nullable = true)
    private String auraDescription_Lang_esMX;

    @Column(name = "AuraDescription_Lang_ruRU", nullable = true)
    private String auraDescription_Lang_ruRU;

    @Column(name = "AuraDescription_Lang_ptPT", nullable = true)
    private String auraDescription_Lang_ptPT;

    @Column(name = "AuraDescription_Lang_ptBR", nullable = true)
    private String auraDescription_Lang_ptBR;

    @Column(name = "AuraDescription_Lang_itIT", nullable = true)
    private String auraDescription_Lang_itIT;

    @Column(name = "AuraDescription_Lang_Unk", nullable = true)
    private String auraDescription_Lang_Unk;

    @Column(name = "AuraDescription_Lang_Mask", nullable = false)
    private Long auraDescription_Lang_Mask;

    @Column(name = "ManaCostPct", nullable = false)
    private Long manaCostPct;

    @Column(name = "StartRecoveryCategory", nullable = false)
    private Long startRecoveryCategory;

    @Column(name = "StartRecoveryTime", nullable = false)
    private Long startRecoveryTime;

    @Column(name = "MaxTargetLevel", nullable = false)
    private Long maxTargetLevel;

    @Column(name = "SpellClassSet", nullable = false)
    private Long spellClassSet;

    @Column(name = "SpellClassMask_1", nullable = false)
    private Long spellClassMask_1;

    @Column(name = "SpellClassMask_2", nullable = false)
    private Long spellClassMask_2;

    @Column(name = "SpellClassMask_3", nullable = false)
    private Long spellClassMask_3;

    @Column(name = "MaxTargets", nullable = false)
    private Long maxTargets;

    @Column(name = "DefenseType", nullable = false)
    private Long defenseType;

    @Column(name = "PreventionType", nullable = false)
    private Long preventionType;

    @Column(name = "StanceBarOrder", nullable = false)
    private Long stanceBarOrder;

    @Column(name = "EffectChainAmplitude_1", nullable = false)
    private Float effectChainAmplitude_1;

    @Column(name = "EffectChainAmplitude_2", nullable = false)
    private Float effectChainAmplitude_2;

    @Column(name = "EffectChainAmplitude_3", nullable = false)
    private Float effectChainAmplitude_3;

    @Column(name = "MinFactionID", nullable = false)
    private Long minFactionID;

    @Column(name = "MinReputation", nullable = false)
    private Long minReputation;

    @Column(name = "RequiredAuraVision", nullable = false)
    private Long requiredAuraVision;

    @Column(name = "RequiredTotemCategoryID_1", nullable = false)
    private Long requiredTotemCategoryID_1;

    @Column(name = "RequiredTotemCategoryID_2", nullable = false)
    private Long requiredTotemCategoryID_2;

    @Column(name = "RequiredAreasID", nullable = false)
    private Long requiredAreasID;

    @Column(name = "SchoolMask", nullable = false)
    private Long schoolMask;

    @Column(name = "RuneCostID", nullable = false)
    private Long runeCostID;

    @Column(name = "SpellMissileID", nullable = false)
    private Long spellMissileID;

    @Column(name = "PowerDisplayID", nullable = false)
    private Long powerDisplayID;

    @Column(name = "EffectBonusCoefficient_1", nullable = false)
    private Float effectBonusCoefficient_1;

    @Column(name = "EffectBonusCoefficient_2", nullable = false)
    private Float effectBonusCoefficient_2;

    @Column(name = "EffectBonusCoefficient_3", nullable = false)
    private Float effectBonusCoefficient_3;

    @Column(name = "SpellDescriptionVariableID", nullable = false)
    private Long spellDescriptionVariableID;

    @Column(name = "SpellDifficultyID", nullable = false)
    private Long spellDifficultyID;
}
