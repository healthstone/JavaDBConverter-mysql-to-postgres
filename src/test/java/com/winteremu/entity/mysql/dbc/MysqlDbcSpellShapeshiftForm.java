package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellshapeshiftform")
@Data
public class MysqlDbcSpellShapeshiftForm {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "BonusActionBar", nullable = false)
    private Integer bonusActionBar;

    @Column(name = "Name_Lang_enUS")
    private String nameLangEnUs;

    @Column(name = "Name_Lang_enGB")
    private String nameLangEnGb;

    @Column(name = "Name_Lang_koKR")
    private String nameLangKoKr;

    @Column(name = "Name_Lang_frFR")
    private String nameLangFrFr;

    @Column(name = "Name_Lang_deDE")
    private String nameLangDeDe;

    @Column(name = "Name_Lang_enCN")
    private String nameLangEnCn;

    @Column(name = "Name_Lang_zhCN")
    private String nameLangZhCn;

    @Column(name = "Name_Lang_enTW")
    private String nameLangEnTw;

    @Column(name = "Name_Lang_zhTW")
    private String nameLangZhTw;

    @Column(name = "Name_Lang_esES")
    private String nameLangEsEs;

    @Column(name = "Name_Lang_esMX")
    private String nameLangEsMx;

    @Column(name = "Name_Lang_ruRU")
    private String nameLangRuRu;

    @Column(name = "Name_Lang_ptPT")
    private String nameLangPtPt;

    @Column(name = "Name_Lang_ptBR")
    private String nameLangPtBr;

    @Column(name = "Name_Lang_itIT")
    private String nameLangItIt;

    @Column(name = "Name_Lang_Unk")
    private String nameLangUnk;

    @Column(name = "Name_Lang_Mask", nullable = false)
    private Long nameLangMask;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "CreatureType", nullable = false)
    private Integer creatureType;

    @Column(name = "AttackIconID", nullable = false)
    private Integer attackIconId;

    @Column(name = "CombatRoundTime", nullable = false)
    private Integer combatRoundTime;

    @Column(name = "CreatureDisplayID_1", nullable = false)
    private Integer creatureDisplayId1;

    @Column(name = "CreatureDisplayID_2", nullable = false)
    private Integer creatureDisplayId2;

    @Column(name = "CreatureDisplayID_3", nullable = false)
    private Integer creatureDisplayId3;

    @Column(name = "CreatureDisplayID_4", nullable = false)
    private Integer creatureDisplayId4;

    @Column(name = "PresetSpellID_1", nullable = false)
    private Integer presetSpellId1;

    @Column(name = "PresetSpellID_2", nullable = false)
    private Integer presetSpellId2;

    @Column(name = "PresetSpellID_3", nullable = false)
    private Integer presetSpellId3;

    @Column(name = "PresetSpellID_4", nullable = false)
    private Integer presetSpellId4;

    @Column(name = "PresetSpellID_5", nullable = false)
    private Integer presetSpellId5;

    @Column(name = "PresetSpellID_6", nullable = false)
    private Integer presetSpellId6;

    @Column(name = "PresetSpellID_7", nullable = false)
    private Integer presetSpellId7;

    @Column(name = "PresetSpellID_8", nullable = false)
    private Integer presetSpellId8;
}
