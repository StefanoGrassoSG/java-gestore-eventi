package org.java.javaevents;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event {
	
	private String title;
	private LocalDate date;
	private int totalSeats;
	private int reservedSeats = 0;
	LocalDate today = LocalDate.now();
	protected LocalDate converted; 
	
	public Event(String title, String date, int totalSeats) throws Exception {

		setTitle(title);
		setDate(convert(date));
		setTotalSeats(totalSeats);
	}
	
	public LocalDate convert(String date) {
        String pattern = "dd-MM-yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(date, formatter);
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) throws Exception {
		if (date.isBefore(today)) 
			throw new Exception("the date must be higher");
		this.date = date;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	private void setTotalSeats(int totalSeats) throws Exception {
		if (totalSeats < 1)
			throw new Exception("the total seats must be higher than 0");
		this.totalSeats = totalSeats;
	}
	public int getReservedSeats() {
		return reservedSeats;
	}
	
	public void reserve(int number) throws Exception {
		if(converted.isBefore(today) || getTotalSeats() < 1)
			throw new Exception("the event has already occurred or there are no more seats available");
		this.reservedSeats += number;
		this.totalSeats -= number;
	}
	public void cancel(int number) throws Exception {
		if(converted.isBefore(today) || getReservedSeats() < 1)
			throw new Exception("the event has already occurred or there are no reserved seats");
		this.reservedSeats -= number;
		this.totalSeats += number;
	}
	
	
	@Override
	public String toString() {
		return "Nome evento: " + getTitle() + "\n"
				+ "Data: " + getDate() + "\n"
				+ "Posti disponibili: " + getTotalSeats()
				+ "\n"
				+ "---------------------------------------"
				+ "\n";
	}			
}
