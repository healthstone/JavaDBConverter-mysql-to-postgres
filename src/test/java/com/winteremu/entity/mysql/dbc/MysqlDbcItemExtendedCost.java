package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_itemextendedcost")
@Data
public class MysqlDbcItemExtendedCost {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "HonorPoints", nullable = false)
    private Integer honorPoints;

    @Column(name = "ArenaPoints", nullable = false)
    private Integer arenaPoints;

    @Column(name = "ArenaBracket", nullable = false)
    private Integer arenaBracket;

    @Column(name = "ItemID_1", nullable = false)
    private Integer itemId1;

    @Column(name = "ItemID_2", nullable = false)
    private Integer itemId2;

    @Column(name = "ItemID_3", nullable = false)
    private Integer itemId3;

    @Column(name = "ItemID_4", nullable = false)
    private Integer itemId4;

    @Column(name = "ItemID_5", nullable = false)
    private Integer itemId5;

    @Column(name = "ItemCount_1", nullable = false)
    private Integer itemCount1;

    @Column(name = "ItemCount_2", nullable = false)
    private Integer itemCount2;

    @Column(name = "ItemCount_3", nullable = false)
    private Integer itemCount3;

    @Column(name = "ItemCount_4", nullable = false)
    private Integer itemCount4;

    @Column(name = "ItemCount_5", nullable = false)
    private Integer itemCount5;

    @Column(name = "RequiredArenaRating", nullable = false)
    private Integer requiredArenaRating;

    @Column(name = "ItemPurchaseGroup", nullable = false)
    private Integer itemPurchaseGroup;
}
