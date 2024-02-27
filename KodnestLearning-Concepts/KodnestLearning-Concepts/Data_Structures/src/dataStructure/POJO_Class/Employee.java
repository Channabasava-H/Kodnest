package dataStructure.POJO_Class;

public class Employee {
		String name;
	public int age;
	private String gender;
	
	public Employee(){
		
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
