import java.util.Scanner;

public class Main {
	
	public static void findFibonacci(int n) {
		int num1=0;
		int num2=1;
		int nextNum=0;
		int count=2;
		if(n==1) {
			System.out.println(num1);
		}
		else if(n==2) {
			System.out.println(num2);
		}
		else {
		while(count++<=n) {
			nextNum=num1+num2;
			num1=num2;
			num2=nextNum;
		}
		System.out.print(nextNum);
		}
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the position : ");
		int n=scn.nextInt();
		scn.close();
		findFibonacci(n);
	}

}
