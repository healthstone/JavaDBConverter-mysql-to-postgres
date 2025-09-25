package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_skilllineability")
@Data
public class MysqlDbcSkillLineAbility {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "SkillLine", nullable = false)
    private Integer skillLine;

    @Column(name = "Spell", nullable = false)
    private Integer spell;

    @Column(name = "RaceMask", nullable = false)
    private Integer raceMask;

    @Column(name = "ClassMask", nullable = false)
    private Integer classMask;

    @Column(name = "ExcludeRace", nullable = false)
    private Integer excludeRace;

    @Column(name = "ExcludeClass", nullable = false)
    private Integer excludeClass;

    @Column(name = "MinSkillLineRank", nullable = false)
    private Integer minSkillLineRank;

    @Column(name = "SupercededBySpell", nullable = false)
    private Integer supercededBySpell;

    @Column(name = "AcquireMethod", nullable = false)
    private Integer acquireMethod;

    @Column(name = "TrivialSkillLineRankHigh", nullable = false)
    private Integer trivialSkillLineRankHigh;

    @Column(name = "TrivialSkillLineRankLow", nullable = false)
    private Integer trivialSkillLineRankLow;

    @Column(name = "TradeSkillCategoryID", nullable = false)
    private Integer tradeSkillCategoryId;
}
