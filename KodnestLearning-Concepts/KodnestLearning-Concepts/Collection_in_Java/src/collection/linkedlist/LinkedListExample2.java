package collection.linkedlist;
import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll); //[10, 20, 30, 40, 50]
		ll.add(2,99);
		System.out.print(ll); //[10, 20, 99, 30, 40, 50]
	}
}