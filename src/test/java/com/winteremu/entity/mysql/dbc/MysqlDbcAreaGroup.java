package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_areagroup")
public class MysqlDbcAreaGroup {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "AreaID_1", nullable = false)
    private Integer areaId1;

    @Column(name = "AreaID_2", nullable = false)
    private Integer areaId2;

    @Column(name = "AreaID_3", nullable = false)
    private Integer areaId3;

    @Column(name = "AreaID_4", nullable = false)
    private Integer areaId4;

    @Column(name = "AreaID_5", nullable = false)
    private Integer areaId5;

    @Column(name = "AreaID_6", nullable = false)
    private Integer areaId6;

    @Column(name = "NextAreaID", nullable = false)
    private Integer nextAreaId;
}
