package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_itemdisplayinfo", schema = "dbc")
@Data
public class PgDbcItemDisplayInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "model_name_1")
    private String modelName1;

    @Column(name = "model_name_2")
    private String modelName2;

    @Column(name = "model_texture_1")
    private String modelTexture1;

    @Column(name = "model_texture_2")
    private String modelTexture2;

    @Column(name = "inventory_icon_1")
    private String inventoryIcon1;

    @Column(name = "inventory_icon_2")
    private String inventoryIcon2;

    @Column(name = "geoset_group_1", nullable = false)
    private int geosetGroup1;

    @Column(name = "geoset_group_2", nullable = false)
    private int geosetGroup2;

    @Column(name = "geoset_group_3", nullable = false)
    private int geosetGroup3;

    @Column(name = "flags", nullable = false)
    private int flags;

    @Column(name = "spell_visual_id", nullable = false)
    private int spellVisualId;

    @Column(name = "group_sound_index", nullable = false)
    private int groupSoundIndex;

    @Column(name = "helmet_geoset_vis_1", nullable = false)
    private int helmetGeosetVis1;

    @Column(name = "helmet_geoset_vis_2", nullable = false)
    private int helmetGeosetVis2;

    @Column(name = "texture_1")
    private String texture1;

    @Column(name = "texture_2")
    private String texture2;

    @Column(name = "texture_3")
    private String texture3;

    @Column(name = "texture_4")
    private String texture4;

    @Column(name = "texture_5")
    private String texture5;

    @Column(name = "texture_6")
    private String texture6;

    @Column(name = "texture_7")
    private String texture7;

    @Column(name = "texture_8")
    private String texture8;

    @Column(name = "item_visual", nullable = false)
    private int itemVisual;

    @Column(name = "particle_color_id", nullable = false)
    private int particleColorId;
}
