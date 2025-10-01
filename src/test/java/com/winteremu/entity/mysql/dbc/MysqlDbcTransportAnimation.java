package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_transportanimation")
@Data
public class MysqlDbcTransportAnimation {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "TransportID", nullable = false)
    private Integer transportId;

    @Column(name = "TimeIndex", nullable = false)
    private Integer timeIndex;

    @Column(name = "PosX", nullable = false)
    private Float posX;

    @Column(name = "PosY", nullable = false)
    private Float posY;

    @Column(name = "PosZ", nullable = false)
    private Float posZ;

    @Column(name = "SequenceID", nullable = false)
    private Integer sequenceId;
}
