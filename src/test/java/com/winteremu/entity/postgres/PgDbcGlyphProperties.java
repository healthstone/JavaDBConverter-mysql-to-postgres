package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_glyphproperties", schema = "dbc")
@Data
public class PgDbcGlyphProperties {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "spellid", nullable = false)
    private int spellId;

    @Column(name = "glyphslotflags", nullable = false)
    private int glyphSlotFlags;

    @Column(name = "spelliconid", nullable = false)
    private int spellIconId;
}
