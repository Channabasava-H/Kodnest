package com.kodnest.polymorphism.exampleShape;

public class Square extends Shape{
	@Override
	public double findArea() {
		return 40.22;
	}
	
	public double findSquarePerimeter() {
		
		return 4.00*4.00;
	}
}
