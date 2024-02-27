package com.kodnest.methods.types;

public class method_type4 {

	public static void main(String[] args) {
		int referral = 3;
		int referral_discouont = 1000;
		int pakdna_hai_isko = kodnest_referral(referral,referral_discouont);
		System.out.println("You will get cashback of "+pakdna_hai_isko+" "
				+ "from Kodnest.");
	}

	public static int kodnest_referral(int a, int b) {
		int c = a*b;
		return c;
	}
}
