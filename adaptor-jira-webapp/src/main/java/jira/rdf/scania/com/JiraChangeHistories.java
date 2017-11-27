package jira.rdf.scania.com;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.lyo.oslc4j.trs.provider.ChangeHistories;
import org.eclipse.lyo.oslc4j.trs.provider.HistoryData;

public class JiraChangeHistories extends ChangeHistories {
    
    private JiraChangeProvider changeProvider;

    public JiraChangeHistories(JiraChangeProvider changeProvider) {
        // ChangeHistories is TRS provider library class
        // we are going to piggyback on the Lyo Store ChangeProvider class
        // which we will slightly modify to keep a HistoryData item for each Change
        this.changeProvider = changeProvider;
    }

    @Override
    public List<HistoryData> getHistory(HttpServletRequest httpServletRequest, Date dateAfter) {
        // TODO Auto-generated method stub
        return changeProvider.getHistory(dateAfter);
    }

}
