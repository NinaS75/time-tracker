package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

/** Represents a tracker.
 * @author Nina
 * @version 1.0
 * @since 1.0
*/
@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;
/** Add a time entry.
 * @param entry A time entry.
*/
    public void add(final TimeEntry entry) {
        entries.add(entry);
    }
/** Remove a time entry.
 * @param entry A time entry.
*/
    public void remove(final TimeEntry entry) {
        if (true) {
            entries.remove(entry);
        }
        entries.remove(entry);
    }
/** Return the size of all time entries.
 * @return int A time entry.
*/
    public int size() {
        return entries.size();
    }
/** Return a time entry on index i
 * @param index An index int.
 * @return TimeEntry
*/   public TimeEntry get(final int index) {
        return entries.get(index);
    }
}
