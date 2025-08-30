package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_barbershopstyle")
@Data
public class MysqlDbcBarbershopStyle {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Type", nullable = false)
    private Integer type;

    @Column(name = "DisplayName_Lang_enUS", columnDefinition = "TEXT")
    private String displayNameEnUs;

    @Column(name = "DisplayName_Lang_enGB", columnDefinition = "TEXT")
    private String displayNameEnGb;

    @Column(name = "DisplayName_Lang_koKR", columnDefinition = "TEXT")
    private String displayNameKoKr;

    @Column(name = "DisplayName_Lang_frFR", columnDefinition = "TEXT")
    private String displayNameFrFr;

    @Column(name = "DisplayName_Lang_deDE", columnDefinition = "TEXT")
    private String displayNameDeDe;

    @Column(name = "DisplayName_Lang_enCN", columnDefinition = "TEXT")
    private String displayNameEnCn;

    @Column(name = "DisplayName_Lang_zhCN", columnDefinition = "TEXT")
    private String displayNameZhCn;

    @Column(name = "DisplayName_Lang_enTW", columnDefinition = "TEXT")
    private String displayNameEnTw;

    @Column(name = "DisplayName_Lang_zhTW", columnDefinition = "TEXT")
    private String displayNameZhTw;

    @Column(name = "DisplayName_Lang_esES", columnDefinition = "TEXT")
    private String displayNameEsEs;

    @Column(name = "DisplayName_Lang_esMX", columnDefinition = "TEXT")
    private String displayNameEsMx;

    @Column(name = "DisplayName_Lang_ruRU", columnDefinition = "TEXT")
    private String displayNameRuRu;

    @Column(name = "DisplayName_Lang_ptPT", columnDefinition = "TEXT")
    private String displayNamePtPt;

    @Column(name = "DisplayName_Lang_ptBR", columnDefinition = "TEXT")
    private String displayNamePtBr;

    @Column(name = "DisplayName_Lang_itIT", columnDefinition = "TEXT")
    private String displayNameItIt;

    @Column(name = "DisplayName_Lang_Unk", columnDefinition = "TEXT")
    private String displayNameUnk;

    @Column(name = "DisplayName_Lang_Mask", nullable = false)
    private Long displayNameLangMask;

    @Column(name = "Description_Lang_enUS", columnDefinition = "TEXT")
    private String descriptionEnUs;

    @Column(name = "Description_Lang_enGB", columnDefinition = "TEXT")
    private String descriptionEnGb;

    @Column(name = "Description_Lang_koKR", columnDefinition = "TEXT")
    private String descriptionKoKr;

    @Column(name = "Description_Lang_frFR", columnDefinition = "TEXT")
    private String descriptionFrFr;

    @Column(name = "Description_Lang_deDE", columnDefinition = "TEXT")
    private String descriptionDeDe;

    @Column(name = "Description_Lang_enCN", columnDefinition = "TEXT")
    private String descriptionEnCn;

    @Column(name = "Description_Lang_zhCN", columnDefinition = "TEXT")
    private String descriptionZhCn;

    @Column(name = "Description_Lang_enTW", columnDefinition = "TEXT")
    private String descriptionEnTw;

    @Column(name = "Description_Lang_zhTW", columnDefinition = "TEXT")
    private String descriptionZhTw;

    @Column(name = "Description_Lang_esES", columnDefinition = "TEXT")
    private String descriptionEsEs;

    @Column(name = "Description_Lang_esMX", columnDefinition = "TEXT")
    private String descriptionEsMx;

    @Column(name = "Description_Lang_ruRU", columnDefinition = "TEXT")
    private String descriptionRuRu;

    @Column(name = "Description_Lang_ptPT", columnDefinition = "TEXT")
    private String descriptionPtPt;

    @Column(name = "Description_Lang_ptBR", columnDefinition = "TEXT")
    private String descriptionPtBr;

    @Column(name = "Description_Lang_itIT", columnDefinition = "TEXT")
    private String descriptionItIt;

    @Column(name = "Description_Lang_Unk", columnDefinition = "TEXT")
    private String descriptionUnk;

    @Column(name = "Description_Lang_Mask", nullable = false)
    private Long descriptionLangMask;

    @Column(name = "Cost_Modifier", nullable = false)
    private Float costModifier;

    @Column(name = "Race", nullable = false)
    private Integer race;

    @Column(name = "Sex", nullable = false)
    private Integer sex;

    @Column(name = "Data", nullable = false)
    private Integer data;
}
