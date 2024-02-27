package P2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int N=scn.nextInt();
		System.out.println("Enter the power : ");
		int n=scn.nextInt();
		System.out.println(PowerOfN.raisePowerOfN(N,n));
		scn.close();
	}

}
