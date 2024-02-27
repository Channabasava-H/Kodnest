package com.kodnest.polymorphism.OverridingRules;

public class Child extends Parent{
	@Override
	protected void display() {
		System.out.println("Inside the Child class");
	}
}
