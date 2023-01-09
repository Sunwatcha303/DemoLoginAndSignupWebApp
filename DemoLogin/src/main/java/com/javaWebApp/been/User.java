package com.javaWebApp.been;

public class User {
	
	private String fname;
	private String lname;
	private String uname;
	private String email;
	private String pwd;
	private String repwd;
	
	public User(String fname,String lname, String uname, String email, String pwd){
		setFname(fname);
		setLname(lname);
		setUname(uname);
		setEmail(email);
		setPwd(pwd);
	}
	
	public User(String uname,String pwd) {
		setUname(uname);
		setPwd(pwd);
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRepwd() {
		return repwd;
	}
	public void setRepwd(String repwd) {
		this.repwd = repwd;
	}
	
	public String toString() {
		return String.format("%s %s", getFname().toUpperCase(),getLname().toUpperCase());
	}
}
