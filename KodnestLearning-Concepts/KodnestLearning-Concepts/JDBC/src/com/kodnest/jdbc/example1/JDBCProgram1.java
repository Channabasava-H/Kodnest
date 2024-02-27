package com.kodnest.jdbc.example1;
//1.Import java.sql package
import java.sql.*;
public class JDBCProgram1 {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password ="root";
		//Query to be executed
		String query = "CREATE TABLE STUDENT (ROLL INT, NAME VARCHAR(20))";
		
		try {
			
			//2. Load The driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully...");
			
			//3. Establish the Connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection establish successfully...");
			
			//Creating the statement
			Statement stmn = con.createStatement();
			System.out.println("Statement executed successfully...");
		
			//Executing the query
			stmn.execute(query);
			System.out.println("Query executed successfully...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
