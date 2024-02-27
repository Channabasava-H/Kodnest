package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
public class StudentApp3 {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student st1= new Student(02,"Rahul",75.07F);
		Student st2= new Student(03, "Sanjib", 78.07F);
		Student st3= new Student(01, "Sangita", 82.09F);
		
		al.add(st1);
		al.add(st2);
		al.add(st3);
		
		System.out.println(al);
		SortingHelper sh= new SortingHelper();
		Collections.sort(al, sh);
		System.out.println(al);
	}
}
