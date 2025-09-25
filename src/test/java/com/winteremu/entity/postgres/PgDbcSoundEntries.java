package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_soundentries", schema = "dbc")
@Data
public class PgDbcSoundEntries {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "soundtype", nullable = false)
    private Integer soundType;

    @Column(name = "name")
    private String name;

    @Column(name = "file_1")
    private String file1;

    @Column(name = "file_2")
    private String file2;

    @Column(name = "file_3")
    private String file3;

    @Column(name = "file_4")
    private String file4;

    @Column(name = "file_5")
    private String file5;

    @Column(name = "file_6")
    private String file6;

    @Column(name = "file_7")
    private String file7;

    @Column(name = "file_8")
    private String file8;

    @Column(name = "file_9")
    private String file9;

    @Column(name = "file_10")
    private String file10;

    @Column(name = "freq_1", nullable = false)
    private Integer freq1;

    @Column(name = "freq_2", nullable = false)
    private Integer freq2;

    @Column(name = "freq_3", nullable = false)
    private Integer freq3;

    @Column(name = "freq_4", nullable = false)
    private Integer freq4;

    @Column(name = "freq_5", nullable = false)
    private Integer freq5;

    @Column(name = "freq_6", nullable = false)
    private Integer freq6;

    @Column(name = "freq_7", nullable = false)
    private Integer freq7;

    @Column(name = "freq_8", nullable = false)
    private Integer freq8;

    @Column(name = "freq_9", nullable = false)
    private Integer freq9;

    @Column(name = "freq_10", nullable = false)
    private Integer freq10;

    @Column(name = "directorybase")
    private String directoryBase;

    @Column(name = "volumefloat", nullable = false)
    private Float volumeFloat;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "mindistance", nullable = false)
    private Float minDistance;

    @Column(name = "distancecutoff", nullable = false)
    private Float distanceCutoff;

    @Column(name = "eaxdef", nullable = false)
    private Integer eaxDef;

    @Column(name = "soundentriesadvancedid", nullable = false)
    private Integer soundEntriesAdvancedId;
}
