import java.util.Scanner;

public class TaxCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount : ");
		double purchseAmount=scan.nextDouble();
		System.out.println("Enter the tax amount(in decimal form) : ");
		double tax=scan.nextDouble();
		System.out.println("Total cost including tax: "+TaxCalculator.calculateTotalWithTax(purchseAmount,tax));
		scan.close();
	}

}
