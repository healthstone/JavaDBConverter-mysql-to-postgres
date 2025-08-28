package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_areatable")
@Data
public class MysqlDbcAreaTable {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "ContinentID", nullable = false)
    private int continentId;

    @Column(name = "ParentAreaID", nullable = false)
    private int parentAreaId;

    @Column(name = "AreaBit", nullable = false)
    private int areaBit;

    @Column(name = "Flags", nullable = false)
    private int flags;

    @Column(name = "SoundProviderPref", nullable = false)
    private int soundProviderPref;

    @Column(name = "SoundProviderPrefUnderwater", nullable = false)
    private int soundProviderPrefUnderwater;

    @Column(name = "AmbienceID", nullable = false)
    private int ambienceId;

    @Column(name = "ZoneMusic", nullable = false)
    private int zoneMusic;

    @Column(name = "IntroSound", nullable = false)
    private int introSound;

    @Column(name = "ExplorationLevel", nullable = false)
    private int explorationLevel;

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
    private Integer areaNameLangMask;

    @Column(name = "FactionGroupMask", nullable = false)
    private int factionGroupMask;

    @Column(name = "LiquidTypeID_1", nullable = false)
    private int liquidTypeId1;

    @Column(name = "LiquidTypeID_2", nullable = false)
    private int liquidTypeId2;

    @Column(name = "LiquidTypeID_3", nullable = false)
    private int liquidTypeId3;

    @Column(name = "LiquidTypeID_4", nullable = false)
    private int liquidTypeId4;

    @Column(name = "MinElevation", nullable = false)
    private float minElevation;

    @Column(name = "Ambient_Multiplier", nullable = false)
    private float ambientMultiplier;

    @Column(name = "Lightid", nullable = false)
    private int lightId;
}
