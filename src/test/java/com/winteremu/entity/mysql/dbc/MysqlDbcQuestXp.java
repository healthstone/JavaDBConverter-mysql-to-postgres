package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_questxp")
@Data
public class MysqlDbcQuestXp {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "Difficulty_1", nullable = false)
    private int difficulty1;

    @Column(name = "Difficulty_2", nullable = false)
    private int difficulty2;

    @Column(name = "Difficulty_3", nullable = false)
    private int difficulty3;

    @Column(name = "Difficulty_4", nullable = false)
    private int difficulty4;

    @Column(name = "Difficulty_5", nullable = false)
    private int difficulty5;

    @Column(name = "Difficulty_6", nullable = false)
    private int difficulty6;

    @Column(name = "Difficulty_7", nullable = false)
    private int difficulty7;

    @Column(name = "Difficulty_8", nullable = false)
    private int difficulty8;

    @Column(name = "Difficulty_9", nullable = false)
    private int difficulty9;

    @Column(name = "Difficulty_10", nullable = false)
    private int difficulty10;
}
