package collection.arraylist;

public class Student2 implements Comparable<Student2>{
	int roll_no;
	String name;
	float percentage;
	
	Student2(int roll_no, String name, float percentage){
		this.roll_no =roll_no;
		this.name=name;
		this.percentage=percentage;
	}
	
	
	
	@Override
	public String toString() {
		return roll_no+" "+name+" "+percentage;
	}



	@Override
	public int compareTo(Student2 o) {
		if(this.roll_no < o.roll_no) {
			return -1;
		}
		else if(this.roll_no > o.roll_no) {
			return 1;
		}
		else {
		return 0;
		}
	}
}
