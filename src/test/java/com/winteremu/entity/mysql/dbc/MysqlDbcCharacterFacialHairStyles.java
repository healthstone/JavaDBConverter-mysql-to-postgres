package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_characterfacialhairstyles")
@Data
public class MysqlDbcCharacterFacialHairStyles {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "RaceID", nullable = false)
    private Integer raceId;

    @Column(name = "SexID", nullable = false)
    private Integer sexId;

    @Column(name = "VariationID", nullable = false)
    private Integer variationId;

    @Column(name = "Geoset_1", nullable = false)
    private Integer geoset1;

    @Column(name = "Geoset_2", nullable = false)
    private Integer geoset2;

    @Column(name = "Geoset_3", nullable = false)
    private Integer geoset3;

    @Column(name = "Geoset_4", nullable = false)
    private Integer geoset4;

    @Column(name = "Geoset_5", nullable = false)
    private Integer geoset5;
}
