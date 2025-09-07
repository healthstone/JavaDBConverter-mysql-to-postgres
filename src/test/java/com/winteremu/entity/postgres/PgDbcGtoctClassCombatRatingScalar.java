package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_gtoctclasscombatratingscalar", schema = "dbc")
@Data
public class PgDbcGtoctClassCombatRatingScalar {
    @Id
    @Column(name = "id", nullable = false)
    private int id = 0;

    @Column(name = "data", nullable = false)
    private float data = 0;
}
