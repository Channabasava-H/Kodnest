import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter an number : ");
		int n=scn.nextInt();
		scn.close();
		if(AmstrongNumber.calculateAmstrong(n)==n) {
			System.out.println("The number "+n+" is an Amstrong Number.");
		}
		else {
			System.out.println("The number "+n+" is not an Amstrong Number.");
		}
		
	}

}
