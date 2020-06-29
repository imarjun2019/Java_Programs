package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String mobile = request.getParameter("phone");
		long phone = Long.parseLong(mobile);
		String department = request.getParameter("department");
		String gender = request.getParameter("gender");
		
		RegisterMVCBean rb = new RegisterMVCBean();
		
		rb.setUsername(username);
		rb.setPassword(password);
		rb.setEmail(email);
		rb.setPhone(phone);
		rb.setDepartment(department);
		rb.setGender(gender);
		
		try {
			boolean status = rb.validate();
			
			if (status==true)
				response.sendRedirect("./Login.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
