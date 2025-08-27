package com.winteremu.entity.mysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_skillline")
@Data
public class MysqlDbcSkillLine {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "CategoryID", nullable = false)
    private int categoryId;

    @Column(name = "SkillCostsID", nullable = false)
    private int skillCostsId;

    // DisplayName
    @Column(name = "DisplayName_Lang_enUS", columnDefinition = "TEXT")
    private String displayNameEnUS;

    @Column(name = "DisplayName_Lang_enGB", columnDefinition = "TEXT")
    private String displayNameEnGB;

    @Column(name = "DisplayName_Lang_koKR", columnDefinition = "TEXT")
    private String displayNameKoKR;

    @Column(name = "DisplayName_Lang_frFR", columnDefinition = "TEXT")
    private String displayNameFrFR;

    @Column(name = "DisplayName_Lang_deDE", columnDefinition = "TEXT")
    private String displayNameDeDE;

    @Column(name = "DisplayName_Lang_enCN", columnDefinition = "TEXT")
    private String displayNameEnCN;

    @Column(name = "DisplayName_Lang_zhCN", columnDefinition = "TEXT")
    private String displayNameZhCN;

    @Column(name = "DisplayName_Lang_enTW", columnDefinition = "TEXT")
    private String displayNameEnTW;

    @Column(name = "DisplayName_Lang_zhTW", columnDefinition = "TEXT")
    private String displayNameZhTW;

    @Column(name = "DisplayName_Lang_esES", columnDefinition = "TEXT")
    private String displayNameEsES;

    @Column(name = "DisplayName_Lang_esMX", columnDefinition = "TEXT")
    private String displayNameEsMX;

    @Column(name = "DisplayName_Lang_ruRU", columnDefinition = "TEXT")
    private String displayNameRuRU;

    @Column(name = "DisplayName_Lang_ptPT", columnDefinition = "TEXT")
    private String displayNamePtPT;

    @Column(name = "DisplayName_Lang_ptBR", columnDefinition = "TEXT")
    private String displayNamePtBR;

    @Column(name = "DisplayName_Lang_itIT", columnDefinition = "TEXT")
    private String displayNameItIT;

    @Column(name = "DisplayName_Lang_Unk", columnDefinition = "TEXT")
    private String displayNameUnk;

    @Column(name = "DisplayName_Lang_Mask", nullable = false)
    private long displayNameMask;

    // Description
    @Column(name = "Description_Lang_enUS", columnDefinition = "TEXT")
    private String descriptionEnUS;

    @Column(name = "Description_Lang_enGB", columnDefinition = "TEXT")
    private String descriptionEnGB;

    @Column(name = "Description_Lang_koKR", columnDefinition = "TEXT")
    private String descriptionKoKR;

    @Column(name = "Description_Lang_frFR", columnDefinition = "TEXT")
    private String descriptionFrFR;

    @Column(name = "Description_Lang_deDE", columnDefinition = "TEXT")
    private String descriptionDeDE;

    @Column(name = "Description_Lang_enCN", columnDefinition = "TEXT")
    private String descriptionEnCN;

    @Column(name = "Description_Lang_zhCN", columnDefinition = "TEXT")
    private String descriptionZhCN;

    @Column(name = "Description_Lang_enTW", columnDefinition = "TEXT")
    private String descriptionEnTW;

    @Column(name = "Description_Lang_zhTW", columnDefinition = "TEXT")
    private String descriptionZhTW;

    @Column(name = "Description_Lang_esES", columnDefinition = "TEXT")
    private String descriptionEsES;

    @Column(name = "Description_Lang_esMX", columnDefinition = "TEXT")
    private String descriptionEsMX;

    @Column(name = "Description_Lang_ruRU", columnDefinition = "TEXT")
    private String descriptionRuRU;

    @Column(name = "Description_Lang_ptPT", columnDefinition = "TEXT")
    private String descriptionPtPT;

    @Column(name = "Description_Lang_ptBR", columnDefinition = "TEXT")
    private String descriptionPtBR;

    @Column(name = "Description_Lang_itIT", columnDefinition = "TEXT")
    private String descriptionItIT;

    @Column(name = "Description_Lang_Unk", columnDefinition = "TEXT")
    private String descriptionUnk;

    @Column(name = "Description_Lang_Mask", nullable = false)
    private long descriptionMask;

    @Column(name = "SpellIconID", nullable = false)
    private int spellIconId;

    // AlternateVerb
    @Column(name = "AlternateVerb_Lang_enUS", columnDefinition = "TEXT")
    private String alternateVerbEnUS;

    @Column(name = "AlternateVerb_Lang_enGB", columnDefinition = "TEXT")
    private String alternateVerbEnGB;

    @Column(name = "AlternateVerb_Lang_koKR", columnDefinition = "TEXT")
    private String alternateVerbKoKR;

    @Column(name = "AlternateVerb_Lang_frFR", columnDefinition = "TEXT")
    private String alternateVerbFrFR;

    @Column(name = "AlternateVerb_Lang_deDE", columnDefinition = "TEXT")
    private String alternateVerbDeDE;

    @Column(name = "AlternateVerb_Lang_enCN", columnDefinition = "TEXT")
    private String alternateVerbEnCN;

    @Column(name = "AlternateVerb_Lang_zhCN", columnDefinition = "TEXT")
    private String alternateVerbZhCN;

    @Column(name = "AlternateVerb_Lang_enTW", columnDefinition = "TEXT")
    private String alternateVerbEnTW;

    @Column(name = "AlternateVerb_Lang_zhTW", columnDefinition = "TEXT")
    private String alternateVerbZhTW;

    @Column(name = "AlternateVerb_Lang_esES", columnDefinition = "TEXT")
    private String alternateVerbEsES;

    @Column(name = "AlternateVerb_Lang_esMX", columnDefinition = "TEXT")
    private String alternateVerbEsMX;

    @Column(name = "AlternateVerb_Lang_ruRU", columnDefinition = "TEXT")
    private String alternateVerbRuRU;

    @Column(name = "AlternateVerb_Lang_ptPT", columnDefinition = "TEXT")
    private String alternateVerbPtPT;

    @Column(name = "AlternateVerb_Lang_ptBR", columnDefinition = "TEXT")
    private String alternateVerbPtBR;

    @Column(name = "AlternateVerb_Lang_itIT", columnDefinition = "TEXT")
    private String alternateVerbItIT;

    @Column(name = "AlternateVerb_Lang_Unk", columnDefinition = "TEXT")
    private String alternateVerbUnk;

    @Column(name = "AlternateVerb_Lang_Mask", nullable = false)
    private long alternateVerbMask;

    @Column(name = "CanLink", nullable = false)
    private int canLink;
}
