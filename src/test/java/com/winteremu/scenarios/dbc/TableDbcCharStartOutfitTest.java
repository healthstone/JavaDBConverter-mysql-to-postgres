package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.MysqlDbcCharStartOutfit;
import com.winteremu.entity.postgres.PgDbcCharStartOutfit;
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
public class TableDbcCharStartOutfitTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableConverter");

    @Test
    @Tag("dbc_charstartoutfit")
    @DisplayName("dbc_charstartoutfit.sql")
    @Description("Перелив данных для dbc_charstartoutfit.sql")
    public void convertTableDbcCharStartOutfit() {
        Query<MysqlDbcCharStartOutfit> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcCharStartOutfit", MysqlDbcCharStartOutfit.class);
        List<MysqlDbcCharStartOutfit> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcCharStartOutfit mysql = mysqlTable.get(i);
                PgDbcCharStartOutfit postgres = new PgDbcCharStartOutfit();

                // Перенос всех полей
                postgres.setId(mysql.getId());
                postgres.setRaceId(mysql.getRaceId());
                postgres.setClassId(mysql.getClassId());
                postgres.setSexId(mysql.getSexId());
                postgres.setOutfitId(mysql.getOutfitId());

                // itemid_1 - itemid_24
                postgres.setItemId1(mysql.getItemId1());
                postgres.setItemId2(mysql.getItemId2());
                postgres.setItemId3(mysql.getItemId3());
                postgres.setItemId4(mysql.getItemId4());
                postgres.setItemId5(mysql.getItemId5());
                postgres.setItemId6(mysql.getItemId6());
                postgres.setItemId7(mysql.getItemId7());
                postgres.setItemId8(mysql.getItemId8());
                postgres.setItemId9(mysql.getItemId9());
                postgres.setItemId10(mysql.getItemId10());
                postgres.setItemId11(mysql.getItemId11());
                postgres.setItemId12(mysql.getItemId12());
                postgres.setItemId13(mysql.getItemId13());
                postgres.setItemId14(mysql.getItemId14());
                postgres.setItemId15(mysql.getItemId15());
                postgres.setItemId16(mysql.getItemId16());
                postgres.setItemId17(mysql.getItemId17());
                postgres.setItemId18(mysql.getItemId18());
                postgres.setItemId19(mysql.getItemId19());
                postgres.setItemId20(mysql.getItemId20());
                postgres.setItemId21(mysql.getItemId21());
                postgres.setItemId22(mysql.getItemId22());
                postgres.setItemId23(mysql.getItemId23());
                postgres.setItemId24(mysql.getItemId24());

                // displayitemid_1 - displayitemid_24
                postgres.setDisplayItemId1(mysql.getDisplayItemId1());
                postgres.setDisplayItemId2(mysql.getDisplayItemId2());
                postgres.setDisplayItemId3(mysql.getDisplayItemId3());
                postgres.setDisplayItemId4(mysql.getDisplayItemId4());
                postgres.setDisplayItemId5(mysql.getDisplayItemId5());
                postgres.setDisplayItemId6(mysql.getDisplayItemId6());
                postgres.setDisplayItemId7(mysql.getDisplayItemId7());
                postgres.setDisplayItemId8(mysql.getDisplayItemId8());
                postgres.setDisplayItemId9(mysql.getDisplayItemId9());
                postgres.setDisplayItemId10(mysql.getDisplayItemId10());
                postgres.setDisplayItemId11(mysql.getDisplayItemId11());
                postgres.setDisplayItemId12(mysql.getDisplayItemId12());
                postgres.setDisplayItemId13(mysql.getDisplayItemId13());
                postgres.setDisplayItemId14(mysql.getDisplayItemId14());
                postgres.setDisplayItemId15(mysql.getDisplayItemId15());
                postgres.setDisplayItemId16(mysql.getDisplayItemId16());
                postgres.setDisplayItemId17(mysql.getDisplayItemId17());
                postgres.setDisplayItemId18(mysql.getDisplayItemId18());
                postgres.setDisplayItemId19(mysql.getDisplayItemId19());
                postgres.setDisplayItemId20(mysql.getDisplayItemId20());
                postgres.setDisplayItemId21(mysql.getDisplayItemId21());
                postgres.setDisplayItemId22(mysql.getDisplayItemId22());
                postgres.setDisplayItemId23(mysql.getDisplayItemId23());
                postgres.setDisplayItemId24(mysql.getDisplayItemId24());

                // inventorytype_1 - inventorytype_24
                postgres.setInventoryType1(mysql.getInventoryType1());
                postgres.setInventoryType2(mysql.getInventoryType2());
                postgres.setInventoryType3(mysql.getInventoryType3());
                postgres.setInventoryType4(mysql.getInventoryType4());
                postgres.setInventoryType5(mysql.getInventoryType5());
                postgres.setInventoryType6(mysql.getInventoryType6());
                postgres.setInventoryType7(mysql.getInventoryType7());
                postgres.setInventoryType8(mysql.getInventoryType8());
                postgres.setInventoryType9(mysql.getInventoryType9());
                postgres.setInventoryType10(mysql.getInventoryType10());
                postgres.setInventoryType11(mysql.getInventoryType11());
                postgres.setInventoryType12(mysql.getInventoryType12());
                postgres.setInventoryType13(mysql.getInventoryType13());
                postgres.setInventoryType14(mysql.getInventoryType14());
                postgres.setInventoryType15(mysql.getInventoryType15());
                postgres.setInventoryType16(mysql.getInventoryType16());
                postgres.setInventoryType17(mysql.getInventoryType17());
                postgres.setInventoryType18(mysql.getInventoryType18());
                postgres.setInventoryType19(mysql.getInventoryType19());
                postgres.setInventoryType20(mysql.getInventoryType20());
                postgres.setInventoryType21(mysql.getInventoryType21());
                postgres.setInventoryType22(mysql.getInventoryType22());
                postgres.setInventoryType23(mysql.getInventoryType23());
                postgres.setInventoryType24(mysql.getInventoryType24());

                postgresDatabaseSession.persist(postgres);

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
