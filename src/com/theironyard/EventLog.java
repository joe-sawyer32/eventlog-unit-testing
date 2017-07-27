package com.theironyard;

import java.util.List;

/**
 * Created by Joe on 7/27/17.
 */
public class EventLog {
    // FIELDS
    private List<Event> eventList;

    // CONSTRUCTORS
    public EventLog () {}

    // METHODS
    // custom
    public int getNumEvents () {
        return eventList.size();
    }

    public boolean addEvent (Event event) {
        if(event == null) {
            throw new IllegalArgumentException();
        }
        if(event.getName() == null || event.getAction() == null) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}
