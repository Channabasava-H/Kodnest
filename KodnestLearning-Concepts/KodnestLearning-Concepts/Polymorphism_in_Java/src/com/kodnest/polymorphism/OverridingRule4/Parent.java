package com.kodnest.polymorphism.OverridingRule4;

public class Parent {
	public ElectronicDevice display() {
		System.out.println("Inside the Parent class");
		return new ElectronicDevice();
	}
}
