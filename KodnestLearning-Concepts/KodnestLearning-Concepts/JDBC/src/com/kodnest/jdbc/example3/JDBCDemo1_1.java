package com.kodnest.jdbc.example3;

import java.util.Scanner;
import java.sql.*;

public class JDBCDemo1_1 {
	public static void main(String[] args) {
		
		try {
			String url ="jdbc:mysql://localhost/myjdbcdb";
			String username ="root";
			String password="root";
			
			Scanner scan=new Scanner(System.in);
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Numner of rows : ");
			int rows = scan.nextInt();
			int p_id=0, p_age=0;
			String p_name=null;
			
			
			for(int i=1;i<=rows;i++) {
				System.out.println("Row "+i+" | Enter Patiens Id : ");
				p_id=scan.nextInt();
				System.out.println("Row "+i+" | Enter Patiens Name : ");
				p_name=scan.next();
				System.out.println("Row "+i+" | Enter Patiens Age : ");
				p_age=scan.nextInt();
				insertData(p_id, p_name, p_age, con);
			}
			System.out.println("All rows inserted successfully.");
			scan.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void insertData(int p_id, String p_name, int p_age, Connection con) throws SQLException {
		String query ="INSERT INTO HOSPITAL VALUES("+p_id+",'"+p_name+"',"+p_age+")";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.execute();
		System.out.println("1 row inserted successfully.");
	}
}
