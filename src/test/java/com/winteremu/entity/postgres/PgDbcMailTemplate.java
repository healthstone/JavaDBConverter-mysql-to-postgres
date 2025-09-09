package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_mailtemplate", schema = "dbc")
@Data
public class PgDbcMailTemplate {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    // Subject fields
    @Column(name = "subject_lang_en_us") private String subjectLangEnUS;
    @Column(name = "subject_lang_en_gb") private String subjectLangEnGB;
    @Column(name = "subject_lang_ko_kr") private String subjectLangKoKR;
    @Column(name = "subject_lang_fr_fr") private String subjectLangFrFR;
    @Column(name = "subject_lang_de_de") private String subjectLangDeDE;
    @Column(name = "subject_lang_en_cn") private String subjectLangEnCN;
    @Column(name = "subject_lang_zh_cn") private String subjectLangZhCN;
    @Column(name = "subject_lang_en_tw") private String subjectLangEnTW;
    @Column(name = "subject_lang_zh_tw") private String subjectLangZhTW;
    @Column(name = "subject_lang_es_es") private String subjectLangEsES;
    @Column(name = "subject_lang_es_mx") private String subjectLangEsMX;
    @Column(name = "subject_lang_ru_ru") private String subjectLangRuRU;
    @Column(name = "subject_lang_pt_pt") private String subjectLangPtPT;
    @Column(name = "subject_lang_pt_br") private String subjectLangPtBR;
    @Column(name = "subject_lang_it_it") private String subjectLangItIT;
    @Column(name = "subject_lang_unk") private String subjectLangUnk;
    @Column(name = "subject_lang_mask", nullable = false) private int subjectLangMask;

    // Body fields
    @Column(name = "body_lang_en_us") private String bodyLangEnUS;
    @Column(name = "body_lang_en_gb") private String bodyLangEnGB;
    @Column(name = "body_lang_ko_kr") private String bodyLangKoKR;
    @Column(name = "body_lang_fr_fr") private String bodyLangFrFR;
    @Column(name = "body_lang_de_de") private String bodyLangDeDE;
    @Column(name = "body_lang_en_cn") private String bodyLangEnCN;
    @Column(name = "body_lang_zh_cn") private String bodyLangZhCN;
    @Column(name = "body_lang_en_tw") private String bodyLangEnTW;
    @Column(name = "body_lang_zh_tw") private String bodyLangZhTW;
    @Column(name = "body_lang_es_es") private String bodyLangEsES;
    @Column(name = "body_lang_es_mx") private String bodyLangEsMX;
    @Column(name = "body_lang_ru_ru") private String bodyLangRuRU;
    @Column(name = "body_lang_pt_pt") private String bodyLangPtPT;
    @Column(name = "body_lang_pt_br") private String bodyLangPtBR;
    @Column(name = "body_lang_it_it") private String bodyLangItIT;
    @Column(name = "body_lang_unk") private String bodyLangUnk;
    @Column(name = "body_lang_mask", nullable = false) private int bodyLangMask;
}
