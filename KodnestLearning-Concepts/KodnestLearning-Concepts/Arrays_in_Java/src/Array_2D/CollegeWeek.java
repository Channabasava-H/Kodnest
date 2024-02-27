package Array_2D;

import java.util.Scanner;

public class CollegeWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String [][]sports = new String[5][];
		sports[0]=new String[3];
		sports[1]=new String[5];
		sports[2]=new String[2];
		sports[3]=new String[4];
		sports[4]=new String[6];
		
		for(int i=0;i<=sports.length-1;i++) {
			for(int j=0;j<=sports[i].length-1;j++) {
				System.out.println("Enter the name of Student "+j+" of Sports "+i);
				sports[i][j]=scn.nextLine();
			}
		}
		scn.close();
		
		System.out.println("Students name who perticipating in different games are : ");
		for(int i=0;i<=sports.length-1;i++) {
			for(int j=0;j<=sports[i].length-1;j++) {
				System.out.print(sports[i][j]+" | ");
			
			}
			System.out.println();
		}

	}

}
