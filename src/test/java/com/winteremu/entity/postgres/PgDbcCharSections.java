package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_charsections", schema = "dbc")
@Data
public class PgDbcCharSections {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "raceid", nullable = false)
    private Integer raceId;

    @Column(name = "sexid", nullable = false)
    private Integer sexId;

    @Column(name = "basesection", nullable = false)
    private Integer baseSection;

    @Column(name = "texturename_1")
    private String textureName1;

    @Column(name = "texturename_2")
    private String textureName2;

    @Column(name = "texturename_3")
    private String textureName3;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "variationindex", nullable = false)
    private Integer variationIndex;

    @Column(name = "colorindex", nullable = false)
    private Integer colorIndex;
}
