package com.kodnest.polymorphism.OverridingRules;

public class Child3 extends Parent {
	@Override
	protected int display() //Error, because return type is changed
	{ 
		System.out.println("Inside the Child class");
	}
}
