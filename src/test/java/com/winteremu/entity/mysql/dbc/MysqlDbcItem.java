package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_item")
@Data
public class MysqlDbcItem {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "ClassID", nullable = false)
    private int classId;

    @Column(name = "SubclassID", nullable = false)
    private int subclassId;

    @Column(name = "Sound_Override_Subclassid", nullable = false)
    private int soundOverrideSubclassId;

    @Column(name = "Material", nullable = false)
    private int material;

    @Column(name = "DisplayInfoID", nullable = false)
    private int displayInfoId;

    @Column(name = "InventoryType", nullable = false)
    private int inventoryType;

    @Column(name = "SheatheType", nullable = false)
    private int sheatheType;
}
