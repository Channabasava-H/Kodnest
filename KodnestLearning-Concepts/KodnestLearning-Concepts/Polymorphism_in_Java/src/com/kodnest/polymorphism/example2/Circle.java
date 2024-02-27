package com.kodnest.polymorphism.example2;

public class Circle extends Shape{
	public void draw() {
		System.out.println("Circle drawing");
	}
	
	public double findArea(double r) {
		return Math.PI*5.0*5.0;
	}
}
