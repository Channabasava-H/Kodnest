package com.kodnest.spring.SpringProject05Wiring;

public class Mobile {
	
	private String brand;
	private int cost;
	private int RAMsize;
	public Mobile() {
		super();
	}
	public Mobile(String brand, int cost, int rAMsize) {
		super();
		this.brand = brand;
		this.cost = cost;
		RAMsize = rAMsize;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRAMsize() {
		return RAMsize;
	}
	public void setRAMsize(int rAMsize) {
		RAMsize = rAMsize;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", cost=" + cost + ", RAMsize=" + RAMsize + "]";
	}
	
	
}
