package multi_threading.Calculator.ThreadClass;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		Addition add=new Addition(num1,num2);
		Subtraction sub=new Subtraction(num1, num2);
		Multiplication mul=new Multiplication(num1, num2);
		Division div = new Division(num1, num2);
		
		add.start();
		sub.start();
		mul.start();
		div.start();
		
		
	}

}
