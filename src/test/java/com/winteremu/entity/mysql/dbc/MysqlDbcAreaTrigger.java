package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_areatrigger")
@Data
public class MysqlDbcAreaTrigger {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "ContinentID", nullable = false)
    private Integer continentId;

    @Column(name = "X", nullable = false)
    private Float x;

    @Column(name = "Y", nullable = false)
    private Float y;

    @Column(name = "Z", nullable = false)
    private Float z;

    @Column(name = "Radius", nullable = false)
    private Float radius;

    @Column(name = "Box_Length", nullable = false)
    private Float boxLength;

    @Column(name = "Box_Width", nullable = false)
    private Float boxWidth;

    @Column(name = "Box_Height", nullable = false)
    private Float boxHeight;

    @Column(name = "Box_Yaw", nullable = false)
    private Float boxYaw;
}
