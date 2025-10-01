package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_vehicle")
@Data
public class MysqlDbcVehicle {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "TurnSpeed", nullable = false)
    private Float turnSpeed;

    @Column(name = "PitchSpeed", nullable = false)
    private Float pitchSpeed;

    @Column(name = "PitchMin", nullable = false)
    private Float pitchMin;

    @Column(name = "PitchMax", nullable = false)
    private Float pitchMax;

    @Column(name = "SeatID_1", nullable = false)
    private Integer seatId1;

    @Column(name = "SeatID_2", nullable = false)
    private Integer seatId2;

    @Column(name = "SeatID_3", nullable = false)
    private Integer seatId3;

    @Column(name = "SeatID_4", nullable = false)
    private Integer seatId4;

    @Column(name = "SeatID_5", nullable = false)
    private Integer seatId5;

    @Column(name = "SeatID_6", nullable = false)
    private Integer seatId6;

    @Column(name = "SeatID_7", nullable = false)
    private Integer seatId7;

    @Column(name = "SeatID_8", nullable = false)
    private Integer seatId8;

    @Column(name = "MouseLookOffsetPitch", nullable = false)
    private Float mouseLookOffsetPitch;

    @Column(name = "CameraFadeDistScalarMin", nullable = false)
    private Float cameraFadeDistScalarMin;

    @Column(name = "CameraFadeDistScalarMax", nullable = false)
    private Float cameraFadeDistScalarMax;

    @Column(name = "CameraPitchOffset", nullable = false)
    private Float cameraPitchOffset;

    @Column(name = "FacingLimitRight", nullable = false)
    private Float facingLimitRight;

    @Column(name = "FacingLimitLeft", nullable = false)
    private Float facingLimitLeft;

    @Column(name = "MsslTrgtTurnLingering", nullable = false)
    private Float msslTrgtTurnLingering;

    @Column(name = "MsslTrgtPitchLingering", nullable = false)
    private Float msslTrgtPitchLingering;

    @Column(name = "MsslTrgtMouseLingering", nullable = false)
    private Float msslTrgtMouseLingering;

    @Column(name = "MsslTrgtEndOpacity", nullable = false)
    private Float msslTrgtEndOpacity;

    @Column(name = "MsslTrgtArcSpeed", nullable = false)
    private Float msslTrgtArcSpeed;

    @Column(name = "MsslTrgtArcRepeat", nullable = false)
    private Float msslTrgtArcRepeat;

    @Column(name = "MsslTrgtArcWidth", nullable = false)
    private Float msslTrgtArcWidth;

    @Column(name = "MsslTrgtImpactRadius_1", nullable = false)
    private Float msslTrgtImpactRadius1;

    @Column(name = "MsslTrgtImpactRadius_2", nullable = false)
    private Float msslTrgtImpactRadius2;

    @Column(name = "MsslTrgtArcTexture")
    private String msslTrgtArcTexture;

    @Column(name = "MsslTrgtImpactTexture")
    private String msslTrgtImpactTexture;

    @Column(name = "MsslTrgtImpactModel_1")
    private String msslTrgtImpactModel1;

    @Column(name = "MsslTrgtImpactModel_2")
    private String msslTrgtImpactModel2;

    @Column(name = "CameraYawOffset", nullable = false)
    private Float cameraYawOffset;

    @Column(name = "UilocomotionType", nullable = false)
    private Integer uiLocomotionType;

    @Column(name = "MsslTrgtImpactTexRadius", nullable = false)
    private Float msslTrgtImpactTexRadius;

    @Column(name = "VehicleUIIndicatorID", nullable = false)
    private Integer vehicleUiIndicatorId;

    @Column(name = "PowerDisplayID_1", nullable = false)
    private Integer powerDisplayId1;

    @Column(name = "PowerDisplayID_2", nullable = false)
    private Integer powerDisplayId2;

    @Column(name = "PowerDisplayID_3", nullable = false)
    private Integer powerDisplayId3;
}
