package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_light")
@Data
public class MysqlDbcLight {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "ContinentID", nullable = false)
    private int continentId;

    @Column(name = "X", nullable = false)
    private float x;

    @Column(name = "Y", nullable = false)
    private float y;

    @Column(name = "Z", nullable = false)
    private float z;

    @Column(name = "FalloffStart", nullable = false)
    private float falloffStart;

    @Column(name = "FalloffEnd", nullable = false)
    private float falloffEnd;

    @Column(name = "LightParamsID_1", nullable = false)
    private int lightParamsId1;

    @Column(name = "LightParamsID_2", nullable = false)
    private int lightParamsId2;

    @Column(name = "LightParamsID_3", nullable = false)
    private int lightParamsId3;

    @Column(name = "LightParamsID_4", nullable = false)
    private int lightParamsId4;

    @Column(name = "LightParamsID_5", nullable = false)
    private int lightParamsId5;

    @Column(name = "LightParamsID_6", nullable = false)
    private int lightParamsId6;

    @Column(name = "LightParamsID_7", nullable = false)
    private int lightParamsId7;

    @Column(name = "LightParamsID_8", nullable = false)
    private int lightParamsId8;
}
