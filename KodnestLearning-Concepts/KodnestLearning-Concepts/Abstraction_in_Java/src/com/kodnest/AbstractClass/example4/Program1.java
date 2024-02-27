package com.kodnest.AbstractClass.example4;

abstract class Program1 {
	static int x,y;		//static variable
	static {			//static block
		x=10;
		y=20;
	}
	
	static void display1() 		//static method
	{
		System.out.println(x+" "+y);
	}
	int a=11, b=12; //non-static variable
	{				//non-static block
		System.out.println("Non-static block");
	}
	void display2()			//Non-static concrete method
	{
		System.out.println(a+" "+b);
	}
	abstract void display3();
	public static abstract void display4(); 
	//cannot have static-abstract method
	Program1()			//Constructor
	{
		System.out.println("inside Constructor");
	}

	public static void main(String[] args) {  //main method
		Program1.display1();
		Program1 p1=new Program1();
		//Cannot create the object of abstract class
		p1.display2();
		
	}

}
