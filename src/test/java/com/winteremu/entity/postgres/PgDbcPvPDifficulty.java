package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_pvpdifficulty", schema = "dbc")
@Data
public class PgDbcPvPDifficulty {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "map_id", nullable = false)
    private Integer mapId;

    @Column(name = "range_index", nullable = false)
    private Integer rangeIndex;

    @Column(name = "min_level", nullable = false)
    private Integer minLevel;

    @Column(name = "max_level", nullable = false)
    private Integer maxLevel;

    @Column(name = "difficulty", nullable = false)
    private Integer difficulty;
}
