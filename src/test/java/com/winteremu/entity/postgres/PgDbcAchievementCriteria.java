package com.winteremu.entity.postgres;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dbc_achievement_criteria", schema = "dbc")
@Data
public class PgDbcAchievementCriteria {
    @Id
    private Integer id;

    @Column(name = "achievement_id", nullable = false)
    private Integer achievementId = 0;

    @Column(name = "type", nullable = false)
    private Integer type = 0;

    @Column(name = "asset_id", nullable = false)
    private Integer assetId = 0;

    @Column(name = "quantity", nullable = false)
    private Integer quantity = 0;

    @Column(name = "start_event", nullable = false)
    private Integer startEvent = 0;

    @Column(name = "start_asset", nullable = false)
    private Integer startAsset = 0;

    @Column(name = "fail_event", nullable = false)
    private Integer failEvent = 0;

    @Column(name = "fail_asset", nullable = false)
    private Integer failAsset = 0;

    // Description fields
    @Column(name = "description_lang_enus")
    private String descriptionLangEnUS;

    @Column(name = "description_lang_engb")
    private String descriptionLangEnGB;

    @Column(name = "description_lang_kokr")
    private String descriptionLangKoKR;

    @Column(name = "description_lang_frfr")
    private String descriptionLangFrFR;

    @Column(name = "description_lang_dede")
    private String descriptionLangDeDE;

    @Column(name = "description_lang_encn")
    private String descriptionLangEnCN;

    @Column(name = "description_lang_zhcn")
    private String descriptionLangZhCN;

    @Column(name = "description_lang_entw")
    private String descriptionLangEnTW;

    @Column(name = "description_lang_zhtw")
    private String descriptionLangZhTW;

    @Column(name = "description_lang_eses")
    private String descriptionLangEsES;

    @Column(name = "description_lang_esmx")
    private String descriptionLangEsMX;

    @Column(name = "description_lang_ruru")
    private String descriptionLangRuRU;

    @Column(name = "description_lang_ptpt")
    private String descriptionLangPtPT;

    @Column(name = "description_lang_ptbr")
    private String descriptionLangPtBR;

    @Column(name = "description_lang_itit")
    private String descriptionLangItIT;

    @Column(name = "description_lang_unk")
    private String descriptionLangUnk;

    @Column(name = "description_lang_mask", nullable = false)
    private Integer descriptionLangMask = 0;

    @Column(name = "flags", nullable = false)
    private Integer flags = 0;

    @Column(name = "timer_start_event", nullable = false)
    private Integer timerStartEvent = 0;

    @Column(name = "timer_asset_id", nullable = false)
    private Integer timerAssetId = 0;

    @Column(name = "timer_time", nullable = false)
    private Integer timerTime = 0;

    @Column(name = "ui_order", nullable = false)
    private Integer uiOrder = 0;
}
