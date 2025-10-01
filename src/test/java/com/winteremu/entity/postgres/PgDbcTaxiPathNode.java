package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_taxipathnode", schema = "dbc")
@Data
public class PgDbcTaxiPathNode {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "pathid", nullable = false)
    private Integer pathId;

    @Column(name = "nodeindex", nullable = false)
    private Integer nodeIndex;

    @Column(name = "continentid", nullable = false)
    private Integer continentId;

    @Column(name = "locx", nullable = false)
    private Float locX;

    @Column(name = "locy", nullable = false)
    private Float locY;

    @Column(name = "locz", nullable = false)
    private Float locZ;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "delay", nullable = false)
    private Integer delay;

    @Column(name = "arrivaleventid", nullable = false)
    private Integer arrivalEventId;

    @Column(name = "departureeventid", nullable = false)
    private Integer departureEventId;
}
