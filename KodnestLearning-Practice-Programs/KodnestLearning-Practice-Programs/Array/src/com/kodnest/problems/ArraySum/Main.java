package com.kodnest.problems.ArraySum;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Length of both arrays : ");
		int len=scan.nextInt();
		
		int arr[]=new int[len];
		int arr2[]=new int[len];
		int arrSum[]=new int[arr.length];
		
		System.out.println("Enter the elements of Array 1 : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		
		System.out.println("Enter the elements of Array 2 : ");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		
		//Sum of both arrays
		for(int i=0;i<=arrSum.length-1;i++) {
			arrSum[i]=arr[i]+arr2[i];
		}
		
		System.out.print("Sum of the both Arrays are : \n"+Arrays.toString(arrSum));
	}

}
