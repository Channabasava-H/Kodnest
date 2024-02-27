package com.kodnest.jdbc.example2;
import java.sql.*;
import java.util.Scanner;

public class EmpJDBC {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password ="root";
		
		boolean cntrl= true; 
		try {
				Connection con = DriverManager.getConnection(url, username, password);
				System.out.println("Connection establish successfully...");
				Thread.sleep(100);
				Statement stmn = con.createStatement();
				System.out.println("Statement executed successfully...");
				Thread.sleep(100);
			
			while(cntrl) {
				System.out.println("\nWelcome to DATAWORLD\n");
				Thread.sleep(100);
				System.out.println("Press 1 ---> for Inserting data");
				Thread.sleep(100);
				System.out.println("Press 2 ---> for updating data");
				Thread.sleep(100);
				System.out.println("Press 3 ---> for deleting data");
				Thread.sleep(100);
				System.out.println("Press 4 ---> for fetching data");
				Thread.sleep(100);
				System.out.println("Press 5 ---> exit");
				int choice=scan.nextInt();
				switch(choice){
					case 1: insert(stmn);
						break;
					case 2: update(stmn);
						break;
					case 3: delete(stmn);
						break;
					case 4: fetchData(stmn);
						break;
					case 5: cntrl=false;
						break;
					default:
						System.out.println("Enter valid option");
				}
			}
			scan.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void insert(Statement stmn) throws Exception{
		String query ="INSERT Employee values(1, 'Sanjib', 50000),(2, 'Rahul', 60000),(3,'Nepal', 55000)";
		stmn.execute(query);
		System.out.println("Query executed successfully...");
		fetchData(stmn);
	}
	
	public static void update(Statement stmn)throws Exception {
		String query ="UPDATE Employee SET Emp_Name='Rithvi' WHERE Emp_id=1";
		stmn.executeUpdate(query);
		System.out.println("Query executed successfully...");
		fetchData(stmn);
	}
	
	public static void delete(Statement stmn) throws Exception{
	
		String query ="DELETE FROM Employee WHERE Emp_id=1";
		stmn.executeUpdate(query);
		System.out.println("Query deleted successfully...");
		fetchData(stmn);
	}
	
	public static void fetchData(Statement stmn) throws Exception{
		String query ="SELECT * FROM Employee";
		ResultSet rs =stmn.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
	}

}
