package collection.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueExample3 {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add("HTML");
		pq.add("CSS");
		pq.add("SQL");
		pq.add("JAVA");
		System.out.println(pq);
		//[CSS, HTML, SQL, JAVA]
	}
}
