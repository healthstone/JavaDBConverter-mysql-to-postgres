package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_skillraceclassinfo")
@Data
public class MysqlDbcSkillRaceClassInfo {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "SkillID", nullable = false)
    private Integer skillId = 0;

    @Column(name = "RaceMask", nullable = false)
    private Integer raceMask = 0;

    @Column(name = "ClassMask", nullable = false)
    private Integer classMask = 0;

    @Column(name = "Flags", nullable = false)
    private Integer flags = 0;

    @Column(name = "MinLevel", nullable = false)
    private Integer minLevel = 0;

    @Column(name = "SkillTierID", nullable = false)
    private Integer skillTierId = 0;

    @Column(name = "SkillCostIndex", nullable = false)
    private Integer skillCostIndex = 0;
}
