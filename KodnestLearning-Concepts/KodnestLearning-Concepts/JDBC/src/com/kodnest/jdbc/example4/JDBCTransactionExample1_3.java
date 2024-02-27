package com.kodnest.jdbc.example4;
import java.sql.*;
import java.util.Scanner;
public class JDBCTransactionExample1_3 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost/bank";
		String username="root", password="root";
		Connection con=null;
		String query1="UPDATE BANK SET AMOUNT=AMOUNT-? WHERE AC_NO=1111";
		String query2="UPDATE BANK SET AMOUNT=AMOUNT+? WHERE AC_NO=3333";
		try {
			con=DriverManager.getConnection(url,username,password);
			//1. Setting auto commit status as false
			con.setAutoCommit(false);
			PreparedStatement pstmt1= con.prepareStatement(query1);
			PreparedStatement pstmt2= con.prepareStatement(query2);
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the amount to be transfer...");
			int amt = scan.nextInt();
			
			pstmt1.setInt(1, amt);
			pstmt1.executeUpdate();
			System.out.println("Amount Debited from Account no 1111");
			pstmt2.setInt(1, amt);
			pstmt2.executeUpdate();
			System.out.println("Amount credited into Account no 3333");
			con.commit(); //2.Committing the changes
			System.out.println("Money Transfered Successfully.");
		} 
		catch (Exception e) {
			try {
				con.rollback(); //3.If any problem occurs, rollback the changes
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
