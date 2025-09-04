package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_durabilitycosts", schema = "dbc")
@Data
public class PgDbcDurabilityCosts {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    // WeaponSubClassCost 1-21
    @Column(name = "weaponsubclasscost_1", nullable = false)
    private int weaponSubClassCost1;
    @Column(name = "weaponsubclasscost_2", nullable = false)
    private int weaponSubClassCost2;
    @Column(name = "weaponsubclasscost_3", nullable = false)
    private int weaponSubClassCost3;
    @Column(name = "weaponsubclasscost_4", nullable = false)
    private int weaponSubClassCost4;
    @Column(name = "weaponsubclasscost_5", nullable = false)
    private int weaponSubClassCost5;
    @Column(name = "weaponsubclasscost_6", nullable = false)
    private int weaponSubClassCost6;
    @Column(name = "weaponsubclasscost_7", nullable = false)
    private int weaponSubClassCost7;
    @Column(name = "weaponsubclasscost_8", nullable = false)
    private int weaponSubClassCost8;
    @Column(name = "weaponsubclasscost_9", nullable = false)
    private int weaponSubClassCost9;
    @Column(name = "weaponsubclasscost_10", nullable = false)
    private int weaponSubClassCost10;
    @Column(name = "weaponsubclasscost_11", nullable = false)
    private int weaponSubClassCost11;
    @Column(name = "weaponsubclasscost_12", nullable = false)
    private int weaponSubClassCost12;
    @Column(name = "weaponsubclasscost_13", nullable = false)
    private int weaponSubClassCost13;
    @Column(name = "weaponsubclasscost_14", nullable = false)
    private int weaponSubClassCost14;
    @Column(name = "weaponsubclasscost_15", nullable = false)
    private int weaponSubClassCost15;
    @Column(name = "weaponsubclasscost_16", nullable = false)
    private int weaponSubClassCost16;
    @Column(name = "weaponsubclasscost_17", nullable = false)
    private int weaponSubClassCost17;
    @Column(name = "weaponsubclasscost_18", nullable = false)
    private int weaponSubClassCost18;
    @Column(name = "weaponsubclasscost_19", nullable = false)
    private int weaponSubClassCost19;
    @Column(name = "weaponsubclasscost_20", nullable = false)
    private int weaponSubClassCost20;
    @Column(name = "weaponsubclasscost_21", nullable = false)
    private int weaponSubClassCost21;

    // ArmorSubClassCost 1-8
    @Column(name = "armorsubclasscost_1", nullable = false)
    private int armorSubClassCost1;
    @Column(name = "armorsubclasscost_2", nullable = false)
    private int armorSubClassCost2;
    @Column(name = "armorsubclasscost_3", nullable = false)
    private int armorSubClassCost3;
    @Column(name = "armorsubclasscost_4", nullable = false)
    private int armorSubClassCost4;
    @Column(name = "armorsubclasscost_5", nullable = false)
    private int armorSubClassCost5;
    @Column(name = "armorsubclasscost_6", nullable = false)
    private int armorSubClassCost6;
    @Column(name = "armorsubclasscost_7", nullable = false)
    private int armorSubClassCost7;
    @Column(name = "armorsubclasscost_8", nullable = false)
    private int armorSubClassCost8;
}
