package com.kodnest.spring.SpringProject01;

public class Student {
	private int roll_no;
	private String Name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll_no, String name, int age) {
		super();
		this.roll_no = roll_no;
		Name = name;
		this.age = age;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", Name=" + Name + ", age=" + age + "]";
	}
	
	
}
