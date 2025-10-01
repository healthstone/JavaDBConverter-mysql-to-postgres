package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_talenttab", schema = "dbc")
@Data
public class PgDbcTalentTab {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

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
    private Long nameLangMask;

    @Column(name = "spelliconid", nullable = false)
    private Integer spellIconId;

    @Column(name = "racemask", nullable = false)
    private Integer raceMask;

    @Column(name = "classmask", nullable = false)
    private Integer classMask;

    @Column(name = "pettalentmask", nullable = false)
    private Integer petTalentMask;

    @Column(name = "orderindex", nullable = false)
    private Integer orderIndex;

    @Column(name = "backgroundfile")
    private String backgroundFile;
}
