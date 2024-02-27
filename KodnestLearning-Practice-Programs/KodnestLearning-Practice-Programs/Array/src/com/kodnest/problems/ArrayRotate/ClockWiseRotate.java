package com.kodnest.problems.ArrayRotate;
import java.util.Arrays;
import java.util.Scanner;

public class ClockWiseRotate {

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
		int k=scan.nextInt();
		scan.close();
		
		for(int i=1;i<=k;i++) {
			int temp=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
					arr[j]=arr[j-1];
				}
				arr[0]=temp;
		}
		
		System.out.print("Array after rotating "+k+" time(s) : \n"+Arrays.toString(arr));
		
	}

}
