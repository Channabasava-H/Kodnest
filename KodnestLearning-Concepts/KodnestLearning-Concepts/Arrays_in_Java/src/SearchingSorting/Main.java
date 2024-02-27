package SearchingSorting;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the Array : ");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter Elements : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Elements before sorting : ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//BubbleSorting bsort= new BubbleSorting();
		//bsort.bubbleSort(arr);
		
		//SelectionSort.selectionSort(arr);
		
		InsertionSort.insertionSort(arr);
		
		System.out.println("Elements after sorting : ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
