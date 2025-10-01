package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellitemenchantment", schema = "dbc")
@Data
public class PgDbcSpellItemEnchantment {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "charges", nullable = false)
    private Integer charges;

    @Column(name = "effect_1", nullable = false)
    private Integer effect1;

    @Column(name = "effect_2", nullable = false)
    private Integer effect2;

    @Column(name = "effect_3", nullable = false)
    private Integer effect3;

    @Column(name = "effectpointsmin_1", nullable = false)
    private Integer effectPointsMin1;

    @Column(name = "effectpointsmin_2", nullable = false)
    private Integer effectPointsMin2;

    @Column(name = "effectpointsmin_3", nullable = false)
    private Integer effectPointsMin3;

    @Column(name = "effectpointsmax_1", nullable = false)
    private Integer effectPointsMax1;

    @Column(name = "effectpointsmax_2", nullable = false)
    private Integer effectPointsMax2;

    @Column(name = "effectpointsmax_3", nullable = false)
    private Integer effectPointsMax3;

    @Column(name = "effectarg_1", nullable = false)
    private Integer effectArg1;

    @Column(name = "effectarg_2", nullable = false)
    private Integer effectArg2;

    @Column(name = "effectarg_3", nullable = false)
    private Integer effectArg3;

    @Column(name = "name_lang_enus")
    private String nameLangEnus;

    @Column(name = "name_lang_engb")
    private String nameLangEngb;

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

    @Column(name = "itemvisual", nullable = false)
    private Integer itemVisual;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "src_itemid", nullable = false)
    private Integer srcItemId;

    @Column(name = "condition_id", nullable = false)
    private Integer conditionId;

    @Column(name = "requiredskillid", nullable = false)
    private Integer requiredSkillId;

    @Column(name = "requiredskillrank", nullable = false)
    private Integer requiredSkillRank;

    @Column(name = "minlevel", nullable = false)
    private Integer minLevel;
}
