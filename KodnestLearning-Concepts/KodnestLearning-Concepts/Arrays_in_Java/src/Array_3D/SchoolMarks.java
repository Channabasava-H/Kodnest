package Array_3D;

import java.util.Scanner;

public class SchoolMarks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int school[][][]=new int[2][2][4];
		
		for(int i=0;i<=school.length-1;i++) {
			
			for(int j=0;j<=school[i].length-1;j++) {
				
				for(int k=0;k<=school[i][j].length-1;k++) {
					
					System.out.println("Enter the Marks of School "+i+" of Class "+j+" of student"+k);
					school[i][j][k]=scan.nextInt();
				}
			}
		}
		scan.close();
		
		System.out.println("Student marks are... ");
		for(int i=0;i<=school.length-1;i++) {
					
					for(int j=0;j<=school[i].length-1;j++) {
						
						for(int k=0;k<=school[i][j].length-1;k++) {
							
							System.out.print(school[i][j][k]+" | ");
						}
						System.out.println();
			}
			System.out.println();
		}
	
	}
	

}
