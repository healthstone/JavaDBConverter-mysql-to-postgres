package com.winteremu.scenarios;

import com.winteremu.entity.mysql.MysqlItemTemplate;
import com.winteremu.framework.basetests.BaseTest;
import com.winteremu.framework.extensions.DatabaseExtension;
import io.qameta.allure.Description;
import org.hibernate.query.Query;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

@Tag("all-table")
@DisplayName("Заполнение данных таблиц из MySQL в PostgresSQL")
@ExtendWith(DatabaseExtension.class)
public class TableConverterTest extends BaseTest {

    @Test
    @Tag("item_template")
    @DisplayName("item_template.sql")
    @Description("Перелив данных для item_template.sql")
    public void convertTableItemTemplate() {
        Query<MysqlItemTemplate> query = mysqlDatabaseSession.createQuery("from MysqlItemTemplate", MysqlItemTemplate.class);
        List<MysqlItemTemplate> mysqlTable = query.getResultList();
        System.out.println("mysqlTable have [" + mysqlTable.size() + "] rows");
    }
}
