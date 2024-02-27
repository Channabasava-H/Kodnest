package collection.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueExample01 {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(40);
		pq.add(50);
		pq.add(10);
		pq.add(20);
		pq.add(30);
		System.out.println(pq);
		//[10, 20, 40, 50, 30]
	}
}
