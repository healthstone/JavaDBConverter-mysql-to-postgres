package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_lock")
@Data
public class MysqlDbcLock {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Type_1", nullable = false)
    private Integer type1;

    @Column(name = "Type_2", nullable = false)
    private Integer type2;

    @Column(name = "Type_3", nullable = false)
    private Integer type3;

    @Column(name = "Type_4", nullable = false)
    private Integer type4;

    @Column(name = "Type_5", nullable = false)
    private Integer type5;

    @Column(name = "Type_6", nullable = false)
    private Integer type6;

    @Column(name = "Type_7", nullable = false)
    private Integer type7;

    @Column(name = "Type_8", nullable = false)
    private Integer type8;

    @Column(name = "Index_1", nullable = false)
    private Integer index1;

    @Column(name = "Index_2", nullable = false)
    private Integer index2;

    @Column(name = "Index_3", nullable = false)
    private Integer index3;

    @Column(name = "Index_4", nullable = false)
    private Integer index4;

    @Column(name = "Index_5", nullable = false)
    private Integer index5;

    @Column(name = "Index_6", nullable = false)
    private Integer index6;

    @Column(name = "Index_7", nullable = false)
    private Integer index7;

    @Column(name = "Index_8", nullable = false)
    private Integer index8;

    @Column(name = "Skill_1", nullable = false)
    private Integer skill1;

    @Column(name = "Skill_2", nullable = false)
    private Integer skill2;

    @Column(name = "Skill_3", nullable = false)
    private Integer skill3;

    @Column(name = "Skill_4", nullable = false)
    private Integer skill4;

    @Column(name = "Skill_5", nullable = false)
    private Integer skill5;

    @Column(name = "Skill_6", nullable = false)
    private Integer skill6;

    @Column(name = "Skill_7", nullable = false)
    private Integer skill7;

    @Column(name = "Skill_8", nullable = false)
    private Integer skill8;

    @Column(name = "Action_1", nullable = false)
    private Integer action1;

    @Column(name = "Action_2", nullable = false)
    private Integer action2;

    @Column(name = "Action_3", nullable = false)
    private Integer action3;

    @Column(name = "Action_4", nullable = false)
    private Integer action4;

    @Column(name = "Action_5", nullable = false)
    private Integer action5;

    @Column(name = "Action_6", nullable = false)
    private Integer action6;

    @Column(name = "Action_7", nullable = false)
    private Integer action7;

    @Column(name = "Action_8", nullable = false)
    private Integer action8;
}
