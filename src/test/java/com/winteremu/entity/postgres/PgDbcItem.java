package com.winteremu.entity.postgres;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_item", schema = "dbc")
@Data
public class PgDbcItem {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "class_id", nullable = false)
    private Integer classId;

    @Column(name = "subclass_id", nullable = false)
    private Integer subclassId;

    @Column(name = "sound_override_subclassid", nullable = false)
    private Integer soundOverrideSubclassId;

    @Column(name = "material", nullable = false)
    private Integer material;

    @Column(name = "display_info_id", nullable = false)
    private Integer displayInfoId;

    @Column(name = "inventory_type", nullable = false)
    private Integer inventoryType;

    @Column(name = "sheathe_type", nullable = false)
    private Integer sheatheType;
}
