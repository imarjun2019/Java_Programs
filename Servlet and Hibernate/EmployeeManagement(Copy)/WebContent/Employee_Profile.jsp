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
<body bgcolor="aqua">
<h1>Employee Profile</h1>
<table>
<tr>
<td><a href="Employee_Home.jsp">EmployeeHome</a> &nbsp;&nbsp;</td>
<td><a href = "index.html">Logout</a>&nbsp;&nbsp;&nbsp;&nbsp;</td> 
</tr>
</table>

<br><br><br>

<%@page import="java.sql.*" %>

<table border="3px" width="700" height="100" align="center">
<tr bgcolor="white">
<td>EID</td>
<td>Username</td>
<td>Email</td>
<td>Phone</td>
<td>Department</td>
<td>Remaining Leave Days</td>
<td>Action</td>
</tr>




<%

Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);

Object o = session.getAttribute("id");
int id = (Integer)o;

PreparedStatement ps = con.prepareStatement("select * from emp where eid=?");
ps.setInt(1,id);
ResultSet rs = ps.executeQuery();

while(rs.next()) 
{
%>
<tr>
<td><%=rs.getInt("eid")%></td>
<td><%=rs.getString("username") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getLong("phone") %></td>
<td><%=rs.getString("department") %></td>
<td><%=rs.getString("remainingleavedays") %></td>
<td><a href="Employee_Update.jsp?id=<%=rs.getInt("eid")%>">Update</a></td>
</tr>

<%
}
%>
</table>
</body>
</html>
