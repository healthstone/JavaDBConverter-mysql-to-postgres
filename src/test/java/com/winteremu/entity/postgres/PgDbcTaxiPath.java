package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_taxipath", schema = "dbc")
@Data
public class PgDbcTaxiPath {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "fromtaxinode", nullable = false)
    private Integer fromTaxiNode;

    @Column(name = "totaxinode", nullable = false)
    private Integer toTaxiNode;

    @Column(name = "cost", nullable = false)
    private Integer cost;
}
