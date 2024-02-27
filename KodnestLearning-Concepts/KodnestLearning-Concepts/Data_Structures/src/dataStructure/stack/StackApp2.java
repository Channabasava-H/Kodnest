package dataStructure.stack;

import java.util.Scanner;

public class StackApp2 {
	public static void main(String[] args) {
		int choice;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the Size of the Stack : ");
			int n=scan.nextInt();
			
			Stack stack=new Stack(n);
			
			while(true) {
				System.out.println("\n|--- Welcome to Stack Data Structure ---|\n");
				System.out.println("|-----------------------|");
				System.out.println("| Press 1 ----> Push    |");
				System.out.println("| Press 2 ----> Pop     |");
				System.out.println("| Press 3 ----> Display |");
				System.out.println("| Press 4 ----> Exit    |");
				System.out.println("|-----------------------|");
				
				try {
					choice=scan.nextInt();
					switch(choice) {
						case 1: stack.push();
								break;
						case 2: stack.pop();
								break;
						case 3: stack.display();
								break;
						case 4: System.exit(0);
								break;
						default: System.out.println(" Invalid Input! ");
						
					}
				} catch (Exception e) {
					System.out.println(" Invalid Input ");
					//break;
					//Why it is running on infinite loop
				}
				
			}
		}
	}
}

