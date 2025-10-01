package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_summonproperties", schema = "dbc")
@Data
public class PgDbcSummonProperties {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "control", nullable = false)
    private Integer control;

    @Column(name = "faction", nullable = false)
    private Integer faction;

    @Column(name = "title", nullable = false)
    private Integer title;

    @Column(name = "slot", nullable = false)
    private Integer slot;

    @Column(name = "flags", nullable = false)
    private Integer flags;
}
