package com.kodnest.methods;
import java.util.Scanner;

public class method_calling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name ? ");
		String name = scan.nextLine();
		System.out.println("What is your birth year ? ");
		int year = scan.nextInt();
		scan.close();
		greet(name);
		int res=age(year);
		System.out.println("Your age is "+res);

	}
	public static void greet(String _name) {
		System.out.println("Hello "+_name);
	}
	
	public static int age(int x)
	{
		return 2023-x;
	}

}
