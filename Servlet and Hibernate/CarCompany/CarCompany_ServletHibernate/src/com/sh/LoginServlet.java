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

public class LoginServlet extends HttpServlet {
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
		
		Session se = sf.openSession();
		
		Query qr = se.createQuery("From Login L where L.username=? and L.password=?");
		qr.setParameter(0, user);
		qr.setParameter(1, pass);

		
		
		List l = qr.list();
		Iterator li = l.iterator();
		
		if(li.hasNext())
		{
			Object o = (Object)li.next();
			Login log = (Login)o;
			HttpSession hs = request.getSession();
			hs.setAttribute("username", log.getUsername());
			response.sendRedirect("./Student_Home.jsp?Successful");
		}
		else 
		{
			response.sendRedirect("./Login.jsp?Failed");
		}
		
		
		
		se.close();	
		sf.close();
		
		
			 	
			
	}

}
