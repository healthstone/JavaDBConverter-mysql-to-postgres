package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_wmoareatable")
@Data
public class MysqlDbcWmoAreaTable {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "WMOID", nullable = false)
    private Integer wmoId;

    @Column(name = "NameSetID", nullable = false)
    private Integer nameSetId;

    @Column(name = "WMOGroupID", nullable = false)
    private Integer wmoGroupId;

    @Column(name = "SoundProviderPref", nullable = false)
    private Integer soundProviderPref;

    @Column(name = "SoundProviderPrefUnderwater", nullable = false)
    private Integer soundProviderPrefUnderwater;

    @Column(name = "AmbienceID", nullable = false)
    private Integer ambienceId;

    @Column(name = "ZoneMusic", nullable = false)
    private Integer zoneMusic;

    @Column(name = "IntroSound", nullable = false)
    private Integer introSound;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "AreaTableID", nullable = false)
    private Integer areaTableId;

    @Column(name = "AreaName_Lang_enUS", columnDefinition = "text")
    private String areaNameLangEnUs;

    @Column(name = "AreaName_Lang_enGB", columnDefinition = "text")
    private String areaNameLangEnGb;

    @Column(name = "AreaName_Lang_koKR", columnDefinition = "text")
    private String areaNameLangKoKr;

    @Column(name = "AreaName_Lang_frFR", columnDefinition = "text")
    private String areaNameLangFrFr;

    @Column(name = "AreaName_Lang_deDE", columnDefinition = "text")
    private String areaNameLangDeDe;

    @Column(name = "AreaName_Lang_enCN", columnDefinition = "text")
    private String areaNameLangEnCn;

    @Column(name = "AreaName_Lang_zhCN", columnDefinition = "text")
    private String areaNameLangZhCn;

    @Column(name = "AreaName_Lang_enTW", columnDefinition = "text")
    private String areaNameLangEnTw;

    @Column(name = "AreaName_Lang_zhTW", columnDefinition = "text")
    private String areaNameLangZhTw;

    @Column(name = "AreaName_Lang_esES", columnDefinition = "text")
    private String areaNameLangEsEs;

    @Column(name = "AreaName_Lang_esMX", columnDefinition = "text")
    private String areaNameLangEsMx;

    @Column(name = "AreaName_Lang_ruRU", columnDefinition = "text")
    private String areaNameLangRuRu;

    @Column(name = "AreaName_Lang_ptPT", columnDefinition = "text")
    private String areaNameLangPtPt;

    @Column(name = "AreaName_Lang_ptBR", columnDefinition = "text")
    private String areaNameLangPtBr;

    @Column(name = "AreaName_Lang_itIT", columnDefinition = "text")
    private String areaNameLangItIt;

    @Column(name = "AreaName_Lang_Unk", columnDefinition = "text")
    private String areaNameLangUnk;

    @Column(name = "AreaName_Lang_Mask", nullable = false)
    private Long areaNameLangMask;
}
