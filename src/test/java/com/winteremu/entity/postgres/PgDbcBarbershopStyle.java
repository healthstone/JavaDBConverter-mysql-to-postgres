package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_barbershopstyle", schema = "dbc")
@Data
public class PgDbcBarbershopStyle {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "type", nullable = false)
    private Integer type;

    @Column(name = "displayname_lang_enus")
    private String displayNameLangEnUS;

    @Column(name = "displayname_lang_engb")
    private String displayNameLangEnGB;

    @Column(name = "displayname_lang_kokr")
    private String displayNameLangKoKR;

    @Column(name = "displayname_lang_frfr")
    private String displayNameLangFrFR;

    @Column(name = "displayname_lang_dede")
    private String displayNameLangDeDE;

    @Column(name = "displayname_lang_encn")
    private String displayNameLangEnCN;

    @Column(name = "displayname_lang_zhcn")
    private String displayNameLangZhCN;

    @Column(name = "displayname_lang_entw")
    private String displayNameLangEnTW;

    @Column(name = "displayname_lang_zhtw")
    private String displayNameLangZhTW;

    @Column(name = "displayname_lang_eses")
    private String displayNameLangEsES;

    @Column(name = "displayname_lang_esmx")
    private String displayNameLangEsMX;

    @Column(name = "displayname_lang_ruru")
    private String displayNameLangRuRU;

    @Column(name = "displayname_lang_ptpt")
    private String displayNameLangPtPT;

    @Column(name = "displayname_lang_ptbr")
    private String displayNameLangPtBR;

    @Column(name = "displayname_lang_itit")
    private String displayNameLangItIT;

    @Column(name = "displayname_lang_unk")
    private String displayNameLangUnk;

    @Column(name = "displayname_lang_mask", nullable = false)
    private Long displayNameLangMask;

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
    private Long descriptionLangMask;

    @Column(name = "cost_modifier", nullable = false)
    private Float costModifier;

    @Column(name = "race", nullable = false)
    private Integer race;

    @Column(name = "sex", nullable = false)
    private Integer sex;

    @Column(name = "data", nullable = false)
    private Integer data;
}
