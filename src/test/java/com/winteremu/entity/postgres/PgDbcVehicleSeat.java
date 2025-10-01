package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_vehicleseat", schema = "dbc")
@Data
public class PgDbcVehicleSeat {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "attachment_id", nullable = false)
    private Integer attachmentId;

    @Column(name = "attachment_offset_x", nullable = false)
    private Float attachmentOffsetX;

    @Column(name = "attachment_offset_y", nullable = false)
    private Float attachmentOffsetY;

    @Column(name = "attachment_offset_z", nullable = false)
    private Float attachmentOffsetZ;

    @Column(name = "enter_pre_delay", nullable = false)
    private Float enterPreDelay;

    @Column(name = "enter_speed", nullable = false)
    private Float enterSpeed;

    @Column(name = "enter_gravity", nullable = false)
    private Float enterGravity;

    @Column(name = "enter_min_duration", nullable = false)
    private Float enterMinDuration;

    @Column(name = "enter_max_duration", nullable = false)
    private Float enterMaxDuration;

    @Column(name = "enter_min_arc_height", nullable = false)
    private Float enterMinArcHeight;

    @Column(name = "enter_max_arc_height", nullable = false)
    private Float enterMaxArcHeight;

    @Column(name = "enter_anim_start", nullable = false)
    private Integer enterAnimStart;

    @Column(name = "enter_anim_loop", nullable = false)
    private Integer enterAnimLoop;

    @Column(name = "ride_anim_start", nullable = false)
    private Integer rideAnimStart;

    @Column(name = "ride_anim_loop", nullable = false)
    private Integer rideAnimLoop;

    @Column(name = "ride_upper_anim_start", nullable = false)
    private Integer rideUpperAnimStart;

    @Column(name = "ride_upper_anim_loop", nullable = false)
    private Integer rideUpperAnimLoop;

    @Column(name = "exit_pre_delay", nullable = false)
    private Float exitPreDelay;

    @Column(name = "exit_speed", nullable = false)
    private Float exitSpeed;

    @Column(name = "exit_gravity", nullable = false)
    private Float exitGravity;

    @Column(name = "exit_min_duration", nullable = false)
    private Float exitMinDuration;

    @Column(name = "exit_max_duration", nullable = false)
    private Float exitMaxDuration;

    @Column(name = "exit_min_arc_height", nullable = false)
    private Float exitMinArcHeight;

    @Column(name = "exit_max_arc_height", nullable = false)
    private Float exitMaxArcHeight;

    @Column(name = "exit_anim_start", nullable = false)
    private Integer exitAnimStart;

    @Column(name = "exit_anim_loop", nullable = false)
    private Integer exitAnimLoop;

    @Column(name = "exit_anim_end", nullable = false)
    private Integer exitAnimEnd;

    @Column(name = "passenger_yaw", nullable = false)
    private Float passengerYaw;

    @Column(name = "passenger_pitch", nullable = false)
    private Float passengerPitch;

    @Column(name = "passenger_roll", nullable = false)
    private Float passengerRoll;

    @Column(name = "passenger_attachment_id", nullable = false)
    private Integer passengerAttachmentId;

    @Column(name = "vehicle_enter_anim", nullable = false)
    private Integer vehicleEnterAnim;

    @Column(name = "vehicle_exit_anim", nullable = false)
    private Integer vehicleExitAnim;

    @Column(name = "vehicle_ride_anim_loop", nullable = false)
    private Integer vehicleRideAnimLoop;

    @Column(name = "vehicle_enter_anim_bone", nullable = false)
    private Integer vehicleEnterAnimBone;

    @Column(name = "vehicle_exit_anim_bone", nullable = false)
    private Integer vehicleExitAnimBone;

    @Column(name = "vehicle_ride_anim_loop_bone", nullable = false)
    private Integer vehicleRideAnimLoopBone;

    @Column(name = "vehicle_enter_anim_delay", nullable = false)
    private Float vehicleEnterAnimDelay;

    @Column(name = "vehicle_exit_anim_delay", nullable = false)
    private Float vehicleExitAnimDelay;

    @Column(name = "vehicle_ability_display", nullable = false)
    private Integer vehicleAbilityDisplay;

    @Column(name = "enter_ui_sound_id", nullable = false)
    private Integer enterUiSoundId;

    @Column(name = "exit_ui_sound_id", nullable = false)
    private Integer exitUiSoundId;

    @Column(name = "ui_skin", nullable = false)
    private Integer uiSkin;

    @Column(name = "flags_b", nullable = false)
    private Integer flagsB;

    @Column(name = "camera_entering_delay", nullable = false)
    private Float cameraEnteringDelay;

    @Column(name = "camera_entering_duration", nullable = false)
    private Float cameraEnteringDuration;

    @Column(name = "camera_exiting_delay", nullable = false)
    private Float cameraExitingDelay;

    @Column(name = "camera_exiting_duration", nullable = false)
    private Float cameraExitingDuration;

    @Column(name = "camera_offset_x", nullable = false)
    private Float cameraOffsetX;

    @Column(name = "camera_offset_y", nullable = false)
    private Float cameraOffsetY;

    @Column(name = "camera_offset_z", nullable = false)
    private Float cameraOffsetZ;

    @Column(name = "camera_pos_chase_rate", nullable = false)
    private Float cameraPosChaseRate;

    @Column(name = "camera_facing_chase_rate", nullable = false)
    private Float cameraFacingChaseRate;

    @Column(name = "camera_entering_zoom", nullable = false)
    private Float cameraEnteringZoom;

    @Column(name = "camera_seat_zoom_min", nullable = false)
    private Float cameraSeatZoomMin;

    @Column(name = "camera_seat_zoom_max", nullable = false)
    private Float cameraSeatZoomMax;
}
