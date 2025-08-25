package com.winteremu.framework.listener;

import com.winteremu.framework.managers.configmgr.ConfigMgr;
import com.winteremu.framework.managers.convertermgr.ConverterMgr;
import com.winteremu.framework.managers.databasemgr.MysqlDBMgr;
import com.winteremu.framework.managers.databasemgr.PostgresDBMgr;
import lombok.SneakyThrows;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomTestExecutionListener implements TestExecutionListener {
    private static final Logger logger = LoggerFactory.getLogger("Listener");

    @SneakyThrows
    public void testPlanExecutionStarted(TestPlan testPlan) {
        logger.info("testPlanExecutionStarted : " + testPlan.getRoots());
        logger.info("availableProcessors : " + Runtime.getRuntime().availableProcessors());
        ConfigMgr.initialize();
        ConverterMgr.initialize();
        MysqlDBMgr.initialize();
        PostgresDBMgr.initialize();
    }
}
