package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_taxipath")
@Data
public class MysqlDbcTaxiPath {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "FromTaxiNode", nullable = false)
    private Integer fromTaxiNode;

    @Column(name = "ToTaxiNode", nullable = false)
    private Integer toTaxiNode;

    @Column(name = "Cost", nullable = false)
    private Integer cost;
}
