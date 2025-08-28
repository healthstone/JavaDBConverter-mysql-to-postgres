package com.winteremu.entity.mysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_achievement_criteria")
@Data
public class MysqlDbcAchievementCriteria {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "Achievement_Id", nullable = false)
    private int achievementId;

    @Column(name = "Type", nullable = false)
    private int type;

    @Column(name = "Asset_Id", nullable = false)
    private int assetId;

    @Column(name = "Quantity", nullable = false)
    private int quantity;

    @Column(name = "Start_Event", nullable = false)
    private int startEvent;

    @Column(name = "Start_Asset", nullable = false)
    private int startAsset;

    @Column(name = "Fail_Event", nullable = false)
    private int failEvent;

    @Column(name = "Fail_Asset", nullable = false)
    private int failAsset;

    @Column(name = "Description_Lang_enUS")
    private String descriptionEnUS;

    @Column(name = "Description_Lang_enGB")
    private String descriptionEnGB;

    @Column(name = "Description_Lang_koKR")
    private String descriptionKoKR;

    @Column(name = "Description_Lang_frFR")
    private String descriptionFrFR;

    @Column(name = "Description_Lang_deDE")
    private String descriptionDeDE;

    @Column(name = "Description_Lang_enCN")
    private String descriptionEnCN;

    @Column(name = "Description_Lang_zhCN")
    private String descriptionZhCN;

    @Column(name = "Description_Lang_enTW")
    private String descriptionEnTW;

    @Column(name = "Description_Lang_zhTW")
    private String descriptionZhTW;

    @Column(name = "Description_Lang_esES")
    private String descriptionEsES;

    @Column(name = "Description_Lang_esMX")
    private String descriptionEsMX;

    @Column(name = "Description_Lang_ruRU")
    private String descriptionRuRU;

    @Column(name = "Description_Lang_ptPT")
    private String descriptionPtPT;

    @Column(name = "Description_Lang_ptBR")
    private String descriptionPtBR;

    @Column(name = "Description_Lang_itIT")
    private String descriptionItIT;

    @Column(name = "Description_Lang_Unk")
    private String descriptionUnk;

    @Column(name = "Description_Lang_Mask", nullable = false)
    private int descriptionLangMask;

    @Column(name = "Flags", nullable = false)
    private int flags;

    @Column(name = "Timer_Start_Event", nullable = false)
    private int timerStartEvent;

    @Column(name = "Timer_Asset_Id", nullable = false)
    private int timerAssetId;

    @Column(name = "Timer_Time", nullable = false)
    private int timerTime;

    @Column(name = "Ui_Order", nullable = false)
    private int uiOrder;
}
