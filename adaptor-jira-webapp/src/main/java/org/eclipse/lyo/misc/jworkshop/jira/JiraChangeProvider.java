package org.eclipse.lyo.misc.jworkshop.jira;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.lyo.misc.jworkshop.jira.resources.ChangeRequest;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.trs.provider.HistoryData;
import org.eclipse.lyo.store.update.change.Change;
import org.eclipse.lyo.store.update.change.ChangeKind;
import org.eclipse.lyo.store.update.change.ChangeProvider;
import org.eclipse.lyo.store.update.change.HistoryResource;

import com.google.common.collect.ImmutableList;

public class JiraChangeProvider implements ChangeProvider<Object> {

    private Collection<Change<Object>> changes = new ArrayList<>();
    private List<HistoryData> history = new ArrayList<>();

    @Override
    public Collection<Change<Object>> getChangesSince(ZonedDateTime lastUpdate, Object message) {
        // TODO Auto-generated method stub
        return new ArrayList<>(changes);
    }

    public void addChange(Change<Object> change) {
        changes.add(change);
        history.add(historyItem(change));
    }

    private HistoryData historyItem(Change<Object> change) {
        String type = null;
        HistoryResource h = change.getHistoryResource();
        if (h.getChangeKindEnum().equals(ChangeKind.CREATION)) {
            type = HistoryData.CREATED;
        } else if (h.getChangeKindEnum().equals(ChangeKind.MODIFICATION)) {
            type = HistoryData.MODIFIED;
        } else if (h.getChangeKindEnum().equals(ChangeKind.DELETION)) {
            type = HistoryData.DELETED;
        }
        return HistoryData.getInstance(h.getTimestamp(), h.getResourceURI(), type);
    }

    public void addResourceChange(ChangeKind modification, AbstractResource aChangeRequest) {
        Change<Object> change = new Change<Object>(aChangeRequest,
                new HistoryResource(modification, new Date(), aChangeRequest.getAbout()), null);
        addChange(change);
    }

    public List<HistoryData> getHistory(Date dateAfter) {
        return new ArrayList<>(history);
    }

}
