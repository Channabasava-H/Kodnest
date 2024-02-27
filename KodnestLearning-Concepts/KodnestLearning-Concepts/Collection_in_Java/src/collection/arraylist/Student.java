package collection.arraylist;

public class Student extends Object{
	int roll_no;
	String name;
	float percentage;
	
	Student(int roll_no, String name, float percentage){
		this.roll_no =roll_no;
		this.name=name;
		this.percentage=percentage;
	}
	
	@Override
	public String toString() {
		return roll_no+" "+name+" "+percentage;
	}
}
