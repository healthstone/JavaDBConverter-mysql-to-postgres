package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_bannedaddons")
@Data
public class MysqlDbcBannedAddons {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NameMD5_1", nullable = false)
    private Long nameMd51;

    @Column(name = "NameMD5_2", nullable = false)
    private Long nameMd52;

    @Column(name = "NameMD5_3", nullable = false)
    private Long nameMd53;

    @Column(name = "NameMD5_4", nullable = false)
    private Long nameMd54;

    @Column(name = "VersionMD5_1", nullable = false)
    private Long versionMd51;

    @Column(name = "VersionMD5_2", nullable = false)
    private Long versionMd52;

    @Column(name = "VersionMD5_3", nullable = false)
    private Long versionMd53;

    @Column(name = "VersionMD5_4", nullable = false)
    private Long versionMd54;

    @Column(name = "LastModified", nullable = false)
    private Integer lastModified;

    @Column(name = "Flags", nullable = false)
    private Integer flags;
}
