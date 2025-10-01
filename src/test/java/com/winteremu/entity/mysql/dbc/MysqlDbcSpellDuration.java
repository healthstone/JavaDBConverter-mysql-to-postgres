package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_spellduration")
@Data
public class MysqlDbcSpellDuration {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Duration", nullable = false)
    private Integer duration;

    @Column(name = "DurationPerLevel", nullable = false)
    private Integer durationPerLevel;

    @Column(name = "MaxDuration", nullable = false)
    private Integer maxDuration;
}
