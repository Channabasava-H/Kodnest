package com.kodnest.jdbc.example1;
//1.Import java.sql package
import java.sql.*;
public class JDBCProgram4 {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password ="root";
		//Query to be executed
		String query = "UPDATE STUDENT SET NAME='Sanjib' WHERE ROLL=1";
		
		try {
			//3. Establish the Connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection establish successfully...");
			
			//Creating the statement
			Statement stmn = con.createStatement();
			System.out.println("Statement executed successfully...");
		
			//Executing the query
			stmn.executeUpdate(query);
			System.out.println("Query executed successfully...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
