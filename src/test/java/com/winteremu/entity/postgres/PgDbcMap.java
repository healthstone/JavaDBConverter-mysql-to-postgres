package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_map", schema = "dbc")
@Data
public class PgDbcMap {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "directory")
    private String directory;

    @Column(name = "instance_type", nullable = false)
    private Integer instanceType;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "pvp", nullable = false)
    private Integer pvp;

    @Column(name = "mapname_lang_en_us")
    private String mapNameLangEnUs;
    @Column(name = "mapname_lang_en_gb")
    private String mapNameLangEnGb;
    @Column(name = "mapname_lang_ko_kr")
    private String mapNameLangKoKr;
    @Column(name = "mapname_lang_fr_fr")
    private String mapNameLangFrFr;
    @Column(name = "mapname_lang_de_de")
    private String mapNameLangDeDe;
    @Column(name = "mapname_lang_en_cn")
    private String mapNameLangEnCn;
    @Column(name = "mapname_lang_zh_cn")
    private String mapNameLangZhCn;
    @Column(name = "mapname_lang_en_tw")
    private String mapNameLangEnTw;
    @Column(name = "mapname_lang_zh_tw")
    private String mapNameLangZhTw;
    @Column(name = "mapname_lang_es_es")
    private String mapNameLangEsEs;
    @Column(name = "mapname_lang_es_mx")
    private String mapNameLangEsMx;
    @Column(name = "mapname_lang_ru_ru")
    private String mapNameLangRuRu;
    @Column(name = "mapname_lang_pt_pt")
    private String mapNameLangPtPt;
    @Column(name = "mapname_lang_pt_br")
    private String mapNameLangPtBr;
    @Column(name = "mapname_lang_it_it")
    private String mapNameLangItIt;
    @Column(name = "mapname_lang_unk")
    private String mapNameLangUnk;

    @Column(name = "mapname_lang_mask", nullable = false)
    private Long mapNameLangMask;

    @Column(name = "area_table_id", nullable = false)
    private Integer areaTableId;

    // MapDescription0
    @Column(name = "mapdescription0_lang_en_us")
    private String mapDescription0LangEnUs;
    @Column(name = "mapdescription0_lang_en_gb")
    private String mapDescription0LangEnGb;
    @Column(name = "mapdescription0_lang_ko_kr")
    private String mapDescription0LangKoKr;
    @Column(name = "mapdescription0_lang_fr_fr")
    private String mapDescription0LangFrFr;
    @Column(name = "mapdescription0_lang_de_de")
    private String mapDescription0LangDeDe;
    @Column(name = "mapdescription0_lang_en_cn")
    private String mapDescription0LangEnCn;
    @Column(name = "mapdescription0_lang_zh_cn")
    private String mapDescription0LangZhCn;
    @Column(name = "mapdescription0_lang_en_tw")
    private String mapDescription0LangEnTw;
    @Column(name = "mapdescription0_lang_zh_tw")
    private String mapDescription0LangZhTw;
    @Column(name = "mapdescription0_lang_es_es")
    private String mapDescription0LangEsEs;
    @Column(name = "mapdescription0_lang_es_mx")
    private String mapDescription0LangEsMx;
    @Column(name = "mapdescription0_lang_ru_ru")
    private String mapDescription0LangRuRu;
    @Column(name = "mapdescription0_lang_pt_pt")
    private String mapDescription0LangPtPt;
    @Column(name = "mapdescription0_lang_pt_br")
    private String mapDescription0LangPtBr;
    @Column(name = "mapdescription0_lang_it_it")
    private String mapDescription0LangItIt;
    @Column(name = "mapdescription0_lang_unk")
    private String mapDescription0LangUnk;
    @Column(name = "mapdescription0_lang_mask", nullable = false)
    private Long mapDescription0LangMask;

    // MapDescription1
    @Column(name = "mapdescription1_lang_en_us")
    private String mapDescription1LangEnUs;
    @Column(name = "mapdescription1_lang_en_gb")
    private String mapDescription1LangEnGb;
    @Column(name = "mapdescription1_lang_ko_kr")
    private String mapDescription1LangKoKr;
    @Column(name = "mapdescription1_lang_fr_fr")
    private String mapDescription1LangFrFr;
    @Column(name = "mapdescription1_lang_de_de")
    private String mapDescription1LangDeDe;
    @Column(name = "mapdescription1_lang_en_cn")
    private String mapDescription1LangEnCn;
    @Column(name = "mapdescription1_lang_zh_cn")
    private String mapDescription1LangZhCn;
    @Column(name = "mapdescription1_lang_en_tw")
    private String mapDescription1LangEnTw;
    @Column(name = "mapdescription1_lang_zh_tw")
    private String mapDescription1LangZhTw;
    @Column(name = "mapdescription1_lang_es_es")
    private String mapDescription1LangEsEs;
    @Column(name = "mapdescription1_lang_es_mx")
    private String mapDescription1LangEsMx;
    @Column(name = "mapdescription1_lang_ru_ru")
    private String mapDescription1LangRuRu;
    @Column(name = "mapdescription1_lang_pt_pt")
    private String mapDescription1LangPtPt;
    @Column(name = "mapdescription1_lang_pt_br")
    private String mapDescription1LangPtBr;
    @Column(name = "mapdescription1_lang_it_it")
    private String mapDescription1LangItIt;
    @Column(name = "mapdescription1_lang_unk")
    private String mapDescription1LangUnk;
    @Column(name = "mapdescription1_lang_mask", nullable = false)
    private Long mapDescription1LangMask;

    @Column(name = "loading_screen_id", nullable = false)
    private Integer loadingScreenId;

    @Column(name = "minimap_icon_scale", nullable = false)
    private Float minimapIconScale;

    @Column(name = "corpse_map_id", nullable = false)
    private Integer corpseMapId;

    @Column(name = "corpse_x", nullable = false)
    private Float corpseX;

    @Column(name = "corpse_y", nullable = false)
    private Float corpseY;

    @Column(name = "time_of_day_override", nullable = false)
    private Integer timeOfDayOverride;

    @Column(name = "expansion_id", nullable = false)
    private Integer expansionId;

    @Column(name = "raid_offset", nullable = false)
    private Integer raidOffset;

    @Column(name = "max_players", nullable = false)
    private Integer maxPlayers;
}
