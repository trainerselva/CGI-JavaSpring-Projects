package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	// Database credentials
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "Welcome123";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;
		
		try {
			// Load the oracle jdbc driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
 
			// Establish the connection
			connection = DriverManager.getConnection(jdbcUrl, username, password);
			System.out.println("Database connection established successfully");
 
			// Create a statement
			statement = connection.createStatement();
 
			// Execute a Query
			resultset = statement.executeQuery("SELECT * FROM students");
 
			// Process the resultset
			while (resultset.next()) {
				System.out.println("===========================");
				System.out.println("ID: " + resultset.getInt(1) + ", NAME: " + resultset.getString(2) + ", EMAIL: "
						+ resultset.getString(3));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Could not load the JDBC driver class");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// CLose the database resources
 
			try {
				if (resultset != null)
					resultset.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
     }
}
