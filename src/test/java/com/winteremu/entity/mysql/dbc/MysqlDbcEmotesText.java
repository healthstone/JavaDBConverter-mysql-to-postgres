package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_emotestext")
@Data
public class MysqlDbcEmotesText {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "EmoteID", nullable = false)
    private Integer emoteId;

    @Column(name = "EmoteText_1", nullable = false)
    private Integer emoteText1;

    @Column(name = "EmoteText_2", nullable = false)
    private Integer emoteText2;

    @Column(name = "EmoteText_3", nullable = false)
    private Integer emoteText3;

    @Column(name = "EmoteText_4", nullable = false)
    private Integer emoteText4;

    @Column(name = "EmoteText_5", nullable = false)
    private Integer emoteText5;

    @Column(name = "EmoteText_6", nullable = false)
    private Integer emoteText6;

    @Column(name = "EmoteText_7", nullable = false)
    private Integer emoteText7;

    @Column(name = "EmoteText_8", nullable = false)
    private Integer emoteText8;

    @Column(name = "EmoteText_9", nullable = false)
    private Integer emoteText9;

    @Column(name = "EmoteText_10", nullable = false)
    private Integer emoteText10;

    @Column(name = "EmoteText_11", nullable = false)
    private Integer emoteText11;

    @Column(name = "EmoteText_12", nullable = false)
    private Integer emoteText12;

    @Column(name = "EmoteText_13", nullable = false)
    private Integer emoteText13;

    @Column(name = "EmoteText_14", nullable = false)
    private Integer emoteText14;

    @Column(name = "EmoteText_15", nullable = false)
    private Integer emoteText15;

    @Column(name = "EmoteText_16", nullable = false)
    private Integer emoteText16;
}
