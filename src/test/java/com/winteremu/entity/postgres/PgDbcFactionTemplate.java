package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_factiontemplate", schema = "dbc")
@Data
public class PgDbcFactionTemplate {
    @Id
    @Column(name = "id", nullable = false)
    private int id = 0;

    @Column(name = "faction", nullable = false)
    private int faction = 0;

    @Column(name = "flags", nullable = false)
    private int flags = 0;

    @Column(name = "factiongroup", nullable = false)
    private int factionGroup = 0;

    @Column(name = "friendgroup", nullable = false)
    private int friendGroup = 0;

    @Column(name = "enemygroup", nullable = false)
    private int enemyGroup = 0;

    @Column(name = "enemies_1", nullable = false)
    private int enemies1 = 0;

    @Column(name = "enemies_2", nullable = false)
    private int enemies2 = 0;

    @Column(name = "enemies_3", nullable = false)
    private int enemies3 = 0;

    @Column(name = "enemies_4", nullable = false)
    private int enemies4 = 0;

    @Column(name = "friend_1", nullable = false)
    private int friend1 = 0;

    @Column(name = "friend_2", nullable = false)
    private int friend2 = 0;

    @Column(name = "friend_3", nullable = false)
    private int friend3 = 0;

    @Column(name = "friend_4", nullable = false)
    private int friend4 = 0;
}
