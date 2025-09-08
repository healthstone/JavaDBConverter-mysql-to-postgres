package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_itemdisplayinfo")
@Data
public class MysqlDbcItemDisplayInfo {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "ModelName_1")
    private String modelName1;

    @Column(name = "ModelName_2")
    private String modelName2;

    @Column(name = "ModelTexture_1")
    private String modelTexture1;

    @Column(name = "ModelTexture_2")
    private String modelTexture2;

    @Column(name = "InventoryIcon_1")
    private String inventoryIcon1;

    @Column(name = "InventoryIcon_2")
    private String inventoryIcon2;

    @Column(name = "GeosetGroup_1", nullable = false)
    private int geosetGroup1;

    @Column(name = "GeosetGroup_2", nullable = false)
    private int geosetGroup2;

    @Column(name = "GeosetGroup_3", nullable = false)
    private int geosetGroup3;

    @Column(name = "Flags", nullable = false)
    private int flags;

    @Column(name = "SpellVisualID", nullable = false)
    private int spellVisualId;

    @Column(name = "GroupSoundIndex", nullable = false)
    private int groupSoundIndex;

    @Column(name = "HelmetGeosetVis_1", nullable = false)
    private int helmetGeosetVis1;

    @Column(name = "HelmetGeosetVis_2", nullable = false)
    private int helmetGeosetVis2;

    @Column(name = "Texture_1")
    private String texture1;

    @Column(name = "Texture_2")
    private String texture2;

    @Column(name = "Texture_3")
    private String texture3;

    @Column(name = "Texture_4")
    private String texture4;

    @Column(name = "Texture_5")
    private String texture5;

    @Column(name = "Texture_6")
    private String texture6;

    @Column(name = "Texture_7")
    private String texture7;

    @Column(name = "Texture_8")
    private String texture8;

    @Column(name = "ItemVisual", nullable = false)
    private int itemVisual;

    @Column(name = "ParticleColorID", nullable = false)
    private int particleColorId;
}
