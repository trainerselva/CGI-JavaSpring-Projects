package com.cgi.jdbcdemo.students;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.cgi.jdbcdemo.JDBCUtil;

public class P06_MetaDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Connection conn = JDBCUtil.getConnection();
			 Statement stmt = conn.createStatement()) {
			
			// Execute a query
			String query = 
					"SELECT * FROM students";
			ResultSet rs = stmt.executeQuery(query);
			
			// Get the ResultSetMetaData object from the ResultSet
			ResultSetMetaData rsMetaData = rs.getMetaData();
			
			// Get the number of columns in the ResultSet
			int numCols = rsMetaData.getColumnCount();
			System.out.println("Number of columns: " + numCols);
			
			// Print the column details
			for (int i = 1; i <= numCols; ++i) {
				System.out.println("Column: " + i);
				System.out.println("    Name: " + rsMetaData.getColumnName(i));
				System.out.println("    Type: " + rsMetaData.getColumnTypeName(i));
				System.out.println("    Size: " + rsMetaData.getColumnDisplaySize(i));
				System.out.println("    Is Nullable: " + 
						(rsMetaData.isNullable(i)) != null ? 
						(rsMetaData.isNullable(i) == ResultSetMetaData.columnNullable) ? "YES" : "NO" : "NULL");
				System.out.println("    Is Auto Increment: " + 
						(rsMetaData.isAutoIncrement(i) ? "YES" : "NO"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
