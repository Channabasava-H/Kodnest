package dataStructure.CircularQueue;

import java.util.Scanner;

public class CircularQueueApp {
	public static void main(String[] args) {
		try(Scanner scan=new Scanner(System.in)) {
			System.out.println("Enter the size of the Queue : ");
			int n=scan.nextInt();
			int choice;
			
			CircularQueue cq =new CircularQueue(n);
			
			while(true) {
				System.out.println("\n|--- Welcome to Circular Queue Data Structure ---|\n");
				System.out.println("|-----------------------|");
				System.out.println("| Press 1 ----> Insert  |");
				System.out.println("| Press 2 ----> Delete  |");
				System.out.println("| Press 3 ----> Display |");
				System.out.println("| Press 4 ----> Exit    |");
				System.out.println("|-----------------------|");
				
				choice=scan.nextInt();
				switch(choice) {
					case 1: cq.insert();
							break;
					case 2: cq.delete();
							break;
					case 3: cq.display();
							break;
					case 4: System.exit(0);
							break;
					default: System.out.println(" Invalid Input! ");
					
				}
			}
		
		}
		catch (Exception e) {
			System.out.println(" Invalid Input! ");
		}
	}
}
