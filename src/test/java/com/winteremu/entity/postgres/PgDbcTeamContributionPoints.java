package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_teamcontributionpoints", schema = "dbc")
public class PgDbcTeamContributionPoints {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id = 0;

    @Column(name = "data", nullable = false)
    private Float data = 0f;
}
