package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_faction", schema = "dbc")
@Data
public class PgDbcFaction {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "reputationindex", nullable = false)
    private Integer reputationIndex;

    @Column(name = "reputationracemask_1", nullable = false)
    private Integer reputationRaceMask1;

    @Column(name = "reputationracemask_2", nullable = false)
    private Integer reputationRaceMask2;

    @Column(name = "reputationracemask_3", nullable = false)
    private Integer reputationRaceMask3;

    @Column(name = "reputationracemask_4", nullable = false)
    private Integer reputationRaceMask4;

    @Column(name = "reputationclassmask_1", nullable = false)
    private Integer reputationClassMask1;

    @Column(name = "reputationclassmask_2", nullable = false)
    private Integer reputationClassMask2;

    @Column(name = "reputationclassmask_3", nullable = false)
    private Integer reputationClassMask3;

    @Column(name = "reputationclassmask_4", nullable = false)
    private Integer reputationClassMask4;

    @Column(name = "reputationbase_1", nullable = false)
    private Integer reputationBase1;

    @Column(name = "reputationbase_2", nullable = false)
    private Integer reputationBase2;

    @Column(name = "reputationbase_3", nullable = false)
    private Integer reputationBase3;

    @Column(name = "reputationbase_4", nullable = false)
    private Integer reputationBase4;

    @Column(name = "reputationflags_1", nullable = false)
    private Integer reputationFlags1;

    @Column(name = "reputationflags_2", nullable = false)
    private Integer reputationFlags2;

    @Column(name = "reputationflags_3", nullable = false)
    private Integer reputationFlags3;

    @Column(name = "reputationflags_4", nullable = false)
    private Integer reputationFlags4;

    @Column(name = "parentfactionid", nullable = false)
    private Integer parentFactionId;

    @Column(name = "parentfactionmod_1", nullable = false)
    private Float parentFactionMod1;

    @Column(name = "parentfactionmod_2", nullable = false)
    private Float parentFactionMod2;

    @Column(name = "parentfactioncap_1", nullable = false)
    private Integer parentFactionCap1;

    @Column(name = "parentfactioncap_2", nullable = false)
    private Integer parentFactionCap2;

    // ---------- Name Localizations ----------
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

    // ---------- Description Localizations ----------
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
