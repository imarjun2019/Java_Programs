package com.mvc;

import java.sql.SQLException;

public class RegisterMVCBean {
	
	private String username,password, email, department, gender;
	private long phone;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	public boolean validate() throws ClassNotFoundException, SQLException
	{
		DatabaseRegClass dc = new DatabaseRegClass();
		boolean status = dc.getConnection(username, password, email, phone, department, gender);
		if (status==true)
			return true;
		else 
			return false;
	}
	

}
