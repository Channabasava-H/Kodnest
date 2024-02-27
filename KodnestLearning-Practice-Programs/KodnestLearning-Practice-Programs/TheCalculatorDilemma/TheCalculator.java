import java.util.Scanner;

public class TheCalculator {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int X=scn.nextInt();
		int Y=scn.nextInt();
		calculate(X,Y);
		scn.close();
	}
	
	public static void calculate(int X, int Y) {
		System.out.println("Select Operation : \n 1)Addition, 2)Subtraction, 3)Multiplication, 4)Division");
		switch(new Scanner(System.in).nextInt()){
		case 1:
			System.out.println("Sum of the given numbers : "+(X+Y));
			break;
		case 2:
			System.out.println("Subtraction of the given numbers : "+(X-Y));
			break;
		case 3:
			System.out.println("Multiplication of the given numbers : "+(X*Y));
			break;
		case 4:
			System.out.println("Divison of the given numbers :"+(X/Y));
			break;
		default:
			System.out.println("Error! ... Select a valid operation");
		}
	}
}
