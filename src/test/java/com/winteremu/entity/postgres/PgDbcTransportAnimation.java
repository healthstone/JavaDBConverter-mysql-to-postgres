package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_transportanimation", schema = "dbc")
@Data
public class PgDbcTransportAnimation {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "transportid", nullable = false)
    private Integer transportId;

    @Column(name = "timeindex", nullable = false)
    private Integer timeIndex;

    @Column(name = "posx", nullable = false)
    private Float posX;

    @Column(name = "posy", nullable = false)
    private Float posY;

    @Column(name = "posz", nullable = false)
    private Float posZ;

    @Column(name = "sequenceid", nullable = false)
    private Integer sequenceId;
}
