package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_questxp", schema = "dbc")
@Data
public class PgDbcQuestXp {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "difficulty_1", nullable = false)
    private int difficulty1;

    @Column(name = "difficulty_2", nullable = false)
    private int difficulty2;

    @Column(name = "difficulty_3", nullable = false)
    private int difficulty3;

    @Column(name = "difficulty_4", nullable = false)
    private int difficulty4;

    @Column(name = "difficulty_5", nullable = false)
    private int difficulty5;

    @Column(name = "difficulty_6", nullable = false)
    private int difficulty6;

    @Column(name = "difficulty_7", nullable = false)
    private int difficulty7;

    @Column(name = "difficulty_8", nullable = false)
    private int difficulty8;

    @Column(name = "difficulty_9", nullable = false)
    private int difficulty9;

    @Column(name = "difficulty_10", nullable = false)
    private int difficulty10;
}
