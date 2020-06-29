package com.servlethibernate;

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

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	SessionFactory sf = null;
       
	public void init(ServletConfig config)
	{
		
		Configuration cf = new Configuration();
		cf.configure("configure.xml");
		sf = cf.buildSessionFactory();	
}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		Session se = sf.openSession();
		
		Register r = new Register();
		
		r.setUsername(user);
		r.setPassword(pass);
		r.setEmail(email);
		
		
		Transaction tx = se.beginTransaction();
		se.save(r);
		tx.commit();
		
		se.close();	
		sf.close();
		
		response.sendRedirect("register.html");
			 	
			
	}

}
