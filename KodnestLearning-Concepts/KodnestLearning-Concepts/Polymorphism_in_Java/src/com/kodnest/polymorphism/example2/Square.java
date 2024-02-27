package com.kodnest.polymorphism.example2;

public class Square extends Shape{
	
	public void draw() {
		System.out.println("Square drawing");
	}
	
	public double findArea() {
		return 5.0*5.0;
	}
}
