package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_skillline", schema = "dbc")
@Data
public class PgDbcSkillLine {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "categoryid", nullable = false)
    private Integer categoryId;

    @Column(name = "skillcostsid", nullable = false)
    private Integer skillCostsId;

    // DisplayName
    @Column(name = "displayname_lang_enus")
    private String displayNameEnUS;

    @Column(name = "displayname_lang_engb")
    private String displayNameEnGB;

    @Column(name = "displayname_lang_kokr")
    private String displayNameKoKR;

    @Column(name = "displayname_lang_frfr")
    private String displayNameFrFR;

    @Column(name = "displayname_lang_dede")
    private String displayNameDeDE;

    @Column(name = "displayname_lang_encn")
    private String displayNameEnCN;

    @Column(name = "displayname_lang_zhcn")
    private String displayNameZhCN;

    @Column(name = "displayname_lang_entw")
    private String displayNameEnTW;

    @Column(name = "displayname_lang_zhtw")
    private String displayNameZhTW;

    @Column(name = "displayname_lang_eses")
    private String displayNameEsES;

    @Column(name = "displayname_lang_esmx")
    private String displayNameEsMX;

    @Column(name = "displayname_lang_ruru")
    private String displayNameRuRU;

    @Column(name = "displayname_lang_ptpt")
    private String displayNamePtPT;

    @Column(name = "displayname_lang_ptbr")
    private String displayNamePtBR;

    @Column(name = "displayname_lang_itit")
    private String displayNameItIT;

    @Column(name = "displayname_lang_unk")
    private String displayNameUnk;

    @Column(name = "displayname_lang_mask", nullable = false)
    private Long displayNameMask;

    // Description
    @Column(name = "description_lang_enus")
    private String descriptionEnUS;

    @Column(name = "description_lang_engb")
    private String descriptionEnGB;

    @Column(name = "description_lang_kokr")
    private String descriptionKoKR;

    @Column(name = "description_lang_frfr")
    private String descriptionFrFR;

    @Column(name = "description_lang_dede")
    private String descriptionDeDE;

    @Column(name = "description_lang_encn")
    private String descriptionEnCN;

    @Column(name = "description_lang_zhcn")
    private String descriptionZhCN;

    @Column(name = "description_lang_entw")
    private String descriptionEnTW;

    @Column(name = "description_lang_zhtw")
    private String descriptionZhTW;

    @Column(name = "description_lang_eses")
    private String descriptionEsES;

    @Column(name = "description_lang_esmx")
    private String descriptionEsMX;

    @Column(name = "description_lang_ruru")
    private String descriptionRuRU;

    @Column(name = "description_lang_ptpt")
    private String descriptionPtPT;

    @Column(name = "description_lang_ptbr")
    private String descriptionPtBR;

    @Column(name = "description_lang_itit")
    private String descriptionItIT;

    @Column(name = "description_lang_unk")
    private String descriptionUnk;

    @Column(name = "description_lang_mask", nullable = false)
    private Long descriptionMask;

    @Column(name = "spelliconid", nullable = false)
    private Integer spellIconId;

    // AlternateVerb
    @Column(name = "alternateverb_lang_enus")
    private String alternateVerbEnUS;

    @Column(name = "alternateverb_lang_engb")
    private String alternateVerbEnGB;

    @Column(name = "alternateverb_lang_kokr")
    private String alternateVerbKoKR;

    @Column(name = "alternateverb_lang_frfr")
    private String alternateVerbFrFR;

    @Column(name = "alternateverb_lang_dede")
    private String alternateVerbDeDE;

    @Column(name = "alternateverb_lang_encn")
    private String alternateVerbEnCN;

    @Column(name = "alternateverb_lang_zhcn")
    private String alternateVerbZhCN;

    @Column(name = "alternateverb_lang_entw")
    private String alternateVerbEnTW;

    @Column(name = "alternateverb_lang_zhtw")
    private String alternateVerbZhTW;

    @Column(name = "alternateverb_lang_eses")
    private String alternateVerbEsES;

    @Column(name = "alternateverb_lang_esmx")
    private String alternateVerbEsMX;

    @Column(name = "alternateverb_lang_ruru")
    private String alternateVerbRuRU;

    @Column(name = "alternateverb_lang_ptpt")
    private String alternateVerbPtPT;

    @Column(name = "alternateverb_lang_ptbr")
    private String alternateVerbPtBR;

    @Column(name = "alternateverb_lang_itit")
    private String alternateVerbItIT;

    @Column(name = "alternateverb_lang_unk")
    private String alternateVerbUnk;

    @Column(name = "alternateverb_lang_mask", nullable = false)
    private Long alternateVerbMask;

    @Column(name = "canlink", nullable = false)
    private Integer canLink;
}
