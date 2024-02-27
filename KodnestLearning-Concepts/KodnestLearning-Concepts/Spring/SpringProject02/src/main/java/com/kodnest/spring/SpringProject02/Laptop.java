package com.kodnest.spring.SpringProject02;

public class Laptop {
	
	private int srNo;
	private String brand;
	private int cost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int srNo, String brand, int cost) {
		super();
		this.srNo = srNo;
		this.brand = brand;
		this.cost = cost;
	}
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
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
	@Override
	public String toString() {
		return "Laptop [srNo=" + srNo + ", brand=" + brand + ", cost=" + cost + "]";
	}
	
	
	
}
