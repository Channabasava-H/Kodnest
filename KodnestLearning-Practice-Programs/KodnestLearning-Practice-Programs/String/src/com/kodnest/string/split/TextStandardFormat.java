package com.kodnest.string.split;

import java.util.Scanner;

public class TextStandardFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=scan.nextLine();
		String std=convertToStandard(str);
		System.out.println(std);
		scan.close();
	}

	public static String convertToStandard(String str) {
		// TODO Auto-generated method stub
		char arr[]=str.toCharArray();
		char std[]=new char[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			
			if(i==0) {
				if(Character.isLowerCase(arr[i])) {
					int temp=arr[i];
					temp=temp-32;
					std[i]=(char)temp;
				}
				else {
				std[i]=arr[i];
				}
			}
			else if(arr[i-1]==' ') {
				if(Character.isLowerCase(arr[i])) {
					int temp=arr[i];
					temp=temp-32;
					std[i]=(char)temp;
				}
				else {
					std[i]=arr[i];
				}
			}
			else if(arr[i]=='.') {
				
			}
			else {
				std[i]=arr[i];
			}
			
		}
		return new String(std);
	}

}
