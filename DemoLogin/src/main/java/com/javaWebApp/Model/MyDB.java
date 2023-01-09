package com.javaWebApp.Model;

import java.sql.*;

public class MyDB {
	public Connection connect;
	
	public Connection getConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testLoginDB", "root", "O8223o!#");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return connect;
	}
}
