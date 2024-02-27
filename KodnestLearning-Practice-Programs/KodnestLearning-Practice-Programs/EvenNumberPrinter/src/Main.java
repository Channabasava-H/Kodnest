import java.util.Scanner;

public class Main {
	public static void printEvenNumbers(int n)

	{

		 do{
			if(n%2==0) {
				System.out.print(n+" ");
			}
		 }while(n-->=1);

	}
	public static void main(String[] args)

	{

	int n=new Scanner(System.in).nextInt();
	printEvenNumbers(n);

	}
}
