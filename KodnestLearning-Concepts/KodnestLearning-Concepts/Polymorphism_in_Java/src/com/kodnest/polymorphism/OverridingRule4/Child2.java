package com.kodnest.polymorphism.OverridingRule4;

public class Child2 extends Parent{
	@Override
	public Laptop display() { //different return type is allowed, bcz of co-variant return type
		System.out.println("Inside the Child 2 class");
		return new Laptop(); 
	}
}
