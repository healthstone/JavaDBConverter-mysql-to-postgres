package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_lock", schema = "dbc")
@Data
public class PgDbcLock {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "type_1", nullable = false)
    private Integer type1;

    @Column(name = "type_2", nullable = false)
    private Integer type2;

    @Column(name = "type_3", nullable = false)
    private Integer type3;

    @Column(name = "type_4", nullable = false)
    private Integer type4;

    @Column(name = "type_5", nullable = false)
    private Integer type5;

    @Column(name = "type_6", nullable = false)
    private Integer type6;

    @Column(name = "type_7", nullable = false)
    private Integer type7;

    @Column(name = "type_8", nullable = false)
    private Integer type8;

    @Column(name = "index_1", nullable = false)
    private Integer index1;

    @Column(name = "index_2", nullable = false)
    private Integer index2;

    @Column(name = "index_3", nullable = false)
    private Integer index3;

    @Column(name = "index_4", nullable = false)
    private Integer index4;

    @Column(name = "index_5", nullable = false)
    private Integer index5;

    @Column(name = "index_6", nullable = false)
    private Integer index6;

    @Column(name = "index_7", nullable = false)
    private Integer index7;

    @Column(name = "index_8", nullable = false)
    private Integer index8;

    @Column(name = "skill_1", nullable = false)
    private Integer skill1;

    @Column(name = "skill_2", nullable = false)
    private Integer skill2;

    @Column(name = "skill_3", nullable = false)
    private Integer skill3;

    @Column(name = "skill_4", nullable = false)
    private Integer skill4;

    @Column(name = "skill_5", nullable = false)
    private Integer skill5;

    @Column(name = "skill_6", nullable = false)
    private Integer skill6;

    @Column(name = "skill_7", nullable = false)
    private Integer skill7;

    @Column(name = "skill_8", nullable = false)
    private Integer skill8;

    @Column(name = "action_1", nullable = false)
    private Integer action1;

    @Column(name = "action_2", nullable = false)
    private Integer action2;

    @Column(name = "action_3", nullable = false)
    private Integer action3;

    @Column(name = "action_4", nullable = false)
    private Integer action4;

    @Column(name = "action_5", nullable = false)
    private Integer action5;

    @Column(name = "action_6", nullable = false)
    private Integer action6;

    @Column(name = "action_7", nullable = false)
    private Integer action7;

    @Column(name = "action_8", nullable = false)
    private Integer action8;
}
