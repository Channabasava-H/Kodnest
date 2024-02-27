import java.util.Scanner;

public class Array_example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		float height[]=new float [10];
		for(int  i=0;i<=height.length-1;i++) {
			System.out.println("Enter the Height of the Players : ");
			height[i]=scn.nextFloat();
		}
		scn.close();
		System.out.println("Players height are : ");
		for(int i=0;i<=height.length-1;i++) {
			System.out.println(height[i]);
		}
	}

}
