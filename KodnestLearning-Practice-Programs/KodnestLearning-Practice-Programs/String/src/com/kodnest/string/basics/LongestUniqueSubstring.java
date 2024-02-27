package com.kodnest.string.basics;

import java.util.Scanner;

public class LongestUniqueSubstring {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		// Find and display the longest unique substring

		String longestUniqueSubstring = findLongestUniqueSubstring(input);

		System.out.println(longestUniqueSubstring);

		}

		// Function to find the longest unique substring

		public static String findLongestUniqueSubstring(String str) {

			int maxLength = 0;
			String longestSubstring = "";
			
			for (int i = 0; i < str.length(); i++) {
	
				StringBuilder currentSubstring = new StringBuilder();
				
				for (int j = i; j < str.length(); j++) {
					char currentChar = str.charAt(j);
					if (currentSubstring.toString().contains(String.valueOf(currentChar))) {
						break;
					}
					currentSubstring.append(currentChar);
				}
		
				if (currentSubstring.length() > maxLength) {
					maxLength = currentSubstring.length();
					longestSubstring = currentSubstring.toString();
				}
			}
			return longestSubstring;

		}

}
