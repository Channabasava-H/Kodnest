package com.example.studcrud.entities;

public class Student {
	
	String KodId;
	String name;
	int age;
	public Student() {
		super();
		
	}
	public Student(String kodId, String name, int age) {
		super();
		KodId = kodId;
		this.name = name;
		this.age = age;
	}
	public String getKodId() {
		return KodId;
	}
	public void setKodId(String kodId) {
		KodId = kodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [KodId=" + KodId + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
