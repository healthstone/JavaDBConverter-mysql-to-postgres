package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_transportrotation", schema = "dbc")
public class PgDbcTransportRotation {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "gameobjectsid", nullable = false)
    private int gameObjectsId;

    @Column(name = "timeindex", nullable = false)
    private int timeIndex;

    @Column(name = "rotx", nullable = false)
    private float rotX;

    @Column(name = "roty", nullable = false)
    private float rotY;

    @Column(name = "rotz", nullable = false)
    private float rotZ;

    @Column(name = "rotw", nullable = false)
    private float rotW;
}
