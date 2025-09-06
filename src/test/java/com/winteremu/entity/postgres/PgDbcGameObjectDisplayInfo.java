package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_gameobjectdisplayinfo", schema = "dbc")
@Data
public class PgDbcGameObjectDisplayInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "modelname")
    private String modelName;

    @Column(name = "sound_1", nullable = false)
    private Integer sound1;

    @Column(name = "sound_2", nullable = false)
    private Integer sound2;

    @Column(name = "sound_3", nullable = false)
    private Integer sound3;

    @Column(name = "sound_4", nullable = false)
    private Integer sound4;

    @Column(name = "sound_5", nullable = false)
    private Integer sound5;

    @Column(name = "sound_6", nullable = false)
    private Integer sound6;

    @Column(name = "sound_7", nullable = false)
    private Integer sound7;

    @Column(name = "sound_8", nullable = false)
    private Integer sound8;

    @Column(name = "sound_9", nullable = false)
    private Integer sound9;

    @Column(name = "sound_10", nullable = false)
    private Integer sound10;

    @Column(name = "geoboxminx", nullable = false)
    private Float geoBoxMinX;

    @Column(name = "geoboxminy", nullable = false)
    private Float geoBoxMinY;

    @Column(name = "geoboxminz", nullable = false)
    private Float geoBoxMinZ;

    @Column(name = "geoboxmaxx", nullable = false)
    private Float geoBoxMaxX;

    @Column(name = "geoboxmaxy", nullable = false)
    private Float geoBoxMaxY;

    @Column(name = "geoboxmaxz", nullable = false)
    private Float geoBoxMaxZ;

    @Column(name = "objecteffectpackageid", nullable = false)
    private Integer objectEffectPackageId;
}
