package com.kodnest.cc;
import java.util.Scanner;

public class GradeApp {

	public static void main(String[] args) {
		System.out.println("Enter the Score : ");
		//Scanner scan = new Scanner(System.in);
		//int score=scan.nextInt();
		int score=new Scanner(System.in).nextInt();
		If_Else_If.getGrade(score);
	}

}
