package com.winteremu.scenarios.dbc;

import com.winteremu.entity.mysql.dbc.MysqlDbcLock;
import com.winteremu.entity.mysql.dbc.MysqlDbcMailTemplate;
import com.winteremu.entity.postgres.PgDbcLock;
import com.winteremu.entity.postgres.PgDbcMailTemplate;
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
public class TableDbcMailTemplateTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger("TableDbcLockTest");

    @Test
    @Tag("dbc_mailtemplate")
    @DisplayName("dbc_mailtemplate.sql")
    @Description("Перелив данных для dbc_mailtemplate.sql")
    public void convertTableDbcMailTemplate() {
        Query<MysqlDbcMailTemplate> query = mysqlDBCDatabaseSession.createQuery("from MysqlDbcMailTemplate", MysqlDbcMailTemplate.class);
        List<MysqlDbcMailTemplate> mysqlTable = query.getResultList();
        Integer counter = mysqlTable.size();
        Integer batchSize = 200;
        Integer batchCounter = 0;
        logger.info("mysqlTable have [{}] rows", counter);

        try {
            for (int i = 0; i < mysqlTable.size(); i++) {
                MysqlDbcMailTemplate mysql = mysqlTable.get(i);
                PgDbcMailTemplate pg = new PgDbcMailTemplate();

                // ID
                pg.setId(mysql.getId());

// Subject fields
                pg.setSubjectLangEnUS(mysql.getSubjectLangEnUS());
                pg.setSubjectLangEnGB(mysql.getSubjectLangEnGB());
                pg.setSubjectLangKoKR(mysql.getSubjectLangKoKR());
                pg.setSubjectLangFrFR(mysql.getSubjectLangFrFR());
                pg.setSubjectLangDeDE(mysql.getSubjectLangDeDE());
                pg.setSubjectLangEnCN(mysql.getSubjectLangEnCN());
                pg.setSubjectLangZhCN(mysql.getSubjectLangZhCN());
                pg.setSubjectLangEnTW(mysql.getSubjectLangEnTW());
                pg.setSubjectLangZhTW(mysql.getSubjectLangZhTW());
                pg.setSubjectLangEsES(mysql.getSubjectLangEsES());
                pg.setSubjectLangEsMX(mysql.getSubjectLangEsMX());
                pg.setSubjectLangRuRU(mysql.getSubjectLangRuRU());
                pg.setSubjectLangPtPT(mysql.getSubjectLangPtPT());
                pg.setSubjectLangPtBR(mysql.getSubjectLangPtBR());
                pg.setSubjectLangItIT(mysql.getSubjectLangItIT());
                pg.setSubjectLangUnk(mysql.getSubjectLangUnk());
                pg.setSubjectLangMask(mysql.getSubjectLangMask());

// Body fields
                pg.setBodyLangEnUS(mysql.getBodyLangEnUS());
                pg.setBodyLangEnGB(mysql.getBodyLangEnGB());
                pg.setBodyLangKoKR(mysql.getBodyLangKoKR());
                pg.setBodyLangFrFR(mysql.getBodyLangFrFR());
                pg.setBodyLangDeDE(mysql.getBodyLangDeDE());
                pg.setBodyLangEnCN(mysql.getBodyLangEnCN());
                pg.setBodyLangZhCN(mysql.getBodyLangZhCN());
                pg.setBodyLangEnTW(mysql.getBodyLangEnTW());
                pg.setBodyLangZhTW(mysql.getBodyLangZhTW());
                pg.setBodyLangEsES(mysql.getBodyLangEsES());
                pg.setBodyLangEsMX(mysql.getBodyLangEsMX());
                pg.setBodyLangRuRU(mysql.getBodyLangRuRU());
                pg.setBodyLangPtPT(mysql.getBodyLangPtPT());
                pg.setBodyLangPtBR(mysql.getBodyLangPtBR());
                pg.setBodyLangItIT(mysql.getBodyLangItIT());
                pg.setBodyLangUnk(mysql.getBodyLangUnk());
                pg.setBodyLangMask(mysql.getBodyLangMask());

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
