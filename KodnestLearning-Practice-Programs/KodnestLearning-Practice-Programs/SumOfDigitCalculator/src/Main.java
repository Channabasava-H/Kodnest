import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=scn.nextInt();
		scn.close();
		sumOfDigit(n);
		
	}
	
	public static void sumOfDigit(int n) {
		int sum=0;
		while(n>=1) {
		sum=sum+(n%10);
		n=n/10;
		}
		System.out.println("Sum of the Digits is : "+sum);
		
	}
}
