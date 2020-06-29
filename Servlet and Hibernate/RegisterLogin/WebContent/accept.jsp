<%@page import="java.sql.*"%>

<%
Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);
String id = request.getParameter("id");
int mid = Integer.parseInt(id);
PreparedStatement ps = con.prepareStatement("update employee_meeting set status='Accepted' where mid=?");
ps.setInt(1,mid);
int x = ps.executeUpdate();
if (x!=0)
	response.sendRedirect("./meeting_details.jsp?msg=Accepted");
%> 