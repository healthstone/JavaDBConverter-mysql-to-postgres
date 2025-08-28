package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_areatable", schema = "dbc")
public class PgDbcAreaTable {
    @Id
    private Integer id;

    @Column(name = "continent_id", nullable = false)
    private Integer continentId = 0;

    @Column(name = "parent_area_id", nullable = false)
    private Integer parentAreaId = 0;

    @Column(name = "area_bit", nullable = false)
    private Integer areaBit = 0;

    @Column(name = "flags", nullable = false)
    private Integer flags = 0;

    @Column(name = "sound_provider_pref", nullable = false)
    private Integer soundProviderPref = 0;

    @Column(name = "sound_provider_pref_underwater", nullable = false)
    private Integer soundProviderPrefUnderwater = 0;

    @Column(name = "ambience_id", nullable = false)
    private Integer ambienceId = 0;

    @Column(name = "zone_music", nullable = false)
    private Integer zoneMusic = 0;

    @Column(name = "intro_sound", nullable = false)
    private Integer introSound = 0;

    @Column(name = "exploration_level", nullable = false)
    private Integer explorationLevel = 0;

    @Column(name = "area_name_lang_enUS")
    private String areaNameLangEnUS;

    @Column(name = "area_name_lang_enGB")
    private String areaNameLangEnGB;

    @Column(name = "area_name_lang_koKR")
    private String areaNameLangKoKR;

    @Column(name = "area_name_lang_frFR")
    private String areaNameLangFrFR;

    @Column(name = "area_name_lang_deDE")
    private String areaNameLangDeDE;

    @Column(name = "area_name_lang_enCN")
    private String areaNameLangEnCN;

    @Column(name = "area_name_lang_zhCN")
    private String areaNameLangZhCN;

    @Column(name = "area_name_lang_enTW")
    private String areaNameLangEnTW;

    @Column(name = "area_name_lang_zhTW")
    private String areaNameLangZhTW;

    @Column(name = "area_name_lang_esES")
    private String areaNameLangEsES;

    @Column(name = "area_name_lang_esMX")
    private String areaNameLangEsMX;

    @Column(name = "area_name_lang_ruRU")
    private String areaNameLangRuRU;

    @Column(name = "area_name_lang_ptPT")
    private String areaNameLangPtPT;

    @Column(name = "area_name_lang_ptBR")
    private String areaNameLangPtBR;

    @Column(name = "area_name_lang_itIT")
    private String areaNameLangItIT;

    @Column(name = "area_name_lang_Unk")
    private String areaNameLangUnk;

    @Column(name = "area_name_lang_mask", nullable = false)
    private Integer areaNameLangMask = 0;

    @Column(name = "faction_group_mask", nullable = false)
    private Integer factionGroupMask = 0;

    @Column(name = "liquid_type_id_1", nullable = false)
    private Integer liquidTypeId1 = 0;

    @Column(name = "liquid_type_id_2", nullable = false)
    private Integer liquidTypeId2 = 0;

    @Column(name = "liquid_type_id_3", nullable = false)
    private Integer liquidTypeId3 = 0;

    @Column(name = "liquid_type_id_4", nullable = false)
    private Integer liquidTypeId4 = 0;

    @Column(name = "min_elevation", nullable = false)
    private Float minElevation = 0f;

    @Column(name = "ambient_multiplier", nullable = false)
    private Float ambientMultiplier = 0f;

    @Column(name = "lightid", nullable = false)
    private Integer lightId = 0;
}
