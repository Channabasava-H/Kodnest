package com.kodnest.methods.types;

public class method_type2 {

	public static void main(String[] args) {
		int pakdo_isko = attendance();
		System.out.println("Complete your "+pakdo_isko+" missed class "
				+ "to seat in the microsoft placement drive.");
	}

	public static int attendance() {
		int total_class = 10;
		int attended = 8;
		int missed = total_class-attended;
		return missed;
	}
}
