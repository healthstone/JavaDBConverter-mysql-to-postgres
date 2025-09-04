package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_creaturespelldata")
@Data
public class MysqlDbcCreatureSpellData {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Spells_1", nullable = false)
    private Integer spells1;

    @Column(name = "Spells_2", nullable = false)
    private Integer spells2;

    @Column(name = "Spells_3", nullable = false)
    private Integer spells3;

    @Column(name = "Spells_4", nullable = false)
    private Integer spells4;

    @Column(name = "Availability_1", nullable = false)
    private Integer availability1;

    @Column(name = "Availability_2", nullable = false)
    private Integer availability2;

    @Column(name = "Availability_3", nullable = false)
    private Integer availability3;

    @Column(name = "Availability_4", nullable = false)
    private Integer availability4;
}
