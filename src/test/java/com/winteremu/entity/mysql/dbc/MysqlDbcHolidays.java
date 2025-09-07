package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_holidays")
@Data
public class MysqlDbcHolidays {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "Duration_1", nullable = false)
    private int duration1;
    @Column(name = "Duration_2", nullable = false)
    private int duration2;
    @Column(name = "Duration_3", nullable = false)
    private int duration3;
    @Column(name = "Duration_4", nullable = false)
    private int duration4;
    @Column(name = "Duration_5", nullable = false)
    private int duration5;
    @Column(name = "Duration_6", nullable = false)
    private int duration6;
    @Column(name = "Duration_7", nullable = false)
    private int duration7;
    @Column(name = "Duration_8", nullable = false)
    private int duration8;
    @Column(name = "Duration_9", nullable = false)
    private int duration9;
    @Column(name = "Duration_10", nullable = false)
    private int duration10;

    @Column(name = "Date_1", nullable = false)
    private int date1;
    @Column(name = "Date_2", nullable = false)
    private int date2;
    @Column(name = "Date_3", nullable = false)
    private int date3;
    @Column(name = "Date_4", nullable = false)
    private int date4;
    @Column(name = "Date_5", nullable = false)
    private int date5;
    @Column(name = "Date_6", nullable = false)
    private int date6;
    @Column(name = "Date_7", nullable = false)
    private int date7;
    @Column(name = "Date_8", nullable = false)
    private int date8;
    @Column(name = "Date_9", nullable = false)
    private int date9;
    @Column(name = "Date_10", nullable = false)
    private int date10;
    @Column(name = "Date_11", nullable = false)
    private int date11;
    @Column(name = "Date_12", nullable = false)
    private int date12;
    @Column(name = "Date_13", nullable = false)
    private int date13;
    @Column(name = "Date_14", nullable = false)
    private int date14;
    @Column(name = "Date_15", nullable = false)
    private int date15;
    @Column(name = "Date_16", nullable = false)
    private int date16;
    @Column(name = "Date_17", nullable = false)
    private int date17;
    @Column(name = "Date_18", nullable = false)
    private int date18;
    @Column(name = "Date_19", nullable = false)
    private int date19;
    @Column(name = "Date_20", nullable = false)
    private int date20;
    @Column(name = "Date_21", nullable = false)
    private int date21;
    @Column(name = "Date_22", nullable = false)
    private int date22;
    @Column(name = "Date_23", nullable = false)
    private int date23;
    @Column(name = "Date_24", nullable = false)
    private int date24;
    @Column(name = "Date_25", nullable = false)
    private int date25;
    @Column(name = "Date_26", nullable = false)
    private int date26;

    @Column(name = "Region", nullable = false)
    private int region;
    @Column(name = "Looping", nullable = false)
    private int looping;

    @Column(name = "CalendarFlags_1", nullable = false)
    private int calendarFlags1;
    @Column(name = "CalendarFlags_2", nullable = false)
    private int calendarFlags2;
    @Column(name = "CalendarFlags_3", nullable = false)
    private int calendarFlags3;
    @Column(name = "CalendarFlags_4", nullable = false)
    private int calendarFlags4;
    @Column(name = "CalendarFlags_5", nullable = false)
    private int calendarFlags5;
    @Column(name = "CalendarFlags_6", nullable = false)
    private int calendarFlags6;
    @Column(name = "CalendarFlags_7", nullable = false)
    private int calendarFlags7;
    @Column(name = "CalendarFlags_8", nullable = false)
    private int calendarFlags8;
    @Column(name = "CalendarFlags_9", nullable = false)
    private int calendarFlags9;
    @Column(name = "CalendarFlags_10", nullable = false)
    private int calendarFlags10;

    @Column(name = "HolidayNameID", nullable = false)
    private int holidayNameID;
    @Column(name = "HolidayDescriptionID", nullable = false)
    private int holidayDescriptionID;

    @Column(name = "TextureFilename")
    private String textureFilename;

    @Column(name = "Priority", nullable = false)
    private int priority;

    @Column(name = "CalendarFilterType", nullable = false)
    private int calendarFilterType;

    @Column(name = "Flags", nullable = false)
    private int flags;
}
