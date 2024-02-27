package com.kodnest.problems.ArrayRotate;

import java.util.Arrays;
import java.util.Scanner;

public class AntiClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("How many times you want to rotate : ");
		int n=scan.nextInt();
		scan.close();
		antiClockWiseRotate(arr, n);
		System.out.print("Array after rotating "+n+" time(s) anti-Clockwise : \n"+Arrays.toString(arr));
		
	}


	public static void antiClockWiseRotate(int[] arr, int n) {
		for(int count=1;count<=n;count++) {
			int temp=arr[0];
			for(int i=0;i<=arr.length-2;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
		}
		//return arr;
	}
}
