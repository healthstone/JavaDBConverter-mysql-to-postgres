package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_transportrotation")
public class MysqlDbcTransportRotation {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "GameObjectsID", nullable = false)
    private int gameObjectsId;

    @Column(name = "TimeIndex", nullable = false)
    private int timeIndex;

    @Column(name = "RotX", nullable = false)
    private float rotX;

    @Column(name = "RotY", nullable = false)
    private float rotY;

    @Column(name = "RotZ", nullable = false)
    private float rotZ;

    @Column(name = "RotW", nullable = false)
    private float rotW;
}
