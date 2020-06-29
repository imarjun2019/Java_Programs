package com.mvc;

import java.sql.SQLException;

public class LoginMVCClass {
	
	private String username,password;

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
	
	public boolean validate() throws ClassNotFoundException, SQLException
	{
		
		DatabaseLogClass dl = new DatabaseLogClass();
		boolean status = dl.getConnection(username, password);
		
		if (status==true)
			return true;
		else
			return false;
		
	}

}
