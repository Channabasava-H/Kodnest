package dataStructure.stack;

import java.util.Scanner;

public class Stack {
	private int top;
	private int size;
	private int data[];
	
	public Stack(int n) {
		data=new int[n];
		size=data.length;
		top=-1;
	}
	
	private Scanner scan=new Scanner(System.in);
	
	public void push() {
		
		if(top==size-1) {
			System.out.println("Stack is full.");
		}
		else {
			System.out.println("Enter an Element to Push : ");
			int element =scan.nextInt();
			++top;
			data[top]=element;
		}
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is empty.");
		}
		else {
			System.out.println("Deleted element is : "+data[top]);
			top--;
		}
	}
	
	public void display() {
		if(top==-1) {
			System.out.println("Stack is empty.");
		}
		else {
			System.out.println("Elements of the stack are :");
			for(int i=top;i>=0;i--) {
				System.out.println(data[i]);
			}
		}
	}
	
}
