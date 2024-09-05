package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcUsingUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection conn = JDBCUtil.getConnection()) {
			System.out.println("Successfully connected to the database!!");
			
			String query = "Select * from students";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				System.out.println("--------------");
				System.out.print("ID: " + rs.getInt(1));
				System.out.print(" Name: " + rs.getString(2));
				System.out.print(" Email: " + rs.getString(3));
				System.out.println();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
