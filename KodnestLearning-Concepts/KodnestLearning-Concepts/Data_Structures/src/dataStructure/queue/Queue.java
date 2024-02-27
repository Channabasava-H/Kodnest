package dataStructure.queue;

import java.util.Scanner;

public class Queue {
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;
	
	public Queue(int n) {
		q=new int[n];
		size=q.length;
	}
	
	private Scanner scan= new Scanner(System.in);
	
	public void insert() {
		if(r==size-1) {
			System.out.println("Queue is full, Insertion not possible.");
		}
		else {
			System.out.println("Enter element : ");
			int elem =scan.nextInt();
			++r;
			q[r]=elem;
			System.out.println("Element inserted.");
		}
	}
	
	public void delete() {
		if(r==-1 || f>r) {
			System.out.println("Queue is empty, deletion not possible.");
		}
		else {
			System.out.println("Deleted element is : "+q[f]);
			f++;
		}
	}
	
	public void display() {
		if(r==-1 || f>r) {
			System.out.println("Queue is empty.");
		}
		else {
			for(int i=f;i<=r;i++)
			System.out.print(q[i]+" ");
		}
		System.out.println();
	}
}
