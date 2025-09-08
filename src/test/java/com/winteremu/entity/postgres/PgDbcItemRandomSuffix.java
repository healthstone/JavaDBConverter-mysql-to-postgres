package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_itemrandomsuffix", schema = "dbc")
@Data
public class PgDbcItemRandomSuffix {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name_lang_enus")
    private String nameLangEnUs;

    @Column(name = "name_lang_engb")
    private String nameLangEnGb;

    @Column(name = "name_lang_kokr")
    private String nameLangKoKr;

    @Column(name = "name_lang_frfr")
    private String nameLangFrFr;

    @Column(name = "name_lang_dede")
    private String nameLangDeDe;

    @Column(name = "name_lang_encn")
    private String nameLangEnCn;

    @Column(name = "name_lang_zhcn")
    private String nameLangZhCn;

    @Column(name = "name_lang_entw")
    private String nameLangEnTw;

    @Column(name = "name_lang_zhtw")
    private String nameLangZhTw;

    @Column(name = "name_lang_eses")
    private String nameLangEsEs;

    @Column(name = "name_lang_esmx")
    private String nameLangEsMx;

    @Column(name = "name_lang_ruru")
    private String nameLangRuRu;

    @Column(name = "name_lang_ptpt")
    private String nameLangPtPt;

    @Column(name = "name_lang_ptbr")
    private String nameLangPtBr;

    @Column(name = "name_lang_itit")
    private String nameLangItIt;

    @Column(name = "name_lang_unk")
    private String nameLangUnk;

    @Column(name = "name_lang_mask", nullable = false)
    private Long nameLangMask;

    @Column(name = "internalname")
    private String internalName;

    @Column(name = "enchantment_1", nullable = false)
    private Integer enchantment1;

    @Column(name = "enchantment_2", nullable = false)
    private Integer enchantment2;

    @Column(name = "enchantment_3", nullable = false)
    private Integer enchantment3;

    @Column(name = "enchantment_4", nullable = false)
    private Integer enchantment4;

    @Column(name = "enchantment_5", nullable = false)
    private Integer enchantment5;

    @Column(name = "allocationpct_1", nullable = false)
    private Integer allocationPct1;

    @Column(name = "allocationpct_2", nullable = false)
    private Integer allocationPct2;

    @Column(name = "allocationpct_3", nullable = false)
    private Integer allocationPct3;

    @Column(name = "allocationpct_4", nullable = false)
    private Integer allocationPct4;

    @Column(name = "allocationpct_5", nullable = false)
    private Integer allocationPct5;
}
