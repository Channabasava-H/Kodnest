package com.kodnest.oop;

public class Movie {
	String name;
	String language;
	int ticket;
	String hall;
	
	public Movie(String name, String language, int ticket, String hall) {
		this.name = name;
		this.language = language;
		this.ticket = ticket;
		this.hall = hall;
	}
	
	public Movie() {
		this.name = "Barbie";
		this.language = "English";
		this.ticket = 250;
		this.hall = "PVR";
	}
	
	public Movie(String name) {
		this.name = name;
		this.ticket = 200;
	}
	
	public Movie(int ticket) {
		this.name = "Pathaan";
		this.ticket = ticket;
		this.hall = "PVR";
	}
	
	void giveEntertainment() {
		System.out.println("Enjoing the movie..."+name);
	}
}
