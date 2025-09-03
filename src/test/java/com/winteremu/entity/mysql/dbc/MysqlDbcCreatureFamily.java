package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_creaturefamily")
@Data
public class MysqlDbcCreatureFamily {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "MinScale", nullable = false)
    private Float minScale;

    @Column(name = "MinScaleLevel", nullable = false)
    private Integer minScaleLevel;

    @Column(name = "MaxScale", nullable = false)
    private Float maxScale;

    @Column(name = "MaxScaleLevel", nullable = false)
    private Integer maxScaleLevel;

    @Column(name = "SkillLine_1", nullable = false)
    private Integer skillLine1;

    @Column(name = "SkillLine_2", nullable = false)
    private Integer skillLine2;

    @Column(name = "PetFoodMask", nullable = false)
    private Integer petFoodMask;

    @Column(name = "PetTalentType", nullable = false)
    private Integer petTalentType;

    @Column(name = "CategoryEnumID", nullable = false)
    private Integer categoryEnumId;

    @Column(name = "Name_Lang_enUS")
    private String nameLangEnUS;

    @Column(name = "Name_Lang_enGB")
    private String nameLangEnGB;

    @Column(name = "Name_Lang_koKR")
    private String nameLangKoKR;

    @Column(name = "Name_Lang_frFR")
    private String nameLangFrFR;

    @Column(name = "Name_Lang_deDE")
    private String nameLangDeDE;

    @Column(name = "Name_Lang_enCN")
    private String nameLangEnCN;

    @Column(name = "Name_Lang_zhCN")
    private String nameLangZhCN;

    @Column(name = "Name_Lang_enTW")
    private String nameLangEnTW;

    @Column(name = "Name_Lang_zhTW")
    private String nameLangZhTW;

    @Column(name = "Name_Lang_esES")
    private String nameLangEsES;

    @Column(name = "Name_Lang_esMX")
    private String nameLangEsMX;

    @Column(name = "Name_Lang_ruRU")
    private String nameLangRuRU;

    @Column(name = "Name_Lang_ptPT")
    private String nameLangPtPT;

    @Column(name = "Name_Lang_ptBR")
    private String nameLangPtBR;

    @Column(name = "Name_Lang_itIT")
    private String nameLangItIT;

    @Column(name = "Name_Lang_Unk")
    private String nameLangUnk;

    // int unsigned → Long
    @Column(name = "Name_Lang_Mask", nullable = false)
    private Long nameLangMask;

    @Column(name = "IconFile")
    private String iconFile;
}
