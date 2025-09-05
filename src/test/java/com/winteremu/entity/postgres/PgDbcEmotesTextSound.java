package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_emotestextsound", schema = "dbc")
@Data
public class PgDbcEmotesTextSound {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "emotestextid", nullable = false)
    private Integer emotesTextId;

    @Column(name = "raceid", nullable = false)
    private Integer raceId;

    @Column(name = "sexid", nullable = false)
    private Integer sexId;

    @Column(name = "soundid", nullable = false)
    private Integer soundId;
}
