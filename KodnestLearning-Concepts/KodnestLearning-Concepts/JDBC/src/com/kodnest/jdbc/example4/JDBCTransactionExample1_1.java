package com.kodnest.jdbc.example4;
import java.sql.*;
//This Program is not working.. 
//Find out the reason
public class JDBCTransactionExample1_1 {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost/bank";
			String username="root", password="root";
			String query="UPDATE BANK SET AMOUNT=? WHERE AC_NO=?";
			
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt= con.prepareStatement(query);
			
			updateBank(5000, 1111, pstmt);
			updateBank(4500, 3333, pstmt);
			System.out.println("Money Transfered Successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void updateBank(int amt, int ac_no, PreparedStatement pstmt) throws SQLException {
		// TODO Auto-generated method stub
		pstmt.setInt(1, ac_no);
		pstmt.setInt(2, amt);
		pstmt.executeUpdate();
	}

}
