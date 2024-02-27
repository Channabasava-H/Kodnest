//Write a Java Program to take name as input from keyboard 
//and greet the person with his name printed along with greeting message.
//
//Note:
//
//Greeting is a task...So ...Keep The Task In a Separate Method and 
//let the method be of type- “ Type-3 “ 
//I,e Method which accept the parameter and would not return the value.
//
//Sample Output:
//
//Hello Omkar ...How Are You ..
package com.kodnest.methods;


import java.util.Scanner;

public class method_calling_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name ? .. ");
		String name = scan.nextLine();
		scan.close();
		greet(name);
		
	}
	
	public static void greet(String _name) {
		System.out.println("Hello "+_name+" ...How are you ..");
	}
}
