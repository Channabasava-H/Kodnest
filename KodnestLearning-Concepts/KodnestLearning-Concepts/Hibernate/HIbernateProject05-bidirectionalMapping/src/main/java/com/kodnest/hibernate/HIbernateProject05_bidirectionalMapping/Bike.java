package com.kodnest.hibernate.HIbernateProject05_bidirectionalMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike {
	@Id
	int engNo;
	String brand;
	int cost;
	@OneToOne
	Person p;
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(int engNo, String brand, int cost, Person p) {
		super();
		this.engNo = engNo;
		this.brand = brand;
		this.cost = cost;
		this.p = p;
	}

	public int getEngNo() {
		return engNo;
	}

	public void setEngNo(int engNo) {
		this.engNo = engNo;
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

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Bike [engNo=" + engNo + ", brand=" + brand + ", cost=" + cost + ", p=" + p + "]";
	}

	
	
	
}
