import java.util.Scanner;

public class DiscountApplicability {

	public static void checkDiscount(double purchaseAmount)

	{

	if(purchaseAmount>100) {
		System.out.println("Discount Applicable");
	}
	else {
		System.out.println("Discount Not Applicable");	
		}

	}

	public static void main(String[] args)

	{
	System.out.println("Enter the AMOUNT");
	double purchaseAmount=new Scanner(System.in).nextInt();
	checkDiscount(purchaseAmount);
	}

}
