import java.util.Scanner;

public class Main {

	public static void printFibonacciSeries(int n)

	{
	int num1=0;
	int num2=1;
	int nextNum=0;
	if(n==1) {
		System.out.println(num1);
	}
	else if(n==2) {
		System.out.println(num1+" "+num2);
	}
	else {
		System.out.print(num1+" "+num2);
		for(int i=3;i<=n;i++) {
			nextNum=num1+num2;
			num1=num2;
			num2=nextNum;
			System.out.print(" "+nextNum);
		}
	}
	}

	public static void main(String[] args)

	{
	System.out.println("Enter a number : ");
	int n=new Scanner(System.in).nextInt();
	printFibonacciSeries(n);

	}

}
