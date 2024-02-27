package com.kodnest.cc;
import java.util.Scanner;
//simple-if
public class Simple_If {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int marks=scan.nextInt();
		System.out.println("Welcome to Kodnest");
		condition(marks);
	}
	
	public static void condition(int m)
	{  
		if(m>=80)
		{
			System.out.println("Welcome to Cyber X Secure Club");
		}
	}

}
