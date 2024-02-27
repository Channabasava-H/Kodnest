package multi_threading.Calculator.ThreadClass;

public class Addition extends Thread{
	double x;
	double y;
	Addition(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public void run() {
		System.out.println("Addition result is : "+(x+y));
	}
}
