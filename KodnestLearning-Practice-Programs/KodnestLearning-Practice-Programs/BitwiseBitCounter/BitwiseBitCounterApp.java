import java.util.Scanner;

public class BitwiseBitCounterApp {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int x=scn.nextInt();
		scn.close();
		System.out.println("Number of set bits: "+BitwiseBitCounter.countSetBits(x));
	}

}
