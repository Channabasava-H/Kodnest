package com.kodnest.string.CaseConverter;
import java.util.Scanner;

public class UpperToLower2 {

	public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				
				String input=new String(scan.nextLine());
				
				String res=convertCase(input);
				System.out.println(res);
				scan.close();
				}
				
			public static String convertCase(String input) {
				char arr[]=input.toCharArray();
				for(int i=0;i<=arr.length-1;i++){
					int temp=arr[i];
				    if(temp>=65 && temp<=90){
				    	temp=temp+32;
				        arr[i]=(char)temp;
				    }
				    else if(temp>=97 && temp<=122){
				    	temp=temp-32;
				        arr[i]=(char)temp;
				    }
				}
				return new String(arr);
		}
}
