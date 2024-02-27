package com.kodnest.jdbc.example1;
//1.Import java.sql package
import java.sql.*;
public class JDBCProgram6 {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password ="root";
		//Query to be executed
		String query = "SELECT * FROM STUDENT";
		
		try {
			//3. Establish the Connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection establish successfully...");
			
			//Creating the statement
			Statement stmn = con.createStatement();
			System.out.println("Statement executed successfully...");
		
			//Executing the query and getting the result set
			ResultSet res=stmn.executeQuery(query);
			//fetching the data using result set
			while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
