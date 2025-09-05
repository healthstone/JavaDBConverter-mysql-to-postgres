package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_emotes", schema = "dbc")
@Data
public class PgDbcEmotes {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "emoteslashcommand")
    private String emoteSlashCommand;

    @Column(name = "animid", nullable = false)
    private Integer animId;

    @Column(name = "emoteflags", nullable = false)
    private Integer emoteFlags;

    @Column(name = "emotespecproc", nullable = false)
    private Integer emoteSpecProc;

    @Column(name = "emotespecprocparam", nullable = false)
    private Integer emoteSpecProcParam;

    @Column(name = "eventsoundid", nullable = false)
    private Integer eventSoundId;
}
