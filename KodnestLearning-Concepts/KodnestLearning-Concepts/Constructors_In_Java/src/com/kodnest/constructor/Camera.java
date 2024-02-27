package com.kodnest.constructor;

public class Camera {
	String color;
	String brand;
	int cost;
	
	void captureImage() { 
		System.out.println("Image Captured....");
	}
	
	void displayImage() { 
		System.out.println("Camera is Displaying Image");
	}
	
	public Camera(String x, String y, int z) { //Constructor
		color=x;
		brand=y;
		cost=z;
	}
}
