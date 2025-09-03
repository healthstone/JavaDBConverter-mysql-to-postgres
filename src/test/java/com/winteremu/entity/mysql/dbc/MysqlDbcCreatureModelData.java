package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_creaturemodeldata")
@Data
public class MysqlDbcCreatureModelData {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "ModelName")
    private String modelName;

    @Column(name = "SizeClass", nullable = false)
    private Integer sizeClass;

    @Column(name = "ModelScale", nullable = false)
    private Float modelScale;

    @Column(name = "BloodID", nullable = false)
    private Integer bloodId;

    @Column(name = "FootprintTextureID", nullable = false)
    private Integer footprintTextureId;

    @Column(name = "FootprintTextureLength", nullable = false)
    private Float footprintTextureLength;

    @Column(name = "FootprintTextureWidth", nullable = false)
    private Float footprintTextureWidth;

    @Column(name = "FootprintParticleScale", nullable = false)
    private Float footprintParticleScale;

    @Column(name = "FoleyMaterialID", nullable = false)
    private Integer foleyMaterialId;

    @Column(name = "FootstepShakeSize", nullable = false)
    private Integer footstepShakeSize;

    @Column(name = "DeathThudShakeSize", nullable = false)
    private Integer deathThudShakeSize;

    @Column(name = "SoundID", nullable = false)
    private Integer soundId;

    @Column(name = "CollisionWidth", nullable = false)
    private Float collisionWidth;

    @Column(name = "CollisionHeight", nullable = false)
    private Float collisionHeight;

    @Column(name = "MountHeight", nullable = false)
    private Float mountHeight;

    @Column(name = "GeoBoxMinX", nullable = false)
    private Float geoBoxMinX;

    @Column(name = "GeoBoxMinY", nullable = false)
    private Float geoBoxMinY;

    @Column(name = "GeoBoxMinZ", nullable = false)
    private Float geoBoxMinZ;

    @Column(name = "GeoBoxMaxX", nullable = false)
    private Float geoBoxMaxX;

    @Column(name = "GeoBoxMaxY", nullable = false)
    private Float geoBoxMaxY;

    @Column(name = "GeoBoxMaxZ", nullable = false)
    private Float geoBoxMaxZ;

    @Column(name = "WorldEffectScale", nullable = false)
    private Float worldEffectScale;

    @Column(name = "AttachedEffectScale", nullable = false)
    private Float attachedEffectScale;

    @Column(name = "MissileCollisionRadius", nullable = false)
    private Float missileCollisionRadius;

    @Column(name = "MissileCollisionPush", nullable = false)
    private Float missileCollisionPush;

    @Column(name = "MissileCollisionRaise", nullable = false)
    private Float missileCollisionRaise;
}
