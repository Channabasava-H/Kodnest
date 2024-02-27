package com.kodnest.staticKeyword;

public class Professor {
	
	static String uniName ="CIT";	//Static variable
	static int totalProf = 0;	//Static variable
	int profId;			//Non-static variable
	String subject;		//Non-static variable
	
	static {			//static block
		System.out.println("Wlecome to "+uniName);
	}
	
	{	//non-static block
		totalProf +=1;
		profId = totalProf;
		System.out.println("Hiring a new Professor...");
	}
	
	public static int getTotalProf() {		//static method
		return totalProf;
	}
	
	public void teach() {		//Non-static method
		System.out.println("Professor ID : "+profId+
				" is teaching "+subject);
				
	}
	
	public Professor(String subject) {	//Constructor
		this.subject=subject;
	}

	public static void main(String[] args) {
		
		System.out.println("Total Professors at start: "+Professor.getTotalProf());
		System.out.println("----------------");
		Professor prof1=new Professor("Java");
		prof1.teach();
		Professor prof2=new Professor("SQL");
		prof2.teach();
		System.out.println("----------------");
		System.out.println("Total professor now :"+Professor.getTotalProf());
	}

}
