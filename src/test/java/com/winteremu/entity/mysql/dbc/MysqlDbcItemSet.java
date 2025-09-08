package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_itemset")
@Data
public class MysqlDbcItemSet {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Name_Lang_enUS", columnDefinition = "text")
    private String nameLangEnus;

    @Column(name = "Name_Lang_enGB", columnDefinition = "text")
    private String nameLangEngb;

    @Column(name = "Name_Lang_koKR", columnDefinition = "text")
    private String nameLangKokr;

    @Column(name = "Name_Lang_frFR", columnDefinition = "text")
    private String nameLangFrfr;

    @Column(name = "Name_Lang_deDE", columnDefinition = "text")
    private String nameLangDede;

    @Column(name = "Name_Lang_enCN", columnDefinition = "text")
    private String nameLangEncn;

    @Column(name = "Name_Lang_zhCN", columnDefinition = "text")
    private String nameLangZhcn;

    @Column(name = "Name_Lang_enTW", columnDefinition = "text")
    private String nameLangEntw;

    @Column(name = "Name_Lang_zhTW", columnDefinition = "text")
    private String nameLangZhtw;

    @Column(name = "Name_Lang_esES", columnDefinition = "text")
    private String nameLangEses;

    @Column(name = "Name_Lang_esMX", columnDefinition = "text")
    private String nameLangEsmx;

    @Column(name = "Name_Lang_ruRU", columnDefinition = "text")
    private String nameLangRuru;

    @Column(name = "Name_Lang_ptPT", columnDefinition = "text")
    private String nameLangPtpt;

    @Column(name = "Name_Lang_ptBR", columnDefinition = "text")
    private String nameLangPtbr;

    @Column(name = "Name_Lang_itIT", columnDefinition = "text")
    private String nameLangItit;

    @Column(name = "Name_Lang_Unk", columnDefinition = "text")
    private String nameLangUnk;

    @Column(name = "Name_Lang_Mask", nullable = false)
    private Long nameLangMask;

    @Column(name = "RequiredSkill", nullable = false)
    private Integer requiredSkill;

    @Column(name = "RequiredSkillRank", nullable = false)
    private Integer requiredSkillRank;

    // 17 предметов
    @Column(name = "ItemID_1", nullable = false)
    private Integer itemId1;
    @Column(name = "ItemID_2", nullable = false)
    private Integer itemId2;
    @Column(name = "ItemID_3", nullable = false)
    private Integer itemId3;
    @Column(name = "ItemID_4", nullable = false)
    private Integer itemId4;
    @Column(name = "ItemID_5", nullable = false)
    private Integer itemId5;
    @Column(name = "ItemID_6", nullable = false)
    private Integer itemId6;
    @Column(name = "ItemID_7", nullable = false)
    private Integer itemId7;
    @Column(name = "ItemID_8", nullable = false)
    private Integer itemId8;
    @Column(name = "ItemID_9", nullable = false)
    private Integer itemId9;
    @Column(name = "ItemID_10", nullable = false)
    private Integer itemId10;
    @Column(name = "ItemID_11", nullable = false)
    private Integer itemId11;
    @Column(name = "ItemID_12", nullable = false)
    private Integer itemId12;
    @Column(name = "ItemID_13", nullable = false)
    private Integer itemId13;
    @Column(name = "ItemID_14", nullable = false)
    private Integer itemId14;
    @Column(name = "ItemID_15", nullable = false)
    private Integer itemId15;
    @Column(name = "ItemID_16", nullable = false)
    private Integer itemId16;
    @Column(name = "ItemID_17", nullable = false)
    private Integer itemId17;

    // 8 SetSpellID + Threshold
    @Column(name = "SetSpellID_1", nullable = false)
    private Integer setSpellId1;
    @Column(name = "SetSpellID_2", nullable = false)
    private Integer setSpellId2;
    @Column(name = "SetSpellID_3", nullable = false)
    private Integer setSpellId3;
    @Column(name = "SetSpellID_4", nullable = false)
    private Integer setSpellId4;
    @Column(name = "SetSpellID_5", nullable = false)
    private Integer setSpellId5;
    @Column(name = "SetSpellID_6", nullable = false)
    private Integer setSpellId6;
    @Column(name = "SetSpellID_7", nullable = false)
    private Integer setSpellId7;
    @Column(name = "SetSpellID_8", nullable = false)
    private Integer setSpellId8;

    @Column(name = "SetThreshold_1", nullable = false)
    private Integer setThreshold1;
    @Column(name = "SetThreshold_2", nullable = false)
    private Integer setThreshold2;
    @Column(name = "SetThreshold_3", nullable = false)
    private Integer setThreshold3;
    @Column(name = "SetThreshold_4", nullable = false)
    private Integer setThreshold4;
    @Column(name = "SetThreshold_5", nullable = false)
    private Integer setThreshold5;
    @Column(name = "SetThreshold_6", nullable = false)
    private Integer setThreshold6;
    @Column(name = "SetThreshold_7", nullable = false)
    private Integer setThreshold7;
    @Column(name = "SetThreshold_8", nullable = false)
    private Integer setThreshold8;
}
