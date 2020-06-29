package com.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseLogClass {
	
	public boolean getConnection(String user,String pass) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/lr";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		PreparedStatement ps = con.prepareStatement("select * from mvc where username=? and password=?");
		
		ps.setString(1, user);
		ps.setString(2, pass);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
			return true;
		else
			return false;
		
	}

}
