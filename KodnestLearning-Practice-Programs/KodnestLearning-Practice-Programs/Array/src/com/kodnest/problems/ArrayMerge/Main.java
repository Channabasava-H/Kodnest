package com.kodnest.problems.ArrayMerge;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter thr length of the array 1 :");
		int len=scan.nextInt();
		System.out.println("Enter thr length of the array 2 :");
		int len2=scan.nextInt();
		int arr[]=new int[len];
		int arr2[]=new int[len2];
		int arrMer[]=new int[arr.length+arr2.length];
		
		System.out.println("Enter the elements of array 1 : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the elements of array 2 : ");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		
		
		System.arraycopy(arr,0,arrMer,0,arr.length);
		System.arraycopy(arr2,0,arrMer,arr.length,arr2.length);
		
		System.out.println("Merged Array is : \n"+Arrays.toString(arrMer));
		
		scan.close();
	}

}
