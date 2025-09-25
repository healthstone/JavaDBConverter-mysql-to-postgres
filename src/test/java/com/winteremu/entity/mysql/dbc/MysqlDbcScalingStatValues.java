package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_scalingstatvalues")
@Data
public class MysqlDbcScalingStatValues {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Charlevel", nullable = false)
    private Integer charLevel;

    @Column(name = "ShoulderBudget", nullable = false)
    private Integer shoulderBudget;

    @Column(name = "TrinketBudget", nullable = false)
    private Integer trinketBudget;

    @Column(name = "WeaponBudget1H", nullable = false)
    private Integer weaponBudget1H;

    @Column(name = "RangedBudget", nullable = false)
    private Integer rangedBudget;

    @Column(name = "ClothShoulderArmor", nullable = false)
    private Integer clothShoulderArmor;

    @Column(name = "LeatherShoulderArmor", nullable = false)
    private Integer leatherShoulderArmor;

    @Column(name = "MailShoulderArmor", nullable = false)
    private Integer mailShoulderArmor;

    @Column(name = "PlateShoulderArmor", nullable = false)
    private Integer plateShoulderArmor;

    @Column(name = "WeaponDPS1H", nullable = false)
    private Integer weaponDps1H;

    @Column(name = "WeaponDPS2H", nullable = false)
    private Integer weaponDps2H;

    @Column(name = "SpellcasterDPS1H", nullable = false)
    private Integer spellcasterDps1H;

    @Column(name = "SpellcasterDPS2H", nullable = false)
    private Integer spellcasterDps2H;

    @Column(name = "RangedDPS", nullable = false)
    private Integer rangedDps;

    @Column(name = "WandDPS", nullable = false)
    private Integer wandDps;

    @Column(name = "SpellPower", nullable = false)
    private Integer spellPower;

    @Column(name = "PrimaryBudget", nullable = false)
    private Integer primaryBudget;

    @Column(name = "TertiaryBudget", nullable = false)
    private Integer tertiaryBudget;

    @Column(name = "ClothCloakArmor", nullable = false)
    private Integer clothCloakArmor;

    @Column(name = "ClothChestArmor", nullable = false)
    private Integer clothChestArmor;

    @Column(name = "LeatherChestArmor", nullable = false)
    private Integer leatherChestArmor;

    @Column(name = "MailChestArmor", nullable = false)
    private Integer mailChestArmor;

    @Column(name = "PlateChestArmor", nullable = false)
    private Integer plateChestArmor;
}
