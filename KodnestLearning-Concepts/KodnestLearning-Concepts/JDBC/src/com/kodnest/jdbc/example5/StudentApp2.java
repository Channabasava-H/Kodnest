package com.kodnest.jdbc.example5;

import java.util.Scanner;

import java.sql.*;

public class StudentApp2 {
	public static void main(String[] args) {
		try {
		String url="jdbc:mysql://localhost/myjdbcdb";
		String username="root", password="root";
		String query1="INSERT INTO STUDENT1 VALUES(?,?,?)";
		String query2 ="SELECT * FROM STUDENT1";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pstmt1= con.prepareStatement(query1);
		PreparedStatement pstmt2=con.prepareStatement(query2);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many Student DATA you want to insert : ");
		int count=scan.nextInt();
		
		while(count>0) {
			System.out.println("----- Student DATA -----");
			System.out.println("Enter the Roll no : ");
			int rollNo=scan.nextInt();
			System.out.println("Enter the Name : ");
			String name=scan.next();
			System.out.println("Enter thr Marks : ");
			int marks=scan.nextInt();
			Student st=new Student(rollNo, name, marks);
			setJDBC(st, pstmt1);
			count--;
		}
		pstmt1.executeBatch();
		System.out.println("All the DATA stored in the DATABASE.");
		scan.close();
		
		System.out.println("\n------ Displaying the DATA ------");
		diplayDATA(pstmt2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void diplayDATA(PreparedStatement pstmt) throws SQLException {
		
		ResultSet res =pstmt.executeQuery();
		System.out.println("<Roll_No>  <Name>  <Marks>");
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
		}
	}

	private static void setJDBC(Student st, PreparedStatement pstmt) throws SQLException {
			pstmt.setInt(1, st.getRollNo());
			pstmt.setString(2, st.getName());
			pstmt.setInt(3, st.getmMarks());
			pstmt.addBatch();
	}

}
