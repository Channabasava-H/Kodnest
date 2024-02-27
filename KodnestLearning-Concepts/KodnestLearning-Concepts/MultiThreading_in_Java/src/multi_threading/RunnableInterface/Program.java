package multi_threading.RunnableInterface;

public class Program implements Runnable{
	public void run() {
		if(Thread.currentThread().getName().equals("Number")) {
			numPrinting();
		}
		else {
			charPrinting();
		}
	}
	
	public void numPrinting() {
		System.out.println("Number Printin Started");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number printing ended");
	}
	
	public void charPrinting() {
		System.out.println("Character Printin Started");
		for(char i='A';i<='E';i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character printing ended");
	}
}
