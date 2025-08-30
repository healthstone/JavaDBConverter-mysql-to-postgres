package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_characterfacialhairstyles", schema = "dbc")
@Data
public class PgDbcCharacterFacialHairstyles {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "raceid", nullable = false)
    private Integer raceId;

    @Column(name = "sexid", nullable = false)
    private Integer sexId;

    @Column(name = "variationid", nullable = false)
    private Integer variationId;

    @Column(name = "geoset_1", nullable = false)
    private Integer geoset1;

    @Column(name = "geoset_2", nullable = false)
    private Integer geoset2;

    @Column(name = "geoset_3", nullable = false)
    private Integer geoset3;

    @Column(name = "geoset_4", nullable = false)
    private Integer geoset4;

    @Column(name = "geoset_5", nullable = false)
    private Integer geoset5;
}
