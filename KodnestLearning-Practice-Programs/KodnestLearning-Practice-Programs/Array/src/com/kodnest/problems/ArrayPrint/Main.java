package com.kodnest.problems.ArrayPrint;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter the elements : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		
		PrintArray.printArray(arr);
	}

}
