package com.kodnest.jdbc.example2;
import java.sql.*;
import java.util.Scanner;

public class EmpJDBC2 {
	
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
					case 1: {
						System.out.println("Enter employee id : ");
						int emp_id=scan.nextInt();
						System.out.println("Enter employee name : ");
						String emp_name=scan.next();
						System.out.println("Enter employee salary : ");
						int emp_salary = scan.nextInt();
						insert(con, emp_id, emp_name, emp_salary);
					}
					break;
					case 2:
						{
							System.out.println("Enter employee id : ");
							int emp_id=scan.nextInt();
							System.out.println("Enter the new name : ");
							String emp_name=scan.next();
							System.out.println("Enter the new salary : ");
							int emp_salary = scan.nextInt();
							update(con,emp_id, emp_name, emp_salary);
					}
					break;
					case 3: {
							System.out.println("Enter the employee id to delete : ");
							int emp_id=scan.nextInt();
							delete(con,emp_id);
					}
					break;
					case 4: {
							System.out.println("Enter the employee id : ");
							int emp_id=scan.nextInt();
							fetchData(con,emp_id);
					}
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
	
	public static void insert(Connection con, int emp_id, String emp_name, int emp_salary) throws Exception{
		String query ="INSERT Employee values(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, emp_id);
		pstmt.setString(2, emp_name);
		pstmt.setInt(3,emp_salary);
		pstmt.execute();
		System.out.println("Data inserted successfully...");
		fetchData(con,emp_id);
	}
	
	public static void update(Connection con, int emp_id, String emp_name, int emp_salary)throws Exception {
		String query ="UPDATE Employee SET Emp_Name=?, Emp_salary=? WHERE Emp_id=?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, emp_name);
		pstmt.setInt(2, emp_salary);
		pstmt.setInt(3, emp_id);
		pstmt.executeUpdate();
		System.out.println("Data updated successfully...");
		fetchData(con,emp_id);
	}
	
	public static void delete(Connection con,  int emp_id) throws Exception{
	
		String query ="DELETE FROM Employee WHERE Emp_id=";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, emp_id);
		pstmt.executeUpdate();
		System.out.println("Query deleted successfully...");
		fetchData(con, emp_id);
	}
	
	public static void fetchData(Connection con, int emp_id) throws Exception{
		String query ="SELECT * FROM Employee WHERE Emp_id=?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1,emp_id);
		ResultSet rs =pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
	}

}
