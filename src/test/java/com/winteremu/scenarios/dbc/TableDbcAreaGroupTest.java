package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcAreaGroup;
import com.winteremu.entity.postgres.PgDbcAreaGroup;
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
public class TableDbcAreaGroupTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcAreaGroupTest");

    @Test
    @Tag("dbc_areagroup")
    @DisplayName("dbc_areagroup.sql")
    @Description("Перелив данных для dbc_areagroup.sql")
    public void convertTableDbcAreaGroup() {
        Query<MysqlDbcAreaGroup> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcAreaGroup", MysqlDbcAreaGroup.class);
        List<MysqlDbcAreaGroup> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try{
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcAreaGroup mysql = mysqlTable.get(i);
                PgDbcAreaGroup postgres = new PgDbcAreaGroup();

                postgres.setId(mysql.getId());
                postgres.setAreaId1(mysql.getAreaId1());
                postgres.setAreaId2(mysql.getAreaId2());
                postgres.setAreaId3(mysql.getAreaId3());
                postgres.setAreaId4(mysql.getAreaId4());
                postgres.setAreaId5(mysql.getAreaId5());
                postgres.setAreaId6(mysql.getAreaId6());
                postgres.setNextAreaId(mysql.getNextAreaId());

                // Сохраняем в PostgreSQL
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
