package com.winteremu.entity.postgres;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_areagroup", schema = "dbc")
public class PgDbcAreaGroup {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "areaid_1", nullable = false)
    private Integer areaId1;

    @Column(name = "areaid_2", nullable = false)
    private Integer areaId2;

    @Column(name = "areaid_3", nullable = false)
    private Integer areaId3;

    @Column(name = "areaid_4", nullable = false)
    private Integer areaId4;

    @Column(name = "areaid_5", nullable = false)
    private Integer areaId5;

    @Column(name = "areaid_6", nullable = false)
    private Integer areaId6;

    @Column(name = "nextareaid", nullable = false)
    private Integer nextAreaId;
}
