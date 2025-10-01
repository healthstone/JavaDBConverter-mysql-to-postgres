package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_taxinodes")
@Data
public class MysqlDbcTaxiNodes {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "ContinentID", nullable = false)
    private Integer continentId;

    @Column(name = "X", nullable = false)
    private Float x;

    @Column(name = "Y", nullable = false)
    private Float y;

    @Column(name = "Z", nullable = false)
    private Float z;

    @Column(name = "Name_Lang_enUS", columnDefinition = "TEXT")
    private String nameLangEnUS;

    @Column(name = "Name_Lang_enGB", columnDefinition = "TEXT")
    private String nameLangEnGB;

    @Column(name = "Name_Lang_koKR", columnDefinition = "TEXT")
    private String nameLangKoKR;

    @Column(name = "Name_Lang_frFR", columnDefinition = "TEXT")
    private String nameLangFrFR;

    @Column(name = "Name_Lang_deDE", columnDefinition = "TEXT")
    private String nameLangDeDE;

    @Column(name = "Name_Lang_enCN", columnDefinition = "TEXT")
    private String nameLangEnCN;

    @Column(name = "Name_Lang_zhCN", columnDefinition = "TEXT")
    private String nameLangZhCN;

    @Column(name = "Name_Lang_enTW", columnDefinition = "TEXT")
    private String nameLangEnTW;

    @Column(name = "Name_Lang_zhTW", columnDefinition = "TEXT")
    private String nameLangZhTW;

    @Column(name = "Name_Lang_esES", columnDefinition = "TEXT")
    private String nameLangEsES;

    @Column(name = "Name_Lang_esMX", columnDefinition = "TEXT")
    private String nameLangEsMX;

    @Column(name = "Name_Lang_ruRU", columnDefinition = "TEXT")
    private String nameLangRuRU;

    @Column(name = "Name_Lang_ptPT", columnDefinition = "TEXT")
    private String nameLangPtPT;

    @Column(name = "Name_Lang_ptBR", columnDefinition = "TEXT")
    private String nameLangPtBR;

    @Column(name = "Name_Lang_itIT", columnDefinition = "TEXT")
    private String nameLangItIT;

    @Column(name = "Name_Lang_Unk", columnDefinition = "TEXT")
    private String nameLangUnk;

    @Column(name = "Name_Lang_Mask", nullable = false)
    private Long nameLangMask;

    @Column(name = "MountCreatureID_1", nullable = false)
    private Integer mountCreatureId1;

    @Column(name = "MountCreatureID_2", nullable = false)
    private Integer mountCreatureId2;
}
