package com.kodnest.jdbc.example5;

public class Student {
	private int rollNo;
	private String name;
	private int marks;
	
	public Student(int rollNo,String name, int marks) {
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public int getmMarks() {
		return marks;
	}
}
