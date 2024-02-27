package multi_threading.Calculator.ThreadClass;

public class Subtraction extends Thread {
	double x;
	double y;
	Subtraction(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public void run() {
		System.out.println("Subtraction result is : "+(x-y));
	}
}
