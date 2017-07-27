package com.theironyard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joe on 7/27/17.
 */
public class EventLog {
    // FIELDS
    private List<Event> eventList = new ArrayList<>();

    // CONSTRUCTORS
    public EventLog() {
    }

    // METHODS
    // custom
    public int getNumEvents() {
        return eventList.size();
    }

    public boolean addEvent(Event event) {
        if (event == null)
            throw new IllegalArgumentException();
        if (event.getName() == null || event.getAction() == null)
            throw new IllegalArgumentException();
        if (event.getAction().equals("Face2Face") ||
                event.getAction().equals("PhoneCall") ||
                event.getAction().equals("TextMessaging") ||
                event.getAction().equals("Unknown")) {
            System.out.printf("Event Added:\n" + event);
            eventList.add(event);
            return true;
        } else
            throw new IllegalArgumentException();
    }
}
