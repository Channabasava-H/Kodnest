package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
public class StudentApp2 {

	public static void main(String[] args) {
		ArrayList<Student2> al=new ArrayList<Student2>();
		
		Student2 st1= new Student2(01,"Rahul",75.07F);
		Student2 st2= new Student2(03, "Sanjib", 78.07F);
		Student2 st3= new Student2(02, "Sangita", 82.09F);
		
		al.add(st1);
		al.add(st2);
		al.add(st3);
		
		System.out.println(al); 
		//System.out.println(al.toString());
		Collections.sort(al);
		//sor() internally calls the compare() present in the Student class
		System.out.println(al);
	}
}
