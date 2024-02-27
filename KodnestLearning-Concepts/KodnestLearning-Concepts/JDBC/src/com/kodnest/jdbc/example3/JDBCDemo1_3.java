package com.kodnest.jdbc.example3;

import java.util.Scanner;
import java.sql.*;

public class JDBCDemo1_3 {
	public static void main(String[] args) {
		
		try {
			String url ="jdbc:mysql://localhost/myjdbcdb";
			String username ="root", password="root";
			String query ="INSERT INTO HOSPITAL VALUES(?,?,?)";
			int rows=0, p_id=0, p_age=0;
			String p_name=null;
			
			Scanner scan=new Scanner(System.in);
			//establishing the connection
			Connection con = DriverManager.getConnection(url, username, password);
			//preparing the statement for executing the query with placeholder
			PreparedStatement pstmt=con.prepareStatement(query);
			//taking user input for number of rows to be inserted
			System.out.println("Numner of rows : ");
			rows = scan.nextInt();
			//Taking user input, completing the query and adding it to batch
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
				pstmt.addBatch();
			}
			pstmt.executeBatch(); //executing the batch
			System.out.println("All rows inserted successfully.");
			scan.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
