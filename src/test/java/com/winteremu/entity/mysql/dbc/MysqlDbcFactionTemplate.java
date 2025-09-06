package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_factiontemplate")
@Data
public class MysqlDbcFactionTemplate {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "Faction", nullable = false)
    private int faction;

    @Column(name = "Flags", nullable = false)
    private int flags;

    @Column(name = "FactionGroup", nullable = false)
    private int factionGroup;

    @Column(name = "FriendGroup", nullable = false)
    private int friendGroup;

    @Column(name = "EnemyGroup", nullable = false)
    private int enemyGroup;

    @Column(name = "Enemies_1", nullable = false)
    private int enemies1;

    @Column(name = "Enemies_2", nullable = false)
    private int enemies2;

    @Column(name = "Enemies_3", nullable = false)
    private int enemies3;

    @Column(name = "Enemies_4", nullable = false)
    private int enemies4;

    @Column(name = "Friend_1", nullable = false)
    private int friend1;

    @Column(name = "Friend_2", nullable = false)
    private int friend2;

    @Column(name = "Friend_3", nullable = false)
    private int friend3;

    @Column(name = "Friend_4", nullable = false)
    private int friend4;
}
