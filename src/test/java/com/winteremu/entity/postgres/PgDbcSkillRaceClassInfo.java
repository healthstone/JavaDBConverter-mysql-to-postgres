package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_skillraceclassinfo", schema = "dbc")
@Data
public class PgDbcSkillRaceClassInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "skillid", nullable = false)
    private Integer skillId = 0;

    @Column(name = "racemask", nullable = false)
    private Integer raceMask = 0;

    @Column(name = "classmask", nullable = false)
    private Integer classMask = 0;

    @Column(name = "flags", nullable = false)
    private Integer flags = 0;

    @Column(name = "minlevel", nullable = false)
    private Integer minLevel = 0;

    @Column(name = "skilltierid", nullable = false)
    private Integer skillTierId = 0;

    @Column(name = "skillcostindex", nullable = false)
    private Integer skillCostIndex = 0;
}
