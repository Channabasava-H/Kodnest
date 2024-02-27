package P1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a NUmber : ");
		int n=scn.nextInt();
		System.out.println(PowerOfTwo.raisePowerOfTwo(n));
		scn.close();
	}

}
