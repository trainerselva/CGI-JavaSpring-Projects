package com.cgi.jdbcdemo.students;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.cgi.jdbcdemo.JDBCUtil;

public class P05_CallableStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		callProcedureDemo();
		callFunctionDemo();
	}
	
	public static void callProcedureDemo() {
		try (Connection conn = JDBCUtil.getConnection()) {
			
			// Create the SQL query and call the stored procedure
			String callProcedureQuery = 
					"{call getStudentNameById(?, ?)}";
			CallableStatement callProcedureStatement =
					conn.prepareCall(callProcedureQuery);
			
			// Set the IN parameter (parameter 1) - student ID
			callProcedureStatement.setInt(1, 101);
			
			// Set the OUT parameter (parameter 2) - student name
			callProcedureStatement.registerOutParameter(2, Types.VARCHAR);
			
			// Execute the stored procedure
			callProcedureStatement.execute();
			
			// Retrieve the OUT parameter (student name)
			String studentName = callProcedureStatement.getString(2);
			System.out.println("Student name: " + studentName);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void callFunctionDemo() {
		try (Connection conn = JDBCUtil.getConnection()) {
			
			// Create the SQL query and call the stored procedure
			String callFunctionQuery = 
					"{? = call getStudentEmailById(?)}";
			
			CallableStatement callFunctionStatement =
					conn.prepareCall(callFunctionQuery);
			
			// Register the OUT parameter (function result)
			callFunctionStatement.registerOutParameter(1, Types.VARCHAR);
			
			// Set the IN parameter (student ID)
			callFunctionStatement.setInt(2, 101);
			
			// Execute the function
			callFunctionStatement.execute();
			
			// Retrieve the function result
			String studentEmail = callFunctionStatement.getString(1);
			System.out.println("Student email: " + studentEmail);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
