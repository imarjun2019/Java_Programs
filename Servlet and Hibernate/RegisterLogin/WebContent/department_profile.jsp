<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Profile</title>

<style>

body
{
	background-color:"green";
}

h1 {
  background-color: black;
  color: white;
  text-align:center;
}


</style>
</head>
<body bgcolor="aqua">
<h1>Department Profile</h1>
<table border="5"> <tr style="background-color:white"><td><a href = "index.html">Home</a></td></tr></table>
<br><br>
<table>
<tr><td><a href="department_profile.jsp">Profile</a> &nbsp;&nbsp;
</td><td><a href = "index.html">Logout</a></td>
</tr>
</table>

<br><br><br>

<%@page import="java.sql.*"%>
<table align="center" width="700" height="150" border=1>

<tr>
<td>DepartmentID</td>
<td>Username</td>
<td>Email</td>
<td>Phone</td>
<td>Department Name</td>
</tr>

<%
Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);

Object ob = session.getAttribute("id");
int id = (Integer)ob;

PreparedStatement ps = con.prepareStatement("select * from department where did=?");
ps.setInt(1,id);
ResultSet rs = ps.executeQuery(); 

 while(rs.next())
 {
	
%>
<tr>
<td><%=rs.getInt("did") %></td>
<td><%=rs.getString("username")%></td>
<td><%=rs.getString("email")%></td>
<td><%=rs.getLong("phone")%></td>
<td><%=rs.getString("department")%></td>

</tr>

<%
 }
%>

</table>

</body>
</html>