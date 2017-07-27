package com.theironyard;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by Joe on 7/27/17.
 */
public class EventLogTest {

    private EventLog testEventLog = new EventLog();
    private Event testEvent;

    @Before
    public void setUp() throws Exception {
        System.out.println("Getting Ready For EventLog Test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Ending Test\n");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void nullEventTest() throws IllegalArgumentException {
        System.out.println("Attempting to add null event...");
        thrown.expect(IllegalArgumentException.class);
        testEventLog.addEvent(testEvent);
    }

    @Test
    public void bothEventVariablesNullTest() throws IllegalArgumentException {
        System.out.println("Attempting to add event with two null variables...");
        testEvent = new Event();
        thrown.expect(IllegalArgumentException.class);
        testEventLog.addEvent(testEvent);
    }

    @Test
    public void onEventVariableNullTest() throws IllegalArgumentException {
        System.out.println("Attempting to add event with one null variable...");
        testEvent = new Event();
        testEvent.setName("some test event name");
        thrown.expect(IllegalArgumentException.class);
        testEventLog.addEvent(testEvent);
    }
}