package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcWorldMapOverlay;
import com.winteremu.entity.mysql.dbc.MysqlDbcWorldSafeLocs;
import com.winteremu.entity.postgres.PgDbcWorldMapOverlay;
import com.winteremu.entity.postgres.PgDbcWorldSafeLocs;
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
public class TableDbcWorldSafeLocsTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcWorldSafeLocsTest");

    @Test
    @Tag("dbc_worldsafelocs")
    @DisplayName("dbc_worldsafelocs.sql")
    @Description("Перелив данных для dbc_worldsafelocs.sql")
    public void convertTableDbcWorldSafeLocs() {
        Query<MysqlDbcWorldSafeLocs> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcWorldSafeLocs", MysqlDbcWorldSafeLocs.class);
        List<MysqlDbcWorldSafeLocs> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcWorldSafeLocs mysql = mysqlTable.get(i);
                PgDbcWorldSafeLocs pg = new PgDbcWorldSafeLocs();

                pg.setId(mysql.getId());
                pg.setContinent(mysql.getContinent());
                pg.setLocX(mysql.getLocX());
                pg.setLocY(mysql.getLocY());
                pg.setLocZ(mysql.getLocZ());

                pg.setAreaNameLangEnUS(mysql.getAreaNameLangEnUS());
                pg.setAreaNameLangEngB(mysql.getAreaNameLangEnGB());
                pg.setAreaNameLangKoKR(mysql.getAreaNameLangKoKR());
                pg.setAreaNameLangFrFR(mysql.getAreaNameLangFrFR());
                pg.setAreaNameLangDeDE(mysql.getAreaNameLangDeDE());
                pg.setAreaNameLangEnCN(mysql.getAreaNameLangEnCN());
                pg.setAreaNameLangZhCN(mysql.getAreaNameLangZhCN());
                pg.setAreaNameLangEnTW(mysql.getAreaNameLangEnTW());
                pg.setAreaNameLangZhTW(mysql.getAreaNameLangZhTW());
                pg.setAreaNameLangEsES(mysql.getAreaNameLangEsES());
                pg.setAreaNameLangEsMX(mysql.getAreaNameLangEsMX());
                pg.setAreaNameLangRuRU(mysql.getAreaNameLangRuRU());
                pg.setAreaNameLangPtPT(mysql.getAreaNameLangPtPT());
                pg.setAreaNameLangPtBR(mysql.getAreaNameLangPtBR());
                pg.setAreaNameLangItIT(mysql.getAreaNameLangItIT());
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
