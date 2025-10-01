package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_talenttab")
@Data
public class MysqlDbcTalentTab {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

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

    @Column(name = "Name_Lang_Mask", nullable = false)
    private Long nameLangMask;

    @Column(name = "SpellIconID", nullable = false)
    private Integer spellIconId;

    @Column(name = "RaceMask", nullable = false)
    private Integer raceMask;

    @Column(name = "ClassMask", nullable = false)
    private Integer classMask;

    @Column(name = "PetTalentMask", nullable = false)
    private Integer petTalentMask;

    @Column(name = "OrderIndex", nullable = false)
    private Integer orderIndex;

    @Column(name = "BackgroundFile")
    private String backgroundFile;
}
