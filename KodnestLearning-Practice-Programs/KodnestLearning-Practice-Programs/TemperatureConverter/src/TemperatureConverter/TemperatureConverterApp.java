package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Temerature in Fahrenheit : ");
		double f=scan.nextDouble();
		scan.close();
		System.out.println("Temperature in Celsius is : "+new TemperatureConverter().convertFahrenheitToCelsius(f));
		//TemperatureConverter temperatureConverter = new TemperatureConverter();
		//System.out.println("Temperature in Celsius is : "+temperatureConverter.convertFahrenheitToCelsius(f));
	}

}
