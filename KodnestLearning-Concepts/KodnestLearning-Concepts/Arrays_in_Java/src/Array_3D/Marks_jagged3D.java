package Array_3D;

import java.util.Scanner;

public class Marks_jagged3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int marks[][][]=new int[n][][];
//		marks[0]=new int[2][];
//		marks[1]=new int[3][];
//		marks[0][0]= new int[3];
//		marks[0][1]= new int[4];
//		marks[1][0]= new int[3];
//		marks[1][1]=new int[2];
//		marks[1][2]=new int[4];
		
		for(int i=0;i<=marks.length-1;i++) {
			marks[i]=new int[scan.nextInt()][];
			for(int j=0;j<=marks[i].length-1;j++) {
				marks[i][j]=new int[scan.nextInt()];
			}
		}
		
		for(int i=0;i<=marks.length-1;i++) {
			for(int j=0;j<=marks[i].length-1;j++) {
				for(int k=0; k<=marks[i][j].length-1;k++) {
					System.out.printf("Enter the marks of %d school, Class %d and Student %d \n",i,j,k);
					marks[i][j][k]=scan.nextInt();
				}
			}
		}
		scan.close();
		System.out.println("Marks are... ");
		for(int i=0;i<=marks.length-1;i++) {
			for(int j=0;j<=marks[i].length-1;j++) {
				for(int k=0; k<=marks[i][j].length-1;k++) {
					System.out.print(marks[i][j][k]+" | ");
					
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
