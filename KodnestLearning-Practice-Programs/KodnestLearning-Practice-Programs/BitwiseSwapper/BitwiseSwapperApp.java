import java.util.Scanner;

public class BitwiseSwapperApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int x=scan.nextInt();
		System.out.println("Enter the second integer: ");
		int y=scan.nextInt();
		BitwiseSwapper.swapUsingBitwise(x,y);
		scan.close();
	}

}
