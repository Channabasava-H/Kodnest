package com.kodnest.spring.SpringProject07AutoWiring;

public class Professor {
	int prId;
	String prName;
	String prSubject;
	public Professor() {
		super();
		
	}
	public Professor(int prId, String prName, String prSubject) {
		super();
		this.prId = prId;
		this.prName = prName;
		this.prSubject = prSubject;
		System.out.println("Using Constructor.");
	}
	public int getPrId() {
		return prId;
	}
	public void setPrId(int prId) {
		this.prId = prId;
	}
	public String getPrName() {
		return prName;
	}
	public void setPrName(String prName) {
		this.prName = prName;
	}
	public String getPrSubject() {
		return prSubject;
	}
	public void setPrSubject(String prSubject) {
		this.prSubject = prSubject;
	}
	@Override
	public String toString() {
		return "Professor [prId=" + prId + ", prName=" + prName + ", prSubject=" + prSubject + "]";
	}
	
	
}
