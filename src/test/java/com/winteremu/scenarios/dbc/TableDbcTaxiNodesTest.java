package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcTalent;
import com.winteremu.entity.mysql.dbc.MysqlDbcTaxiNodes;
import com.winteremu.entity.postgres.PgDbcTalent;
import com.winteremu.entity.postgres.PgDbcTaxiNodes;
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
public class TableDbcTaxiNodesTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcTaxiNodesTest");

    @Test
    @Tag("dbc_taxinodes")
    @DisplayName("dbc_taxinodes.sql")
    @Description("Перелив данных для dbc_taxinodes.sql")
    public void convertTableDbcTaxiNodes() {
        Query<MysqlDbcTaxiNodes> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcTaxiNodes", MysqlDbcTaxiNodes.class);
        List<MysqlDbcTaxiNodes> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcTaxiNodes mysql = mysqlTable.get(i);
                PgDbcTaxiNodes pg = new PgDbcTaxiNodes();

                pg.setId(mysql.getId());
                pg.setContinentId(mysql.getContinentId());
                pg.setX(mysql.getX());
                pg.setY(mysql.getY());
                pg.setZ(mysql.getZ());

                pg.setNameLangEnUS(mysql.getNameLangEnUS());
                pg.setNameLangEnGB(mysql.getNameLangEnGB());
                pg.setNameLangKoKR(mysql.getNameLangKoKR());
                pg.setNameLangFrFR(mysql.getNameLangFrFR());
                pg.setNameLangDeDE(mysql.getNameLangDeDE());
                pg.setNameLangEnCN(mysql.getNameLangEnCN());
                pg.setNameLangZhCN(mysql.getNameLangZhCN());
                pg.setNameLangEnTW(mysql.getNameLangEnTW());
                pg.setNameLangZhTW(mysql.getNameLangZhTW());
                pg.setNameLangEsES(mysql.getNameLangEsES());
                pg.setNameLangEsMX(mysql.getNameLangEsMX());
                pg.setNameLangRuRU(mysql.getNameLangRuRU());
                pg.setNameLangPtPT(mysql.getNameLangPtPT());
                pg.setNameLangPtBR(mysql.getNameLangPtBR());
                pg.setNameLangItIT(mysql.getNameLangItIT());
                pg.setNameLangUnk(mysql.getNameLangUnk());

                pg.setNameLangMask(mysql.getNameLangMask());
                pg.setMountCreatureId1(mysql.getMountCreatureId1());
                pg.setMountCreatureId2(mysql.getMountCreatureId2());

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
