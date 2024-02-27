import java.util.Scanner;

public class JourneyCalculator {

	public static void main(String[] args) {
		JourneyCalculator journeycalc = new JourneyCalculator();
		Scanner scan= new Scanner(System.in);
		System.out.println("What is the Speed ? ");
		double speed =scan.nextDouble();
		System.out.println("What is the Time ? ");
		double time =scan.nextDouble();
		System.out.println("Distance is :"+journeycalc.calculateDistance(speed,time));
		
	}
	
	public double calculateDistance(double speed, double time) {
		return speed*time;
	}
}
