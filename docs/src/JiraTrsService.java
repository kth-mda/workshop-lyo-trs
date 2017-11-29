package org.eclipse.lyo.misc.jworkshop.jira.services;

import org.eclipse.lyo.misc.jworkshop.jira.JiraAdaptorManager;
import org.eclipse.lyo.misc.jworkshop.jira.JiraChangeHistories;
import org.eclipse.lyo.oslc4j.trs.provider.ChangeHistories;
import org.eclipse.lyo.oslc4j.trs.provider.service.TrsServiceBase;

public class JiraTrsService extends TrsServiceBase {

    public static JiraChangeHistories changeHistories = new JiraChangeHistories(JiraAdaptorManager.changeProvider);

    @Override
    protected ChangeHistories getChangeHistories() {
        return changeHistories;
    }

    @Override
    protected String getServiceBase() {
        return "http://localhost:8081/adaptor-jira/services/";
    }

}
