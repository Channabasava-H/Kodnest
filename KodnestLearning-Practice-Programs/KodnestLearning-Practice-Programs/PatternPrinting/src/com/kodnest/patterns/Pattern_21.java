package com.kodnest.patterns;

public class Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=1;j<=5;j++) {
			for(int i=1;i<=5;i++) {
				if(j==1 || j==5 || i==1 || i==5) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
