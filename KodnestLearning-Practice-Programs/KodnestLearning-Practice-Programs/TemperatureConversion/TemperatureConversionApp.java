import java.util.Scanner;

public class TemperatureConversionApp {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		double temp;
		System.out.println("----- Welcome to the Temperature Conversion Tool! -----\n\n");
		System.out.println("Select an Option : "+"\n"
				+ "1. Convert Celsius to Fahrenheit"
				+ "\n"
				+ "2. Convert Fahrenheit to Celsius"
				+ "\n\n"
				+ "Enter your choice : ");
		switch(scn.nextInt()) {
			case 1:
				System.out.println("Enter the temperature in Celsius :");
				temp=scn.nextDouble();
				System.out.println(temp+"°C is equivalent to "+TemperatureConvert.celsiusToFahrenheit(temp)+"°F");
				break;
			case 2:
				System.out.println("Enter the temperature in Fahrenheit :");
				temp=scn.nextDouble();
				System.out.println(temp+"°F is equivalent to "+TemperatureConvert.fahrenheitToCelsius(temp)+"°C");
				break;
			default:
				System.out.println("Error! ... Select a valid option");
		}
		scn.close();
	}
}
