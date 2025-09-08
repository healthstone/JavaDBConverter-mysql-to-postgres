package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_lfgdungeons", schema = "dbc")
@Data
public class PgDbcLfgDungeons {
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

    @Column(name = "min_level", nullable = false)
    private Integer minLevel;

    @Column(name = "max_level", nullable = false)
    private Integer maxLevel;

    @Column(name = "target_level", nullable = false)
    private Integer targetLevel;

    @Column(name = "target_level_min", nullable = false)
    private Integer targetLevelMin;

    @Column(name = "target_level_max", nullable = false)
    private Integer targetLevelMax;

    @Column(name = "mapid", nullable = false)
    private Integer mapId;

    @Column(name = "difficulty", nullable = false)
    private Integer difficulty;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "typeid", nullable = false)
    private Integer typeId;

    @Column(name = "faction", nullable = false)
    private Integer faction;

    
    @Column(name = "texturefilename")
    private String textureFilename;

    @Column(name = "expansionlevel", nullable = false)
    private Integer expansionLevel;

    @Column(name = "order_index", nullable = false)
    private Integer orderIndex;

    @Column(name = "group_id", nullable = false)
    private Integer groupId;

    
    @Column(name = "description_lang_enus")
    private String descriptionLangEnUs;

    
    @Column(name = "description_lang_engb")
    private String descriptionLangEnGb;

    
    @Column(name = "description_lang_kokr")
    private String descriptionLangKoKr;

    
    @Column(name = "description_lang_frfr")
    private String descriptionLangFrFr;

    
    @Column(name = "description_lang_dede")
    private String descriptionLangDeDe;

    
    @Column(name = "description_lang_encn")
    private String descriptionLangEnCn;

    
    @Column(name = "description_lang_zhcn")
    private String descriptionLangZhCn;

    
    @Column(name = "description_lang_entw")
    private String descriptionLangEnTw;

    
    @Column(name = "description_lang_zhtw")
    private String descriptionLangZhTw;

    
    @Column(name = "description_lang_eses")
    private String descriptionLangEsEs;

    
    @Column(name = "description_lang_esmx")
    private String descriptionLangEsMx;

    
    @Column(name = "description_lang_ruru")
    private String descriptionLangRuRu;

    
    @Column(name = "description_lang_ptpt")
    private String descriptionLangPtPt;

    
    @Column(name = "description_lang_ptbr")
    private String descriptionLangPtBr;

    
    @Column(name = "description_lang_itit")
    private String descriptionLangItIt;

    
    @Column(name = "description_lang_unk")
    private String descriptionLangUnk;

    @Column(name = "description_lang_mask", nullable = false)
    private Long descriptionLangMask;
}
