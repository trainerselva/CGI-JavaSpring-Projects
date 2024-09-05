package com.cgi.jdbcdemo.students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cgi.jdbcdemo.JDBCUtil;

public class P02_SelectStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String selectQuery = 
				"SELECT * from students WHERE stu_id = ?";
		
		try (Connection conn = JDBCUtil.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(selectQuery)) {
				
			// Set the unknown values in the insert query and then execute
			pstmt.setInt(1, 103);
			
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					System.out.println("--------------");
					System.out.print("ID: " + rs.getInt(1));
					System.out.print(" Name: " + rs.getString(2));
					System.out.print(" Email: " + rs.getString(3));
					System.out.println();
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
