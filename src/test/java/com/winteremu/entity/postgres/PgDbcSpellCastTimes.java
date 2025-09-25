package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_spellcasttimes", schema = "dbc")
public class PgDbcSpellCastTimes {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "base", nullable = false)
    private Integer base;

    @Column(name = "perlevel", nullable = false)
    private Integer perLevel;

    @Column(name = "minimum", nullable = false)
    private Integer minimum;
}
