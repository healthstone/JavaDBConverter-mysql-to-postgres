package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_charsections")
@Data
public class MysqlDbcCharSections {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "RaceID", nullable = false)
    private Integer raceId;

    @Column(name = "SexID", nullable = false)
    private Integer sexId;

    @Column(name = "BaseSection", nullable = false)
    private Integer baseSection;

    @Column(name = "TextureName_1")
    private String textureName1;

    @Column(name = "TextureName_2")
    private String textureName2;

    @Column(name = "TextureName_3")
    private String textureName3;

    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @Column(name = "VariationIndex", nullable = false)
    private Integer variationIndex;

    @Column(name = "ColorIndex", nullable = false)
    private Integer colorIndex;
}
