package com.kodnest.recursion.level1;

import java.util.Scanner;

public class FactorialApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a numbers :");
		int n=scan.nextInt();
		scan.close();
		Factorial theFactorial=new Factorial();
		int res=theFactorial.fact(n);
		System.out.println("Factorial is : "+res);
	}
}
