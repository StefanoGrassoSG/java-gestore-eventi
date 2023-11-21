package org.java.javaevents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
//		Scanner in = new Scanner(System.in);
//		System.out.print("inserisci il nome dell'evento: ");
//		String name = in.nextLine();
//		
//		System.out.print("inserisci la data dell'evento: ");
//		String date = in.nextLine();
//		
//		System.out.print("inserisci i posti disponibili: ");
//		int seats = Integer.parseInt(in.nextLine());
//		
//		Event e = null; 
//		try {
//			e = new Event(name, date, seats);
//			System.out.println(e);
//		} catch (Exception ex) {
//			System.out.println(ex);
//			in.close();
//			return;
//		}
//		
//		System.out.println("vuoi prenotare?[y][n]");
//		String input = in.nextLine();
//		
//		if(input.equals("n")) {
//			System.out.println("terminato");
//			in.close();
//			return;
//		}
//		
//		System.out.println("quanti posti vuoi prenotare?");
//		int seatsNumber = Integer.parseInt(in.nextLine());
//		
//		e.reserve(seatsNumber);
//		
//		System.out.println("posti prenotati: " + e.getReservedSeats() + "\n"
//							+ "posti disponibili: " + e.getTotalSeats());
//		
//		System.out.println("vuoi disdire?[y][n]");
//		String input2 = in.nextLine();
//		
//		if(input2.equals("n")) System.out.println("terminato");
//		
//		System.out.println("quanti posti vuoi disdire?");
//		int seatsNumberCancel = Integer.parseInt(in.nextLine());
//		
//		e.cancel(seatsNumberCancel);
//		
//		System.out.println("posti prenotati: " + e.getReservedSeats() + "\n"
//							+ "posti disponibili: " + e.getTotalSeats());
//		in.close();
//		
//		Concert c = new Concert("vasco", "15-12-2023", 100, "16:00", 50.50);
//		System.out.println(c);
		
		Event a = new Event("concerto1", "19-12-2023", 100);
		Event b = new Event("concerto2", "20-12-2023", 100);
		Event c = new Event("concerto3", "17-12-2023", 100);
		Event d = new Event("concerto4", "18-12-2023", 100);
		Event e = new Event("concerto5", "15-12-2023", 100);
		Event f = new Event("concerto6", "16-12-2023", 100);
		Event g = new Event("concerto7", "21-12-2023", 100);
		
		List<Event> eventList = new ArrayList<>();
	        eventList.add(a);
	        eventList.add(b);
	        eventList.add(c);
	        eventList.add(d);
	        eventList.add(e);
	        eventList.add(f);
	        eventList.add(g);
		
		ProgramEvents p = new ProgramEvents("fiera fegli eventi brutti", eventList);
		Event h = new Event("concerto8", "21-12-2023", 100);
		p.addEvent(h);
		System.out.println(p);
		System.out.println(p.eventForDate("21-12-2023"));
		System.out.println("Numero di eventi nella lista: " + p.getNumberEvents());
		p.eventDate();
	}
}
