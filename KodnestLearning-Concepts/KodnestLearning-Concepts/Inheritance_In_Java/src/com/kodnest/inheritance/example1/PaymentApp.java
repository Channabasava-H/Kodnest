package com.kodnest.inheritance.example1;

public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UPI upi=new UPI();
		upi.bill();
		upi.offer();
		upi.pay();
		
		Wallet wlt=new Wallet();
		wlt.bill();
		wlt.offer();
		wlt.pay();
		
		Card crd=new Card();
		crd.bill();
		crd.offer();
		crd.pay();
		
		
	}

}
