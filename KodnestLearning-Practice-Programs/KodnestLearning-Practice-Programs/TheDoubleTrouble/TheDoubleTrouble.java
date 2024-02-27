import java.util.Scanner;

public class TheDoubleTrouble {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number to be doubled :");
		int num=scan.nextInt();
		System.out.println("Doubled number is :"+doubleTheNumber(num));
	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}
}
