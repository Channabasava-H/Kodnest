package com.kodnest.jdbc.example5;

import java.util.Scanner;

import java.sql.*;

public class StudentApp {
	public static void main(String[] args) {
		try {
		String url="jdbc:mysql://localhost/myjdbcdb";
		String username="root", password="root";
		Connection con=DriverManager.getConnection(url, username, password);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("----- Student 1 ----");
		System.out.println("Enter the Roll no : ");
		int rollNo1=scan.nextInt();
		System.out.println("Enter the Name : ");
		String name1=scan.next();
		System.out.println("Enter thr Marks : ");
		int marks1=scan.nextInt();
		Student st1=new Student(rollNo1, name1, marks1);
		setJDBC(st1,con);
		//setStudentObject(rollNo, name, marks);
		
		System.out.println("----- Student 2 ----");
		System.out.println("Enter the Roll no : ");
		int rollNo2=scan.nextInt();
		System.out.println("Enter the Name : ");
		String name2=scan.next();
		System.out.println("Enter thr Marks : ");
		int marks2=scan.nextInt();
		Student st2=new Student(rollNo2, name2, marks2);
		setJDBC(st2, con);
		
		System.out.println("----- Student 3 ----");
		System.out.println("Enter the Roll no : ");
		int rollNo3=scan.nextInt();
		System.out.println("Enter the Name : ");
		String name3=scan.next();
		System.out.println("Enter thr Marks : ");
		int marks3=scan.nextInt();
		Student st3=new Student(rollNo3, name3, marks3);
		setJDBC(st3, con);
		System.out.println("All Student data Stored in Database.");
		scan.close();
		
		System.out.println("------ Displaying the DATA ------");
		diplayDATA(con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void diplayDATA(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		String query ="SELECT * FROM STUDENT1";
		PreparedStatement pstmt=con.prepareStatement(query);
		ResultSet res =pstmt.executeQuery();
		System.out.println("<Roll No>  <Name>  <Marks>");
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
		}
	}

	private static void setJDBC(Student st, Connection con) {
		// TODO Auto-generated method stub
		try {
			
			String query="INSERT INTO STUDENT1 VALUES(?,?,?)";
			PreparedStatement pstmt= con.prepareStatement(query);
			
			pstmt.setInt(1, st.getRollNo());
			pstmt.setString(2, st.getName());
			pstmt.setInt(3, st.getmMarks());
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

//	private static void setStudentObject(int rollNo, String name, int marks) {
//		// TODO Auto-generated method stub
//		Student st
//	}
}
