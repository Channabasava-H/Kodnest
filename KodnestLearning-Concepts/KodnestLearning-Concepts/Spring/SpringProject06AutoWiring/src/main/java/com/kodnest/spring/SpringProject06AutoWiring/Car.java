package com.kodnest.spring.SpringProject06AutoWiring;

public class Car {
	Engine eng;

	public Car() {
		super();
		
	}

	public Car(Engine eng) {
		super();
		this.eng = eng;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Car [eng=" + eng + "]";
	}
	
}
