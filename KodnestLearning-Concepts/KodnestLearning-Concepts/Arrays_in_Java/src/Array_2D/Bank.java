package Array_2D;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String [][]bank=new String[5][6];
		for(int i=0;i<=bank.length-1;i++) {
			for(int j=0;j<=bank[i].length-1;j++) {
				System.out.println("Enter the "+j+" Customer Name of Bank "+i);
				bank[i][j]=scan.nextLine();
			}
		}
		scan.close();
		System.out.println("Bank Customers are : ");
		for(int i=0;i<=bank.length-1;i++) {
			for(int j=0;j<=bank[i].length-1;j++) {
				System.out.print(bank[i][j]+" | ");
				
			}
			System.out.println();
		}
	}

}
