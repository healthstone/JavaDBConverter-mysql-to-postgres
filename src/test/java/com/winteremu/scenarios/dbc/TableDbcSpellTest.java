package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcSpell;
import com.winteremu.entity.postgres.PgDbcSpell;
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
public class TableDbcSpellTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcSpellTest");

    @Test
    @Tag("dbc_spell")
    @DisplayName("dbc_spell.sql")
    @Description("Перелив данных для dbc_spell.sql")
    public void convertTableDbcSpell() {
        Query<MysqlDbcSpell> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcSpell", MysqlDbcSpell.class);
        List<MysqlDbcSpell> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcSpell mysql = mysqlTable.get(i);
                PgDbcSpell pg = new PgDbcSpell();

                pg.setId(mysql.getId());
                pg.setCategory(mysql.getCategory());
                pg.setDispelType(mysql.getDispelType());
                pg.setMechanic(mysql.getMechanic());
                pg.setAttributes(mysql.getAttributes());
                pg.setAttributesEx(mysql.getAttributesEx());
                pg.setAttributesExB(mysql.getAttributesExB());
                pg.setAttributesExC(mysql.getAttributesExC());
                pg.setAttributesExD(mysql.getAttributesExD());
                pg.setAttributesExE(mysql.getAttributesExE());
                pg.setAttributesExF(mysql.getAttributesExF());
                pg.setAttributesExG(mysql.getAttributesExG());
                pg.setShapeshiftMask1(mysql.getShapeshiftMask_1());
                pg.setShapeshiftMask2(mysql.getShapeshiftMask_2());
                pg.setShapeshiftExclude1(mysql.getShapeshiftExclude_1());
                pg.setShapeshiftExclude2(mysql.getShapeshiftExclude_2());
                pg.setTargets(mysql.getTargets());
                pg.setTargetCreatureType(mysql.getTargetCreatureType());
                pg.setRequiresSpellFocus(mysql.getRequiresSpellFocus());
                pg.setFacingCasterFlags(mysql.getFacingCasterFlags());
                pg.setCasterAuraState(mysql.getCasterAuraState());
                pg.setTargetAuraState(mysql.getTargetAuraState());
                pg.setExcludeCasterAuraState(mysql.getExcludeCasterAuraState());
                pg.setExcludeTargetAuraState(mysql.getExcludeTargetAuraState());
                pg.setCasterAuraSpell(mysql.getCasterAuraSpell());
                pg.setTargetAuraSpell(mysql.getTargetAuraSpell());
                pg.setExcludeCasterAuraSpell(mysql.getExcludeCasterAuraSpell());
                pg.setExcludeTargetAuraSpell(mysql.getExcludeTargetAuraSpell());
                pg.setCastingTimeIndex(mysql.getCastingTimeIndex());
                pg.setRecoveryTime(mysql.getRecoveryTime());
                pg.setCategoryRecoveryTime(mysql.getCategoryRecoveryTime());
                pg.setInterruptFlags(mysql.getInterruptFlags());
                pg.setAuraInterruptFlags(mysql.getAuraInterruptFlags());
                pg.setChannelInterruptFlags(mysql.getChannelInterruptFlags());
                pg.setProcTypeMask(mysql.getProcTypeMask());
                pg.setProcChance(mysql.getProcChance());
                pg.setProcCharges(mysql.getProcCharges());
                pg.setMaxLevel(mysql.getMaxLevel());
                pg.setBaseLevel(mysql.getBaseLevel());
                pg.setSpellLevel(mysql.getSpellLevel());
                pg.setDurationIndex(mysql.getDurationIndex());
                pg.setPowerType(mysql.getPowerType());
                pg.setManaCost(mysql.getManaCost());
                pg.setManaCostPerLevel(mysql.getManaCostPerLevel());
                pg.setManaPerSecond(mysql.getManaPerSecond());
                pg.setManaPerSecondPerLevel(mysql.getManaPerSecondPerLevel());
                pg.setRangeIndex(mysql.getRangeIndex());
                pg.setSpeed(mysql.getSpeed());
                pg.setModalNextSpell(mysql.getModalNextSpell());
                pg.setCumulativeAura(mysql.getCumulativeAura());
                pg.setTotem1(mysql.getTotem_1());
                pg.setTotem2(mysql.getTotem_2());
                pg.setReagent1(mysql.getReagent_1());
                pg.setReagent2(mysql.getReagent_2());
                pg.setReagent3(mysql.getReagent_3());
                pg.setReagent4(mysql.getReagent_4());
                pg.setReagent5(mysql.getReagent_5());
                pg.setReagent6(mysql.getReagent_6());
                pg.setReagent7(mysql.getReagent_7());
                pg.setReagent8(mysql.getReagent_8());
                pg.setReagentCount1(mysql.getReagentCount_1());
                pg.setReagentCount2(mysql.getReagentCount_2());
                pg.setReagentCount3(mysql.getReagentCount_3());
                pg.setReagentCount4(mysql.getReagentCount_4());
                pg.setReagentCount5(mysql.getReagentCount_5());
                pg.setReagentCount6(mysql.getReagentCount_6());
                pg.setReagentCount7(mysql.getReagentCount_7());
                pg.setReagentCount8(mysql.getReagentCount_8());
                pg.setEquippedItemClass(mysql.getEquippedItemClass());
                pg.setEquippedItemSubclass(mysql.getEquippedItemSubclass());
                pg.setEquippedItemInvTypes(mysql.getEquippedItemInvTypes());
                pg.setEffect1(mysql.getEffect_1());
                pg.setEffect2(mysql.getEffect_2());
                pg.setEffect3(mysql.getEffect_3());
                pg.setEffectDieSides1(mysql.getEffectDieSides_1());
                pg.setEffectDieSides2(mysql.getEffectDieSides_2());
                pg.setEffectDieSides3(mysql.getEffectDieSides_3());
                pg.setEffectRealPointsPerLevel1(mysql.getEffectRealPointsPerLevel_1());
                pg.setEffectRealPointsPerLevel2(mysql.getEffectRealPointsPerLevel_2());
                pg.setEffectRealPointsPerLevel3(mysql.getEffectRealPointsPerLevel_3());
                pg.setEffectBasePoints1(mysql.getEffectBasePoints_1());
                pg.setEffectBasePoints2(mysql.getEffectBasePoints_2());
                pg.setEffectBasePoints3(mysql.getEffectBasePoints_3());
                pg.setEffectMechanic1(mysql.getEffectMechanic_1());
                pg.setEffectMechanic2(mysql.getEffectMechanic_2());
                pg.setEffectMechanic3(mysql.getEffectMechanic_3());
                pg.setImplicitTargetA1(mysql.getImplicitTargetA_1());
                pg.setImplicitTargetA2(mysql.getImplicitTargetA_2());
                pg.setImplicitTargetA3(mysql.getImplicitTargetA_3());
                pg.setImplicitTargetB1(mysql.getImplicitTargetB_1());
                pg.setImplicitTargetB2(mysql.getImplicitTargetB_2());
                pg.setImplicitTargetB3(mysql.getImplicitTargetB_3());
                pg.setEffectRadiusIndex1(mysql.getEffectRadiusIndex_1());
                pg.setEffectRadiusIndex2(mysql.getEffectRadiusIndex_2());
                pg.setEffectRadiusIndex3(mysql.getEffectRadiusIndex_3());
                pg.setEffectAura1(mysql.getEffectAura_1());
                pg.setEffectAura2(mysql.getEffectAura_2());
                pg.setEffectAura3(mysql.getEffectAura_3());
                pg.setEffectAuraPeriod1(mysql.getEffectAuraPeriod_1());
                pg.setEffectAuraPeriod2(mysql.getEffectAuraPeriod_2());
                pg.setEffectAuraPeriod3(mysql.getEffectAuraPeriod_3());
                pg.setEffectAmplitude1(mysql.getEffectAmplitude_1());
                pg.setEffectAmplitude2(mysql.getEffectAmplitude_2());
                pg.setEffectAmplitude3(mysql.getEffectAmplitude_3());
                pg.setEffectChainTargets1(mysql.getEffectChainTargets_1());
                pg.setEffectChainTargets2(mysql.getEffectChainTargets_2());
                pg.setEffectChainTargets3(mysql.getEffectChainTargets_3());
                pg.setEffectItemType1(mysql.getEffectItemType_1());
                pg.setEffectItemType2(mysql.getEffectItemType_2());
                pg.setEffectItemType3(mysql.getEffectItemType_3());
                pg.setEffectMiscValue1(mysql.getEffectMiscValue_1());
                pg.setEffectMiscValue2(mysql.getEffectMiscValue_2());
                pg.setEffectMiscValue3(mysql.getEffectMiscValue_3());
                pg.setEffectMiscValueB1(mysql.getEffectMiscValueB_1());
                pg.setEffectMiscValueB2(mysql.getEffectMiscValueB_2());
                pg.setEffectMiscValueB3(mysql.getEffectMiscValueB_3());
                pg.setEffectTriggerSpell1(mysql.getEffectTriggerSpell_1());
                pg.setEffectTriggerSpell2(mysql.getEffectTriggerSpell_2());
                pg.setEffectTriggerSpell3(mysql.getEffectTriggerSpell_3());
                pg.setEffectPointsPerCombo1(mysql.getEffectPointsPerCombo_1());
                pg.setEffectPointsPerCombo2(mysql.getEffectPointsPerCombo_2());
                pg.setEffectPointsPerCombo3(mysql.getEffectPointsPerCombo_3());
                pg.setEffectSpellClassMaskA1(mysql.getEffectSpellClassMaskA_1());
                pg.setEffectSpellClassMaskA2(mysql.getEffectSpellClassMaskA_2());
                pg.setEffectSpellClassMaskA3(mysql.getEffectSpellClassMaskA_3());
                pg.setEffectSpellClassMaskB1(mysql.getEffectSpellClassMaskB_1());
                pg.setEffectSpellClassMaskB2(mysql.getEffectSpellClassMaskB_2());
                pg.setEffectSpellClassMaskB3(mysql.getEffectSpellClassMaskB_3());
                pg.setEffectSpellClassMaskC1(mysql.getEffectSpellClassMaskC_1());
                pg.setEffectSpellClassMaskC2(mysql.getEffectSpellClassMaskC_2());
                pg.setEffectSpellClassMaskC3(mysql.getEffectSpellClassMaskC_3());
                pg.setSpellVisualID1(mysql.getSpellVisualID_1());
                pg.setSpellVisualID2(mysql.getSpellVisualID_2());
                pg.setSpellIconID(mysql.getSpellIconID());
                pg.setActiveIconID(mysql.getActiveIconID());
                pg.setSpellPriority(mysql.getSpellPriority());
                pg.setNameLangEnUS(mysql.getName_Lang_enUS());
                pg.setNameLangEnGB(mysql.getName_Lang_enGB());
                pg.setNameLangKoKR(mysql.getName_Lang_koKR());
                pg.setNameLangFrFR(mysql.getName_Lang_frFR());
                pg.setNameLangDeDE(mysql.getName_Lang_deDE());
                pg.setNameLangEnCN(mysql.getName_Lang_enCN());
                pg.setNameLangZhCN(mysql.getName_Lang_zhCN());
                pg.setNameLangEnTW(mysql.getName_Lang_enTW());
                pg.setNameLangZhTW(mysql.getName_Lang_zhTW());
                pg.setNameLangEsES(mysql.getName_Lang_esES());
                pg.setNameLangEsMX(mysql.getName_Lang_esMX());
                pg.setNameLangRuRU(mysql.getName_Lang_ruRU());
                pg.setNameLangPtPT(mysql.getName_Lang_ptPT());
                pg.setNameLangPtBR(mysql.getName_Lang_ptBR());
                pg.setNameLangItIT(mysql.getName_Lang_itIT());
                pg.setNameLangUnk(mysql.getName_Lang_Unk());
                pg.setNameLangMask(mysql.getName_Lang_Mask());
                pg.setNameSubtextLangEnUS(mysql.getNameSubtext_Lang_enUS());
                pg.setNameSubtextLangEnGB(mysql.getNameSubtext_Lang_enGB());
                pg.setNameSubtextLangKoKR(mysql.getNameSubtext_Lang_koKR());
                pg.setNameSubtextLangFrFR(mysql.getNameSubtext_Lang_frFR());
                pg.setNameSubtextLangDeDE(mysql.getNameSubtext_Lang_deDE());
                pg.setNameSubtextLangEnCN(mysql.getNameSubtext_Lang_enCN());
                pg.setNameSubtextLangZhCN(mysql.getNameSubtext_Lang_zhCN());
                pg.setNameSubtextLangEnTW(mysql.getNameSubtext_Lang_enTW());
                pg.setNameSubtextLangZhTW(mysql.getNameSubtext_Lang_zhTW());
                pg.setNameSubtextLangEsES(mysql.getNameSubtext_Lang_esES());
                pg.setNameSubtextLangEsMX(mysql.getNameSubtext_Lang_esMX());
                pg.setNameSubtextLangRuRU(mysql.getNameSubtext_Lang_ruRU());
                pg.setNameSubtextLangPtPT(mysql.getNameSubtext_Lang_ptPT());
                pg.setNameSubtextLangPtBR(mysql.getNameSubtext_Lang_ptBR());
                pg.setNameSubtextLangItIT(mysql.getNameSubtext_Lang_itIT());
                pg.setNameSubtextLangUnk(mysql.getNameSubtext_Lang_Unk());
                pg.setNameSubtextLangMask(mysql.getNameSubtext_Lang_Mask());
                pg.setDescriptionLangEnUS(mysql.getDescription_Lang_enUS());
                pg.setDescriptionLangEnGB(mysql.getDescription_Lang_enGB());
                pg.setDescriptionLangKoKR(mysql.getDescription_Lang_koKR());
                pg.setDescriptionLangFrFR(mysql.getDescription_Lang_frFR());
                pg.setDescriptionLangDeDE(mysql.getDescription_Lang_deDE());
                pg.setDescriptionLangEnCN(mysql.getDescription_Lang_enCN());
                pg.setDescriptionLangZhCN(mysql.getDescription_Lang_zhCN());
                pg.setDescriptionLangEnTW(mysql.getDescription_Lang_enTW());
                pg.setDescriptionLangZhTW(mysql.getDescription_Lang_zhTW());
                pg.setDescriptionLangEsES(mysql.getDescription_Lang_esES());
                pg.setDescriptionLangEsMX(mysql.getDescription_Lang_esMX());
                pg.setDescriptionLangRuRU(mysql.getDescription_Lang_ruRU());
                pg.setDescriptionLangPtPT(mysql.getDescription_Lang_ptPT());
                pg.setDescriptionLangPtBR(mysql.getDescription_Lang_ptBR());
                pg.setDescriptionLangItIT(mysql.getDescription_Lang_itIT());
                pg.setDescriptionLangUnk(mysql.getDescription_Lang_Unk());
                pg.setDescriptionLangMask(mysql.getDescription_Lang_Mask());
                pg.setAuraDescriptionLangEnUS(mysql.getAuraDescription_Lang_enUS());
                pg.setAuraDescriptionLangEnGB(mysql.getAuraDescription_Lang_enGB());
                pg.setAuraDescriptionLangKoKR(mysql.getAuraDescription_Lang_koKR());
                pg.setAuraDescriptionLangFrFR(mysql.getAuraDescription_Lang_frFR());
                pg.setAuraDescriptionLangDeDE(mysql.getAuraDescription_Lang_deDE());
                pg.setAuraDescriptionLangEnCN(mysql.getAuraDescription_Lang_enCN());
                pg.setAuraDescriptionLangZhCN(mysql.getAuraDescription_Lang_zhCN());
                pg.setAuraDescriptionLangEnTW(mysql.getAuraDescription_Lang_enTW());
                pg.setAuraDescriptionLangZhTW(mysql.getAuraDescription_Lang_zhTW());
                pg.setAuraDescriptionLangEsES(mysql.getAuraDescription_Lang_esES());
                pg.setAuraDescriptionLangEsMX(mysql.getAuraDescription_Lang_esMX());
                pg.setAuraDescriptionLangRuRU(mysql.getAuraDescription_Lang_ruRU());
                pg.setAuraDescriptionLangPtPT(mysql.getAuraDescription_Lang_ptPT());
                pg.setAuraDescriptionLangPtBR(mysql.getAuraDescription_Lang_ptBR());
                pg.setAuraDescriptionLangItIT(mysql.getAuraDescription_Lang_itIT());
                pg.setAuraDescriptionLangUnk(mysql.getAuraDescription_Lang_Unk());
                pg.setAuraDescriptionLangMask(mysql.getAuraDescription_Lang_Mask());
                pg.setManaCostPct(mysql.getManaCostPct());
                pg.setStartRecoveryCategory(mysql.getStartRecoveryCategory());
                pg.setStartRecoveryTime(mysql.getStartRecoveryTime());
                pg.setMaxTargetLevel(mysql.getMaxTargetLevel());
                pg.setSpellClassSet(mysql.getSpellClassSet());
                pg.setSpellClassMask1(mysql.getSpellClassMask_1());
                pg.setSpellClassMask2(mysql.getSpellClassMask_2());
                pg.setSpellClassMask3(mysql.getSpellClassMask_3());
                pg.setMaxTargets(mysql.getMaxTargets());
                pg.setDefenseType(mysql.getDefenseType());
                pg.setPreventionType(mysql.getPreventionType());
                pg.setStanceBarOrder(mysql.getStanceBarOrder());
                pg.setEffectChainAmplitude1(mysql.getEffectChainAmplitude_1());
                pg.setEffectChainAmplitude2(mysql.getEffectChainAmplitude_2());
                pg.setEffectChainAmplitude3(mysql.getEffectChainAmplitude_3());
                pg.setMinFactionId(mysql.getMinFactionID());
                pg.setMinReputation(mysql.getMinReputation());
                pg.setRequiredAuraVision(mysql.getRequiredAuraVision());
                pg.setRequiredTotemCategoryId1(mysql.getRequiredTotemCategoryID_1());
                pg.setRequiredTotemCategoryId2(mysql.getRequiredTotemCategoryID_2());
                pg.setRequiredAreasId(mysql.getRequiredAreasID());
                pg.setSchoolMask(mysql.getSchoolMask());
                pg.setRuneCostId(mysql.getRuneCostID());
                pg.setSpellMissileId(mysql.getSpellMissileID());
                pg.setPowerDisplayId(mysql.getPowerDisplayID());
                pg.setEffectBonusCoefficient1(mysql.getEffectBonusCoefficient_1());
                pg.setEffectBonusCoefficient2(mysql.getEffectBonusCoefficient_2());
                pg.setEffectBonusCoefficient3(mysql.getEffectBonusCoefficient_3());
                pg.setSpellDescriptionVariableId(mysql.getSpellDescriptionVariableID());
                pg.setSpellDifficultyId(mysql.getSpellDifficultyID());

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
