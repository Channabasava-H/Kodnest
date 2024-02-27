package com.kodnest.polymorphism.example2;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape ref;
		
		ref=new Square();
		ref.draw();
		ref.findArea();
		ref=new Rectangle();
		ref.draw();
		ref.findArea();
		ref=new Circle();
		ref.draw();
		ref.findArea();
		
	}

}
