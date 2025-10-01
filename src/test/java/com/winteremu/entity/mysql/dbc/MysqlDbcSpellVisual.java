package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellvisual")
@Data
public class MysqlDbcSpellVisual {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "PrecastKit", nullable = false)
    private Integer precastKit;

    @Column(name = "CastKit", nullable = false)
    private Integer castKit;

    @Column(name = "ImpactKit", nullable = false)
    private Integer impactKit;

    @Column(name = "StateKit", nullable = false)
    private Integer stateKit;

    @Column(name = "StateDoneKit", nullable = false)
    private Integer stateDoneKit;

    @Column(name = "ChannelKit", nullable = false)
    private Integer channelKit;

    @Column(name = "HasMissile", nullable = false)
    private Integer hasMissile;

    @Column(name = "MissileModel", nullable = false)
    private Integer missileModel;

    @Column(name = "MissilePathType", nullable = false)
    private Integer missilePathType;

    @Column(name = "MissileDestinationAttachment", nullable = false)
    private Integer missileDestinationAttachment;

    @Column(name = "MissileSound", nullable = false)
    private Integer missileSound;

    @Column(name = "AnimEventSoundID", nullable = false)
    private Integer animEventSoundId;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "CasterImpactKit", nullable = false)
    private Integer casterImpactKit;

    @Column(name = "TargetImpactKit", nullable = false)
    private Integer targetImpactKit;

    @Column(name = "MissileAttachment", nullable = false)
    private Integer missileAttachment;

    @Column(name = "MissileFollowGroundHeight", nullable = false)
    private Integer missileFollowGroundHeight;

    @Column(name = "MissileFollowGroundDropSpeed", nullable = false)
    private Integer missileFollowGroundDropSpeed;

    @Column(name = "MissileFollowGroundApproach", nullable = false)
    private Integer missileFollowGroundApproach;

    @Column(name = "MissileFollowGroundFlags", nullable = false)
    private Integer missileFollowGroundFlags;

    @Column(name = "MissileMotion", nullable = false)
    private Integer missileMotion;

    @Column(name = "MissileTargetingKit", nullable = false)
    private Integer missileTargetingKit;

    @Column(name = "InstantAreaKit", nullable = false)
    private Integer instantAreaKit;

    @Column(name = "ImpactAreaKit", nullable = false)
    private Integer impactAreaKit;

    @Column(name = "PersistentAreaKit", nullable = false)
    private Integer persistentAreaKit;

    @Column(name = "MissileCastOffsetX", nullable = false)
    private Float missileCastOffsetX;

    @Column(name = "MissileCastOffsetY", nullable = false)
    private Float missileCastOffsetY;

    @Column(name = "MissileCastOffsetZ", nullable = false)
    private Float missileCastOffsetZ;

    @Column(name = "MissileImpactOffsetX", nullable = false)
    private Float missileImpactOffsetX;

    @Column(name = "MissileImpactOffsetY", nullable = false)
    private Float missileImpactOffsetY;

    @Column(name = "MissileImpactOffsetZ", nullable = false)
    private Float missileImpactOffsetZ;
}
