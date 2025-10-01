package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_talent")
@Data
public class MysqlDbcTalent {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "TabID", nullable = false)
    private Integer tabId;

    @Column(name = "TierID", nullable = false)
    private Integer tierId;

    @Column(name = "ColumnIndex", nullable = false)
    private Integer columnIndex;

    @Column(name = "SpellRank_1", nullable = false)
    private Integer spellRank1;

    @Column(name = "SpellRank_2", nullable = false)
    private Integer spellRank2;

    @Column(name = "SpellRank_3", nullable = false)
    private Integer spellRank3;

    @Column(name = "SpellRank_4", nullable = false)
    private Integer spellRank4;

    @Column(name = "SpellRank_5", nullable = false)
    private Integer spellRank5;

    @Column(name = "SpellRank_6", nullable = false)
    private Integer spellRank6;

    @Column(name = "SpellRank_7", nullable = false)
    private Integer spellRank7;

    @Column(name = "SpellRank_8", nullable = false)
    private Integer spellRank8;

    @Column(name = "SpellRank_9", nullable = false)
    private Integer spellRank9;

    @Column(name = "PrereqTalent_1", nullable = false)
    private Integer prereqTalent1;

    @Column(name = "PrereqTalent_2", nullable = false)
    private Integer prereqTalent2;

    @Column(name = "PrereqTalent_3", nullable = false)
    private Integer prereqTalent3;

    @Column(name = "PrereqRank_1", nullable = false)
    private Integer prereqRank1;

    @Column(name = "PrereqRank_2", nullable = false)
    private Integer prereqRank2;

    @Column(name = "PrereqRank_3", nullable = false)
    private Integer prereqRank3;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "RequiredSpellID", nullable = false)
    private Integer requiredSpellId;

    @Column(name = "CategoryMask_1", nullable = false)
    private Integer categoryMask1;

    @Column(name = "CategoryMask_2", nullable = false)
    private Integer categoryMask2;
}
