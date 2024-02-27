import java.util.Scanner;

public class Main {
	public static void calculateSum(int n)

	{
		int res=n;
		while(n-->0) {
			res=res+n;
		}
		System.out.println(res);
	}

	public static void main(String[] args)

	{
		int n=new Scanner(System.in).nextInt();
		calculateSum(n);
	}
}
