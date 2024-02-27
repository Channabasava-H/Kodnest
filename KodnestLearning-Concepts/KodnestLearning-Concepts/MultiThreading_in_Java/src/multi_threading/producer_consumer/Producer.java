package multi_threading.producer_consumer;

public class Producer extends Thread{
	Factory f;
	
	public Producer(Factory f) {
		this.f=f;
	}
	
	public void run() {
		int i=1;
		while(true) {
			f.put(i++);
		}
	}
}
