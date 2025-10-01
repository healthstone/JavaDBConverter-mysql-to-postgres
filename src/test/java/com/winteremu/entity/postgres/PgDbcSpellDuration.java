package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellduration", schema = "dbc")
@Data
public class PgDbcSpellDuration {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "duration", nullable = false)
    private Integer duration;

    @Column(name = "duration_per_level", nullable = false)
    private Integer durationPerLevel;

    @Column(name = "max_duration", nullable = false)
    private Integer maxDuration;
}
