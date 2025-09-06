package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcFaction;
import com.winteremu.entity.mysql.dbc.MysqlDbcFactionTemplate;
import com.winteremu.entity.postgres.PgDbcFaction;
import com.winteremu.entity.postgres.PgDbcFactionTemplate;
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
public class TableDbcFactionTemplateTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcFactionTest");

    @Test
    @Tag("dbc_factiontemplate")
    @DisplayName("dbc_factiontemplate.sql")
    @Description("Перелив данных для dbc_factiontemplate.sql")
    public void convertTableDbcFaction() {
        Query<MysqlDbcFactionTemplate> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcFactionTemplate", MysqlDbcFactionTemplate.class);
        List<MysqlDbcFactionTemplate> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcFactionTemplate mysql = mysqlTable.get(i);
                PgDbcFactionTemplate pg = new PgDbcFactionTemplate();

                pg.setId(mysql.getId());
                pg.setFaction(mysql.getFaction());
                pg.setFlags(mysql.getFlags());
                pg.setFactionGroup(mysql.getFactionGroup());
                pg.setFriendGroup(mysql.getFriendGroup());
                pg.setEnemyGroup(mysql.getEnemyGroup());

                pg.setEnemies1(mysql.getEnemies1());
                pg.setEnemies2(mysql.getEnemies2());
                pg.setEnemies3(mysql.getEnemies3());
                pg.setEnemies4(mysql.getEnemies4());

                pg.setFriend1(mysql.getFriend1());
                pg.setFriend2(mysql.getFriend2());
                pg.setFriend3(mysql.getFriend3());
                pg.setFriend4(mysql.getFriend4());

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
