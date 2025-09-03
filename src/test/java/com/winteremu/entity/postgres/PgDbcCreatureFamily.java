package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_creaturefamily", schema = "dbc")
@Data
public class PgDbcCreatureFamily {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "minscale", nullable = false)
    private Float minScale;

    @Column(name = "minscalelevel", nullable = false)
    private Integer minScaleLevel;

    @Column(name = "maxscale", nullable = false)
    private Float maxScale;

    @Column(name = "maxscalelevel", nullable = false)
    private Integer maxScaleLevel;

    @Column(name = "skillline_1", nullable = false)
    private Integer skillLine1;

    @Column(name = "skillline_2", nullable = false)
    private Integer skillLine2;

    @Column(name = "petfoodmask", nullable = false)
    private Integer petFoodMask;

    @Column(name = "pettalenttype", nullable = false)
    private Integer petTalentType;

    @Column(name = "categoryenumid", nullable = false)
    private Integer categoryEnumId;

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

    @Column(name = "iconfile")
    private String iconFile;
}
