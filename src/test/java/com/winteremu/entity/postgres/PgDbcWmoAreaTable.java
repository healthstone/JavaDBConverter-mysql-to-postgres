package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_wmoareatable", schema = "dbc")
@Data
public class PgDbcWmoAreaTable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "wmoid", nullable = false)
    private Integer wmoId;

    @Column(name = "namesetid", nullable = false)
    private Integer nameSetId;

    @Column(name = "wmogroupid", nullable = false)
    private Integer wmoGroupId;

    @Column(name = "soundproviderpref", nullable = false)
    private Integer soundProviderPref;

    @Column(name = "soundproviderprefunderwater", nullable = false)
    private Integer soundProviderPrefUnderwater;

    @Column(name = "ambienceid", nullable = false)
    private Integer ambienceId;

    @Column(name = "zonemusic", nullable = false)
    private Integer zoneMusic;

    @Column(name = "introsound", nullable = false)
    private Integer introSound;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "areatableid", nullable = false)
    private Integer areaTableId;

    @Column(name = "areaname_lang_enus")
    private String areaNameLangEnUs;

    @Column(name = "areaname_lang_engb")
    private String areaNameLangEnGb;

    @Column(name = "areaname_lang_kokr")
    private String areaNameLangKoKr;

    @Column(name = "areaname_lang_frfr")
    private String areaNameLangFrFr;

    @Column(name = "areaname_lang_dede")
    private String areaNameLangDeDe;

    @Column(name = "areaname_lang_encn")
    private String areaNameLangEnCn;

    @Column(name = "areaname_lang_zhcn")
    private String areaNameLangZhCn;

    @Column(name = "areaname_lang_entw")
    private String areaNameLangEnTw;

    @Column(name = "areaname_lang_zhtw")
    private String areaNameLangZhTw;

    @Column(name = "areaname_lang_eses")
    private String areaNameLangEsEs;

    @Column(name = "areaname_lang_esmx")
    private String areaNameLangEsMx;

    @Column(name = "areaname_lang_ruru")
    private String areaNameLangRuRu;

    @Column(name = "areaname_lang_ptpt")
    private String areaNameLangPtPt;

    @Column(name = "areaname_lang_ptbr")
    private String areaNameLangPtBr;

    @Column(name = "areaname_lang_itit")
    private String areaNameLangItIt;

    @Column(name = "areaname_lang_unk")
    private String areaNameLangUnk;

    @Column(name = "areaname_lang_mask", nullable = false)
    private Long areaNameLangMask;
}
