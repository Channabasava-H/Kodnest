package com.kodnest.string.split;

import java.util.Scanner;

//Reverse Words in a String

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.nextLine();
		System.out.println("Entered String is :"+str);
		String res=reverseWords(str);
		System.out.println("Reversed String is : "+res);

	}
	
	public static String reverseWords(String str) {
		
		String arr[]=str.split(" ");
		String revSen="";
		for(int i=0;i<=arr.length-1;i++) {
			String word=arr[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--) {
				revWord=revWord+word.charAt(j);
				
			}
		revSen=revSen+revWord+" ";

		}
		return revSen;
		
	}

}
