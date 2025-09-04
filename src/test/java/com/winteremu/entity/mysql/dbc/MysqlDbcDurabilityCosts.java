package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_durabilitycosts")
@Data
public class MysqlDbcDurabilityCosts {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    // WeaponSubClassCost 1-21
    @Column(name = "WeaponSubClassCost_1", nullable = false)
    private int weaponSubClassCost1;
    @Column(name = "WeaponSubClassCost_2", nullable = false)
    private int weaponSubClassCost2;
    @Column(name = "WeaponSubClassCost_3", nullable = false)
    private int weaponSubClassCost3;
    @Column(name = "WeaponSubClassCost_4", nullable = false)
    private int weaponSubClassCost4;
    @Column(name = "WeaponSubClassCost_5", nullable = false)
    private int weaponSubClassCost5;
    @Column(name = "WeaponSubClassCost_6", nullable = false)
    private int weaponSubClassCost6;
    @Column(name = "WeaponSubClassCost_7", nullable = false)
    private int weaponSubClassCost7;
    @Column(name = "WeaponSubClassCost_8", nullable = false)
    private int weaponSubClassCost8;
    @Column(name = "WeaponSubClassCost_9", nullable = false)
    private int weaponSubClassCost9;
    @Column(name = "WeaponSubClassCost_10", nullable = false)
    private int weaponSubClassCost10;
    @Column(name = "WeaponSubClassCost_11", nullable = false)
    private int weaponSubClassCost11;
    @Column(name = "WeaponSubClassCost_12", nullable = false)
    private int weaponSubClassCost12;
    @Column(name = "WeaponSubClassCost_13", nullable = false)
    private int weaponSubClassCost13;
    @Column(name = "WeaponSubClassCost_14", nullable = false)
    private int weaponSubClassCost14;
    @Column(name = "WeaponSubClassCost_15", nullable = false)
    private int weaponSubClassCost15;
    @Column(name = "WeaponSubClassCost_16", nullable = false)
    private int weaponSubClassCost16;
    @Column(name = "WeaponSubClassCost_17", nullable = false)
    private int weaponSubClassCost17;
    @Column(name = "WeaponSubClassCost_18", nullable = false)
    private int weaponSubClassCost18;
    @Column(name = "WeaponSubClassCost_19", nullable = false)
    private int weaponSubClassCost19;
    @Column(name = "WeaponSubClassCost_20", nullable = false)
    private int weaponSubClassCost20;
    @Column(name = "WeaponSubClassCost_21", nullable = false)
    private int weaponSubClassCost21;

    // ArmorSubClassCost 1-8
    @Column(name = "ArmorSubClassCost_1", nullable = false)
    private int armorSubClassCost1;
    @Column(name = "ArmorSubClassCost_2", nullable = false)
    private int armorSubClassCost2;
    @Column(name = "ArmorSubClassCost_3", nullable = false)
    private int armorSubClassCost3;
    @Column(name = "ArmorSubClassCost_4", nullable = false)
    private int armorSubClassCost4;
    @Column(name = "ArmorSubClassCost_5", nullable = false)
    private int armorSubClassCost5;
    @Column(name = "ArmorSubClassCost_6", nullable = false)
    private int armorSubClassCost6;
    @Column(name = "ArmorSubClassCost_7", nullable = false)
    private int armorSubClassCost7;
    @Column(name = "ArmorSubClassCost_8", nullable = false)
    private int armorSubClassCost8;
}
