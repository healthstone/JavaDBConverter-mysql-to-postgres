package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_scalingstatdistribution")
@Data
public class MysqlDbcScalingStatDistribution {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "StatID_1", nullable = false)
    private Integer statId1;

    @Column(name = "StatID_2", nullable = false)
    private Integer statId2;

    @Column(name = "StatID_3", nullable = false)
    private Integer statId3;

    @Column(name = "StatID_4", nullable = false)
    private Integer statId4;

    @Column(name = "StatID_5", nullable = false)
    private Integer statId5;

    @Column(name = "StatID_6", nullable = false)
    private Integer statId6;

    @Column(name = "StatID_7", nullable = false)
    private Integer statId7;

    @Column(name = "StatID_8", nullable = false)
    private Integer statId8;

    @Column(name = "StatID_9", nullable = false)
    private Integer statId9;

    @Column(name = "StatID_10", nullable = false)
    private Integer statId10;

    @Column(name = "Bonus_1", nullable = false)
    private Integer bonus1;

    @Column(name = "Bonus_2", nullable = false)
    private Integer bonus2;

    @Column(name = "Bonus_3", nullable = false)
    private Integer bonus3;

    @Column(name = "Bonus_4", nullable = false)
    private Integer bonus4;

    @Column(name = "Bonus_5", nullable = false)
    private Integer bonus5;

    @Column(name = "Bonus_6", nullable = false)
    private Integer bonus6;

    @Column(name = "Bonus_7", nullable = false)
    private Integer bonus7;

    @Column(name = "Bonus_8", nullable = false)
    private Integer bonus8;

    @Column(name = "Bonus_9", nullable = false)
    private Integer bonus9;

    @Column(name = "Bonus_10", nullable = false)
    private Integer bonus10;

    @Column(name = "Maxlevel", nullable = false)
    private Integer maxLevel;
}
