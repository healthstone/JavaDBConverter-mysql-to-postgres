package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_scalingstatvalues", schema = "dbc")
@Data
public class PgDbcScalingStatValues {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "charlevel", nullable = false)
    private Integer charLevel;

    @Column(name = "shoulderbudget", nullable = false)
    private Integer shoulderBudget;

    @Column(name = "trinketbudget", nullable = false)
    private Integer trinketBudget;

    @Column(name = "weaponbudget1h", nullable = false)
    private Integer weaponBudget1H;

    @Column(name = "rangedbudget", nullable = false)
    private Integer rangedBudget;

    @Column(name = "clothshoulderarmor", nullable = false)
    private Integer clothShoulderArmor;

    @Column(name = "leathershoulderarmor", nullable = false)
    private Integer leatherShoulderArmor;

    @Column(name = "mailshoulderarmor", nullable = false)
    private Integer mailShoulderArmor;

    @Column(name = "plateshoulderarmor", nullable = false)
    private Integer plateShoulderArmor;

    @Column(name = "weapondps1h", nullable = false)
    private Integer weaponDps1H;

    @Column(name = "weapondps2h", nullable = false)
    private Integer weaponDps2H;

    @Column(name = "spellcasterdps1h", nullable = false)
    private Integer spellcasterDps1H;

    @Column(name = "spellcasterdps2h", nullable = false)
    private Integer spellcasterDps2H;

    @Column(name = "rangeddps", nullable = false)
    private Integer rangedDps;

    @Column(name = "wanddps", nullable = false)
    private Integer wandDps;

    @Column(name = "spellpower", nullable = false)
    private Integer spellPower;

    @Column(name = "primarybudget", nullable = false)
    private Integer primaryBudget;

    @Column(name = "tertiarybudget", nullable = false)
    private Integer tertiaryBudget;

    @Column(name = "clothcloakarmor", nullable = false)
    private Integer clothCloakArmor;

    @Column(name = "clothchestarmor", nullable = false)
    private Integer clothChestArmor;

    @Column(name = "leatherchestarmor", nullable = false)
    private Integer leatherChestArmor;

    @Column(name = "mailchestarmor", nullable = false)
    private Integer mailChestArmor;

    @Column(name = "platechestarmor", nullable = false)
    private Integer plateChestArmor;
}
