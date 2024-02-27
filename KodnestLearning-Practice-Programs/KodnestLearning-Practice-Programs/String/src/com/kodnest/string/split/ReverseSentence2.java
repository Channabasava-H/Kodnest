package com.kodnest.string.split;

import java.util.Scanner;

public class ReverseSentence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.nextLine();
		System.out.println("Entered String is :"+str);
		String res=reverseSen(str);
		System.out.println("Reversed String is : "+res);

	}

	private static String reverseSen(String str) {
		// TODO Auto-generated method stub
		String arr[]=str.split(" ");
		String revArr[]=new String[arr.length];
		int k=revArr.length-1;
		for(int i=0;i<=arr.length-1;i++) {
			 revArr[k]=arr[i]+" ";
			 k--;
		}
		
		return revArr;
	}

}
