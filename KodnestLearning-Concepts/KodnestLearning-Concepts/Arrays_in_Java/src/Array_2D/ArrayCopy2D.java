package Array_2D;


import java.util.Scanner;

public class ArrayCopy2D {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of 2D Array. : ");
		int arr[][]=new int[scan.nextInt()][scan.nextInt()];
		
		System.out.println("Enter the elements : ");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Elements of Array 1 are : ");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int arr2[][]=new int[arr.length][arr.length];
		System.out.println("Copying the elements to another 2D array.... \n");
		for(int i=0;i<=arr2.length-1;i++) {
			for(int j=0;j<=arr2[i].length-1;j++) {
				arr2[i][j]=arr[i][j];
			}
		}
		
		System.out.println("After copying ... Elements of Array 2 are : ");
		for(int i=0;i<=arr2.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
