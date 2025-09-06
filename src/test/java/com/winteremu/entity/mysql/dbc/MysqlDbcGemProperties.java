package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_gemproperties")
@Data
public class MysqlDbcGemProperties {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Enchant_Id")
    private Integer enchantId;

    @Column(name = "Maxcount_Inv")
    private Integer maxcountInv;

    @Column(name = "Maxcount_Item")
    private Integer maxcountItem;

    @Column(name = "Type")
    private Integer type;
}
