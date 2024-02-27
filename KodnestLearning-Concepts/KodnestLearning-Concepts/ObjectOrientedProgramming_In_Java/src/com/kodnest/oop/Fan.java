package com.kodnest.oop;

public class Fan {
		int no_Of_Wings;
		String color;
		int cost;
		String brand;
		
		void rotate() {
			System.out.println(color+" color fan with "+no_Of_Wings+"wings, which cost is "+cost+" is roatating. The Brand is "+brand);
		}
		void blow_Air() {
			System.out.println(color+" color fan with "+no_Of_Wings+"wings, which cost is "+cost+" is blowing Air. The Brand is "+brand);
		}
}
