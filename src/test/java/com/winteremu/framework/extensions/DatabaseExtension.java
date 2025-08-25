package com.winteremu.framework.extensions;

import com.winteremu.framework.managers.databasemgr.PostgresDBMgr;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import com.winteremu.framework.basetests.BaseTest;
import com.winteremu.framework.managers.databasemgr.MysqlDBMgr;

public class DatabaseExtension implements BeforeEachCallback, AfterEachCallback {
    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        BaseTest baseTest = (BaseTest) extensionContext.getTestInstance().get();
        baseTest.closeDatabaseSession();
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        BaseTest baseTest = (BaseTest) extensionContext.getTestInstance().get();
        baseTest.setMysqlDatabaseSession(MysqlDBMgr.createSession());
        baseTest.setPostgresDatabaseSession(PostgresDBMgr.createSession());
    }
}
