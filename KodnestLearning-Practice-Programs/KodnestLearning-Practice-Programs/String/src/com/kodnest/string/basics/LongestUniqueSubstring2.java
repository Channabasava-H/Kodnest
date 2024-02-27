package com.kodnest.string.basics;

import java.util.Scanner;


public class LongestUniqueSubstring2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		// Find and display the longest unique substring

		String longestUniqueSubstring = findLongestUniqueSubstring(input);

		System.out.println(longestUniqueSubstring);
		scanner.close();

		}

		// Function to find the longest unique substring

		public static String findLongestUniqueSubstring(String str) {
			
			int maxlen=0;
			String lon_sub="";

			for(int i=0;i<str.length();i++) {
				StringBuilder str2 = new StringBuilder();
				
				for(int j=i;j<str.length();j++) {
					
					char arr=str.charAt(j);
					if(str2.toString().contains(String.valueOf(arr))){
						break;
					}
					str2.append(arr);
				}
				
				if(str2.length()>maxlen) {
					maxlen=str2.length();
					lon_sub=str2.toString();
				}
				
			}
			return lon_sub;
		}

}
