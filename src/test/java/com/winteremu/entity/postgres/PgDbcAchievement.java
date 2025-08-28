package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_achievement", schema = "dbc")
@Data
public class PgDbcAchievement {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "faction", nullable = false)
    private Integer faction;

    @Column(name = "instance_id", nullable = false)
    private Integer instanceId;

    @Column(name = "supercedes", nullable = false)
    private Integer supercedes;

    // Title
    @Column(name = "title_lang_enus")
    private String titleEnUS;

    @Column(name = "title_lang_engb")
    private String titleEnGB;

    @Column(name = "title_lang_kokr")
    private String titleKoKR;

    @Column(name = "title_lang_frfr")
    private String titleFrFR;

    @Column(name = "title_lang_dede")
    private String titleDeDE;

    @Column(name = "title_lang_encn")
    private String titleEnCN;

    @Column(name = "title_lang_zhcn")
    private String titleZhCN;

    @Column(name = "title_lang_entw")
    private String titleEnTW;

    @Column(name = "title_lang_zhtw")
    private String titleZhTW;

    @Column(name = "title_lang_eses")
    private String titleEsES;

    @Column(name = "title_lang_esmx")
    private String titleEsMX;

    @Column(name = "title_lang_ruru")
    private String titleRuRU;

    @Column(name = "title_lang_ptpt")
    private String titlePtPT;

    @Column(name = "title_lang_ptbr")
    private String titlePtBR;

    @Column(name = "title_lang_itit")
    private String titleItIT;

    @Column(name = "title_lang_unk")
    private String titleUnk;

    @Column(name = "title_lang_mask", nullable = false)
    private Long titleMask;

    // Description
    @Column(name = "description_lang_enus")
    private String descriptionEnUS;

    @Column(name = "description_lang_engb")
    private String descriptionEnGB;

    @Column(name = "description_lang_kokr")
    private String descriptionKoKR;

    @Column(name = "description_lang_frfr")
    private String descriptionFrFR;

    @Column(name = "description_lang_dede")
    private String descriptionDeDE;

    @Column(name = "description_lang_encn")
    private String descriptionEnCN;

    @Column(name = "description_lang_zhcn")
    private String descriptionZhCN;

    @Column(name = "description_lang_entw")
    private String descriptionEnTW;

    @Column(name = "description_lang_zhtw")
    private String descriptionZhTW;

    @Column(name = "description_lang_eses")
    private String descriptionEsES;

    @Column(name = "description_lang_esmx")
    private String descriptionEsMX;

    @Column(name = "description_lang_ruru")
    private String descriptionRuRU;

    @Column(name = "description_lang_ptpt")
    private String descriptionPtPT;

    @Column(name = "description_lang_ptbr")
    private String descriptionPtBR;

    @Column(name = "description_lang_itit")
    private String descriptionItIT;

    @Column(name = "description_lang_unk")
    private String descriptionUnk;

    @Column(name = "description_lang_mask", nullable = false)
    private Long descriptionMask;

    // Other fields
    @Column(name = "category", nullable = false)
    private Integer category;

    @Column(name = "points", nullable = false)
    private Integer points;

    @Column(name = "ui_order", nullable = false)
    private Integer uiOrder;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "iconid", nullable = false)
    private Integer iconId;

    // Reward
    @Column(name = "reward_lang_enus")
    private String rewardEnUS;

    @Column(name = "reward_lang_engb")
    private String rewardEnGB;

    @Column(name = "reward_lang_kokr")
    private String rewardKoKR;

    @Column(name = "reward_lang_frfr")
    private String rewardFrFR;

    @Column(name = "reward_lang_dede")
    private String rewardDeDE;

    @Column(name = "reward_lang_encn")
    private String rewardEnCN;

    @Column(name = "reward_lang_zhcn")
    private String rewardZhCN;

    @Column(name = "reward_lang_entw")
    private String rewardEnTW;

    @Column(name = "reward_lang_zhtw")
    private String rewardZhTW;

    @Column(name = "reward_lang_eses")
    private String rewardEsES;

    @Column(name = "reward_lang_esmx")
    private String rewardEsMX;

    @Column(name = "reward_lang_ruru")
    private String rewardRuRU;

    @Column(name = "reward_lang_ptpt")
    private String rewardPtPT;

    @Column(name = "reward_lang_ptbr")
    private String rewardPtBR;

    @Column(name = "reward_lang_itit")
    private String rewardItIT;

    @Column(name = "reward_lang_unk")
    private String rewardUnk;

    @Column(name = "reward_lang_mask", nullable = false)
    private Long rewardMask;

    @Column(name = "minimum_criteria", nullable = false)
    private Integer minimumCriteria;

    @Column(name = "shares_criteria", nullable = false)
    private Integer sharesCriteria;
}
