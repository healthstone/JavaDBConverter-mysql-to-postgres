package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_worldsafelocs")
public class MysqlDbcWorldSafeLocs {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Continent", nullable = false)
    private Integer continent;

    @Column(name = "LocX", nullable = false)
    private Float locX;

    @Column(name = "LocY", nullable = false)
    private Float locY;

    @Column(name = "LocZ", nullable = false)
    private Float locZ;

    @Column(name = "AreaName_Lang_enUS")
    private String areaNameLangEnUS;

    @Column(name = "AreaName_Lang_enGB")
    private String areaNameLangEnGB;

    @Column(name = "AreaName_Lang_koKR")
    private String areaNameLangKoKR;

    @Column(name = "AreaName_Lang_frFR")
    private String areaNameLangFrFR;

    @Column(name = "AreaName_Lang_deDE")
    private String areaNameLangDeDE;

    @Column(name = "AreaName_Lang_enCN")
    private String areaNameLangEnCN;

    @Column(name = "AreaName_Lang_zhCN")
    private String areaNameLangZhCN;

    @Column(name = "AreaName_Lang_enTW")
    private String areaNameLangEnTW;

    @Column(name = "AreaName_Lang_zhTW")
    private String areaNameLangZhTW;

    @Column(name = "AreaName_Lang_esES")
    private String areaNameLangEsES;

    @Column(name = "AreaName_Lang_esMX")
    private String areaNameLangEsMX;

    @Column(name = "AreaName_Lang_ruRU")
    private String areaNameLangRuRU;

    @Column(name = "AreaName_Lang_ptPT")
    private String areaNameLangPtPT;

    @Column(name = "AreaName_Lang_ptBR")
    private String areaNameLangPtBR;

    @Column(name = "AreaName_Lang_itIT")
    private String areaNameLangItIT;

    @Column(name = "AreaName_Lang_Unk")
    private String areaNameLangUnk;

    @Column(name = "AreaName_Lang_Mask", nullable = false)
    private Long areaNameLangMask;
}
