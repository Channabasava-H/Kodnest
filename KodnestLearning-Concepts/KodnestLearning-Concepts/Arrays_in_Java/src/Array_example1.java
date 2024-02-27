import java.util.Scanner;

public class Array_example1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int marks[]=new int[3];
		for(int i=0;i<=marks.length-1;i++) {
			System.out.println("Enter Marks of Student : ");
			marks[i]=scn.nextInt();
		}
		scn.close();
		System.out.println("Student Marks are : ");
		for(int i=0;i<=marks.length-1;i++) {
			System.out.print(marks[i]+" ");
		}

	}

}
