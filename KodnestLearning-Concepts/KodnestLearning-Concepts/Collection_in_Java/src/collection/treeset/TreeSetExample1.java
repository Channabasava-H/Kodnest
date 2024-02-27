package collection.treeset;

import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(30);
		ts.add(20);
		ts.add(10);
		ts.add(40);
		System.out.println(ts);
		//[10, 20, 30, 40]
	}
}
