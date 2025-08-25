package com.winteremu.framework.basetests;

import com.winteremu.framework.components.StepContext;
import com.winteremu.framework.components.WrappableStep;
import lombok.Setter;
import org.hibernate.Session;

public abstract class BaseTest {
    @Setter
    protected Session mysqlDatabaseSession;
    @Setter
    protected Session postgresDatabaseSession;

    protected StepContext stepContext = new StepContext();

    public void closeDatabaseSession() {
        if (mysqlDatabaseSession != null) {
            mysqlDatabaseSession.close();
        }
        if (postgresDatabaseSession != null) {
            postgresDatabaseSession.close();
        }
    }

    public String getStep() { return stepContext.getStep(); }

    public void aftStep(final String message, WrappableStep action) {
        stepContext.aftStep(message, action);
    }

    public void aftStep(int stepNo, final String message, WrappableStep action) {
        stepContext.aftStep(stepNo, message, action);
    }
}
