package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellvisual", schema = "dbc")
@Data
public class PgDbcSpellVisual {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "precastkit", nullable = false)
    private Integer precastKit;

    @Column(name = "castkit", nullable = false)
    private Integer castKit;

    @Column(name = "impactkit", nullable = false)
    private Integer impactKit;

    @Column(name = "statekit", nullable = false)
    private Integer stateKit;

    @Column(name = "statedonekit", nullable = false)
    private Integer stateDoneKit;

    @Column(name = "channelkit", nullable = false)
    private Integer channelKit;

    @Column(name = "hasmissile", nullable = false)
    private Integer hasMissile;

    @Column(name = "missilemodel", nullable = false)
    private Integer missileModel;

    @Column(name = "missilepathtype", nullable = false)
    private Integer missilePathType;

    @Column(name = "missiledestinationattachment", nullable = false)
    private Integer missileDestinationAttachment;

    @Column(name = "missilesound", nullable = false)
    private Integer missileSound;

    @Column(name = "animeventsoundid", nullable = false)
    private Integer animEventSoundId;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "casterimpactkit", nullable = false)
    private Integer casterImpactKit;

    @Column(name = "targetimpactkit", nullable = false)
    private Integer targetImpactKit;

    @Column(name = "missileattachment", nullable = false)
    private Integer missileAttachment;

    @Column(name = "missilefollowgroundheight", nullable = false)
    private Integer missileFollowGroundHeight;

    @Column(name = "missilefollowgrounddropspeed", nullable = false)
    private Integer missileFollowGroundDropSpeed;

    @Column(name = "missilefollowgroundapproach", nullable = false)
    private Integer missileFollowGroundApproach;

    @Column(name = "missilefollowgroundflags", nullable = false)
    private Integer missileFollowGroundFlags;

    @Column(name = "misslemotion", nullable = false)
    private Integer missileMotion;

    @Column(name = "missiletargetingkit", nullable = false)
    private Integer missileTargetingKit;

    @Column(name = "instantareakit", nullable = false)
    private Integer instantAreaKit;

    @Column(name = "impactareakit", nullable = false)
    private Integer impactAreaKit;

    @Column(name = "persistentareakit", nullable = false)
    private Integer persistentAreaKit;

    @Column(name = "missilecastoffsetx", nullable = false)
    private Float missileCastOffsetX;

    @Column(name = "missilecastoffsety", nullable = false)
    private Float missileCastOffsetY;

    @Column(name = "missilecastoffsetz", nullable = false)
    private Float missileCastOffsetZ;

    @Column(name = "missileimpactoffsetx", nullable = false)
    private Float missileImpactOffsetX;

    @Column(name = "missileimpactoffsety", nullable = false)
    private Float missileImpactOffsetY;

    @Column(name = "missileimpactoffsetz", nullable = false)
    private Float missileImpactOffsetZ;
}
