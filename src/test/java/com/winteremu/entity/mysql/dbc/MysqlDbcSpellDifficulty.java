package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spelldifficulty")
@Data
public class MysqlDbcSpellDifficulty {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "DifficultySpellID_1", nullable = false)
    private Integer difficultySpellId1;

    @Column(name = "DifficultySpellID_2", nullable = false)
    private Integer difficultySpellId2;

    @Column(name = "DifficultySpellID_3", nullable = false)
    private Integer difficultySpellId3;

    @Column(name = "DifficultySpellID_4", nullable = false)
    private Integer difficultySpellId4;
}
