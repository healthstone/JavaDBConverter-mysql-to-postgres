package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_gtchancetospellcrit")
@Data
public class MysqlDbcGtChanceToSpellCrit {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Data", nullable = false)
    private Float data;
}
