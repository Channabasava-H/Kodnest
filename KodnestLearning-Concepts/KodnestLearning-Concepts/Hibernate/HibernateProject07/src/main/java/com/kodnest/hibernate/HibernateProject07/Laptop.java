package com.kodnest.hibernate.HibernateProject07;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int S_SrNo;
	private String L_Brand;
	@ManyToOne
	private Student st;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int s_SrNo, String l_Brand, Student st) {
		super();
		S_SrNo = s_SrNo;
		L_Brand = l_Brand;
		this.st = st;
	}

	public int getS_SrNo() {
		return S_SrNo;
	}

	public void setS_SrNo(int s_SrNo) {
		S_SrNo = s_SrNo;
	}

	public String getL_Brand() {
		return L_Brand;
	}

	public void setL_Brand(String l_Brand) {
		L_Brand = l_Brand;
	}

	public Student getSt() {
		return st;
	}

	public void setSt(Student st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "Laptop [S_SrNo=" + S_SrNo + ", L_Brand=" + L_Brand + ", st=" + st + "]";
	}
	
	
}
