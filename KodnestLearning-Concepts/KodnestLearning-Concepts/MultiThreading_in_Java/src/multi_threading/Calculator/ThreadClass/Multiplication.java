package multi_threading.Calculator.ThreadClass;

public class Multiplication extends Thread {
	double x;
	double y;
	Multiplication(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public void run() {
		System.out.println("Multiplication result is : "+(x*y));
	}
}
