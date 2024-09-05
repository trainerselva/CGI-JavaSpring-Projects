package com.cgi.jdbcdemo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {

	private static Properties props = new Properties();
	
	static {
		try (InputStream inStream = 
				JDBCUtil.class.getClassLoader()
				.getResourceAsStream("db.properties")) {
			if (inStream == null) {
				System.out.println("ERROR: Unable to find db.properties");	
			} else {
				System.out.println("db.properties file opened successfully");
				props.load(inStream);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		String url = props.getProperty("db.url");
		String username = props.getProperty("db.username");
		String password = props.getProperty("db.password");
		
		return DriverManager.getConnection(url, username, password);
	}
}
