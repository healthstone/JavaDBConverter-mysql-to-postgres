package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_taxipathnode")
@Data
public class MysqlDbcTaxiPathNode {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "PathID", nullable = false)
    private Integer pathId;

    @Column(name = "NodeIndex", nullable = false)
    private Integer nodeIndex;

    @Column(name = "ContinentID", nullable = false)
    private Integer continentId;

    @Column(name = "LocX", nullable = false)
    private Float locX;

    @Column(name = "LocY", nullable = false)
    private Float locY;

    @Column(name = "LocZ", nullable = false)
    private Float locZ;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "Delay", nullable = false)
    private Integer delay;

    @Column(name = "ArrivalEventID", nullable = false)
    private Integer arrivalEventId;

    @Column(name = "DepartureEventID", nullable = false)
    private Integer departureEventId;
}
