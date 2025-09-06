package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_gameobjectdisplayinfo")
@Data
public class MysqlDbcGameObjectDisplayInfo {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "ModelName", columnDefinition = "TEXT")
    private String modelName;

    @Column(name = "Sound_1", nullable = false)
    private int sound1;

    @Column(name = "Sound_2", nullable = false)
    private int sound2;

    @Column(name = "Sound_3", nullable = false)
    private int sound3;

    @Column(name = "Sound_4", nullable = false)
    private int sound4;

    @Column(name = "Sound_5", nullable = false)
    private int sound5;

    @Column(name = "Sound_6", nullable = false)
    private int sound6;

    @Column(name = "Sound_7", nullable = false)
    private int sound7;

    @Column(name = "Sound_8", nullable = false)
    private int sound8;

    @Column(name = "Sound_9", nullable = false)
    private int sound9;

    @Column(name = "Sound_10", nullable = false)
    private int sound10;

    @Column(name = "GeoBoxMinX", nullable = false)
    private float geoBoxMinX;

    @Column(name = "GeoBoxMinY", nullable = false)
    private float geoBoxMinY;

    @Column(name = "GeoBoxMinZ", nullable = false)
    private float geoBoxMinZ;

    @Column(name = "GeoBoxMaxX", nullable = false)
    private float geoBoxMaxX;

    @Column(name = "GeoBoxMaxY", nullable = false)
    private float geoBoxMaxY;

    @Column(name = "GeoBoxMaxZ", nullable = false)
    private float geoBoxMaxZ;

    @Column(name = "ObjectEffectPackageID", nullable = false)
    private int objectEffectPackageID;
}
