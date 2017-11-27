package jira.rdf.scania.com.services;

import org.eclipse.lyo.oslc4j.trs.provider.ChangeHistories;
import org.eclipse.lyo.oslc4j.trs.provider.service.TrsServiceBase;

import jira.rdf.scania.com.JiraAdaptorManager;
import jira.rdf.scania.com.JiraChangeHistories;

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
