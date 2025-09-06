package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_glyphproperties")
@Data
public class MysqlDbcGlyphProperties {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "SpellID", nullable = false)
    private int spellId;

    @Column(name = "GlyphSlotFlags", nullable = false)
    private int glyphSlotFlags;

    @Column(name = "SpellIconID", nullable = false)
    private int spellIconId;
}
