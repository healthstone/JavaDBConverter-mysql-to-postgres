package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dbc_auctionhouse", schema = "dbc")
public class PgDbcAuctionHouse {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "faction_id", nullable = false)
    private Integer factionId = 0;

    @Column(name = "deposit_rate", nullable = false)
    private Integer depositRate = 0;

    @Column(name = "consignment_rate", nullable = false)
    private Integer consignmentRate = 0;

    @Column(name = "name_lang_enUS")
    private String nameLangEnUS;

    @Column(name = "name_lang_enGB")
    private String nameLangEnGB;

    @Column(name = "name_lang_koKR")
    private String nameLangKoKR;

    @Column(name = "name_lang_frFR")
    private String nameLangFrFR;

    @Column(name = "name_lang_deDE")
    private String nameLangDeDE;

    @Column(name = "name_lang_enCN")
    private String nameLangEnCN;

    @Column(name = "name_lang_zhCN")
    private String nameLangZhCN;

    @Column(name = "name_lang_enTW")
    private String nameLangEnTW;

    @Column(name = "name_lang_zhTW")
    private String nameLangZhTW;

    @Column(name = "name_lang_esES")
    private String nameLangEsES;

    @Column(name = "name_lang_esMX")
    private String nameLangEsMX;

    @Column(name = "name_lang_ruRU")
    private String nameLangRuRU;

    @Column(name = "name_lang_ptPT")
    private String nameLangPtPT;

    @Column(name = "name_lang_ptBR")
    private String nameLangPtBR;

    @Column(name = "name_lang_itIT")
    private String nameLangItIT;

    @Column(name = "name_lang_unk")
    private String nameLangUnk;

    @Column(name = "name_lang_mask", nullable = false)
    private Integer nameLangMask = 0;
}
