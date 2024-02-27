package collection.arraylist;

import java.util.ArrayList;
public class StudentApp {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		Student st1= new Student(01,"Rahul",75.07F);
		Student st2= new Student(02, "Sanjib", 78.07F);
		Student st3= new Student(03, "Sangita", 82.09F);
		
		al.add(st1);
		al.add(st2);
		al.add(st3);
		
		System.out.println(al);
	}
}
