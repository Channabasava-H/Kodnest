package multi_threading.Calculator.ThreadClass;

public class Division extends Thread {
	double x;
	double y;
	Division(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public void run() {
		System.out.println("Division result is : "+(x/y));
	}
}
