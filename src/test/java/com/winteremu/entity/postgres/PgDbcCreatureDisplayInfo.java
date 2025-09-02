package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_creaturedisplayinfo", schema = "dbc")
@Data
public class PgDbcCreatureDisplayInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "modelid", nullable = false)
    private Integer modelId;

    @Column(name = "soundid", nullable = false)
    private Integer soundId;

    @Column(name = "extendeddisplayinfoid", nullable = false)
    private Integer extendedDisplayInfoId;

    @Column(name = "creaturemodelscale", nullable = false)
    private Float creatureModelScale;

    @Column(name = "creaturemodelalpha", nullable = false)
    private Integer creatureModelAlpha;

    @Column(name = "texturevariation_1")
    private String textureVariation1;

    @Column(name = "texturevariation_2")
    private String textureVariation2;

    @Column(name = "texturevariation_3")
    private String textureVariation3;

    @Column(name = "portraittexturename")
    private String portraitTextureName;

    @Column(name = "bloodlevel", nullable = false)
    private Integer bloodLevel;

    @Column(name = "bloodid", nullable = false)
    private Integer bloodId;

    @Column(name = "npcsoundid", nullable = false)
    private Integer npcSoundId;

    @Column(name = "particlecolorid", nullable = false)
    private Integer particleColorId;

    @Column(name = "creaturegeosetdata", nullable = false)
    private Integer creatureGeosetData;

    @Column(name = "objecteffectpackageid", nullable = false)
    private Integer objectEffectPackageId;
}
