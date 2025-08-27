package com.winteremu.entity.postgres;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dbc_charstartoutfit", schema = "dbc")
@Data
public class PgDbcCharStartOutfit {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "raceid", nullable = false)
    private Short raceId;

    @Column(name = "classid", nullable = false)
    private Short classId;

    @Column(name = "sexid", nullable = false)
    private Short sexId;

    @Column(name = "outfitid", nullable = false)
    private Short outfitId;

    // ItemID 1..24
    @Column(name = "itemid_1", nullable = false) private Integer itemId1;
    @Column(name = "itemid_2", nullable = false) private Integer itemId2;
    @Column(name = "itemid_3", nullable = false) private Integer itemId3;
    @Column(name = "itemid_4", nullable = false) private Integer itemId4;
    @Column(name = "itemid_5", nullable = false) private Integer itemId5;
    @Column(name = "itemid_6", nullable = false) private Integer itemId6;
    @Column(name = "itemid_7", nullable = false) private Integer itemId7;
    @Column(name = "itemid_8", nullable = false) private Integer itemId8;
    @Column(name = "itemid_9", nullable = false) private Integer itemId9;
    @Column(name = "itemid_10", nullable = false) private Integer itemId10;
    @Column(name = "itemid_11", nullable = false) private Integer itemId11;
    @Column(name = "itemid_12", nullable = false) private Integer itemId12;
    @Column(name = "itemid_13", nullable = false) private Integer itemId13;
    @Column(name = "itemid_14", nullable = false) private Integer itemId14;
    @Column(name = "itemid_15", nullable = false) private Integer itemId15;
    @Column(name = "itemid_16", nullable = false) private Integer itemId16;
    @Column(name = "itemid_17", nullable = false) private Integer itemId17;
    @Column(name = "itemid_18", nullable = false) private Integer itemId18;
    @Column(name = "itemid_19", nullable = false) private Integer itemId19;
    @Column(name = "itemid_20", nullable = false) private Integer itemId20;
    @Column(name = "itemid_21", nullable = false) private Integer itemId21;
    @Column(name = "itemid_22", nullable = false) private Integer itemId22;
    @Column(name = "itemid_23", nullable = false) private Integer itemId23;
    @Column(name = "itemid_24", nullable = false) private Integer itemId24;

    // DisplayItemID 1..24
    @Column(name = "displayitemid_1", nullable = false) private Integer displayItemId1;
    @Column(name = "displayitemid_2", nullable = false) private Integer displayItemId2;
    @Column(name = "displayitemid_3", nullable = false) private Integer displayItemId3;
    @Column(name = "displayitemid_4", nullable = false) private Integer displayItemId4;
    @Column(name = "displayitemid_5", nullable = false) private Integer displayItemId5;
    @Column(name = "displayitemid_6", nullable = false) private Integer displayItemId6;
    @Column(name = "displayitemid_7", nullable = false) private Integer displayItemId7;
    @Column(name = "displayitemid_8", nullable = false) private Integer displayItemId8;
    @Column(name = "displayitemid_9", nullable = false) private Integer displayItemId9;
    @Column(name = "displayitemid_10", nullable = false) private Integer displayItemId10;
    @Column(name = "displayitemid_11", nullable = false) private Integer displayItemId11;
    @Column(name = "displayitemid_12", nullable = false) private Integer displayItemId12;
    @Column(name = "displayitemid_13", nullable = false) private Integer displayItemId13;
    @Column(name = "displayitemid_14", nullable = false) private Integer displayItemId14;
    @Column(name = "displayitemid_15", nullable = false) private Integer displayItemId15;
    @Column(name = "displayitemid_16", nullable = false) private Integer displayItemId16;
    @Column(name = "displayitemid_17", nullable = false) private Integer displayItemId17;
    @Column(name = "displayitemid_18", nullable = false) private Integer displayItemId18;
    @Column(name = "displayitemid_19", nullable = false) private Integer displayItemId19;
    @Column(name = "displayitemid_20", nullable = false) private Integer displayItemId20;
    @Column(name = "displayitemid_21", nullable = false) private Integer displayItemId21;
    @Column(name = "displayitemid_22", nullable = false) private Integer displayItemId22;
    @Column(name = "displayitemid_23", nullable = false) private Integer displayItemId23;
    @Column(name = "displayitemid_24", nullable = false) private Integer displayItemId24;

    // InventoryType 1..24
    @Column(name = "inventorytype_1", nullable = false) private Integer inventoryType1;
    @Column(name = "inventorytype_2", nullable = false) private Integer inventoryType2;
    @Column(name = "inventorytype_3", nullable = false) private Integer inventoryType3;
    @Column(name = "inventorytype_4", nullable = false) private Integer inventoryType4;
    @Column(name = "inventorytype_5", nullable = false) private Integer inventoryType5;
    @Column(name = "inventorytype_6", nullable = false) private Integer inventoryType6;
    @Column(name = "inventorytype_7", nullable = false) private Integer inventoryType7;
    @Column(name = "inventorytype_8", nullable = false) private Integer inventoryType8;
    @Column(name = "inventorytype_9", nullable = false) private Integer inventoryType9;
    @Column(name = "inventorytype_10", nullable = false) private Integer inventoryType10;
    @Column(name = "inventorytype_11", nullable = false) private Integer inventoryType11;
    @Column(name = "inventorytype_12", nullable = false) private Integer inventoryType12;
    @Column(name = "inventorytype_13", nullable = false) private Integer inventoryType13;
    @Column(name = "inventorytype_14", nullable = false) private Integer inventoryType14;
    @Column(name = "inventorytype_15", nullable = false) private Integer inventoryType15;
    @Column(name = "inventorytype_16", nullable = false) private Integer inventoryType16;
    @Column(name = "inventorytype_17", nullable = false) private Integer inventoryType17;
    @Column(name = "inventorytype_18", nullable = false) private Integer inventoryType18;
    @Column(name = "inventorytype_19", nullable = false) private Integer inventoryType19;
    @Column(name = "inventorytype_20", nullable = false) private Integer inventoryType20;
    @Column(name = "inventorytype_21", nullable = false) private Integer inventoryType21;
    @Column(name = "inventorytype_22", nullable = false) private Integer inventoryType22;
    @Column(name = "inventorytype_23", nullable = false) private Integer inventoryType23;
    @Column(name = "inventorytype_24", nullable = false) private Integer inventoryType24;
}
