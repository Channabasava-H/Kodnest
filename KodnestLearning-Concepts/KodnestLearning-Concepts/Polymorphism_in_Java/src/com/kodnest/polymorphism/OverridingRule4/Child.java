package com.kodnest.polymorphism.OverridingRule4;

public class Child extends Parent{
	@Override
	public ElectronicDevice display() {
		System.out.println("Inside the Child class");
		return new ElectronicDevice();
	}
}
