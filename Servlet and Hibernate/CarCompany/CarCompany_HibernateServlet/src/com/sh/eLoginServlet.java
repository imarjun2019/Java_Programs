package com.sh;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class eLoginServlet extends HttpServlet {
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
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		System.out.println(user + " " + pass);
		
		Session se = sf.openSession();
		
		Query qr = se.createQuery("From Register L where L.username=? and L.password=?");
		qr.setParameter(0, user);
		qr.setParameter(1, pass);

		
		
		List l = qr.list();
		Iterator li = l.iterator();
		
		if(li.hasNext())
		{
			Object o = (Object)li.next();
			eLogin log = (eLogin)o;
			HttpSession hs = request.getSession();
			hs.setAttribute("username", log.getUsername());
			response.sendRedirect("./employee_home.jsp?Successful");
		}
		else 
		{
			response.sendRedirect("./elogin.html?Failed");
		}
		
		
		
		se.close();	
		sf.close();
		
		
			 	
			
	}

}
