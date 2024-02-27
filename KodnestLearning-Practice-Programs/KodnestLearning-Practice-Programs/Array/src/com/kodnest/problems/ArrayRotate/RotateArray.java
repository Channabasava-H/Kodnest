package com.kodnest.problems.ArrayRotate;

public class RotateArray {
	
	public static void rotateArray(int arr[],int n) {
		//Clockwise
		for(int k=1;k<=n;k++) {
			int temp=arr[arr.length-1];
			for(int i=arr.length-2;i>=0;i--) {
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
		}
	}
	
	public static void rotateArray(int n,int[] arr) {
		//Anti-clockwise
		for(int k=1;k<=n;k++) {
			int temp=arr[0];
			for(int i=1;i<=arr.length-1;i++) {
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
		}
	}

}
