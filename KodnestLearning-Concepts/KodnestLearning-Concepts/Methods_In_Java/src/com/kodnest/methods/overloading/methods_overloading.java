package com.kodnest.methods.overloading;

public class methods_overloading {

	public static void main(String[] args) {
		greet();
		teabill();
		teabill(10);
		teabill("Lemon");
		teabill("Green", 10);
	}
	
	public static void greet() {
		System.out.println("-- Welcome to SKM chai Point --");
		System.out.println("-- Tea Bill --");
	}
	
	public static void teabill()
	{
		System.out.println("Your Tea bill is : Rs 10/-");
	}
	
	public static void teabill(int a)
	{
		System.out.println("Your Tea bill is : Rs "+(a*10)+"/-");
	}
	
	public static void teabill(String b) {
		System.out.println("Your Lemon tea bill is : Rs 20/-");
	}
	
	public static void teabill(String z, int y) {
		System.out.println("Your 10 cup Lemon tea bill is : Rs "+(y*20)+"/-");
	}
}
