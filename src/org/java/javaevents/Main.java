package org.java.javaevents;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci il nome dell'evento: ");
		String name = in.nextLine();
		
		System.out.print("inserisci la data dell'evento: ");
		String date = in.nextLine();
		
		System.out.print("inserisci i posti disponibili: ");
		int seats = Integer.parseInt(in.nextLine());
		
		Event e = null; 
		try {
			e = new Event(name, date, seats);
			System.out.println(e);
		} catch (Exception ex) {
			System.out.println(ex);
			return;
		}
		
		System.out.println("vuoi prenotare?[y][n]");
		String input = in.nextLine();
		
		if(input.equals("n")) System.out.println("terminato");
		
		System.out.println("quanti posti vuoi prenotare?");
		int seatsNumber = Integer.parseInt(in.nextLine());
		
		e.reserve(seatsNumber);
		
		System.out.println("posti prenotati: " + e.getReservedSeats() + "\n"
							+ "posti disponibili: " + e.getTotalSeats());
		

		System.out.println("vuoi disdire?[y][n]");
		String input2 = in.nextLine();
		
		if(input2.equals("n")) System.out.println("terminato");
		
		System.out.println("quanti posti vuoi disdire?");
		int seatsNumberCancel = Integer.parseInt(in.nextLine());
		
		e.cancel(seatsNumberCancel);
		
		System.out.println("posti prenotati: " + e.getReservedSeats() + "\n"
							+ "posti disponibili: " + e.getTotalSeats());
	}
}
