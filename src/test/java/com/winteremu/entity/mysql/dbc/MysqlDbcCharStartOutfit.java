package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_charstartoutfit")
@Data
public class MysqlDbcCharStartOutfit {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "RaceID", nullable = false)
    private Short raceId;

    @Column(name = "ClassID", nullable = false)
    private Short classId;

    @Column(name = "SexID", nullable = false)
    private Short sexId;

    @Column(name = "OutfitID", nullable = false)
    private Short outfitId;

    // ItemID 1..24
    @Column(name = "ItemID_1", nullable = false)  private Integer itemId1;
    @Column(name = "ItemID_2", nullable = false)  private Integer itemId2;
    @Column(name = "ItemID_3", nullable = false)  private Integer itemId3;
    @Column(name = "ItemID_4", nullable = false)  private Integer itemId4;
    @Column(name = "ItemID_5", nullable = false)  private Integer itemId5;
    @Column(name = "ItemID_6", nullable = false)  private Integer itemId6;
    @Column(name = "ItemID_7", nullable = false)  private Integer itemId7;
    @Column(name = "ItemID_8", nullable = false)  private Integer itemId8;
    @Column(name = "ItemID_9", nullable = false)  private Integer itemId9;
    @Column(name = "ItemID_10", nullable = false) private Integer itemId10;
    @Column(name = "ItemID_11", nullable = false) private Integer itemId11;
    @Column(name = "ItemID_12", nullable = false) private Integer itemId12;
    @Column(name = "ItemID_13", nullable = false) private Integer itemId13;
    @Column(name = "ItemID_14", nullable = false) private Integer itemId14;
    @Column(name = "ItemID_15", nullable = false) private Integer itemId15;
    @Column(name = "ItemID_16", nullable = false) private Integer itemId16;
    @Column(name = "ItemID_17", nullable = false) private Integer itemId17;
    @Column(name = "ItemID_18", nullable = false) private Integer itemId18;
    @Column(name = "ItemID_19", nullable = false) private Integer itemId19;
    @Column(name = "ItemID_20", nullable = false) private Integer itemId20;
    @Column(name = "ItemID_21", nullable = false) private Integer itemId21;
    @Column(name = "ItemID_22", nullable = false) private Integer itemId22;
    @Column(name = "ItemID_23", nullable = false) private Integer itemId23;
    @Column(name = "ItemID_24", nullable = false) private Integer itemId24;

    // DisplayItemID 1..24
    @Column(name = "DisplayItemID_1", nullable = false)  private Integer displayItemId1;
    @Column(name = "DisplayItemID_2", nullable = false)  private Integer displayItemId2;
    @Column(name = "DisplayItemID_3", nullable = false)  private Integer displayItemId3;
    @Column(name = "DisplayItemID_4", nullable = false)  private Integer displayItemId4;
    @Column(name = "DisplayItemID_5", nullable = false)  private Integer displayItemId5;
    @Column(name = "DisplayItemID_6", nullable = false)  private Integer displayItemId6;
    @Column(name = "DisplayItemID_7", nullable = false)  private Integer displayItemId7;
    @Column(name = "DisplayItemID_8", nullable = false)  private Integer displayItemId8;
    @Column(name = "DisplayItemID_9", nullable = false)  private Integer displayItemId9;
    @Column(name = "DisplayItemID_10", nullable = false) private Integer displayItemId10;
    @Column(name = "DisplayItemID_11", nullable = false) private Integer displayItemId11;
    @Column(name = "DisplayItemID_12", nullable = false) private Integer displayItemId12;
    @Column(name = "DisplayItemID_13", nullable = false) private Integer displayItemId13;
    @Column(name = "DisplayItemID_14", nullable = false) private Integer displayItemId14;
    @Column(name = "DisplayItemID_15", nullable = false) private Integer displayItemId15;
    @Column(name = "DisplayItemID_16", nullable = false) private Integer displayItemId16;
    @Column(name = "DisplayItemID_17", nullable = false) private Integer displayItemId17;
    @Column(name = "DisplayItemID_18", nullable = false) private Integer displayItemId18;
    @Column(name = "DisplayItemID_19", nullable = false) private Integer displayItemId19;
    @Column(name = "DisplayItemID_20", nullable = false) private Integer displayItemId20;
    @Column(name = "DisplayItemID_21", nullable = false) private Integer displayItemId21;
    @Column(name = "DisplayItemID_22", nullable = false) private Integer displayItemId22;
    @Column(name = "DisplayItemID_23", nullable = false) private Integer displayItemId23;
    @Column(name = "DisplayItemID_24", nullable = false) private Integer displayItemId24;

    // InventoryType 1..24
    @Column(name = "InventoryType_1", nullable = false)  private Integer inventoryType1;
    @Column(name = "InventoryType_2", nullable = false)  private Integer inventoryType2;
    @Column(name = "InventoryType_3", nullable = false)  private Integer inventoryType3;
    @Column(name = "InventoryType_4", nullable = false)  private Integer inventoryType4;
    @Column(name = "InventoryType_5", nullable = false)  private Integer inventoryType5;
    @Column(name = "InventoryType_6", nullable = false)  private Integer inventoryType6;
    @Column(name = "InventoryType_7", nullable = false)  private Integer inventoryType7;
    @Column(name = "InventoryType_8", nullable = false)  private Integer inventoryType8;
    @Column(name = "InventoryType_9", nullable = false)  private Integer inventoryType9;
    @Column(name = "InventoryType_10", nullable = false) private Integer inventoryType10;
    @Column(name = "InventoryType_11", nullable = false) private Integer inventoryType11;
    @Column(name = "InventoryType_12", nullable = false) private Integer inventoryType12;
    @Column(name = "InventoryType_13", nullable = false) private Integer inventoryType13;
    @Column(name = "InventoryType_14", nullable = false) private Integer inventoryType14;
    @Column(name = "InventoryType_15", nullable = false) private Integer inventoryType15;
    @Column(name = "InventoryType_16", nullable = false) private Integer inventoryType16;
    @Column(name = "InventoryType_17", nullable = false) private Integer inventoryType17;
    @Column(name = "InventoryType_18", nullable = false) private Integer inventoryType18;
    @Column(name = "InventoryType_19", nullable = false) private Integer inventoryType19;
    @Column(name = "InventoryType_20", nullable = false) private Integer inventoryType20;
    @Column(name = "InventoryType_21", nullable = false) private Integer inventoryType21;
    @Column(name = "InventoryType_22", nullable = false) private Integer inventoryType22;
    @Column(name = "InventoryType_23", nullable = false) private Integer inventoryType23;
    @Column(name = "InventoryType_24", nullable = false) private Integer inventoryType24;
}
