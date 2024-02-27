package com.kodnest.methods.calling;

public class DemoObj {
	void method() { //in Case of In class Non Static method we have to make an object of the class to call the method
		System.out.println("I'm Non Satic Method");
	}
	
	public static void staticMethod() { //in Case of Static method we can call the method directly
		System.out.println("I'm Satic Method");
	}
}
