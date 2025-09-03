package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_creaturemodeldata", schema = "dbc")
@Data
public class PgDbcCreatureModelData {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "modelname")
    private String modelName;

    @Column(name = "sizeclass", nullable = false)
    private Integer sizeClass;

    @Column(name = "modelscale", nullable = false)
    private Float modelScale;

    @Column(name = "bloodid", nullable = false)
    private Integer bloodId;

    @Column(name = "footprinttextureid", nullable = false)
    private Integer footprintTextureId;

    @Column(name = "footprinttexturelength", nullable = false)
    private Float footprintTextureLength;

    @Column(name = "footprinttexturewidth", nullable = false)
    private Float footprintTextureWidth;

    @Column(name = "footprintparticlescale", nullable = false)
    private Float footprintParticleScale;

    @Column(name = "foleymaterialid", nullable = false)
    private Integer foleyMaterialId;

    @Column(name = "footstepshakesize", nullable = false)
    private Integer footstepShakeSize;

    @Column(name = "deaththudshakesize", nullable = false)
    private Integer deathThudShakeSize;

    @Column(name = "soundid", nullable = false)
    private Integer soundId;

    @Column(name = "collisionwidth", nullable = false)
    private Float collisionWidth;

    @Column(name = "collisionheight", nullable = false)
    private Float collisionHeight;

    @Column(name = "mountheight", nullable = false)
    private Float mountHeight;

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

    @Column(name = "worldeffectscale", nullable = false)
    private Float worldEffectScale;

    @Column(name = "attachedeffectscale", nullable = false)
    private Float attachedEffectScale;

    @Column(name = "missilecollisionradius", nullable = false)
    private Float missileCollisionRadius;

    @Column(name = "missilecollisionpush", nullable = false)
    private Float missileCollisionPush;

    @Column(name = "missilecollisionraise", nullable = false)
    private Float missileCollisionRaise;
}
