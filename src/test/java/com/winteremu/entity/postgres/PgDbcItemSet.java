package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_itemset", schema = "dbc")
@Data
public class PgDbcItemSet {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name_lang_enus")
    private String nameLangEnus;

    @Column(name = "name_lang_engb")
    private String nameLangEngb;

    @Column(name = "name_lang_kokr")
    private String nameLangKokr;

    @Column(name = "name_lang_frfr")
    private String nameLangFrfr;

    @Column(name = "name_lang_dede")
    private String nameLangDede;

    @Column(name = "name_lang_encn")
    private String nameLangEncn;

    @Column(name = "name_lang_zhcn")
    private String nameLangZhcn;

    @Column(name = "name_lang_entw")
    private String nameLangEntw;

    @Column(name = "name_lang_zhtw")
    private String nameLangZhtw;

    @Column(name = "name_lang_eses")
    private String nameLangEses;

    @Column(name = "name_lang_esmx")
    private String nameLangEsmx;

    @Column(name = "name_lang_ruru")
    private String nameLangRuru;

    @Column(name = "name_lang_ptpt")
    private String nameLangPtpt;

    @Column(name = "name_lang_ptbr")
    private String nameLangPtbr;

    @Column(name = "name_lang_itit")
    private String nameLangItit;

    @Column(name = "name_lang_unk")
    private String nameLangUnk;

    @Column(name = "name_lang_mask", nullable = false)
    private Long nameLangMask;

    // --- ItemID[1..17] ---
    @Column(name = "itemid_1", nullable = false) private Integer itemId1;
    @Column(name = "itemid_2", nullable = false) private Integer itemId2;
    @Column(name = "itemid_3", nullable = false) private Integer itemId3;
    @Column(name = "itemid_4", nullable = false) private Integer itemId4;
    @Column(name = "itemid_5", nullable = false) private Integer itemId5;
    @Column(name = "itemid_6", nullable = false) private Integer itemId6;
    @Column(name = "itemid_7", nullable = false) private Integer itemId7;
    @Column(name = "itemid_8", nullable = false) private Integer itemId8;
    @Column(name = "itemid_9", nullable = false) private Integer itemId9;
    @Column(name = "itemid_10", nullable = false) private Integer itemId10;
    @Column(name = "itemid_11", nullable = false) private Integer itemId11;
    @Column(name = "itemid_12", nullable = false) private Integer itemId12;
    @Column(name = "itemid_13", nullable = false) private Integer itemId13;
    @Column(name = "itemid_14", nullable = false) private Integer itemId14;
    @Column(name = "itemid_15", nullable = false) private Integer itemId15;
    @Column(name = "itemid_16", nullable = false) private Integer itemId16;
    @Column(name = "itemid_17", nullable = false) private Integer itemId17;

    // --- SetSpellID[1..8] ---
    @Column(name = "setspellid_1", nullable = false) private Integer setSpellId1;
    @Column(name = "setspellid_2", nullable = false) private Integer setSpellId2;
    @Column(name = "setspellid_3", nullable = false) private Integer setSpellId3;
    @Column(name = "setspellid_4", nullable = false) private Integer setSpellId4;
    @Column(name = "setspellid_5", nullable = false) private Integer setSpellId5;
    @Column(name = "setspellid_6", nullable = false) private Integer setSpellId6;
    @Column(name = "setspellid_7", nullable = false) private Integer setSpellId7;
    @Column(name = "setspellid_8", nullable = false) private Integer setSpellId8;

    // --- SetThreshold[1..8] ---
    @Column(name = "setthreshold_1", nullable = false) private Integer setThreshold1;
    @Column(name = "setthreshold_2", nullable = false) private Integer setThreshold2;
    @Column(name = "setthreshold_3", nullable = false) private Integer setThreshold3;
    @Column(name = "setthreshold_4", nullable = false) private Integer setThreshold4;
    @Column(name = "setthreshold_5", nullable = false) private Integer setThreshold5;
    @Column(name = "setthreshold_6", nullable = false) private Integer setThreshold6;
    @Column(name = "setthreshold_7", nullable = false) private Integer setThreshold7;
    @Column(name = "setthreshold_8", nullable = false) private Integer setThreshold8;

    @Column(name = "requiredskill", nullable = false)
    private Integer requiredSkill;

    @Column(name = "requiredskillrank", nullable = false)
    private Integer requiredSkillRank;
}
