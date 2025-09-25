package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_skilllineability", schema = "dbc")
@Data
public class PgDbcSkillLineAbility {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "skillline", nullable = false)
    private Integer skillLine;

    @Column(name = "spell", nullable = false)
    private Integer spell;

    @Column(name = "racemask", nullable = false)
    private Integer raceMask;

    @Column(name = "classmask", nullable = false)
    private Integer classMask;

    @Column(name = "excluderace", nullable = false)
    private Integer excludeRace;

    @Column(name = "excludeclass", nullable = false)
    private Integer excludeClass;

    @Column(name = "minskilllinerank", nullable = false)
    private Integer minSkillLineRank;

    @Column(name = "supercededbyspell", nullable = false)
    private Integer supercededBySpell;

    @Column(name = "acquiremethod", nullable = false)
    private Integer acquireMethod;

    @Column(name = "trivialskilllinerankhigh", nullable = false)
    private Integer trivialSkillLineRankHigh;

    @Column(name = "trivialskilllineranklow", nullable = false)
    private Integer trivialSkillLineRankLow;

    @Column(name = "tradeskillcategoryid", nullable = false)
    private Integer tradeSkillCategoryId;
}
