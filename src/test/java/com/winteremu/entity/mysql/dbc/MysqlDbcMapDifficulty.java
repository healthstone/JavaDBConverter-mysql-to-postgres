package com.winteremu.entity.mysql.dbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_mapdifficulty")
@Data
public class MysqlDbcMapDifficulty {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "MapID", nullable = false)
    private Integer mapId;

    @Column(name = "Difficulty", nullable = false)
    private Integer difficulty;

    @Column(name = "Message_Lang_enUS")
    private String messageLangEnUs;

    @Column(name = "Message_Lang_enGB")
    private String messageLangEnGb;

    @Column(name = "Message_Lang_koKR")
    private String messageLangKoKr;

    @Column(name = "Message_Lang_frFR")
    private String messageLangFrFr;

    @Column(name = "Message_Lang_deDE")
    private String messageLangDeDe;

    @Column(name = "Message_Lang_enCN")
    private String messageLangEnCn;

    @Column(name = "Message_Lang_zhCN")
    private String messageLangZhCn;

    @Column(name = "Message_Lang_enTW")
    private String messageLangEnTw;

    @Column(name = "Message_Lang_zhTW")
    private String messageLangZhTw;

    @Column(name = "Message_Lang_esES")
    private String messageLangEsEs;

    @Column(name = "Message_Lang_esMX")
    private String messageLangEsMx;

    @Column(name = "Message_Lang_ruRU")
    private String messageLangRuRu;

    @Column(name = "Message_Lang_ptPT")
    private String messageLangPtPt;

    @Column(name = "Message_Lang_ptBR")
    private String messageLangPtBr;

    @Column(name = "Message_Lang_itIT")
    private String messageLangItIt;

    @Column(name = "Message_Lang_Unk")
    private String messageLangUnk;

    @Column(name = "Message_Lang_Mask", nullable = false)
    private Long messageLangMask; // int unsigned → long

    @Column(name = "RaidDuration", nullable = false)
    private Integer raidDuration;

    @Column(name = "MaxPlayers", nullable = false)
    private Integer maxPlayers;

    @Column(name = "Difficultystring")
    private String difficultyString;
}
