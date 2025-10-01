package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_vehicleseat")
@Data
public class MysqlDbcVehicleSeat {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "AttachmentID", nullable = false)
    private Integer attachmentId;

    @Column(name = "AttachmentOffsetX", nullable = false)
    private Float attachmentOffsetX;

    @Column(name = "AttachmentOffsetY", nullable = false)
    private Float attachmentOffsetY;

    @Column(name = "AttachmentOffsetZ", nullable = false)
    private Float attachmentOffsetZ;

    @Column(name = "EnterPreDelay", nullable = false)
    private Float enterPreDelay;

    @Column(name = "EnterSpeed", nullable = false)
    private Float enterSpeed;

    @Column(name = "EnterGravity", nullable = false)
    private Float enterGravity;

    @Column(name = "EnterMinDuration", nullable = false)
    private Float enterMinDuration;

    @Column(name = "EnterMaxDuration", nullable = false)
    private Float enterMaxDuration;

    @Column(name = "EnterMinArcHeight", nullable = false)
    private Float enterMinArcHeight;

    @Column(name = "EnterMaxArcHeight", nullable = false)
    private Float enterMaxArcHeight;

    @Column(name = "EnterAnimStart", nullable = false)
    private Integer enterAnimStart;

    @Column(name = "EnterAnimLoop", nullable = false)
    private Integer enterAnimLoop;

    @Column(name = "RideAnimStart", nullable = false)
    private Integer rideAnimStart;

    @Column(name = "RideAnimLoop", nullable = false)
    private Integer rideAnimLoop;

    @Column(name = "RideUpperAnimStart", nullable = false)
    private Integer rideUpperAnimStart;

    @Column(name = "RideUpperAnimLoop", nullable = false)
    private Integer rideUpperAnimLoop;

    @Column(name = "ExitPreDelay", nullable = false)
    private Float exitPreDelay;

    @Column(name = "ExitSpeed", nullable = false)
    private Float exitSpeed;

    @Column(name = "ExitGravity", nullable = false)
    private Float exitGravity;

    @Column(name = "ExitMinDuration", nullable = false)
    private Float exitMinDuration;

    @Column(name = "ExitMaxDuration", nullable = false)
    private Float exitMaxDuration;

    @Column(name = "ExitMinArcHeight", nullable = false)
    private Float exitMinArcHeight;

    @Column(name = "ExitMaxArcHeight", nullable = false)
    private Float exitMaxArcHeight;

    @Column(name = "ExitAnimStart", nullable = false)
    private Integer exitAnimStart;

    @Column(name = "ExitAnimLoop", nullable = false)
    private Integer exitAnimLoop;

    @Column(name = "ExitAnimEnd", nullable = false)
    private Integer exitAnimEnd;

    @Column(name = "PassengerYaw", nullable = false)
    private Float passengerYaw;

    @Column(name = "PassengerPitch", nullable = false)
    private Float passengerPitch;

    @Column(name = "PassengerRoll", nullable = false)
    private Float passengerRoll;

    @Column(name = "PassengerAttachmentID", nullable = false)
    private Integer passengerAttachmentId;

    @Column(name = "VehicleEnterAnim", nullable = false)
    private Integer vehicleEnterAnim;

    @Column(name = "VehicleExitAnim", nullable = false)
    private Integer vehicleExitAnim;

    @Column(name = "VehicleRideAnimLoop", nullable = false)
    private Integer vehicleRideAnimLoop;

    @Column(name = "VehicleEnterAnimBone", nullable = false)
    private Integer vehicleEnterAnimBone;

    @Column(name = "VehicleExitAnimBone", nullable = false)
    private Integer vehicleExitAnimBone;

    @Column(name = "VehicleRideAnimLoopBone", nullable = false)
    private Integer vehicleRideAnimLoopBone;

    @Column(name = "VehicleEnterAnimDelay", nullable = false)
    private Float vehicleEnterAnimDelay;

    @Column(name = "VehicleExitAnimDelay", nullable = false)
    private Float vehicleExitAnimDelay;

    @Column(name = "VehicleAbilityDisplay", nullable = false)
    private Integer vehicleAbilityDisplay;

    @Column(name = "EnterUISoundID", nullable = false)
    private Integer enterUiSoundId;

    @Column(name = "ExitUISoundID", nullable = false)
    private Integer exitUiSoundId;

    @Column(name = "UiSkin", nullable = false)
    private Integer uiSkin;

    @Column(name = "FlagsB", nullable = false)
    private Integer flagsB;

    @Column(name = "CameraEnteringDelay", nullable = false)
    private Float cameraEnteringDelay;

    @Column(name = "CameraEnteringDuration", nullable = false)
    private Float cameraEnteringDuration;

    @Column(name = "CameraExitingDelay", nullable = false)
    private Float cameraExitingDelay;

    @Column(name = "CameraExitingDuration", nullable = false)
    private Float cameraExitingDuration;

    @Column(name = "CameraOffsetX", nullable = false)
    private Float cameraOffsetX;

    @Column(name = "CameraOffsetY", nullable = false)
    private Float cameraOffsetY;

    @Column(name = "CameraOffsetZ", nullable = false)
    private Float cameraOffsetZ;

    @Column(name = "CameraPosChaseRate", nullable = false)
    private Float cameraPosChaseRate;

    @Column(name = "CameraFacingChaseRate", nullable = false)
    private Float cameraFacingChaseRate;

    @Column(name = "CameraEnteringZoom", nullable = false)
    private Float cameraEnteringZoom;

    @Column(name = "CameraSeatZoomMin", nullable = false)
    private Float cameraSeatZoomMin;

    @Column(name = "CameraSeatZoomMax", nullable = false)
    private Float cameraSeatZoomMax;
}
