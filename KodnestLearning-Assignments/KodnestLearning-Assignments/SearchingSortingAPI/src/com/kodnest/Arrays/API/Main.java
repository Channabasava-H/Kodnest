package com.kodnest.Arrays.API;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();		
		}
		
		System.out.println("Array elements before sorting : ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		KodNestSearchSort api=new KodNestSearchSort();
		
		while(true) {
			System.out.println("\n:: Main Menu ::");
			System.out.println("===============");
			System.out.println("Press 1 ---> Searching");
			System.out.println("Press 2 ---> Sorting");
			System.out.println("Press 3 ---> Finding Minimum or Maximum");
			System.out.println("Press anykey ---> Exit");
			System.out.println("===============\n");
			System.out.println("Enter your choice... ");
			
			int choice=scan.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Press 1 ---> Linear Search");
					System.out.println("Press 2 ---> Binary Search");
					int choice1=scan.nextInt();
					if(choice1==1) {
						System.out.println("Enter the key to search : ");
						int key=scan.nextInt();
						int res=api.linearSearch(arr, key);
						if(res>=0)
							System.out.println("Key found at "+res+" index");
						else
							System.out.println("Key not found!");
					}
					
					else if(choice1==2) {
						System.out.println("Enter the key to search : ");
						int key=scan.nextInt();
						int res=api.binarySearch(arr, key);
						if(res>=0)
							System.out.println("Key found at "+res+" index");
						else
							System.out.println("Key not found!");
					}
					else {
						System.out.println("Invalid Choice!");
						return;
					}
					break;
					
				case 2:
					System.out.println("Press 1 ---> Bubble Sort");
					System.out.println("Press 2 ---> Selection Sort");
					System.out.println("Press 3 ---> Insertion Sort");
					int choice2=scan.nextInt();
					if(choice2==1) {
						System.out.println("Press 1 ---> Ascending Sort");
						System.out.println("Press 2 ---> Descending Sort");
						int choice3=scan.nextInt();
						if(choice3==1) {
							api.bubbleSortAscending(arr);
							System.out.println("Sorted in Ascending order : "+Arrays.toString(arr));
						}
						else if(choice3==2) {
							api.bubbleSortDescending(arr);
							System.out.println("Sorted in Descending order : "+Arrays.toString(arr));
						}
						else {
							System.out.println("Invalid Choice!");
						}
					}
					else if(choice2==2) {
						System.out.println("Press 1 ---> Ascending Sort");
						System.out.println("Press 2 ---> Descending Sort");
						int choice3=scan.nextInt();
						if(choice3==1) {
							api.selectionSortAscending(arr);
							System.out.println("Sorted in Ascending order : "+Arrays.toString(arr));
						}
						else if(choice3==2) {
							api.selectionSortDescending(arr);
							System.out.println("Sorted in Descending order : "+Arrays.toString(arr));
						}
						else {
							System.out.println("Invalid Choice!");
						}
					}
					else if(choice2==3) {
						System.out.println("Press 1 ---> Ascending Sort");
						System.out.println("Press 2 ---> Descending Sort");
						int choice3=scan.nextInt();
						if(choice3==1) {
							api.insertionSortAscending(arr);
							System.out.println("Sorted in Ascending order : "+Arrays.toString(arr));
						}
						else if(choice3==2) {
							api.insertionSortDescending(arr);
							System.out.println("Sorted in Descending order : "+Arrays.toString(arr));
						}
						else {
							System.out.println("Invalid Choice!");
						
						}
					}
					else {
						System.out.println("Invalid Choice!");
						return;
					}
					break;
					
				case 3:
					System.out.println("Press 1 ---> Minimum");
					System.out.println("Press 2 ---> Maximum");
					int choice4=scan.nextInt();
					if(choice4==1) {
						System.out.println("Minimum element is : "+api.findMinimum(arr));
					}
					else if(choice4==2) {
						System.out.println("Maximum element is : "+api.findMax(arr));
					}
					else {
						System.out.println("Invalid Choice!");
						return;
					}
					break;
					
				default:
					System.out.println("Thank you, Bye bye!");
					return;
			}
			
		}	
	}

}
