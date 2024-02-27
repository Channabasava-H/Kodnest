package com.kodnest.string.basics;

import java.util.Scanner;

public class FirstNonRepeatitiveLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String str=scan.next();
		scan.close();
		
		char nonRepeatitive=findFirstNonRepeatitive(str);
		if(nonRepeatitive=='\0')
			System.out.print("No Non Repeatitive latter available.");
		else
			System.out.println(nonRepeatitive);

	}

	private static char findFirstNonRepeatitive(String str) {
		// TODO Auto-generated method stub
		
		char found='\0';
		
		for(char i : str.toCharArray()) {
			if(str.indexOf(i)== str.lastIndexOf(i)) {
					found=i;
					break;
				}
		}
		return found;
		
	}
}
