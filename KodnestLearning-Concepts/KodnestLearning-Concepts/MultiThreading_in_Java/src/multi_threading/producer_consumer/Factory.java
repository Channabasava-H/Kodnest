package multi_threading.producer_consumer;

public class Factory {
	int x;
	boolean status=false;
	
	synchronized public void put(int a) {
		try {
			if(status == false) {
				x=a;
				System.out.println("Value stored in x is : "+x);
				status=true;
				notify();
			}
			else {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	synchronized public void get() {
		try {
			if(status == true) {
				System.out.println("Value got from x is : "+x);
				status=false;
				notify();
			}
			else {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
