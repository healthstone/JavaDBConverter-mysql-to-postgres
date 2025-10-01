package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_summonproperties")
@Data
public class MysqlDbcSummonProperties {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Control", nullable = false)
    private Integer control;

    @Column(name = "Faction", nullable = false)
    private Integer faction;

    @Column(name = "Title", nullable = false)
    private Integer title;

    @Column(name = "Slot", nullable = false)
    private Integer slot;

    @Column(name = "Flags", nullable = false)
    private Integer flags;
}
