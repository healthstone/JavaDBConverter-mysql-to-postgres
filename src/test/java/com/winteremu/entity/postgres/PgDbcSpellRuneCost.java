package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellrunecost", schema = "dbc")
@Data
public class PgDbcSpellRuneCost {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "blood", nullable = false)
    private Integer blood;

    @Column(name = "unholy", nullable = false)
    private Integer unholy;

    @Column(name = "frost", nullable = false)
    private Integer frost;

    @Column(name = "runicpower", nullable = false)
    private Integer runicPower;
}
