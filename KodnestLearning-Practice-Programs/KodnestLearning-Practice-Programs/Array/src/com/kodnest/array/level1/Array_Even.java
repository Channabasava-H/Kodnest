package com.kodnest.array.level1;

import java.util.Scanner;

public class Array_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the Elements : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		
		int even[]=new int[arr.length];
		int j=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				even[j]=arr[i];
				j++;
			}
		}
		
		System.out.println("Even numbers are : ");
		for(int i=0;i<=arr.length-1;i++) {
			if(even[i]!=0)
			System.out.print(even[i]+" ");
		}
		
	}

}
