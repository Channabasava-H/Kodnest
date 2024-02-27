package com.kodnest.staticKeyword;

public class Program {
	
	static int a, b; 
	static {
		System.out.println("Inside static block");
		a=10;
		b=20;
	}
	
	static void display1() {
		System.out.println("Inside static method");
		System.out.println(a);
		System.out.println(b);
	}
	
	int x=100, y=200; 
	
	{
		System.out.println("Inside non static block");
	}
	
	void display2() {
		System.out.println("Inside non static method");
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
	
	Program(){
		x=70;
		y=80;
		System.out.println("Inside Constructor");
	}

	public static void main(String[] args) {
		Program.display1();
		Program p= new Program();
		p.display2();
		
	}
}
