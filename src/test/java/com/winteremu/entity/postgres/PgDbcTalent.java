package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_talent", schema = "dbc")
@Data
public class PgDbcTalent {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "tabid", nullable = false)
    private Integer tabId;

    @Column(name = "tierid", nullable = false)
    private Integer tierId;

    @Column(name = "columnindex", nullable = false)
    private Integer columnIndex;

    @Column(name = "spellrank_1", nullable = false)
    private Integer spellRank1;

    @Column(name = "spellrank_2", nullable = false)
    private Integer spellRank2;

    @Column(name = "spellrank_3", nullable = false)
    private Integer spellRank3;

    @Column(name = "spellrank_4", nullable = false)
    private Integer spellRank4;

    @Column(name = "spellrank_5", nullable = false)
    private Integer spellRank5;

    @Column(name = "spellrank_6", nullable = false)
    private Integer spellRank6;

    @Column(name = "spellrank_7", nullable = false)
    private Integer spellRank7;

    @Column(name = "spellrank_8", nullable = false)
    private Integer spellRank8;

    @Column(name = "spellrank_9", nullable = false)
    private Integer spellRank9;

    @Column(name = "prereqtalent_1", nullable = false)
    private Integer prereqTalent1;

    @Column(name = "prereqtalent_2", nullable = false)
    private Integer prereqTalent2;

    @Column(name = "prereqtalent_3", nullable = false)
    private Integer prereqTalent3;

    @Column(name = "prerekrank_1", nullable = false)
    private Integer prereqRank1;

    @Column(name = "prerekrank_2", nullable = false)
    private Integer prereqRank2;

    @Column(name = "prerekrank_3", nullable = false)
    private Integer prereqRank3;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "requiredspellid", nullable = false)
    private Integer requiredSpellId;

    @Column(name = "categorymask_1", nullable = false)
    private Integer categoryMask1;

    @Column(name = "categorymask_2", nullable = false)
    private Integer categoryMask2;
}
