package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName(JDBCProperties.DRIVER);
		return DriverManager.getConnection(JDBCProperties.URL, JDBCProperties.USERNAME,JDBCProperties.PASSWORD);
		
	}
}
