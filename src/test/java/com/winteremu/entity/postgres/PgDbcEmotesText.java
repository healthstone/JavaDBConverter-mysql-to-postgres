package com.winteremu.entity.postgres;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_emotestext", schema = "dbc")
@Data
public class PgDbcEmotesText {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "emoteid", nullable = false)
    private Integer emoteId;

    @Column(name = "emotetext_1", nullable = false)
    private Integer emoteText1;

    @Column(name = "emotetext_2", nullable = false)
    private Integer emoteText2;

    @Column(name = "emotetext_3", nullable = false)
    private Integer emoteText3;

    @Column(name = "emotetext_4", nullable = false)
    private Integer emoteText4;

    @Column(name = "emotetext_5", nullable = false)
    private Integer emoteText5;

    @Column(name = "emotetext_6", nullable = false)
    private Integer emoteText6;

    @Column(name = "emotetext_7", nullable = false)
    private Integer emoteText7;

    @Column(name = "emotetext_8", nullable = false)
    private Integer emoteText8;

    @Column(name = "emotetext_9", nullable = false)
    private Integer emoteText9;

    @Column(name = "emotetext_10", nullable = false)
    private Integer emoteText10;

    @Column(name = "emotetext_11", nullable = false)
    private Integer emoteText11;

    @Column(name = "emotetext_12", nullable = false)
    private Integer emoteText12;

    @Column(name = "emotetext_13", nullable = false)
    private Integer emoteText13;

    @Column(name = "emotetext_14", nullable = false)
    private Integer emoteText14;

    @Column(name = "emotetext_15", nullable = false)
    private Integer emoteText15;

    @Column(name = "emotetext_16", nullable = false)
    private Integer emoteText16;
}
