package com.kodnest.spring.SpringProject05Wiring;

public class Person {
	
	private Mobile mbl;

	public Person() {
		super();
	}

	public Person(Mobile mbl) {
		super();
		this.mbl = mbl;
	}

	public Mobile getMbl() {
		return mbl;
	}

	public void setMbl(Mobile mbl) {
		this.mbl = mbl;
	}

	@Override
	public String toString() {
		return "Person [mbl=" + mbl + "]";
	}

	
	
	
}
