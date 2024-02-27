package com.kodnest.string.CaseConverter;
import java.util.Scanner;

public class UpperToLower {

	public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				
				String input=new String(scan.nextLine());
				
				String res=convertCase(input);
				System.out.println(res);
				scan.close();
				}
				
			public static String convertCase(String input) {
				char arr[]=input.toCharArray();
				String uc=input.toUpperCase();
				String lc=input.toLowerCase();
				for(int i=0;i<=arr.length-1;i++){
				    if(Character.isUpperCase(arr[i])){
				        arr[i]=lc.charAt(i);
				    }
				    else{
				        arr[i]=uc.charAt(i);
				    }
				}
				return new String(arr);
		}
}
