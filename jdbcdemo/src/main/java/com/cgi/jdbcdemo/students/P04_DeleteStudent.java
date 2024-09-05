package com.cgi.jdbcdemo.students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cgi.jdbcdemo.JDBCUtil;

public class P04_DeleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String deleteQuery = "DELETE FROM students WHERE stu_id = ?";
		
		try (
				Connection conn = JDBCUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(deleteQuery)
				){
			
			// Set the student id
			pstmt.setInt(1, 102);
			
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Number of rows deleted: " + rowsAffected);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
