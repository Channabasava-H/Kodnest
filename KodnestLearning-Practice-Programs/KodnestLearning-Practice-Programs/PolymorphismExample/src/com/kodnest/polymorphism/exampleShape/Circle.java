package com.kodnest.polymorphism.exampleShape;

public class Circle extends Shape {
	
	@Override
	public double findArea() {
		return 20.01;
	}
	
	public double findCirclePerimeter() {
		
		return 2*Math.PI*20.00;
	}
}
