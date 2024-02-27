package com.kodnest.AbstractClass.example2;

public class CarApp {
	
	public static void doActivity(Car car) {
		car.start();
		car.stop();
		if(car instanceof ElectricCar) {
			((ElectricCar)car).refuel();
		}
		else if(car instanceof PetrolCar) {
			((PetrolCar)car).refuel();
		}
		else {
			((DieselCar)car).refuel();
		}
	}

	public static void main(String[] args) {
		
		Car car;
		
		car=new ElectricCar();
		doActivity(car);
		car=new PetrolCar();
		doActivity(car);
		car=new DieselCar();
		doActivity(car);
		
	}

	

}
