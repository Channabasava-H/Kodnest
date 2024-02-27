import java.util.Scanner;

public class LogicalOperatorValidatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is input valid (true/false): ");
		boolean x=scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false): ");
		boolean y=scan.nextBoolean();
		if(LogicalOperatorValidator.isValidInput(x,y)) {
			System.out.println("Input is Valid");
		}
		else {
			System.out.println("Input is Not Valid");
		}
		scan.close();
	}

}
