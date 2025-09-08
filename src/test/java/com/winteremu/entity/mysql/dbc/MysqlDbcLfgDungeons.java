package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_lfgdungeons")
@Data
public class MysqlDbcLfgDungeons {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    
    @Column(name = "Name_Lang_enUS")
    private String nameLangEnUs;

    
    @Column(name = "Name_Lang_enGB")
    private String nameLangEnGb;

    
    @Column(name = "Name_Lang_koKR")
    private String nameLangKoKr;

    
    @Column(name = "Name_Lang_frFR")
    private String nameLangFrFr;

    
    @Column(name = "Name_Lang_deDE")
    private String nameLangDeDe;

    
    @Column(name = "Name_Lang_enCN")
    private String nameLangEnCn;

    
    @Column(name = "Name_Lang_zhCN")
    private String nameLangZhCn;

    
    @Column(name = "Name_Lang_enTW")
    private String nameLangEnTw;

    
    @Column(name = "Name_Lang_zhTW")
    private String nameLangZhTw;

    
    @Column(name = "Name_Lang_esES")
    private String nameLangEsEs;

    
    @Column(name = "Name_Lang_esMX")
    private String nameLangEsMx;

    
    @Column(name = "Name_Lang_ruRU")
    private String nameLangRuRu;

    
    @Column(name = "Name_Lang_ptPT")
    private String nameLangPtPt;

    
    @Column(name = "Name_Lang_ptBR")
    private String nameLangPtBr;

    
    @Column(name = "Name_Lang_itIT")
    private String nameLangItIt;

    
    @Column(name = "Name_Lang_Unk")
    private String nameLangUnk;

    @Column(name = "Name_Lang_Mask", nullable = false)
    private Long nameLangMask;

    @Column(name = "MinLevel", nullable = false)
    private Integer minLevel;

    @Column(name = "MaxLevel", nullable = false)
    private Integer maxLevel;

    @Column(name = "Target_Level", nullable = false)
    private Integer targetLevel;

    @Column(name = "Target_Level_Min", nullable = false)
    private Integer targetLevelMin;

    @Column(name = "Target_Level_Max", nullable = false)
    private Integer targetLevelMax;

    @Column(name = "MapID", nullable = false)
    private Integer mapId;

    @Column(name = "Difficulty", nullable = false)
    private Integer difficulty;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "TypeID", nullable = false)
    private Integer typeId;

    @Column(name = "Faction", nullable = false)
    private Integer faction;

    
    @Column(name = "TextureFilename")
    private String textureFilename;

    @Column(name = "ExpansionLevel", nullable = false)
    private Integer expansionLevel;

    @Column(name = "Order_Index", nullable = false)
    private Integer orderIndex;

    @Column(name = "Group_Id", nullable = false)
    private Integer groupId;

    
    @Column(name = "Description_Lang_enUS")
    private String descriptionLangEnUs;

    
    @Column(name = "Description_Lang_enGB")
    private String descriptionLangEnGb;

    
    @Column(name = "Description_Lang_koKR")
    private String descriptionLangKoKr;

    
    @Column(name = "Description_Lang_frFR")
    private String descriptionLangFrFr;

    
    @Column(name = "Description_Lang_deDE")
    private String descriptionLangDeDe;

    
    @Column(name = "Description_Lang_enCN")
    private String descriptionLangEnCn;

    
    @Column(name = "Description_Lang_zhCN")
    private String descriptionLangZhCn;

    
    @Column(name = "Description_Lang_enTW")
    private String descriptionLangEnTw;

    
    @Column(name = "Description_Lang_zhTW")
    private String descriptionLangZhTw;

    
    @Column(name = "Description_Lang_esES")
    private String descriptionLangEsEs;

    
    @Column(name = "Description_Lang_esMX")
    private String descriptionLangEsMx;

    
    @Column(name = "Description_Lang_ruRU")
    private String descriptionLangRuRu;

    
    @Column(name = "Description_Lang_ptPT")
    private String descriptionLangPtPt;

    
    @Column(name = "Description_Lang_ptBR")
    private String descriptionLangPtBr;

    
    @Column(name = "Description_Lang_itIT")
    private String descriptionLangItIt;

    
    @Column(name = "Description_Lang_Unk")
    private String descriptionLangUnk;

    @Column(name = "Description_Lang_Mask", nullable = false)
    private Long descriptionLangMask;
}
