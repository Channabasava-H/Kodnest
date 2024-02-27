package multi_threading.RunnableInterface;

public class ProgramApp {

	public static void main(String[] args) {
		
		Program p1=new Program();
		Program p2=new Program();
		Thread t1= new Thread(p1);
		Thread t2= new Thread(p2);
		t1.setName("Number");
		t2.setName("Char");
		t1.start();
		t2.start();
	}

}
