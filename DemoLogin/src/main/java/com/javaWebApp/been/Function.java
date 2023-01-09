package com.javaWebApp.been;

import java.sql.*;
import java.util.regex.*;

import com.javaWebApp.Model.DataProvider;

public class Function {
	public static boolean emtryInputSigup(String f,String l, String e, String u, String p, String rp) {
		if(f.equals("") || l.equals("") || e.equals("") || u.equals("") || p.equals("") || rp.equals("")) {
			return true;
		}
		return false;
	}
	
	public static boolean invalidUid(String userName) {
		Pattern p = Pattern.compile("^[A-Za-z]\\w{5,29}$");
		Matcher m = p.matcher("userName");
		if(!m.matches()) {
			return true;
		}
		return false;
	}
	
	public static boolean invalidEmail(String e) {
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(e);  
		if(!matcher.matches()) {
			return true;
		}
		return false;
	}
	
	public static boolean invalidPasswordMatches(String p, String rp) {
		if(!p.equals(rp)) {
			return true;
		}
		return false;
	}
	
	public static boolean uidExists(DataProvider dp, String uName, String email) {
		try {
			String sql = "select * from member";
			Statement stm = dp.getStatment();
			ResultSet res = stm.executeQuery(sql);
			
			while(res != null && res.next()) {
				if(res.getString("username").equals(uName) || res.getString("email").equals(email)) {
					return true;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
