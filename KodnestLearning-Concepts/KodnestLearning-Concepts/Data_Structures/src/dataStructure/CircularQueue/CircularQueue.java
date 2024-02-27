package dataStructure.CircularQueue;

import java.util.Scanner;

public class CircularQueue {
	
	int r=-1;
	int f=0;
	int count=-1;
	int cq[];
	int size;
	
	public CircularQueue(int n) {
		cq=new int[n];
		size=cq.length;
	}
	
	private Scanner scan = new Scanner(System.in);
	
	public void insert() {
		int elem;
		if(count==size)
		{
			System.out.println("insertion not possible");
		}
		
		else {
			System.out.println("Enter the element : ");
			elem=scan.nextInt();
			r=(r+1)%size;
			cq[r]=elem;
			count++;
		}
	}
	
	public void delete() {
		if(count==-1) {
			System.out.println("Queue is empty, deletion not possible");
		}
		else {
			System.out.println("Element deleted is : "+cq[f]);
			f=(f+1)%size;
			count--;
		}
	}
	
	public void display() {
		if(count==-1 || f<r) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i=f;i<=r;i++) {
				System.out.println(cq[i]+" ");
			}
			System.out.println();
		}
	}
}
	
