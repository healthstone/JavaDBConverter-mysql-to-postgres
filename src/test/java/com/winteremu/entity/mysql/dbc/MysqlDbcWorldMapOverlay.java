package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_worldmapoverlay")
@Data
public class MysqlDbcWorldMapOverlay {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "MapAreaID", nullable = false)
    private Integer mapAreaId;

    @Column(name = "AreaID_1", nullable = false)
    private Integer areaId1;

    @Column(name = "AreaID_2", nullable = false)
    private Integer areaId2;

    @Column(name = "AreaID_3", nullable = false)
    private Integer areaId3;

    @Column(name = "AreaID_4", nullable = false)
    private Integer areaId4;

    @Column(name = "MapPointX", nullable = false)
    private Integer mapPointX;

    @Column(name = "MapPointY", nullable = false)
    private Integer mapPointY;

    @Column(name = "TextureName", columnDefinition = "text")
    private String textureName;

    @Column(name = "TextureWidth", nullable = false)
    private Integer textureWidth;

    @Column(name = "TextureHeight", nullable = false)
    private Integer textureHeight;

    @Column(name = "OffsetX", nullable = false)
    private Integer offsetX;

    @Column(name = "OffsetY", nullable = false)
    private Integer offsetY;

    @Column(name = "HitRectTop", nullable = false)
    private Integer hitRectTop;

    @Column(name = "HitRectLeft", nullable = false)
    private Integer hitRectLeft;

    @Column(name = "HitRectBottom", nullable = false)
    private Integer hitRectBottom;

    @Column(name = "HitRectRight", nullable = false)
    private Integer hitRectRight;
}
