package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellcategory")
@Data
public class MysqlDbcSpellCategory {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Flags", nullable = false)
    private Integer flags;
}
