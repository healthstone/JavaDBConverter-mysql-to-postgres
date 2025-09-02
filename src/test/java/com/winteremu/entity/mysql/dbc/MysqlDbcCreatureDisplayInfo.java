package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_creaturedisplayinfo")
@Data
public class MysqlDbcCreatureDisplayInfo {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "ModelID", nullable = false)
    private Integer modelId;

    @Column(name = "SoundID", nullable = false)
    private Integer soundId;

    @Column(name = "ExtendedDisplayInfoID", nullable = false)
    private Integer extendedDisplayInfoId;

    @Column(name = "CreatureModelScale", nullable = false)
    private Float creatureModelScale;

    @Column(name = "CreatureModelAlpha", nullable = false)
    private Integer creatureModelAlpha;

    @Column(name = "TextureVariation_1")
    private String textureVariation1;

    @Column(name = "TextureVariation_2")
    private String textureVariation2;

    @Column(name = "TextureVariation_3")
    private String textureVariation3;

    @Column(name = "PortraitTextureName")
    private String portraitTextureName;

    @Column(name = "BloodLevel", nullable = false)
    private Integer bloodLevel;

    @Column(name = "BloodID", nullable = false)
    private Integer bloodId;

    @Column(name = "NPCSoundID", nullable = false)
    private Integer npcSoundId;

    @Column(name = "ParticleColorID", nullable = false)
    private Integer particleColorId;

    @Column(name = "CreatureGeosetData", nullable = false)
    private Integer creatureGeosetData;

    @Column(name = "ObjectEffectPackageID", nullable = false)
    private Integer objectEffectPackageId;
}
