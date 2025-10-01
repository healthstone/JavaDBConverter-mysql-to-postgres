package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spelldifficulty", schema = "dbc")
@Data
public class PgDbcSpellDifficulty {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "difficulty_spell_id_1", nullable = false)
    private Integer difficultySpellId1;

    @Column(name = "difficulty_spell_id_2", nullable = false)
    private Integer difficultySpellId2;

    @Column(name = "difficulty_spell_id_3", nullable = false)
    private Integer difficultySpellId3;

    @Column(name = "difficulty_spell_id_4", nullable = false)
    private Integer difficultySpellId4;
}
