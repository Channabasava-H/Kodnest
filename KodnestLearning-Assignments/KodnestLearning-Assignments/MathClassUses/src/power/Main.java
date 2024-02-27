package power;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=scn.nextInt();
		System.out.println("Enter the Power : ");
		int power=scn.nextInt();
		System.out.println(Math.pow(n, power));
		scn.close();
	}
	
}
