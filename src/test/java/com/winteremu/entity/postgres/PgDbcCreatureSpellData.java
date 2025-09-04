package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_creaturespelldata", schema = "dbc")
@Data
public class PgDbcCreatureSpellData {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "spells_1", nullable = false)
    private Integer spells1;

    @Column(name = "spells_2", nullable = false)
    private Integer spells2;

    @Column(name = "spells_3", nullable = false)
    private Integer spells3;

    @Column(name = "spells_4", nullable = false)
    private Integer spells4;

    @Column(name = "availability_1", nullable = false)
    private Integer availability1;

    @Column(name = "availability_2", nullable = false)
    private Integer availability2;

    @Column(name = "availability_3", nullable = false)
    private Integer availability3;

    @Column(name = "availability_4", nullable = false)
    private Integer availability4;
}
