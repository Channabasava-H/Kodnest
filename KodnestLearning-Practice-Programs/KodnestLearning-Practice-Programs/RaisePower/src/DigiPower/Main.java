package DigiPower;
import P2.PowerOfN;
import CountDigit.CountDigit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=scn.nextInt();
		int digit=CountDigit.countDigit(num);
		System.out.println(PowerOfN.raisePowerOfN(num, digit));
		scn.close();
	}

}
