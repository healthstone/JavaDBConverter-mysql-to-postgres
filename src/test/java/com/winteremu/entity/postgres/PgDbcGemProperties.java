package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_gemproperties", schema = "dbc")
@Data
public class PgDbcGemProperties {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "enchant_id")
    private Integer enchantId;

    @Column(name = "maxcount_inv")
    private Integer maxcountInv;

    @Column(name = "maxcount_item")
    private Integer maxcountItem;

    @Column(name = "type")
    private Integer type;
}
