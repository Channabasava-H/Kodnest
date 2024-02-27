package com.kodnest.constructor.overloading;

public class MovieApp {

	public static void main(String[] args) {
		Movie m1 = new Movie("Oppenheimer","English",300,"Cinepolis");
//		m1.name="Oppenheimer";
//		m1.language="English";
//		m1.ticket=300;
//		m1.Hall="Cinepolis";
		
		System.out.println("Movie name : "+m1.name+" | Language : "+m1.language+
				" | Ticket Price : "+m1.ticket+"/- Rupees | Movie Hall : "+m1.hall);
		System.out.println("=======================================================");
		Movie m2 = new Movie();
		System.out.println("Movie name : "+m2.name+" | Language : "+m2.language+
				" | Ticket Price : "+m2.ticket+"/- Rupees | Movie Hall : "+m2.hall);
		System.out.println("=======================================================");
		Movie m3 = new Movie("Oppenheimer");
		System.out.println("Movie name : "+m3.name+" | Language : "+m3.language+
				" | Ticket Price : "+m3.ticket+"/- Rupees | Movie Hall : "+m3.hall);
		System.out.println("=======================================================");
		Movie m4 = new Movie(400);
		System.out.println("Movie name : "+m4.name+" | Language : "+m4.language+
				" | Ticket Price : "+m4.ticket+"/- Rupees | Movie Hall : "+m4.hall);
		m1.giveEntertainment();
	}

}