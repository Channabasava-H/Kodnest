package com.kodnest.recursion.level1;

import java.util.Scanner;

public class GCDAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int m=scan.nextInt();
		int n=scan.nextInt();
		scan.close();
		GCD theGcd=new GCD();
		int res=theGcd.findGcd(m, n);
		System.out.println("GCD is : "+res);
		

	}

}
