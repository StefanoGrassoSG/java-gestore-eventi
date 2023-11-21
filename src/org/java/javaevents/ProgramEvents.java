package org.java.javaevents;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramEvents {
	
	private String title;
	private List<Event> events;
	
	public ProgramEvents(String title, List<Event> events) {
		setTitle(title);
		setEvents(events);
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	public void addEvent(Event event) {
		events.add(event);
	}
	
	public void sortEventsByDate() {
		Collections.sort(events, (d1, d2) -> d1.getDate().compareTo(d2.getDate()));
	}
	
	public List<Event> eventForDate(String date) {
		sortEventsByDate();
		 List<Event> eventsForDate = new ArrayList<>();
		 String pattern = "dd-MM-yyyy";
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		 LocalDate newDate = LocalDate.parse(date, formatter);
        for (Event event : events) {
            if (event.getDate().isEqual(newDate)) {
                eventsForDate.add(event);
            }
        }

        return eventsForDate;
	}
	
	public int getNumberEvents() {
		return events.size();
	}

	public void clear() {
		events.clear();
	}
	
	public void eventDate() {
	   System.out.println("Titolo: " + getTitle());
        for (int x=0;x<getNumberEvents();x++) {
             Event event = getEvents().get(x);
             System.out.println(event.getTitle() + " - " + event.getDate());
            }
    	}
	
	@Override
	public String toString() {
		return "titolo: " + getTitle() + "\n"
				+ "Lista eventi:" + "\n" + getEvents();
	}
}
