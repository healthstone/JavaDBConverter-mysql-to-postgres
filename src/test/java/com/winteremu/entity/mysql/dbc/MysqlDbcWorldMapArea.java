package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_worldmaparea")
public class MysqlDbcWorldMapArea {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "MapID", nullable = false)
    private Integer mapId;

    @Column(name = "AreaID", nullable = false)
    private Integer areaId;

    @Column(name = "AreaName")
    private String areaName;

    @Column(name = "LocLeft", nullable = false)
    private Float locLeft;

    @Column(name = "LocRight", nullable = false)
    private Float locRight;

    @Column(name = "LocTop", nullable = false)
    private Float locTop;

    @Column(name = "LocBottom", nullable = false)
    private Float locBottom;

    @Column(name = "DisplayMapID", nullable = false)
    private Integer displayMapId;

    @Column(name = "DefaultDungeonFloor", nullable = false)
    private Integer defaultDungeonFloor;

    @Column(name = "ParentWorldMapID", nullable = false)
    private Integer parentWorldMapId;
}
