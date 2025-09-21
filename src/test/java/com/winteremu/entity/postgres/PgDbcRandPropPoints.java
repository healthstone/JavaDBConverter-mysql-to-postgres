package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_randproppoints", schema = "dbc")
@Data
public class PgDbcRandPropPoints {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "epic_1", nullable = false)
    private Integer epic1;

    @Column(name = "epic_2", nullable = false)
    private Integer epic2;

    @Column(name = "epic_3", nullable = false)
    private Integer epic3;

    @Column(name = "epic_4", nullable = false)
    private Integer epic4;

    @Column(name = "epic_5", nullable = false)
    private Integer epic5;

    @Column(name = "superior_1", nullable = false)
    private Integer superior1;

    @Column(name = "superior_2", nullable = false)
    private Integer superior2;

    @Column(name = "superior_3", nullable = false)
    private Integer superior3;

    @Column(name = "superior_4", nullable = false)
    private Integer superior4;

    @Column(name = "superior_5", nullable = false)
    private Integer superior5;

    @Column(name = "good_1", nullable = false)
    private Integer good1;

    @Column(name = "good_2", nullable = false)
    private Integer good2;

    @Column(name = "good_3", nullable = false)
    private Integer good3;

    @Column(name = "good_4", nullable = false)
    private Integer good4;

    @Column(name = "good_5", nullable = false)
    private Integer good5;
}
