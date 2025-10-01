package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_worldmaparea", schema = "dbc")
public class PgDbcWorldMapArea {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "mapid", nullable = false)
    private Integer mapId;

    @Column(name = "areaid", nullable = false)
    private Integer areaId;

    @Column(name = "areaname")
    private String areaName;

    @Column(name = "locleft", nullable = false)
    private Float locLeft;

    @Column(name = "locright", nullable = false)
    private Float locRight;

    @Column(name = "loctop", nullable = false)
    private Float locTop;

    @Column(name = "locbottom", nullable = false)
    private Float locBottom;

    @Column(name = "displaymapid", nullable = false)
    private Integer displayMapId;

    @Column(name = "defaultdungeonfloor", nullable = false)
    private Integer defaultDungeonFloor;

    @Column(name = "parentworldmapid", nullable = false)
    private Integer parentWorldMapId;
}
