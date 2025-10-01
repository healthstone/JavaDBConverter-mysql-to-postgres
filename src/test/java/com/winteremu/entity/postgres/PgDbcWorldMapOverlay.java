package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_worldmapoverlay", schema = "dbc")
@Data
public class PgDbcWorldMapOverlay {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "mapareaid", nullable = false)
    private Integer mapAreaId;

    @Column(name = "areaid_1", nullable = false)
    private Integer areaId1;

    @Column(name = "areaid_2", nullable = false)
    private Integer areaId2;

    @Column(name = "areaid_3", nullable = false)
    private Integer areaId3;

    @Column(name = "areaid_4", nullable = false)
    private Integer areaId4;

    @Column(name = "mappointx", nullable = false)
    private Integer mapPointX;

    @Column(name = "mappointy", nullable = false)
    private Integer mapPointY;

    @Column(name = "texturename", columnDefinition = "text")
    private String textureName;

    @Column(name = "texturewidth", nullable = false)
    private Integer textureWidth;

    @Column(name = "textureheight", nullable = false)
    private Integer textureHeight;

    @Column(name = "offsetx", nullable = false)
    private Integer offsetX;

    @Column(name = "offsety", nullable = false)
    private Integer offsetY;

    @Column(name = "hitrecttop", nullable = false)
    private Integer hitRectTop;

    @Column(name = "hitrectleft", nullable = false)
    private Integer hitRectLeft;

    @Column(name = "hitrectbottom", nullable = false)
    private Integer hitRectBottom;

    @Column(name = "hitrectright", nullable = false)
    private Integer hitRectRight;
}
