package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcLight;
import com.winteremu.entity.mysql.dbc.MysqlDbcLock;
import com.winteremu.entity.postgres.PgDbcLight;
import com.winteremu.entity.postgres.PgDbcLock;
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
public class TableDbcLockTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcLockTest");

    @Test
    @Tag("dbc_lock")
    @DisplayName("dbc_lock.sql")
    @Description("Перелив данных для dbc_lock.sql")
    public void convertTableDbcLock() {
        Query<MysqlDbcLock> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcLock", MysqlDbcLock.class);
        List<MysqlDbcLock> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcLock mysql = mysqlTable.get(i);
                PgDbcLock pg = new PgDbcLock();

                pg.setId(mysql.getId());

                pg.setType1(mysql.getType1());
                pg.setType2(mysql.getType2());
                pg.setType3(mysql.getType3());
                pg.setType4(mysql.getType4());
                pg.setType5(mysql.getType5());
                pg.setType6(mysql.getType6());
                pg.setType7(mysql.getType7());
                pg.setType8(mysql.getType8());

                pg.setIndex1(mysql.getIndex1());
                pg.setIndex2(mysql.getIndex2());
                pg.setIndex3(mysql.getIndex3());
                pg.setIndex4(mysql.getIndex4());
                pg.setIndex5(mysql.getIndex5());
                pg.setIndex6(mysql.getIndex6());
                pg.setIndex7(mysql.getIndex7());
                pg.setIndex8(mysql.getIndex8());

                pg.setSkill1(mysql.getSkill1());
                pg.setSkill2(mysql.getSkill2());
                pg.setSkill3(mysql.getSkill3());
                pg.setSkill4(mysql.getSkill4());
                pg.setSkill5(mysql.getSkill5());
                pg.setSkill6(mysql.getSkill6());
                pg.setSkill7(mysql.getSkill7());
                pg.setSkill8(mysql.getSkill8());

                pg.setAction1(mysql.getAction1());
                pg.setAction2(mysql.getAction2());
                pg.setAction3(mysql.getAction3());
                pg.setAction4(mysql.getAction4());
                pg.setAction5(mysql.getAction5());
                pg.setAction6(mysql.getAction6());
                pg.setAction7(mysql.getAction7());
                pg.setAction8(mysql.getAction8());

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
