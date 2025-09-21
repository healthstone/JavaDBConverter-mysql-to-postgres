package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_namesprofanity")
@Data
public class MysqlDbcNamesProfanity {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Language", nullable = false)
    private Integer language;
}
