//import java.util.Arrays;
package com.kodnest.string.basics;

import java.util.Scanner;


public class StringPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//String input=scan.nextLine();
		String input=new String(scan.nextLine());
		
		char arr[]=input.toCharArray();
		
		//System.out.println(Arrays.toString(arr));
		
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.println(arr[i]);
//		}
		
		for(char x:arr) {
			System.out.println(x);
		}
		scan.close();

	}

}
