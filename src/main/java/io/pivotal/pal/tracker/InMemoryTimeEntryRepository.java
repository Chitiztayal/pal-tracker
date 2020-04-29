package io.pivotal.pal.tracker;


import java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {
    @Override
    public TimeEntry create(TimeEntry timeEntry) {

        return  new TimeEntry(1,
                timeEntry.getProjectId(),
                timeEntry.getUserId(),
                timeEntry.getDate(),
                timeEntry.getHours());
    }


    @Override
    public TimeEntry update(long id, TimeEntry timeEntry) {
        return null;
    }

    @Override
    public void delete(long id) {
            }

    @Override
    public TimeEntry find(long id) {
        return null;
    }

    @Override
    public List<TimeEntry> list() {
        return null;
    }
}
