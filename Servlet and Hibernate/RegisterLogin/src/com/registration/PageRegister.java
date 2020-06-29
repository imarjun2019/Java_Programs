package com.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection con = null;
	PreparedStatement ps = null;
       
	public void init(ServletConfig config)
	{
		/*
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","orcl","Arjun226");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/lr";
		String username = "root";
		String password = "root";
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		String mobile = request.getParameter("phone");
		String city = request.getParameter("city");
		String zipcode = request.getParameter("zip");
		Long phone = Long.parseLong(mobile);
		int zip = Integer.parseInt(zipcode);
		String department = request.getParameter("department");
		
		
		try {
			
			/*
			ps = con.prepareStatement("insert into employee values(em.nextval,?,?,?,?,?,?)");
			
			ps.setString(1,user);
			ps.setString(2,pass);
			ps.setString(3, email);
			ps.setLong(4, phone);
			ps.setString(5, city);
			ps.setInt(6, zip);
			*/
			
			
			 //MySQL;
			 
			ps = con.prepareStatement("insert into employee (username, password, email, phone, city, zipcode,department) values(?,?,?,?,?,?,?)");
			
			ps.setString(1,user);
			ps.setString(2,pass);
			ps.setString(3, email);
			ps.setLong(4, phone);
			ps.setString(5, city);
			ps.setInt(6, zip);
			ps.setString(7, department);
			
			
			
			int x = ps.executeUpdate();
			
			
			PrintWriter pw = response.getWriter();
			
			if(x!=0)
			{
				
				response.sendRedirect("./login.html");
				
				
				
				
//				pw.println("<html><body bgcolor='aqua'>");
//				pw.println("<center><h1> "+user+" Registered Successfully</h1></center>");
//				pw.println("</body></html>");
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
