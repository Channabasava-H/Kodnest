package Array_2D;

import java.util.Scanner;

public class TwoDArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of 2D Array. : ");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int arr[][]=new int[m][n];
		int arr2[][]=new int[m][n];
		int sum[][]=new int[m][n];
		
		System.out.println("Enter the elements for Array 1 : ");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Enter the elements for Array 2 : ");
		for(int i=0;i<=arr2.length-1;i++) {
			for(int j=0;j<=arr2[i].length-1;j++) {
				arr2[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Elements of Array 1 are : ");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Elements of Array 2 are : ");
		for(int i=0;i<=arr2.length-1;i++) {
			for(int j=0;j<=arr2[i].length-1;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Sum of Array 1 & Array 2 : ");
		for(int i=0;i<=sum.length-1;i++) {
			for(int j=0;j<=sum[i].length-1;j++) {
				sum[i][j]=arr[i][j]+arr2[i][j];
			}
		}
		//Printing
		for(int i=0;i<=sum.length-1;i++) {
			for(int j=0;j<=sum[i].length-1;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
