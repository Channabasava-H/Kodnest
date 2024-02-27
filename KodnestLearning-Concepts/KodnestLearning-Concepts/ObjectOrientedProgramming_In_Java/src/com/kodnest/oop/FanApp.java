package com.kodnest.oop;

public class FanApp {

	public static void main(String[] args) {
		Fan f1=new Fan();
		f1.no_Of_Wings=4;
		f1.color="White";
		f1.cost=3000;
		f1.brand="Havells";
		f1.rotate();
		f1.blow_Air();
		System.out.println("------------------------------------------------------------------");
		
		Fan f2=new Fan();
		f2.no_Of_Wings=3;
		f2.color="Black";
		f2.cost=3200;
		f2.brand="USHA";
		f2.rotate();
		f2.blow_Air();
		System.out.println("------------------------------------------------------------------");
		
		Fan f3=new Fan();
		f3.no_Of_Wings=5;
		f3.color="Transparent";
		f3.cost=2500;
		f3.brand="Crompton";
		f3.rotate();
		f3.blow_Air();
		System.out.println("------------------------------------------------------------------");
		
	}

}
