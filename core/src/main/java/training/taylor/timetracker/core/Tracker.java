package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

@Component
public class Tracker {
    @Autowired
    private final List<TimeEntry> entries = new ArrayList<>();

    public void add(final TimeEntry entry) {
        entries.add(entry);
    }

    public void remove(final TimeEntry entry) {
        entries.remove(entry);
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(final int index) {
        return entries.get(index);
    }
}
