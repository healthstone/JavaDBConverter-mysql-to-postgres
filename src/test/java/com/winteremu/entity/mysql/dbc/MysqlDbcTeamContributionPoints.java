package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_teamcontributionpoints")
public class MysqlDbcTeamContributionPoints {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id = 0;

    @Column(name = "Data", nullable = false)
    private Float data = 0f;
}
