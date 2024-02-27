package dataStructure.POJO_Class;

import java.io.Serializable;

public class EmployeeBEANClass implements Serializable {
	private String name;
	private int age;
	private String gender;
	
	public EmployeeBEANClass(){
		//Compulsory
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
}
