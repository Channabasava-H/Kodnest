package com.kodnest.problems.ArraySwap;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter thr array length : ");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter the elements : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter 2 index values which you want to swap : ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		scan.close();
		
		System.out.println("Before Swapping : "+Arrays.toString(arr));
		
		int temp=arr[x];
		for(int i=0;i<=arr.length-1;i++) {
			if(i==y) {
			arr[x]=arr[i];
			arr[i]=temp;
			}
		}
		
		System.out.print("After Swapping : "+Arrays.toString(arr));
	}

}
