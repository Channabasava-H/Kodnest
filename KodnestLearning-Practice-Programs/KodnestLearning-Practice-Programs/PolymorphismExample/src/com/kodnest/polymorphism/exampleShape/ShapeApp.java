package com.kodnest.polymorphism.exampleShape;

public class ShapeApp {
	
	public static void doActivity(Shape sh) {
		sh.draw();
		System.out.println(sh.findArea());
		if(sh instanceof Square) 
		{
		System.out.println(((Square)(sh)).findSquarePerimeter());
		}
		else if(sh instanceof Circle)
		{
		System.out.println(((Circle)(sh)).findCirclePerimeter());
		}
		else 
		{
		System.out.println(((Rectangle)sh).findRectanglePerimeter());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh;
		System.out.println("Square-------");
		sh=new Square();
		doActivity(sh);
		
		System.out.println("Circle-------");
		sh=new Circle();
		doActivity(sh);
		
		System.out.println("Rectangle-------");
		sh=new Rectangle();
		doActivity(sh);
			

	}

}
