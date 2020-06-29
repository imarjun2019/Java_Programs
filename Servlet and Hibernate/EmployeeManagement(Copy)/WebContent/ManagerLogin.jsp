<%@page import="java.sql.*" %>

<%
Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);

String user = request.getParameter("user");
String pass = request.getParameter("pass");

 
PreparedStatement ps = con.prepareStatement("select * from manager where username=? and password=?");

ps.setString(1,user);
ps.setString(2,pass);

ResultSet rs = ps.executeQuery();


if (rs.next())
{
	HttpSession hs = request.getSession();
	hs.setAttribute("id", rs.getInt("mid"));
	hs.setAttribute("department",rs.getString("department"));
	response.sendRedirect("./Manager_Home.jsp?msg=LoginSuccessful");
}
else
{
	response.sendRedirect("./ManagerLoginForm.jsp?msg=LoginFailed");
}

%>