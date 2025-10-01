package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellrunecost")
@Data
public class MysqlDbcSpellRuneCost {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Blood", nullable = false)
    private Integer blood;

    @Column(name = "Unholy", nullable = false)
    private Integer unholy;

    @Column(name = "Frost", nullable = false)
    private Integer frost;

    @Column(name = "RunicPower", nullable = false)
    private Integer runicPower;
}
