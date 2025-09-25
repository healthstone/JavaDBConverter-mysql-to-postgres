package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_scalingstatdistribution", schema = "dbc")
@Data
public class PgDbcScalingStatDistribution {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "statid_1", nullable = false)
    private Integer statId1;

    @Column(name = "statid_2", nullable = false)
    private Integer statId2;

    @Column(name = "statid_3", nullable = false)
    private Integer statId3;

    @Column(name = "statid_4", nullable = false)
    private Integer statId4;

    @Column(name = "statid_5", nullable = false)
    private Integer statId5;

    @Column(name = "statid_6", nullable = false)
    private Integer statId6;

    @Column(name = "statid_7", nullable = false)
    private Integer statId7;

    @Column(name = "statid_8", nullable = false)
    private Integer statId8;

    @Column(name = "statid_9", nullable = false)
    private Integer statId9;

    @Column(name = "statid_10", nullable = false)
    private Integer statId10;

    @Column(name = "bonus_1", nullable = false)
    private Integer bonus1;

    @Column(name = "bonus_2", nullable = false)
    private Integer bonus2;

    @Column(name = "bonus_3", nullable = false)
    private Integer bonus3;

    @Column(name = "bonus_4", nullable = false)
    private Integer bonus4;

    @Column(name = "bonus_5", nullable = false)
    private Integer bonus5;

    @Column(name = "bonus_6", nullable = false)
    private Integer bonus6;

    @Column(name = "bonus_7", nullable = false)
    private Integer bonus7;

    @Column(name = "bonus_8", nullable = false)
    private Integer bonus8;

    @Column(name = "bonus_9", nullable = false)
    private Integer bonus9;

    @Column(name = "bonus_10", nullable = false)
    private Integer bonus10;

    @Column(name = "maxlevel", nullable = false)
    private Integer maxLevel;
}
