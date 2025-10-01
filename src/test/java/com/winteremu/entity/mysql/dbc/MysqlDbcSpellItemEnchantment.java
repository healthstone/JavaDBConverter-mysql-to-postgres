package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellitemenchantment")
@Data
public class MysqlDbcSpellItemEnchantment {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Charges", nullable = false)
    private Integer charges;

    @Column(name = "Effect_1", nullable = false)
    private Integer effect1;

    @Column(name = "Effect_2", nullable = false)
    private Integer effect2;

    @Column(name = "Effect_3", nullable = false)
    private Integer effect3;

    @Column(name = "EffectPointsMin_1", nullable = false)
    private Integer effectPointsMin1;

    @Column(name = "EffectPointsMin_2", nullable = false)
    private Integer effectPointsMin2;

    @Column(name = "EffectPointsMin_3", nullable = false)
    private Integer effectPointsMin3;

    @Column(name = "EffectPointsMax_1", nullable = false)
    private Integer effectPointsMax1;

    @Column(name = "EffectPointsMax_2", nullable = false)
    private Integer effectPointsMax2;

    @Column(name = "EffectPointsMax_3", nullable = false)
    private Integer effectPointsMax3;

    @Column(name = "EffectArg_1", nullable = false)
    private Integer effectArg1;

    @Column(name = "EffectArg_2", nullable = false)
    private Integer effectArg2;

    @Column(name = "EffectArg_3", nullable = false)
    private Integer effectArg3;

    @Column(name = "Name_Lang_enUS", columnDefinition = "text")
    private String nameLangEnUs;

    @Column(name = "Name_Lang_enGB", columnDefinition = "text")
    private String nameLangEnGb;

    @Column(name = "Name_Lang_koKR", columnDefinition = "text")
    private String nameLangKoKr;

    @Column(name = "Name_Lang_frFR", columnDefinition = "text")
    private String nameLangFrFr;

    @Column(name = "Name_Lang_deDE", columnDefinition = "text")
    private String nameLangDeDe;

    @Column(name = "Name_Lang_enCN", columnDefinition = "text")
    private String nameLangEnCn;

    @Column(name = "Name_Lang_zhCN", columnDefinition = "text")
    private String nameLangZhCn;

    @Column(name = "Name_Lang_enTW", columnDefinition = "text")
    private String nameLangEnTw;

    @Column(name = "Name_Lang_zhTW", columnDefinition = "text")
    private String nameLangZhTw;

    @Column(name = "Name_Lang_esES", columnDefinition = "text")
    private String nameLangEsEs;

    @Column(name = "Name_Lang_esMX", columnDefinition = "text")
    private String nameLangEsMx;

    @Column(name = "Name_Lang_ruRU", columnDefinition = "text")
    private String nameLangRuRu;

    @Column(name = "Name_Lang_ptPT", columnDefinition = "text")
    private String nameLangPtPt;

    @Column(name = "Name_Lang_ptBR", columnDefinition = "text")
    private String nameLangPtBr;

    @Column(name = "Name_Lang_itIT", columnDefinition = "text")
    private String nameLangItIt;

    @Column(name = "Name_Lang_Unk", columnDefinition = "text")
    private String nameLangUnk;

    @Column(name = "Name_Lang_Mask", nullable = false)
    private Long nameLangMask;

    @Column(name = "ItemVisual", nullable = false)
    private Integer itemVisual;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "Src_ItemID", nullable = false)
    private Integer srcItemId;

    @Column(name = "Condition_Id", nullable = false)
    private Integer conditionId;

    @Column(name = "RequiredSkillID", nullable = false)
    private Integer requiredSkillId;

    @Column(name = "RequiredSkillRank", nullable = false)
    private Integer requiredSkillRank;

    @Column(name = "MinLevel", nullable = false)
    private Integer minLevel;
}
