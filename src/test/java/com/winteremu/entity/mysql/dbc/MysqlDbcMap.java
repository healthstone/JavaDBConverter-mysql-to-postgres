package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_map")
@Data
public class MysqlDbcMap {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Directory")
    private String directory;

    @Column(name = "InstanceType", nullable = false)
    private Integer instanceType;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "PVP", nullable = false)
    private Integer pvp;

    // MapName fields
    @Column(name = "MapName_Lang_enUS") private String mapNameLangEnUs;
    @Column(name = "MapName_Lang_enGB") private String mapNameLangEnGb;
    @Column(name = "MapName_Lang_koKR") private String mapNameLangKoKr;
    @Column(name = "MapName_Lang_frFR") private String mapNameLangFrFr;
    @Column(name = "MapName_Lang_deDE") private String mapNameLangDeDe;
    @Column(name = "MapName_Lang_enCN") private String mapNameLangEnCn;
    @Column(name = "MapName_Lang_zhCN") private String mapNameLangZhCn;
    @Column(name = "MapName_Lang_enTW") private String mapNameLangEnTw;
    @Column(name = "MapName_Lang_zhTW") private String mapNameLangZhTw;
    @Column(name = "MapName_Lang_esES") private String mapNameLangEsEs;
    @Column(name = "MapName_Lang_esMX") private String mapNameLangEsMx;
    @Column(name = "MapName_Lang_ruRU") private String mapNameLangRuRu;
    @Column(name = "MapName_Lang_ptPT") private String mapNameLangPtPt;
    @Column(name = "MapName_Lang_ptBR") private String mapNameLangPtBr;
    @Column(name = "MapName_Lang_itIT") private String mapNameLangItIt;
    @Column(name = "MapName_Lang_Unk") private String mapNameLangUnk;

    @Column(name = "MapName_Lang_Mask", nullable = false)
    private Long mapNameLangMask;

    @Column(name = "AreaTableID", nullable = false)
    private Integer areaTableId;

    // MapDescription0 fields
    @Column(name = "MapDescription0_Lang_enUS") private String mapDescription0LangEnUs;
    @Column(name = "MapDescription0_Lang_enGB") private String mapDescription0LangEnGb;
    @Column(name = "MapDescription0_Lang_koKR") private String mapDescription0LangKoKr;
    @Column(name = "MapDescription0_Lang_frFR") private String mapDescription0LangFrFr;
    @Column(name = "MapDescription0_Lang_deDE") private String mapDescription0LangDeDe;
    @Column(name = "MapDescription0_Lang_enCN") private String mapDescription0LangEnCn;
    @Column(name = "MapDescription0_Lang_zhCN") private String mapDescription0LangZhCn;
    @Column(name = "MapDescription0_Lang_enTW") private String mapDescription0LangEnTw;
    @Column(name = "MapDescription0_Lang_zhTW") private String mapDescription0LangZhTw;
    @Column(name = "MapDescription0_Lang_esES") private String mapDescription0LangEsEs;
    @Column(name = "MapDescription0_Lang_esMX") private String mapDescription0LangEsMx;
    @Column(name = "MapDescription0_Lang_ruRU") private String mapDescription0LangRuRu;
    @Column(name = "MapDescription0_Lang_ptPT") private String mapDescription0LangPtPt;
    @Column(name = "MapDescription0_Lang_ptBR") private String mapDescription0LangPtBr;
    @Column(name = "MapDescription0_Lang_itIT") private String mapDescription0LangItIt;
    @Column(name = "MapDescription0_Lang_Unk") private String mapDescription0LangUnk;

    @Column(name = "MapDescription0_Lang_Mask", nullable = false)
    private Long mapDescription0LangMask;

    // MapDescription1 fields
    @Column(name = "MapDescription1_Lang_enUS") private String mapDescription1LangEnUs;
    @Column(name = "MapDescription1_Lang_enGB") private String mapDescription1LangEnGb;
    @Column(name = "MapDescription1_Lang_koKR") private String mapDescription1LangKoKr;
    @Column(name = "MapDescription1_Lang_frFR") private String mapDescription1LangFrFr;
    @Column(name = "MapDescription1_Lang_deDE") private String mapDescription1LangDeDe;
    @Column(name = "MapDescription1_Lang_enCN") private String mapDescription1LangEnCn;
    @Column(name = "MapDescription1_Lang_zhCN") private String mapDescription1LangZhCn;
    @Column(name = "MapDescription1_Lang_enTW") private String mapDescription1LangEnTw;
    @Column(name = "MapDescription1_Lang_zhTW") private String mapDescription1LangZhTw;
    @Column(name = "MapDescription1_Lang_esES") private String mapDescription1LangEsEs;
    @Column(name = "MapDescription1_Lang_esMX") private String mapDescription1LangEsMx;
    @Column(name = "MapDescription1_Lang_ruRU") private String mapDescription1LangRuRu;
    @Column(name = "MapDescription1_Lang_ptPT") private String mapDescription1LangPtPt;
    @Column(name = "MapDescription1_Lang_ptBR") private String mapDescription1LangPtBr;
    @Column(name = "MapDescription1_Lang_itIT") private String mapDescription1LangItIt;
    @Column(name = "MapDescription1_Lang_Unk") private String mapDescription1LangUnk;

    @Column(name = "MapDescription1_Lang_Mask", nullable = false)
    private Long mapDescription1LangMask;

    @Column(name = "LoadingScreenID", nullable = false)
    private Integer loadingScreenId;

    @Column(name = "MinimapIconScale", nullable = false)
    private Float minimapIconScale;

    @Column(name = "CorpseMapID", nullable = false)
    private Integer corpseMapId;

    @Column(name = "CorpseX", nullable = false)
    private Float corpseX;

    @Column(name = "CorpseY", nullable = false)
    private Float corpseY;

    @Column(name = "TimeOfDayOverride", nullable = false)
    private Integer timeOfDayOverride;

    @Column(name = "ExpansionID", nullable = false)
    private Integer expansionId;

    @Column(name = "RaidOffset", nullable = false)
    private Integer raidOffset;

    @Column(name = "MaxPlayers", nullable = false)
    private Integer maxPlayers;
}
