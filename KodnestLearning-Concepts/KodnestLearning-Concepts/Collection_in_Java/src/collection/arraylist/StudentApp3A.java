package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class StudentApp3A {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student st1= new Student(02,"Rahul",75.07F);
		Student st2= new Student(03, "Sanjib", 78.07F);
		Student st3= new Student(01, "Sangita", 82.09F);
		
		al.add(st1);
		al.add(st2);
		al.add(st3);
		
		System.out.println(al);
		Collections.sort(al, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.roll_no < o2.roll_no) {
					return -1;
				}
				else if(o1.roll_no > o2.roll_no) {
					return 1;
				}
				else {
					return 0;
				}
			}
			
		});
		System.out.println(al);
	}
}
