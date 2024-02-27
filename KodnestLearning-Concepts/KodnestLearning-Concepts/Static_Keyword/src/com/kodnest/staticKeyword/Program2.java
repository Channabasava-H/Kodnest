package com.kodnest.staticKeyword;

public class Program2 {
	
	static int a, b;
	int x=100, y=200; 
	
	static {  		//Static Block
		a=10;		//Accessing static variable
		b=20;		//Accessing static variable
		x=101;		//Accessing Non-static variable
		y=102;		//Accessing Non-static variable
	}
	
	static void display1() { //Static Method
		System.out.println(a); 		//Accessing static variable
		System.out.println(b);		//Accessing static variable
		System.out.println(x);		//Error, Not able to access Non-static variable
		System.out.println(y);		//Error, Not able to access Non-static variable
	}
	
	
	
	{					//Non-Static Block
		a=11;			//Accessing static variable
		b=12;			//Accessing static variable
		x=13;			//Accessing Non-static variable
		y=14;			//Accessing Non-static variable
	}
	
	void display2() {			//Non-static method
		System.out.println(x);	//Accessing Non-static variable
		System.out.println(y);	//Accessing Non-static variable
		System.out.println(a);	//Accessing static variable
		System.out.println(b);	//Accessing static variable
	}
	
	Program2(){
		x=70;		//Accessing Non-static variable
		y=80;		//Accessing Non-static variable
		a=111;		//Accessing static variable
		b=222;		//Accessing static variable
	}

	public static void main(String[] args) {
		Program2.display1();
		Program2 p= new Program2();
		p.display2();
		
	}
}
