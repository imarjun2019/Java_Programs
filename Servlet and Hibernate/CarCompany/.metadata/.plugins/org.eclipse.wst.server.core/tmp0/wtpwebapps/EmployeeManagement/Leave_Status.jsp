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
<h1>Leave Status</h1>
<table border="5"> <tr style="background-color:white"><td><a href = "index.html">Home</a></td></tr></table>
<br><br>
<table>
<tr><td><a href="Employee_Profile.jsp">Profile</a> &nbsp;&nbsp;
</td><td><a href = "index.html">Logout</a></td>
</tr>
</table>

<br><br><br>

<%@page import="java.sql.*"%>
<table align="center" width="1200" height="150" border=1>

<tr bgcolor="white">
<td>LeaveID</td>
<td>EmployeeID</td>
<td>Username</td>
<td>Email</td>
<td>Phone</td>
<td>Department</td>
<td>Reason</td>
<td>Start Date</td>
<td>End Time</td>
<td>Leave Days</td>
<td>Status</td>
</tr>

<%
Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);

Object o = session.getAttribute("id");
int id = (Integer)o;

PreparedStatement ps = con.prepareStatement("select * from leavereq where eid=?");
ps.setInt(1, id);
ResultSet rs = ps.executeQuery(); 

 while(rs.next())
 {
	
%>
<tr>
<td><%=rs.getInt("lid") %></td>
<td><%=rs.getInt("eid") %></td>
<td><%=rs.getString("username")%></td>
<td><%=rs.getString("email")%></td>
<td><%=rs.getLong("phone")%></td>
<td><%=rs.getString("department")%></td>
<td><%=rs.getString("reasonforleave") %></td>
<td><%=rs.getString("startdate")%></td>
<td><%=rs.getString("enddate")%></td>
<td><%=rs.getInt("leavedays") %></td>
<td><%=rs.getString("action")%></td>
</tr>

<%
 }
%>

</table>

</body>
</html>