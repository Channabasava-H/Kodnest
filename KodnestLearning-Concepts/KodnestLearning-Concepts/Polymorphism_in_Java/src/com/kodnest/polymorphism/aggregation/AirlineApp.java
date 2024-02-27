package com.kodnest.polymorphism.aggregation;

public class AirlineApp {
	
	public static void main(String[] args) {
		Pilot p=new Pilot("Sanjib");
		p.fly();
		
		Airline ar=new Airline("Vistara",p);
		ar.activity();
		ar=null;
		ar.activity(); //Will not work
		p.fly();
	}
}
