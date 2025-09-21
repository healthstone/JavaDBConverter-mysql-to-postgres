package com.winteremu.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dbc_mapdifficulty", schema = "dbc")
@Data
public class PgDbcMapDifficulty {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "map_id", nullable = false)
    private Integer mapId;

    @Column(name = "difficulty", nullable = false)
    private Integer difficulty;

    @Column(name = "message_lang_en_us")
    private String messageLangEnUs;

    @Column(name = "message_lang_en_gb")
    private String messageLangEnGb;

    @Column(name = "message_lang_ko_kr")
    private String messageLangKoKr;

    @Column(name = "message_lang_fr_fr")
    private String messageLangFrFr;

    @Column(name = "message_lang_de_de")
    private String messageLangDeDe;

    @Column(name = "message_lang_en_cn")
    private String messageLangEnCn;

    @Column(name = "message_lang_zh_cn")
    private String messageLangZhCn;

    @Column(name = "message_lang_en_tw")
    private String messageLangEnTw;

    @Column(name = "message_lang_zh_tw")
    private String messageLangZhTw;

    @Column(name = "message_lang_es_es")
    private String messageLangEsEs;

    @Column(name = "message_lang_es_mx")
    private String messageLangEsMx;

    @Column(name = "message_lang_ru_ru")
    private String messageLangRuRu;

    @Column(name = "message_lang_pt_pt")
    private String messageLangPtPt;

    @Column(name = "message_lang_pt_br")
    private String messageLangPtBr;

    @Column(name = "message_lang_it_it")
    private String messageLangItIt;

    @Column(name = "message_lang_unk")
    private String messageLangUnk;

    @Column(name = "message_lang_mask", nullable = false)
    private Long messageLangMask; // bigint

    @Column(name = "raid_duration", nullable = false)
    private Integer raidDuration;

    @Column(name = "max_players", nullable = false)
    private Integer maxPlayers;

    @Column(name = "difficulty_string")
    private String difficultyString;
}
