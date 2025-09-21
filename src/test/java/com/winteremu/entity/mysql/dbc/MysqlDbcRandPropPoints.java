package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_randproppoints")
@Data
public class MysqlDbcRandPropPoints {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Epic_1", nullable = false)
    private Integer epic1;

    @Column(name = "Epic_2", nullable = false)
    private Integer epic2;

    @Column(name = "Epic_3", nullable = false)
    private Integer epic3;

    @Column(name = "Epic_4", nullable = false)
    private Integer epic4;

    @Column(name = "Epic_5", nullable = false)
    private Integer epic5;

    @Column(name = "Superior_1", nullable = false)
    private Integer superior1;

    @Column(name = "Superior_2", nullable = false)
    private Integer superior2;

    @Column(name = "Superior_3", nullable = false)
    private Integer superior3;

    @Column(name = "Superior_4", nullable = false)
    private Integer superior4;

    @Column(name = "Superior_5", nullable = false)
    private Integer superior5;

    @Column(name = "Good_1", nullable = false)
    private Integer good1;

    @Column(name = "Good_2", nullable = false)
    private Integer good2;

    @Column(name = "Good_3", nullable = false)
    private Integer good3;

    @Column(name = "Good_4", nullable = false)
    private Integer good4;

    @Column(name = "Good_5", nullable = false)
    private Integer good5;
}
