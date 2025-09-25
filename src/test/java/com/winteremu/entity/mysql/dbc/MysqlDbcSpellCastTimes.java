package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_spellcasttimes")
public class MysqlDbcSpellCastTimes {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Base", nullable = false)
    private Integer base;

    @Column(name = "PerLevel", nullable = false)
    private Integer perLevel;

    @Column(name = "Minimum", nullable = false)
    private Integer minimum;
}
