package com.kodnest.jdbc.example3;

import java.util.Scanner;
import java.sql.*;

public class JDBCDemo1_2 {
	public static void main(String[] args) {
		
		try {
			String url ="jdbc:mysql://localhost/myjdbcdb";
			String username ="root", password="root";
			String query ="INSERT INTO HOSPITAL VALUES(?,?,?)";
			int rows=0, p_id=0, p_age=0;
			String p_name=null;
			
			Scanner scan=new Scanner(System.in);
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt=con.prepareStatement(query);
			
			System.out.println("Numner of rows : ");
			rows = scan.nextInt();
			
			for(int i=1;i<=rows;i++) {
				System.out.println("Row "+i+" | Enter Patiens Id : ");
				p_id=scan.nextInt();
				System.out.println("Row "+i+" | Enter Patiens Name : ");
				p_name=scan.next();
				System.out.println("Row "+i+" | Enter Patiens Age : ");
				p_age=scan.nextInt();
				pstmt.setInt(1, p_id);
				pstmt.setString(2, p_name);
				pstmt.setInt(3, p_age);
				pstmt.execute();
				System.out.println("One row inserted successfully.");
			}
			System.out.println("All rows inserted successfully.");
			scan.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
