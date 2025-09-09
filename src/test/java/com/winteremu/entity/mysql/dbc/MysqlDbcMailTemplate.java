package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_mailtemplate")
@Data
public class MysqlDbcMailTemplate {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    // Subject fields
    @Column(name = "Subject_Lang_enUS") private String subjectLangEnUS;
    @Column(name = "Subject_Lang_enGB") private String subjectLangEnGB;
    @Column(name = "Subject_Lang_koKR") private String subjectLangKoKR;
    @Column(name = "Subject_Lang_frFR") private String subjectLangFrFR;
    @Column(name = "Subject_Lang_deDE") private String subjectLangDeDE;
    @Column(name = "Subject_Lang_enCN") private String subjectLangEnCN;
    @Column(name = "Subject_Lang_zhCN") private String subjectLangZhCN;
    @Column(name = "Subject_Lang_enTW") private String subjectLangEnTW;
    @Column(name = "Subject_Lang_zhTW") private String subjectLangZhTW;
    @Column(name = "Subject_Lang_esES") private String subjectLangEsES;
    @Column(name = "Subject_Lang_esMX") private String subjectLangEsMX;
    @Column(name = "Subject_Lang_ruRU") private String subjectLangRuRU;
    @Column(name = "Subject_Lang_ptPT") private String subjectLangPtPT;
    @Column(name = "Subject_Lang_ptBR") private String subjectLangPtBR;
    @Column(name = "Subject_Lang_itIT") private String subjectLangItIT;
    @Column(name = "Subject_Lang_Unk") private String subjectLangUnk;
    @Column(name = "Subject_Lang_Mask", nullable = false) private int subjectLangMask;

    // Body fields
    @Column(name = "Body_Lang_enUS") private String bodyLangEnUS;
    @Column(name = "Body_Lang_enGB") private String bodyLangEnGB;
    @Column(name = "Body_Lang_koKR") private String bodyLangKoKR;
    @Column(name = "Body_Lang_frFR") private String bodyLangFrFR;
    @Column(name = "Body_Lang_deDE") private String bodyLangDeDE;
    @Column(name = "Body_Lang_enCN") private String bodyLangEnCN;
    @Column(name = "Body_Lang_zhCN") private String bodyLangZhCN;
    @Column(name = "Body_Lang_enTW") private String bodyLangEnTW;
    @Column(name = "Body_Lang_zhTW") private String bodyLangZhTW;
    @Column(name = "Body_Lang_esES") private String bodyLangEsES;
    @Column(name = "Body_Lang_esMX") private String bodyLangEsMX;
    @Column(name = "Body_Lang_ruRU") private String bodyLangRuRU;
    @Column(name = "Body_Lang_ptPT") private String bodyLangPtPT;
    @Column(name = "Body_Lang_ptBR") private String bodyLangPtBR;
    @Column(name = "Body_Lang_itIT") private String bodyLangItIT;
    @Column(name = "Body_Lang_Unk") private String bodyLangUnk;
    @Column(name = "Body_Lang_Mask", nullable = false) private int bodyLangMask;
}
