package com.kodnest.patterns;

public class Pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int j=5;j>=1;j--) {
			for(int i=1;i<=5;i++) {
			System.out.print(" ");
			}
			for(int i=1;i<=j;i++) {
			System.out.print("*");
			}
			System.out.println();
		}
		for(int j=1;j<=5;j++) {
			for(int i=1;i<=5;i++) {
			System.out.print(" ");
			}
			for(int i=1;i<=j;i++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
