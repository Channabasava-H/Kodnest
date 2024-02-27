package collection.arraylist;

import java.util.Comparator;

public class SortingHelper implements Comparator<Student>{
	
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
}
