package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_emotestextsound")
@Data
public class MysqlDbcEmotesTextSound {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "EmotesTextID", nullable = false)
    private Integer emotesTextId;

    @Column(name = "RaceID", nullable = false)
    private Integer raceId;

    @Column(name = "SexID", nullable = false)
    private Integer sexId;

    @Column(name = "SoundID", nullable = false)
    private Integer soundId;
}
