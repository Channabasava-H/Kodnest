package com.kodnest.inheritance.example1;

public class PaymentApp_Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment upi=new UPI();
		upi.bill();
		upi.offer();
		upi.pay();
		
		Payment wlt=new Wallet();
		wlt.bill();
		wlt.offer();
		wlt.pay();
		
		Payment crd=new Card();
		crd.bill();
		crd.offer();
		crd.pay();
		
		
	}

}
