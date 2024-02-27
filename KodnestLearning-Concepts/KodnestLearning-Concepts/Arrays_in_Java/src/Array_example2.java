import java.util.Scanner;

public class Array_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String names[]=new String [8];
		for(int  i=0;i<=names.length-1;i++) {
			System.out.println("Enter the Name of the Employee : ");
			names[i]=scn.nextLine();
		}
		scn.close();
		System.out.println("Empoyee Names are : ");
		for(int i=0;i<=names.length-1;i++) {
			System.out.println(names[i]);
		}
	}

}
