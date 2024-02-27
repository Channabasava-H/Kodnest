package com.kodnest.jdbc.example1;
import java.sql.*;
import java.util.Scanner;

public class JDBCProgram7 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username ="root";
		String password="root";
		String query ="INSERT INTO EMPLOYEE VALUES(?,?,?)"; //Placeholders
		try {
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			PreparedStatement pstmt=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter employee id : ");
			int emp_id=scan.nextInt();
			System.out.println("Enter employee name : ");
			String emp_name=scan.next();
			System.out.println("Enter employee salary : ");
			int emp_salary = scan.nextInt();
			
			pstmt.setInt(1, emp_id);
			pstmt.setString(2, emp_name);
			pstmt.setInt(3, emp_salary);
			pstmt.execute();
			
			System.out.println("Rows are inserted");
			
			scan.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
