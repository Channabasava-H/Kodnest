import java.util.Scanner;

public class Main {
	public static void printTable(int num)

	{

		for(int i=1;i<=10;i++) {
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}

	public static void main(String[] args)

	{

		int num=new Scanner(System.in).nextInt();
		printTable(num);
	}
}
