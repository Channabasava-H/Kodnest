package P3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=scn.nextInt();
		int digit=PowerOfDigit.countDigit(n);
		System.out.println(PowerOfDigit.powerOfDigit(n,digit));
		scn.close();
	}

}
