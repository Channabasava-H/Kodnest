package com.kodnest.jdbc.example4;
import java.sql.*;
import java.util.Scanner;

public class JDBCTransactionExample1_2 {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost/bank";
			String username="root", password="root";
			String query1="UPDATE BANK SET AMOUNT=AMOUNT-? WHERE AC_NO=1111";
			String query2="UPDATE BANK SET AMOUNT=AMOUNT+? WHERE AC_NO=3333";
			
			Connection con=DriverManager.getConnection(url,username,password);
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
			
			System.out.println("Money Transfered Successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
