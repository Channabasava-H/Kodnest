package com.kodnest.hibernate.HibernateProject02;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	int roll_no;
	String name;
	int marks;
	
	public Student() {
		super();
	}

	public Student(int roll_no, String name, int marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
