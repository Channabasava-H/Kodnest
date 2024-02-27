package com.kodnest.string.basics;

import java.util.Scanner;

public class ReplaceWith99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		char arr[]=input.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
				System.out.print(99);
			}
			else
			{
				System.out.print(arr[i]);
			}
		}

}
}
