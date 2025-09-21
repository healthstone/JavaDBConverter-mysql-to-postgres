package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_pvpdifficulty")
@Data
public class MysqlDbcPvpDifficulty {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "MapID", nullable = false)
    private Integer mapId;

    @Column(name = "RangeIndex", nullable = false)
    private Integer rangeIndex;

    @Column(name = "MinLevel", nullable = false)
    private Integer minLevel;

    @Column(name = "MaxLevel", nullable = false)
    private Integer maxLevel;

    @Column(name = "Difficulty", nullable = false)
    private Integer difficulty;
}
