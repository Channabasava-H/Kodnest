package dataStructure.queue;

import java.util.Scanner;

public class QueueApp {
	public static void main(String[] args) {
		try(Scanner scan=new Scanner(System.in)) {
			System.out.println("Enter the size of the Queue : ");
			int n=scan.nextInt();
			int choice;
			
			Queue queue=new Queue(n);
			
			while(true) {
				System.out.println("\n|--- Welcome to Queue Data Structure ---|\n");
				System.out.println("|-----------------------|");
				System.out.println("| Press 1 ----> Insert  |");
				System.out.println("| Press 2 ----> Delete  |");
				System.out.println("| Press 3 ----> Display |");
				System.out.println("| Press 4 ----> Exit    |");
				System.out.println("|-----------------------|");
				
				choice=scan.nextInt();
				switch(choice) {
					case 1: queue.insert();
							break;
					case 2: queue.delete();
							break;
					case 3: queue.display();
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
