package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_namesreserved", schema = "dbc")
@Data
public class PgDbcNamesReserved {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", columnDefinition = "text")
    private String name;

    @Column(name = "language", nullable = false)
    private Integer language;

}
