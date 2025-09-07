package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcGtRegenMpPerSpt;
import com.winteremu.entity.mysql.dbc.MysqlDbcHolidays;
import com.winteremu.entity.postgres.PgDbcGtRegenMpPerSpt;
import com.winteremu.entity.postgres.PgDbcHolidays;
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
public class TableDbcHolidaysTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcHolidaysTest");

    @Test
    @Tag("dbc_holidays")
    @DisplayName("dbc_holidays.sql")
    @Description("Перелив данных для dbc_holidays.sql")
    public void convertTableDbcHolidays() {
        Query<MysqlDbcHolidays> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcHolidays", MysqlDbcHolidays.class);
        List<MysqlDbcHolidays> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcHolidays mysql = mysqlTable.get(i);
                PgDbcHolidays pg = new PgDbcHolidays();

                pg.setId(mysql.getId());

                pg.setDuration1(mysql.getDuration1());
                pg.setDuration2(mysql.getDuration2());
                pg.setDuration3(mysql.getDuration3());
                pg.setDuration4(mysql.getDuration4());
                pg.setDuration5(mysql.getDuration5());
                pg.setDuration6(mysql.getDuration6());
                pg.setDuration7(mysql.getDuration7());
                pg.setDuration8(mysql.getDuration8());
                pg.setDuration9(mysql.getDuration9());
                pg.setDuration10(mysql.getDuration10());

                pg.setDate1(mysql.getDate1());
                pg.setDate2(mysql.getDate2());
                pg.setDate3(mysql.getDate3());
                pg.setDate4(mysql.getDate4());
                pg.setDate5(mysql.getDate5());
                pg.setDate6(mysql.getDate6());
                pg.setDate7(mysql.getDate7());
                pg.setDate8(mysql.getDate8());
                pg.setDate9(mysql.getDate9());
                pg.setDate10(mysql.getDate10());
                pg.setDate11(mysql.getDate11());
                pg.setDate12(mysql.getDate12());
                pg.setDate13(mysql.getDate13());
                pg.setDate14(mysql.getDate14());
                pg.setDate15(mysql.getDate15());
                pg.setDate16(mysql.getDate16());
                pg.setDate17(mysql.getDate17());
                pg.setDate18(mysql.getDate18());
                pg.setDate19(mysql.getDate19());
                pg.setDate20(mysql.getDate20());
                pg.setDate21(mysql.getDate21());
                pg.setDate22(mysql.getDate22());
                pg.setDate23(mysql.getDate23());
                pg.setDate24(mysql.getDate24());
                pg.setDate25(mysql.getDate25());
                pg.setDate26(mysql.getDate26());

                pg.setRegion(mysql.getRegion());
                pg.setLooping(mysql.getLooping());

                pg.setCalendarFlags1(mysql.getCalendarFlags1());
                pg.setCalendarFlags2(mysql.getCalendarFlags2());
                pg.setCalendarFlags3(mysql.getCalendarFlags3());
                pg.setCalendarFlags4(mysql.getCalendarFlags4());
                pg.setCalendarFlags5(mysql.getCalendarFlags5());
                pg.setCalendarFlags6(mysql.getCalendarFlags6());
                pg.setCalendarFlags7(mysql.getCalendarFlags7());
                pg.setCalendarFlags8(mysql.getCalendarFlags8());
                pg.setCalendarFlags9(mysql.getCalendarFlags9());
                pg.setCalendarFlags10(mysql.getCalendarFlags10());

                pg.setHolidayNameId(mysql.getHolidayNameID());
                pg.setHolidayDescriptionId(mysql.getHolidayDescriptionID());

                pg.setTextureFilename(mysql.getTextureFilename());
                pg.setPriority(mysql.getPriority());
                pg.setCalendarFilterType(mysql.getCalendarFilterType());
                pg.setFlags(mysql.getFlags());

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
