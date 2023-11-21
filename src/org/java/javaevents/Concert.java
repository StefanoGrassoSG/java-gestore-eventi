package org.java.javaevents;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concert extends Event {
	
	private String time;
	private double price;
	private LocalTime converted; 
	
	public Concert(String title, String date, int totalSeats, String time, double price) throws Exception {
		super(title, date, totalSeats);
		this.time = time;
		this.converted = convertTime(this.time);
		
		setTime(time);
		setPrice(price);
	}
	
	public LocalTime convertTime(String time) {
        String pattern = "HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalTime.parse(time, formatter);
	}

	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return super.converted + " " + converted + " " + "-" + " " + super.getTitle() + " " + "-" + " " + String.format("%.2f", getPrice()) + "€";
	}
}
