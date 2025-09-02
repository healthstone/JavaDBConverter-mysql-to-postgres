package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_creaturedisplayinfoextra")
@Data
public class MysqlDbcCreatureDisplayInfoExtra {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "displayraceid", nullable = false)
    private int displayRaceID;

    @Column(name = "displaysexid", nullable = false)
    private int displaySexID;

    @Column(name = "skinid", nullable = false)
    private int skinID;

    @Column(name = "faceid", nullable = false)
    private int faceID;

    @Column(name = "hairstyleid", nullable = false)
    private int hairStyleID;

    @Column(name = "haircolorid", nullable = false)
    private int hairColorID;

    @Column(name = "facialhairid", nullable = false)
    private int facialHairID;

    @Column(name = "npcitemdisplay_1", nullable = false)
    private int npcItemDisplay1;

    @Column(name = "npcitemdisplay_2", nullable = false)
    private int npcItemDisplay2;

    @Column(name = "npcitemdisplay_3", nullable = false)
    private int npcItemDisplay3;

    @Column(name = "npcitemdisplay_4", nullable = false)
    private int npcItemDisplay4;

    @Column(name = "npcitemdisplay_5", nullable = false)
    private int npcItemDisplay5;

    @Column(name = "npcitemdisplay_6", nullable = false)
    private int npcItemDisplay6;

    @Column(name = "npcitemdisplay_7", nullable = false)
    private int npcItemDisplay7;

    @Column(name = "npcitemdisplay_8", nullable = false)
    private int npcItemDisplay8;

    @Column(name = "npcitemdisplay_9", nullable = false)
    private int npcItemDisplay9;

    @Column(name = "npcitemdisplay_10", nullable = false)
    private int npcItemDisplay10;

    @Column(name = "npcitemdisplay_11", nullable = false)
    private int npcItemDisplay11;

    @Column(name = "flags", nullable = false)
    private int flags;

    @Column(name = "bakename")
    private String bakeName;
}
