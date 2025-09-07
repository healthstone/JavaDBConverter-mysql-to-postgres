package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_gtoctclasscombatratingscalar")
@Data
public class MysqlDbcGtoctClassCombatRatingScalar {
    @Id
    @Column(name = "ID", nullable = false)
    private int id = 0;

    @Column(name = "Data", nullable = false)
    private float data = 0;
}
