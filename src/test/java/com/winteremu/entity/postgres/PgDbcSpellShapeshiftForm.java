package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellshapeshiftform", schema = "dbc")
@Data
public class PgDbcSpellShapeshiftForm {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "bonusactionbar", nullable = false)
    private Integer bonusActionBar;

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

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "creaturetype", nullable = false)
    private Integer creatureType;

    @Column(name = "attackiconid", nullable = false)
    private Integer attackIconId;

    @Column(name = "combatroundtime", nullable = false)
    private Integer combatRoundTime;

    @Column(name = "creaturedisplayid_1", nullable = false)
    private Integer creatureDisplayId1;

    @Column(name = "creaturedisplayid_2", nullable = false)
    private Integer creatureDisplayId2;

    @Column(name = "creaturedisplayid_3", nullable = false)
    private Integer creatureDisplayId3;

    @Column(name = "creaturedisplayid_4", nullable = false)
    private Integer creatureDisplayId4;

    @Column(name = "presetspellid_1", nullable = false)
    private Integer presetSpellId1;

    @Column(name = "presetspellid_2", nullable = false)
    private Integer presetSpellId2;

    @Column(name = "presetspellid_3", nullable = false)
    private Integer presetSpellId3;

    @Column(name = "presetspellid_4", nullable = false)
    private Integer presetSpellId4;

    @Column(name = "presetspellid_5", nullable = false)
    private Integer presetSpellId5;

    @Column(name = "presetspellid_6", nullable = false)
    private Integer presetSpellId6;

    @Column(name = "presetspellid_7", nullable = false)
    private Integer presetSpellId7;

    @Column(name = "presetspellid_8", nullable = false)
    private Integer presetSpellId8;
}
