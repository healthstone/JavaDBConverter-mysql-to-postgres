package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_light", schema = "dbc")
@Data
public class PgDbcLight {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "continent_id", nullable = false)
    private int continentId;

    @Column(name = "x", nullable = false)
    private float x;

    @Column(name = "y", nullable = false)
    private float y;

    @Column(name = "z", nullable = false)
    private float z;

    @Column(name = "falloff_start", nullable = false)
    private float falloffStart;

    @Column(name = "falloff_end", nullable = false)
    private float falloffEnd;

    @Column(name = "lightparamsid_1", nullable = false)
    private int lightParamsId1;

    @Column(name = "lightparamsid_2", nullable = false)
    private int lightParamsId2;

    @Column(name = "lightparamsid_3", nullable = false)
    private int lightParamsId3;

    @Column(name = "lightparamsid_4", nullable = false)
    private int lightParamsId4;

    @Column(name = "lightparamsid_5", nullable = false)
    private int lightParamsId5;

    @Column(name = "lightparamsid_6", nullable = false)
    private int lightParamsId6;

    @Column(name = "lightparamsid_7", nullable = false)
    private int lightParamsId7;

    @Column(name = "lightparamsid_8", nullable = false)
    private int lightParamsId8;
}
