package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_holidays", schema = "dbc")
@Data
public class PgDbcHolidays {
    @Id
    @Column(name = "id")
    private Integer id = 0;

    @Column(name = "duration_1", nullable = false)
    private Integer duration1 = 0;
    @Column(name = "duration_2", nullable = false)
    private Integer duration2 = 0;
    @Column(name = "duration_3", nullable = false)
    private Integer duration3 = 0;
    @Column(name = "duration_4", nullable = false)
    private Integer duration4 = 0;
    @Column(name = "duration_5", nullable = false)
    private Integer duration5 = 0;
    @Column(name = "duration_6", nullable = false)
    private Integer duration6 = 0;
    @Column(name = "duration_7", nullable = false)
    private Integer duration7 = 0;
    @Column(name = "duration_8", nullable = false)
    private Integer duration8 = 0;
    @Column(name = "duration_9", nullable = false)
    private Integer duration9 = 0;
    @Column(name = "duration_10", nullable = false)
    private Integer duration10 = 0;

    @Column(name = "date_1", nullable = false)
    private Integer date1 = 0;
    @Column(name = "date_2", nullable = false)
    private Integer date2 = 0;
    @Column(name = "date_3", nullable = false)
    private Integer date3 = 0;
    @Column(name = "date_4", nullable = false)
    private Integer date4 = 0;
    @Column(name = "date_5", nullable = false)
    private Integer date5 = 0;
    @Column(name = "date_6", nullable = false)
    private Integer date6 = 0;
    @Column(name = "date_7", nullable = false)
    private Integer date7 = 0;
    @Column(name = "date_8", nullable = false)
    private Integer date8 = 0;
    @Column(name = "date_9", nullable = false)
    private Integer date9 = 0;
    @Column(name = "date_10", nullable = false)
    private Integer date10 = 0;
    @Column(name = "date_11", nullable = false)
    private Integer date11 = 0;
    @Column(name = "date_12", nullable = false)
    private Integer date12 = 0;
    @Column(name = "date_13", nullable = false)
    private Integer date13 = 0;
    @Column(name = "date_14", nullable = false)
    private Integer date14 = 0;
    @Column(name = "date_15", nullable = false)
    private Integer date15 = 0;
    @Column(name = "date_16", nullable = false)
    private Integer date16 = 0;
    @Column(name = "date_17", nullable = false)
    private Integer date17 = 0;
    @Column(name = "date_18", nullable = false)
    private Integer date18 = 0;
    @Column(name = "date_19", nullable = false)
    private Integer date19 = 0;
    @Column(name = "date_20", nullable = false)
    private Integer date20 = 0;
    @Column(name = "date_21", nullable = false)
    private Integer date21 = 0;
    @Column(name = "date_22", nullable = false)
    private Integer date22 = 0;
    @Column(name = "date_23", nullable = false)
    private Integer date23 = 0;
    @Column(name = "date_24", nullable = false)
    private Integer date24 = 0;
    @Column(name = "date_25", nullable = false)
    private Integer date25 = 0;
    @Column(name = "date_26", nullable = false)
    private Integer date26 = 0;

    @Column(name = "region", nullable = false)
    private Integer region = 0;

    @Column(name = "looping", nullable = false)
    private Integer looping = 0;

    @Column(name = "calendarflags_1", nullable = false)
    private Integer calendarFlags1 = 0;
    @Column(name = "calendarflags_2", nullable = false)
    private Integer calendarFlags2 = 0;
    @Column(name = "calendarflags_3", nullable = false)
    private Integer calendarFlags3 = 0;
    @Column(name = "calendarflags_4", nullable = false)
    private Integer calendarFlags4 = 0;
    @Column(name = "calendarflags_5", nullable = false)
    private Integer calendarFlags5 = 0;
    @Column(name = "calendarflags_6", nullable = false)
    private Integer calendarFlags6 = 0;
    @Column(name = "calendarflags_7", nullable = false)
    private Integer calendarFlags7 = 0;
    @Column(name = "calendarflags_8", nullable = false)
    private Integer calendarFlags8 = 0;
    @Column(name = "calendarflags_9", nullable = false)
    private Integer calendarFlags9 = 0;
    @Column(name = "calendarflags_10", nullable = false)
    private Integer calendarFlags10 = 0;

    @Column(name = "holidaynameid", nullable = false)
    private Integer holidayNameId = 0;

    @Column(name = "holidaydescriptionid", nullable = false)
    private Integer holidayDescriptionId = 0;

    @Column(name = "texturefilename")
    private String textureFilename;

    @Column(name = "priority", nullable = false)
    private Integer priority = 0;

    @Column(name = "calendarfiltertype", nullable = false)
    private Integer calendarFilterType = 0;

    @Column(name = "flags", nullable = false)
    private Integer flags = 0;
}
