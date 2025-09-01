package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_chartitles")
@Data
public class MysqlDbcCharTitles {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Condition_ID", nullable = false)
    private Integer conditionId;


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


    @Column(name = "Name1_Lang_enUS")
    private String name1LangEnUs;


    @Column(name = "Name1_Lang_enGB")
    private String name1LangEnGb;


    @Column(name = "Name1_Lang_koKR")
    private String name1LangKoKr;


    @Column(name = "Name1_Lang_frFR")
    private String name1LangFrFr;


    @Column(name = "Name1_Lang_deDE")
    private String name1LangDeDe;


    @Column(name = "Name1_Lang_enCN")
    private String name1LangEnCn;


    @Column(name = "Name1_Lang_zhCN")
    private String name1LangZhCn;


    @Column(name = "Name1_Lang_enTW")
    private String name1LangEnTw;


    @Column(name = "Name1_Lang_zhTW")
    private String name1LangZhTw;


    @Column(name = "Name1_Lang_esES")
    private String name1LangEsEs;


    @Column(name = "Name1_Lang_esMX")
    private String name1LangEsMx;


    @Column(name = "Name1_Lang_ruRU")
    private String name1LangRuRu;


    @Column(name = "Name1_Lang_ptPT")
    private String name1LangPtPt;


    @Column(name = "Name1_Lang_ptBR")
    private String name1LangPtBr;


    @Column(name = "Name1_Lang_itIT")
    private String name1LangItIt;


    @Column(name = "Name1_Lang_Unk")
    private String name1LangUnk;

    @Column(name = "Name1_Lang_Mask", nullable = false)
    private Long name1LangMask;

    @Column(name = "Mask_ID", nullable = false)
    private Integer maskId;
}
