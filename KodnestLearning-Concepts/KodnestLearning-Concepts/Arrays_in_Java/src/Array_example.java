import java.util.Scanner;

public class Array_example {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter an element : ");
			arr[i]=scn.nextInt();
		}
		scn.close();
		System.out.println("Array counts are : ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
