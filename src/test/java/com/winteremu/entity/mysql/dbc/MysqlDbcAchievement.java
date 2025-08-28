package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_achievement")
@Data
public class MysqlDbcAchievement {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Faction", nullable = false)
    private Integer faction;

    @Column(name = "Instance_Id", nullable = false)
    private Integer instanceId;

    @Column(name = "Supercedes", nullable = false)
    private Integer supercedes;

    // Title
    @Column(name = "Title_Lang_enUS")
    private String titleEnUS;

    @Column(name = "Title_Lang_enGB")
    private String titleEnGB;

    @Column(name = "Title_Lang_koKR")
    private String titleKoKR;

    @Column(name = "Title_Lang_frFR")
    private String titleFrFR;

    @Column(name = "Title_Lang_deDE")
    private String titleDeDE;

    @Column(name = "Title_Lang_enCN")
    private String titleEnCN;

    @Column(name = "Title_Lang_zhCN")
    private String titleZhCN;

    @Column(name = "Title_Lang_enTW")
    private String titleEnTW;

    @Column(name = "Title_Lang_zhTW")
    private String titleZhTW;

    @Column(name = "Title_Lang_esES")
    private String titleEsES;

    @Column(name = "Title_Lang_esMX")
    private String titleEsMX;

    @Column(name = "Title_Lang_ruRU")
    private String titleRuRU;

    @Column(name = "Title_Lang_ptPT")
    private String titlePtPT;

    @Column(name = "Title_Lang_ptBR")
    private String titlePtBR;

    @Column(name = "Title_Lang_itIT")
    private String titleItIT;

    @Column(name = "Title_Lang_Unk")
    private String titleUnk;

    @Column(name = "Title_Lang_Mask", nullable = false)
    private Long titleMask;

    // Description
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
    private Long descriptionMask;

    // Other fields
    @Column(name = "Category", nullable = false)
    private Integer category;

    @Column(name = "Points", nullable = false)
    private Integer points;

    @Column(name = "Ui_Order", nullable = false)
    private Integer uiOrder;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "IconID", nullable = false)
    private Integer iconId;

    // Reward
    @Column(name = "Reward_Lang_enUS")
    private String rewardEnUS;

    @Column(name = "Reward_Lang_enGB")
    private String rewardEnGB;

    @Column(name = "Reward_Lang_koKR")
    private String rewardKoKR;

    @Column(name = "Reward_Lang_frFR")
    private String rewardFrFR;

    @Column(name = "Reward_Lang_deDE")
    private String rewardDeDE;

    @Column(name = "Reward_Lang_enCN")
    private String rewardEnCN;

    @Column(name = "Reward_Lang_zhCN")
    private String rewardZhCN;

    @Column(name = "Reward_Lang_enTW")
    private String rewardEnTW;

    @Column(name = "Reward_Lang_zhTW")
    private String rewardZhTW;

    @Column(name = "Reward_Lang_esES")
    private String rewardEsES;

    @Column(name = "Reward_Lang_esMX")
    private String rewardEsMX;

    @Column(name = "Reward_Lang_ruRU")
    private String rewardRuRU;

    @Column(name = "Reward_Lang_ptPT")
    private String rewardPtPT;

    @Column(name = "Reward_Lang_ptBR")
    private String rewardPtBR;

    @Column(name = "Reward_Lang_itIT")
    private String rewardItIT;

    @Column(name = "Reward_Lang_Unk")
    private String rewardUnk;

    @Column(name = "Reward_Lang_Mask", nullable = false)
    private Long rewardMask;

    @Column(name = "Minimum_Criteria", nullable = false)
    private Integer minimumCriteria;

    @Column(name = "Shares_Criteria", nullable = false)
    private Integer sharesCriteria;
}
