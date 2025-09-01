package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_chartitles", schema = "dbc")
@Data
public class PgDbcCharTitles {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "condition_id", nullable = false)
    private Integer conditionId;

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

    
    @Column(name = "name1_lang_enus")
    private String name1LangEnUs;

    
    @Column(name = "name1_lang_engb")
    private String name1LangEnGb;

    
    @Column(name = "name1_lang_kokr")
    private String name1LangKoKr;

    
    @Column(name = "name1_lang_frfr")
    private String name1LangFrFr;

    
    @Column(name = "name1_lang_dede")
    private String name1LangDeDe;

    
    @Column(name = "name1_lang_encn")
    private String name1LangEnCn;

    
    @Column(name = "name1_lang_zhcn")
    private String name1LangZhCn;

    
    @Column(name = "name1_lang_entw")
    private String name1LangEnTw;

    
    @Column(name = "name1_lang_zhtw")
    private String name1LangZhTw;

    
    @Column(name = "name1_lang_eses")
    private String name1LangEsEs;

    
    @Column(name = "name1_lang_esmx")
    private String name1LangEsMx;

    
    @Column(name = "name1_lang_ruru")
    private String name1LangRuRu;

    
    @Column(name = "name1_lang_ptpt")
    private String name1LangPtPt;

    
    @Column(name = "name1_lang_ptbr")
    private String name1LangPtBr;

    
    @Column(name = "name1_lang_itit")
    private String name1LangItIt;

    
    @Column(name = "name1_lang_unk")
    private String name1LangUnk;

    @Column(name = "name1_lang_mask", nullable = false)
    private Long name1LangMask;

    @Column(name = "mask_id", nullable = false)
    private Integer maskId;
}
