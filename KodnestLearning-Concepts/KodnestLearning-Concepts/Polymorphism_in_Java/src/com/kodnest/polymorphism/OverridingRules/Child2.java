package com.kodnest.polymorphism.OverridingRules;

public class Child2 extends Parent {
	@Override
	void display() //Access modifier is decreasing visibility
	{ 
		System.out.println("Inside the Child class");
	}
}
