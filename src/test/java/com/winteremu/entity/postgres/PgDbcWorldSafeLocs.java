package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_worldsafelocs", schema = "dbc")
public class PgDbcWorldSafeLocs {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "continent", nullable = false)
    private Integer continent;

    @Column(name = "loc_x", nullable = false)
    private Float locX;

    @Column(name = "loc_y", nullable = false)
    private Float locY;

    @Column(name = "loc_z", nullable = false)
    private Float locZ;

    @Column(name = "area_name_lang_enus")
    private String areaNameLangEnUS;

    @Column(name = "area_name_lang_engb")
    private String areaNameLangEngB;

    @Column(name = "area_name_lang_kokr")
    private String areaNameLangKoKR;

    @Column(name = "area_name_lang_frfr")
    private String areaNameLangFrFR;

    @Column(name = "area_name_lang_dede")
    private String areaNameLangDeDE;

    @Column(name = "area_name_lang_encn")
    private String areaNameLangEnCN;

    @Column(name = "area_name_lang_zhcn")
    private String areaNameLangZhCN;

    @Column(name = "area_name_lang_entw")
    private String areaNameLangEnTW;

    @Column(name = "area_name_lang_zhtw")
    private String areaNameLangZhTW;

    @Column(name = "area_name_lang_eses")
    private String areaNameLangEsES;

    @Column(name = "area_name_lang_esmx")
    private String areaNameLangEsMX;

    @Column(name = "area_name_lang_ruru")
    private String areaNameLangRuRU;

    @Column(name = "area_name_lang_ptpt")
    private String areaNameLangPtPT;

    @Column(name = "area_name_lang_ptbr")
    private String areaNameLangPtBR;

    @Column(name = "area_name_lang_itit")
    private String areaNameLangItIT;

    @Column(name = "area_name_lang_unk")
    private String areaNameLangUnk;

    @Column(name = "area_name_lang_mask", nullable = false)
    private Long areaNameLangMask;
}
