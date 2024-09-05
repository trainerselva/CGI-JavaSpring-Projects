package com.cgi.jdbcdemo.students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cgi.jdbcdemo.JDBCUtil;

public class P01_CreateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String insertQuery = 
				"INSERT INTO students (stu_id, stu_name, stu_email) values (?, ?, ?)";
		
		try (Connection conn = JDBCUtil.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
				
			// Set the unknown values in the insert query and then execute
			pstmt.setInt(1, 103);
			pstmt.setString(2, "Third");
			pstmt.setString(3, "third@yahoo.com");
			
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Number of rows inserted: " + rowsAffected);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
