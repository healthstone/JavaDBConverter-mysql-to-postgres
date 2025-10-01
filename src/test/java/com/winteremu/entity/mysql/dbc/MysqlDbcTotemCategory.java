package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_totemcategory")
@Data
public class MysqlDbcTotemCategory {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Name_Lang_enUS", columnDefinition = "TEXT")
    private String nameLangEnUs;

    @Column(name = "Name_Lang_enGB", columnDefinition = "TEXT")
    private String nameLangEnGb;

    @Column(name = "Name_Lang_koKR", columnDefinition = "TEXT")
    private String nameLangKoKr;

    @Column(name = "Name_Lang_frFR", columnDefinition = "TEXT")
    private String nameLangFrFr;

    @Column(name = "Name_Lang_deDE", columnDefinition = "TEXT")
    private String nameLangDeDe;

    @Column(name = "Name_Lang_enCN", columnDefinition = "TEXT")
    private String nameLangEnCn;

    @Column(name = "Name_Lang_zhCN", columnDefinition = "TEXT")
    private String nameLangZhCn;

    @Column(name = "Name_Lang_enTW", columnDefinition = "TEXT")
    private String nameLangEnTw;

    @Column(name = "Name_Lang_zhTW", columnDefinition = "TEXT")
    private String nameLangZhTw;

    @Column(name = "Name_Lang_esES", columnDefinition = "TEXT")
    private String nameLangEsEs;

    @Column(name = "Name_Lang_esMX", columnDefinition = "TEXT")
    private String nameLangEsMx;

    @Column(name = "Name_Lang_ruRU", columnDefinition = "TEXT")
    private String nameLangRuRu;

    @Column(name = "Name_Lang_ptPT", columnDefinition = "TEXT")
    private String nameLangPtPt;

    @Column(name = "Name_Lang_ptBR", columnDefinition = "TEXT")
    private String nameLangPtBr;

    @Column(name = "Name_Lang_itIT", columnDefinition = "TEXT")
    private String nameLangItIt;

    @Column(name = "Name_Lang_Unk", columnDefinition = "TEXT")
    private String nameLangUnk;

    @Column(name = "Name_Lang_Mask", nullable = false)
    private Long nameLangMask;

    @Column(name = "TotemCategoryType", nullable = false)
    private Integer totemCategoryType;

    @Column(name = "TotemCategoryMask", nullable = false)
    private Integer totemCategoryMask;
}
