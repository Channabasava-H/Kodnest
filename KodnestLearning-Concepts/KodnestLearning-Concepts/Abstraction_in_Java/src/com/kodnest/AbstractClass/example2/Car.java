package com.kodnest.AbstractClass.example2;

abstract public class Car {
	void start()
	{
		System.out.println("Car Starting...");
	}
	
	void stop()
	{
		System.out.println("Car Stopped...");
	}
	
	abstract void refuel();
}
