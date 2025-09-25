package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_soundentries")
@Data
public class MysqlDbcSoundEntries {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "SoundType", nullable = false)
    private Integer soundType;

    @Column(name = "Name")
    private String name;

    @Column(name = "File_1")
    private String file1;

    @Column(name = "File_2")
    private String file2;

    @Column(name = "File_3")
    private String file3;

    @Column(name = "File_4")
    private String file4;

    @Column(name = "File_5")
    private String file5;

    @Column(name = "File_6")
    private String file6;

    @Column(name = "File_7")
    private String file7;

    @Column(name = "File_8")
    private String file8;

    @Column(name = "File_9")
    private String file9;

    @Column(name = "File_10")
    private String file10;

    @Column(name = "Freq_1", nullable = false)
    private Integer freq1;

    @Column(name = "Freq_2", nullable = false)
    private Integer freq2;

    @Column(name = "Freq_3", nullable = false)
    private Integer freq3;

    @Column(name = "Freq_4", nullable = false)
    private Integer freq4;

    @Column(name = "Freq_5", nullable = false)
    private Integer freq5;

    @Column(name = "Freq_6", nullable = false)
    private Integer freq6;

    @Column(name = "Freq_7", nullable = false)
    private Integer freq7;

    @Column(name = "Freq_8", nullable = false)
    private Integer freq8;

    @Column(name = "Freq_9", nullable = false)
    private Integer freq9;

    @Column(name = "Freq_10", nullable = false)
    private Integer freq10;

    @Column(name = "DirectoryBase")
    private String directoryBase;

    @Column(name = "Volumefloat", nullable = false)
    private Float volumeFloat;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "MinDistance", nullable = false)
    private Float minDistance;

    @Column(name = "DistanceCutoff", nullable = false)
    private Float distanceCutoff;

    @Column(name = "EAXDef", nullable = false)
    private Integer eaxDef;

    @Column(name = "SoundEntriesAdvancedID", nullable = false)
    private Integer soundEntriesAdvancedId;
}
