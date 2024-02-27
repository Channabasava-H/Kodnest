package multi_threading.producer_consumer;

public class FactoryApp {

	public static void main(String[] args) {
		Factory f=new Factory();
		Producer p=new Producer(f);
		Consumer c=new Consumer(f);
		
		p.start();
		c.start();
	}

}
