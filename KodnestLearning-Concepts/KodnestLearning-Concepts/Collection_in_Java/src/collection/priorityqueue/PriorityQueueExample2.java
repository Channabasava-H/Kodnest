package collection.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueExample2 {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(40);
		pq.add(50);
		pq.add(10);
		pq.add("JAVA");
		pq.add(30.80F);
		pq.add(true);
		System.out.println(pq);
		//Exception - ClassCastException
	}
}
