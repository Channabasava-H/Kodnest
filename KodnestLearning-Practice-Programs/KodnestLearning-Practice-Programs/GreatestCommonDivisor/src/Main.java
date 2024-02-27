import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void findGCD(int a, int b) { // your code here 
		for(int i=Math.min(a,b);i>0;i--)
		{
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				break;
			}
		}
		
	} 
		
		public static void main(String[] args) { 
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter Two numbers :");
			int a=scn.nextInt();
			int b=scn.nextInt();
			findGCD(a, b); 
			scn.close();
	
	}

}
