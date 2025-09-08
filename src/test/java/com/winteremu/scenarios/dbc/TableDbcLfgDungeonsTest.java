package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcGtRegenMpPerSpt;
import com.winteremu.entity.mysql.dbc.MysqlDbcLfgDungeons;
import com.winteremu.entity.postgres.PgDbcGtRegenMpPerSpt;
import com.winteremu.entity.postgres.PgDbcLfgDungeons;
import com.winteremu.framework.basetests.BaseTest;
import com.winteremu.framework.extensions.DatabaseExtension;
import io.qameta.allure.Description;
import org.hibernate.query.Query;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Tag("all-table")
@DisplayName("Заполнение данных таблиц из MySQL в PostgresSQL")
@ExtendWith(DatabaseExtension.class)
public class TableDbcLfgDungeonsTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcLfgDungeonsTest");

    @Test
    @Tag("dbc_lfgdungeons")
    @DisplayName("dbc_lfgdungeons.sql")
    @Description("Перелив данных для dbc_lfgdungeons.sql")
    public void convertTableDbcLfgDungeons() {
        Query<MysqlDbcLfgDungeons> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcLfgDungeons", MysqlDbcLfgDungeons.class);
        List<MysqlDbcLfgDungeons> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcLfgDungeons mysql = mysqlTable.get(i);
                PgDbcLfgDungeons pg = new PgDbcLfgDungeons();

                // ID
                pg.setId(mysql.getId());

// Name локализации
                pg.setNameLangEnUs(mysql.getNameLangEnUs());
                pg.setNameLangEnGb(mysql.getNameLangEnGb());
                pg.setNameLangKoKr(mysql.getNameLangKoKr());
                pg.setNameLangFrFr(mysql.getNameLangFrFr());
                pg.setNameLangDeDe(mysql.getNameLangDeDe());
                pg.setNameLangEnCn(mysql.getNameLangEnCn());
                pg.setNameLangZhCn(mysql.getNameLangZhCn());
                pg.setNameLangEnTw(mysql.getNameLangEnTw());
                pg.setNameLangZhTw(mysql.getNameLangZhTw());
                pg.setNameLangEsEs(mysql.getNameLangEsEs());
                pg.setNameLangEsMx(mysql.getNameLangEsMx());
                pg.setNameLangRuRu(mysql.getNameLangRuRu());
                pg.setNameLangPtPt(mysql.getNameLangPtPt());
                pg.setNameLangPtBr(mysql.getNameLangPtBr());
                pg.setNameLangItIt(mysql.getNameLangItIt());
                pg.setNameLangUnk(mysql.getNameLangUnk());
                pg.setNameLangMask(mysql.getNameLangMask());

// Уровни и карта
                pg.setMinLevel(mysql.getMinLevel());
                pg.setMaxLevel(mysql.getMaxLevel());
                pg.setTargetLevel(mysql.getTargetLevel());
                pg.setTargetLevelMin(mysql.getTargetLevelMin());
                pg.setTargetLevelMax(mysql.getTargetLevelMax());
                pg.setMapId(mysql.getMapId());
                pg.setDifficulty(mysql.getDifficulty());
                pg.setFlags(mysql.getFlags());
                pg.setTypeId(mysql.getTypeId());
                pg.setFaction(mysql.getFaction());
                pg.setTextureFilename(mysql.getTextureFilename());
                pg.setExpansionLevel(mysql.getExpansionLevel());
                pg.setOrderIndex(mysql.getOrderIndex());
                pg.setGroupId(mysql.getGroupId());

// Description локализации
                pg.setDescriptionLangEnUs(mysql.getDescriptionLangEnUs());
                pg.setDescriptionLangEnGb(mysql.getDescriptionLangEnGb());
                pg.setDescriptionLangKoKr(mysql.getDescriptionLangKoKr());
                pg.setDescriptionLangFrFr(mysql.getDescriptionLangFrFr());
                pg.setDescriptionLangDeDe(mysql.getDescriptionLangDeDe());
                pg.setDescriptionLangEnCn(mysql.getDescriptionLangEnCn());
                pg.setDescriptionLangZhCn(mysql.getDescriptionLangZhCn());
                pg.setDescriptionLangEnTw(mysql.getDescriptionLangEnTw());
                pg.setDescriptionLangZhTw(mysql.getDescriptionLangZhTw());
                pg.setDescriptionLangEsEs(mysql.getDescriptionLangEsEs());
                pg.setDescriptionLangEsMx(mysql.getDescriptionLangEsMx());
                pg.setDescriptionLangRuRu(mysql.getDescriptionLangRuRu());
                pg.setDescriptionLangPtPt(mysql.getDescriptionLangPtPt());
                pg.setDescriptionLangPtBr(mysql.getDescriptionLangPtBr());
                pg.setDescriptionLangItIt(mysql.getDescriptionLangItIt());
                pg.setDescriptionLangUnk(mysql.getDescriptionLangUnk());
                pg.setDescriptionLangMask(mysql.getDescriptionLangMask());

                postgresDatabaseSession.persist(pg);

                batchCounter++;
                counter--;

                if (batchCounter.equals(batchSize) || counter.equals(0)) {
                    batchCounter = 0;
                    postgresDatabaseSession.beginTransaction();
                    postgresDatabaseSession.getTransaction().commit();

                    logger.info("remains {} rows", counter);
                    postgresDatabaseSession.clear();
                }
            }

            logger.info("postgresTable successfully handled");
        } catch (Exception ex) {
            logger.warn(ex.getMessage());
            postgresDatabaseSession.getTransaction().rollback();
        }
    }
}
