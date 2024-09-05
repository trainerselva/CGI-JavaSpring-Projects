package com.cgi.jdbcdemo.students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cgi.jdbcdemo.JDBCUtil;

public class P03_UpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String updateQuery = "UPDATE students SET stu_email = ? WHERE stu_name = ?";
		
		try (Connection conn = JDBCUtil.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
			
			// Set the unknown values
			pstmt.setString(1, "newsecond@hotmail.com");
			pstmt.setString(2, "Second");
			
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Number of rows updated: " + rowsAffected);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
