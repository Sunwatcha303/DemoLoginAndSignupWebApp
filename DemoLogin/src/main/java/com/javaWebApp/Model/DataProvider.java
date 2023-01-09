package com.javaWebApp.Model;

import java.sql.*;

import com.javaWebApp.been.User;

public class DataProvider {
	MyDB db = new MyDB();
	Connection connect = db.getConnect();
	
	public void writeData(User user) {
		String fname = user.getFname();
		String lname = user.getLname();
		String uname = user.getUname();
		String email = user.getEmail();
		String pwd = user.getPwd();
		try {
			String sql = "insert into member(first_name,last_name,email,username,passwords) values('"+fname+"','"+lname+"','"+email+"','"+uname+"','"+pwd+"')";
			Statement stm = connect.createStatement();
			stm.executeUpdate(sql);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Statement getStatment() {
		try {
			Statement stm = connect.createStatement();
			return stm;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public User readData(User user) {
		ResultSet res = null;
		try {
			String sql = "select * from member where username = '"+user.getUname()+"' or email = '"+user.getUname()+"' and passwords = '"+user.getPwd()+"'";
			
			Statement stm = connect.createStatement();
			res = stm.executeQuery(sql);
			if(res != null && res.next()) {
				user.setFname(res.getString("first_name"));
				user.setLname(res.getString("last_name"));
				user.setUname(res.getString("username"));
				user.setEmail(res.getString("email"));
				user.setPwd(res.getString("passwords"));
				return user;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
