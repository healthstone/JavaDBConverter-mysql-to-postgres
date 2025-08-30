package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_bannedaddons", schema = "dbc")
@Data
public class PgDbcBannedAddons {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "namemd5_1", nullable = false)
    private Long nameMd51;

    @Column(name = "namemd5_2", nullable = false)
    private Long nameMd52;

    @Column(name = "namemd5_3", nullable = false)
    private Long nameMd53;

    @Column(name = "namemd5_4", nullable = false)
    private Long nameMd54;

    @Column(name = "versionmd5_1", nullable = false)
    private Long versionMd51;

    @Column(name = "versionmd5_2", nullable = false)
    private Long versionMd52;

    @Column(name = "versionmd5_3", nullable = false)
    private Long versionMd53;

    @Column(name = "versionmd5_4", nullable = false)
    private Long versionMd54;

    @Column(name = "lastmodified", nullable = false)
    private Integer lastModified;

    @Column(name = "flags", nullable = false)
    private Integer flags;
}
