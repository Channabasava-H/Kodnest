import java.util.Scanner;

public class Main {
	public static void calculateFactorial(int n)

	{
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac=fac*i;
		}
		System.out.println(fac);
	}

	public static void main(String[] args)

	{

	int n=new Scanner(System.in).nextInt();
	calculateFactorial(n);

	}
}
