package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginMVCClass lc = new LoginMVCClass();
		lc.setUsername(username);
		lc.setPassword(password);
		
		HttpSession hs = request.getSession();
		hs.setAttribute("bean",lc);
		
		try {
			boolean status = lc.validate();
			
			if(status==true)
				response.sendRedirect("./success.jsp");
			else
				response.sendRedirect("./failed.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
