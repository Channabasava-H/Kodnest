package com.kodnest.polymorphism.example2;

public class Rectangle extends Shape{
	public void draw() {
		System.out.println("Rectangle drawing");
	}
	
	public double findArea() {
		return 5.0*3.0;
	}
}
