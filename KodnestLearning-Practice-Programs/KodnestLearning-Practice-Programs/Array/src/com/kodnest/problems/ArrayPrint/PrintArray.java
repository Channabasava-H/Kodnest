package com.kodnest.problems.ArrayPrint;

public class PrintArray {
	public static void printArray(int arr[]) {
		System.out.print("Array is : [ ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ]");
		
		System.out.print("Reversed Array is : [ ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ]");
	}
}
