package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellcategory", schema = "dbc")
@Data
public class PgDbcSpellCategory {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "flags", nullable = false)
    private Integer flags;
}
