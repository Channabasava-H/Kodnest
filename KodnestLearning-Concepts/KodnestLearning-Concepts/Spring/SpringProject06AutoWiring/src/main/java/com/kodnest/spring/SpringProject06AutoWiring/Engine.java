package com.kodnest.spring.SpringProject06AutoWiring;

public class Engine {
	int eng_No;
	String eng_Type;
	public Engine() {
		super();
		
	}
	public Engine(int eng_No, String eng_Type) {
		super();
		this.eng_No = eng_No;
		this.eng_Type = eng_Type;
	}
	public int getEng_No() {
		return eng_No;
	}
	public void setEng_No(int eng_No) {
		this.eng_No = eng_No;
	}
	public String getEng_Type() {
		return eng_Type;
	}
	public void setEng_Type(String eng_Type) {
		this.eng_Type = eng_Type;
	}
	@Override
	public String toString() {
		return "Engine [eng_No=" + eng_No + ", eng_Type=" + eng_Type + "]";
	}
	
	
}
