package com.tutorialspoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	public Connection getConnection() throws Exception
	{
	try
	{
		 String myDriver = "com.mysql.jdbc.Driver";
			String db = "jdbc:mysql://localhost:3306/product";
			Class.forName(myDriver);
			Connection conn = (Connection) DriverManager.getConnection(db, "root", "");
	return conn;
	}
	catch (SQLException e)
	{
	throw e;
	}
	catch (Exception e)
	{
	throw e;
	}
	}
}
