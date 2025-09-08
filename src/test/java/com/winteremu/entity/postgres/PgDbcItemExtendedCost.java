package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_itemextendedcost", schema = "dbc")
@Data
public class PgDbcItemExtendedCost {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "honor_points", nullable = false)
    private Integer honorPoints;

    @Column(name = "arena_points", nullable = false)
    private Integer arenaPoints;

    @Column(name = "arena_bracket", nullable = false)
    private Integer arenaBracket;

    @Column(name = "item_id_1", nullable = false)
    private Integer itemId1;

    @Column(name = "item_id_2", nullable = false)
    private Integer itemId2;

    @Column(name = "item_id_3", nullable = false)
    private Integer itemId3;

    @Column(name = "item_id_4", nullable = false)
    private Integer itemId4;

    @Column(name = "item_id_5", nullable = false)
    private Integer itemId5;

    @Column(name = "item_count_1", nullable = false)
    private Integer itemCount1;

    @Column(name = "item_count_2", nullable = false)
    private Integer itemCount2;

    @Column(name = "item_count_3", nullable = false)
    private Integer itemCount3;

    @Column(name = "item_count_4", nullable = false)
    private Integer itemCount4;

    @Column(name = "item_count_5", nullable = false)
    private Integer itemCount5;

    @Column(name = "required_arena_rating", nullable = false)
    private Integer requiredArenaRating;

    @Column(name = "item_purchase_group", nullable = false)
    private Integer itemPurchaseGroup;
}
