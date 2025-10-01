package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcTransportRotation;
import com.winteremu.entity.mysql.dbc.MysqlDbcWmoAreaTable;
import com.winteremu.entity.postgres.PgDbcTransportRotation;
import com.winteremu.entity.postgres.PgDbcWmoAreaTable;
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
public class TableDbcWmoAreaTableTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcWmoAreaTableTest");

    @Test
    @Tag("dbc_wmoareatable")
    @DisplayName("dbc_wmoareatable.sql")
    @Description("Перелив данных для dbc_wmoareatable.sql")
    public void convertTableDbcWmoAreaTable() {
        Query<MysqlDbcWmoAreaTable> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcWmoAreaTable", MysqlDbcWmoAreaTable.class);
        List<MysqlDbcWmoAreaTable> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcWmoAreaTable mysql = mysqlTable.get(i);
                PgDbcWmoAreaTable pg = new PgDbcWmoAreaTable();

                pg.setId(mysql.getId());
                pg.setWmoId(mysql.getWmoId());
                pg.setNameSetId(mysql.getNameSetId());
                pg.setWmoGroupId(mysql.getWmoGroupId());
                pg.setSoundProviderPref(mysql.getSoundProviderPref());
                pg.setSoundProviderPrefUnderwater(mysql.getSoundProviderPrefUnderwater());
                pg.setAmbienceId(mysql.getAmbienceId());
                pg.setZoneMusic(mysql.getZoneMusic());
                pg.setIntroSound(mysql.getIntroSound());
                pg.setFlags(mysql.getFlags());
                pg.setAreaTableId(mysql.getAreaTableId());

                pg.setAreaNameLangEnUs(mysql.getAreaNameLangEnUs());
                pg.setAreaNameLangEnGb(mysql.getAreaNameLangEnGb());
                pg.setAreaNameLangKoKr(mysql.getAreaNameLangKoKr());
                pg.setAreaNameLangFrFr(mysql.getAreaNameLangFrFr());
                pg.setAreaNameLangDeDe(mysql.getAreaNameLangDeDe());
                pg.setAreaNameLangEnCn(mysql.getAreaNameLangEnCn());
                pg.setAreaNameLangZhCn(mysql.getAreaNameLangZhCn());
                pg.setAreaNameLangEnTw(mysql.getAreaNameLangEnTw());
                pg.setAreaNameLangZhTw(mysql.getAreaNameLangZhTw());
                pg.setAreaNameLangEsEs(mysql.getAreaNameLangEsEs());
                pg.setAreaNameLangEsMx(mysql.getAreaNameLangEsMx());
                pg.setAreaNameLangRuRu(mysql.getAreaNameLangRuRu());
                pg.setAreaNameLangPtPt(mysql.getAreaNameLangPtPt());
                pg.setAreaNameLangPtBr(mysql.getAreaNameLangPtBr());
                pg.setAreaNameLangItIt(mysql.getAreaNameLangItIt());
                pg.setAreaNameLangUnk(mysql.getAreaNameLangUnk());

                pg.setAreaNameLangMask(mysql.getAreaNameLangMask());

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
