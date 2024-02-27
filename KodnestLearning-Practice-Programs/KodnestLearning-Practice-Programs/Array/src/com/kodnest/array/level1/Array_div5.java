package com.kodnest.array.level1;

import java.util.Scanner;

public class Array_div5 {

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
		
		int div5[]=new int[arr.length];
		int j=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%5==0) {
				div5[j]=arr[i];
				j++;
			}
		}
		
		System.out.println("Numbers which divisible by 5 are : ");
		for(int i=0;i<=div5.length-1;i++) {
			if(div5[i]!=0) {
				System.out.print(div5[i]+" ");
			}
		}
	}

}
