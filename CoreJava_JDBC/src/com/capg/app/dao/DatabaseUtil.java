package com.capg.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUtil {
	
	Connection con;  // hold database connection
	PreparedStatement ps;  // holds SQL Query
	
	public DatabaseUtil()throws ClassNotFoundException,SQLException
	{
		String path = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "user1";
		String password = "user1";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");  // Search Oracle Driver class and create instance
		
		con = DriverManager.getConnection(path,username,password);
		System.out.println("---->> Check Connection :- "+con);
		
	}
	
	/*  Only for Testing ---*/
	public static void main(String[] args) {
		
		try {
			new DatabaseUtil();
			
		} 
		catch (ClassNotFoundException e) {
			System.out.println(" Class Not Found "+e);
		}
		catch (SQLException e) {
				System.out.println(" SQLException "+e);
		}
			
	}

}//end class
