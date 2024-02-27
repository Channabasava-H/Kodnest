package com.kodnest.string.basics;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String to check wheather it is panagram or not ?");
		String input=scan.nextLine();
		scan.close();
		
		boolean isPangram = isPangram(input);
		
		if(isPangram)
			System.out.println("Entered String is a pangram.");
		else
			System.out.println("Entered String is not a pangram.");
		

	}

	public static boolean isPangram(String input) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int count=0;
		for(int i=0;i<26;i++) {
			char ch='a';
			char CH='A';
			for(int j=0;j<input.length();j++) {
				if(ch==input.charAt(j) || CH==input.charAt(j)) {
					count++;
					break;
				}
				ch++;
				CH++;
			}
		}
		
		if(count==26) {
			flag=true;
		}
		
		return flag;
	}

}
