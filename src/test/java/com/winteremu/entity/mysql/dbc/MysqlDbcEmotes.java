package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_emotes")
@Data
public class MysqlDbcEmotes {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "EmoteSlashCommand")
    private String emoteSlashCommand;

    @Column(name = "AnimID", nullable = false)
    private Integer animId;

    @Column(name = "EmoteFlags", nullable = false)
    private Integer emoteFlags;

    @Column(name = "EmoteSpecProc", nullable = false)
    private Integer emoteSpecProc;

    @Column(name = "EmoteSpecProcParam", nullable = false)
    private Integer emoteSpecProcParam;

    @Column(name = "EventSoundID", nullable = false)
    private Integer eventSoundId;
}
