package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_areatrigger", schema = "dbc")
@Data
public class PgDbcAreaTrigger {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "continent_id", nullable = false)
    private Integer continentId;

    @Column(name = "x", nullable = false)
    private Float x;

    @Column(name = "y", nullable = false)
    private Float y;

    @Column(name = "z", nullable = false)
    private Float z;

    @Column(name = "radius", nullable = false)
    private Float radius;

    @Column(name = "box_length", nullable = false)
    private Float boxLength;

    @Column(name = "box_width", nullable = false)
    private Float boxWidth;

    @Column(name = "box_height", nullable = false)
    private Float boxHeight;

    @Column(name = "box_yaw", nullable = false)
    private Float boxYaw;
}
