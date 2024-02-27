package com.kodnest.userinput;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student First Name");
		String fname = scan.next();
		System.out.println("First Name is : "+fname);
		System.out.println("Enter Student Last Name");
		String lname = scan.next();
		System.out.println("Last Name is : "+lname);
		System.out.println("Enter Student Age ");
		int age=scan.nextInt();
		System.out.println("Age is "+age);
		System.out.println("Enter Student Gender ");
		String gender=scan.next();
		System.out.println("Gender is "+gender);
		System.out.println("Is Student Married ? say True or False ");
		boolean married =scan.nextBoolean();
		System.out.println("Married Status "+married);
		System.out.println("Enter Student Branch ");
		scan.nextLine();
		String bnc = scan.nextLine();
		System.out.println("Branch : "+bnc);
		System.out.println("Enter Student Height ");
		float hght = scan.nextFloat();
		System.out.println("Height is : "+hght);
		System.out.println("Enter Student Weight ");
		float wght = scan.nextFloat();
		System.out.println("Height is : "+wght);
		scan.close();
	}
}
