package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_faction")
@Data
public class MysqlDbcFaction {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "ReputationIndex", nullable = false)
    private Integer reputationIndex;

    @Column(name = "ReputationRaceMask_1", nullable = false)
    private Integer reputationRaceMask1;

    @Column(name = "ReputationRaceMask_2", nullable = false)
    private Integer reputationRaceMask2;

    @Column(name = "ReputationRaceMask_3", nullable = false)
    private Integer reputationRaceMask3;

    @Column(name = "ReputationRaceMask_4", nullable = false)
    private Integer reputationRaceMask4;

    @Column(name = "ReputationClassMask_1", nullable = false)
    private Integer reputationClassMask1;

    @Column(name = "ReputationClassMask_2", nullable = false)
    private Integer reputationClassMask2;

    @Column(name = "ReputationClassMask_3", nullable = false)
    private Integer reputationClassMask3;

    @Column(name = "ReputationClassMask_4", nullable = false)
    private Integer reputationClassMask4;

    @Column(name = "ReputationBase_1", nullable = false)
    private Integer reputationBase1;

    @Column(name = "ReputationBase_2", nullable = false)
    private Integer reputationBase2;

    @Column(name = "ReputationBase_3", nullable = false)
    private Integer reputationBase3;

    @Column(name = "ReputationBase_4", nullable = false)
    private Integer reputationBase4;

    @Column(name = "ReputationFlags_1", nullable = false)
    private Integer reputationFlags1;

    @Column(name = "ReputationFlags_2", nullable = false)
    private Integer reputationFlags2;

    @Column(name = "ReputationFlags_3", nullable = false)
    private Integer reputationFlags3;

    @Column(name = "ReputationFlags_4", nullable = false)
    private Integer reputationFlags4;

    @Column(name = "ParentFactionID", nullable = false)
    private Integer parentFactionId;

    @Column(name = "ParentFactionMod_1", nullable = false)
    private Float parentFactionMod1;

    @Column(name = "ParentFactionMod_2", nullable = false)
    private Float parentFactionMod2;

    @Column(name = "ParentFactionCap_1", nullable = false)
    private Integer parentFactionCap1;

    @Column(name = "ParentFactionCap_2", nullable = false)
    private Integer parentFactionCap2;

    // ---------- Name Localizations ----------
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

    // ---------- Description Localizations ----------
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
