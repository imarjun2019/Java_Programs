package com.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseRegClass {
	
	public boolean getConnection(String user,String pass,String email,long phone,String department,String gender) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/lr";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		PreparedStatement ps = con.prepareStatement("insert into mvc (username,password,email,phone,department,gender) values (?,?,?,?,?,?)");
		
		ps.setString(1, user);
		ps.setString(2, pass);
		ps.setString(3, email);
		ps.setLong(4, phone);
		ps.setString(5, department);
		ps.setString(6, gender);
		
		int x = ps.executeUpdate();
		
		if (x!=0)
			return true;
		else
			return false;
	}

}
