package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellfocusobject")
@Data
public class MysqlDbcSpellFocusObject {
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
}
