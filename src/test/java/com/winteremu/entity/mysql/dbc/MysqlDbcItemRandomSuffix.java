package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_itemrandomsuffix")
@Data
public class MysqlDbcItemRandomSuffix {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Name_Lang_enUS")
    private String nameLangEnUs;

    @Column(name = "Name_Lang_enGB")
    private String nameLangEnGb;

    @Column(name = "Name_Lang_koKR")
    private String nameLangKoKr;

    @Column(name = "Name_Lang_frFR")
    private String nameLangFrFr;

    @Column(name = "Name_Lang_deDE")
    private String nameLangDeDe;

    @Column(name = "Name_Lang_enCN")
    private String nameLangEnCn;

    @Column(name = "Name_Lang_zhCN")
    private String nameLangZhCn;

    @Column(name = "Name_Lang_enTW")
    private String nameLangEnTw;

    @Column(name = "Name_Lang_zhTW")
    private String nameLangZhTw;

    @Column(name = "Name_Lang_esES")
    private String nameLangEsEs;

    @Column(name = "Name_Lang_esMX")
    private String nameLangEsMx;

    @Column(name = "Name_Lang_ruRU")
    private String nameLangRuRu;

    @Column(name = "Name_Lang_ptPT")
    private String nameLangPtPt;

    @Column(name = "Name_Lang_ptBR")
    private String nameLangPtBr;

    @Column(name = "Name_Lang_itIT")
    private String nameLangItIt;

    @Column(name = "Name_Lang_Unk")
    private String nameLangUnk;

    @Column(name = "Name_Lang_Mask", nullable = false)
    private Long nameLangMask;

    @Column(name = "InternalName")
    private String internalName;

    @Column(name = "Enchantment_1", nullable = false)
    private Integer enchantment1;

    @Column(name = "Enchantment_2", nullable = false)
    private Integer enchantment2;

    @Column(name = "Enchantment_3", nullable = false)
    private Integer enchantment3;

    @Column(name = "Enchantment_4", nullable = false)
    private Integer enchantment4;

    @Column(name = "Enchantment_5", nullable = false)
    private Integer enchantment5;

    @Column(name = "AllocationPct_1", nullable = false)
    private Integer allocationPct1;

    @Column(name = "AllocationPct_2", nullable = false)
    private Integer allocationPct2;

    @Column(name = "AllocationPct_3", nullable = false)
    private Integer allocationPct3;

    @Column(name = "AllocationPct_4", nullable = false)
    private Integer allocationPct4;

    @Column(name = "AllocationPct_5", nullable = false)
    private Integer allocationPct5;
}
