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

table{
	border: 4px solid;
	align:center; 
	width:700;
}

</style>
</head>
<body bgcolor="87CEEB ">
<h1>Student Profile</h1>
<table>
<tr>
<td><a href="Student_Home.jsp">StudentHome</a> &nbsp;&nbsp;</td>
<td><a href = "index.html">Logout</a>&nbsp;&nbsp;&nbsp;&nbsp;</td> 
</tr>
</table>

<br><br><br>

<%@page import="java.sql.*" %>

<table border="3px" width="700" height="100" align="center">
<tr bgcolor="white">
<td>Username</td>
<td>Email</td>
<td>Action</td>
</tr>




<%

Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);

Object o = session.getAttribute("username");
String uname = (String)o;

PreparedStatement ps = con.prepareStatement("select * from emp where username=?");
ps.setString(1,uname);
ResultSet rs = ps.executeQuery();

while(rs.next()) 
{
%>
<tr>
<td><%=rs.getString("username") %></td>
<td><%=rs.getString("email") %></td>
<td><a href="Student_Update.jsp?id=<%=rs.getString("username")%>">Update</a></td>
</tr>

<%
}
%>

</table>
</body>
</html>
