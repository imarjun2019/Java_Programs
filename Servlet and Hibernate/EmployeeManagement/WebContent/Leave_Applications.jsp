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
<h1>Leave Applications</h1>
<table border="5"> <tr style="background-color:white"><td><a href = "index.html">Home</a></td></tr></table>
<br><br>
<table>
<tr><td><a href="Manager_Profile.jsp">Profile</a> &nbsp;&nbsp;
</td><td><a href = "index.html">Logout</a></td>
</tr>
</table>

<br><br><br>

<%@page import="java.sql.*"%>
<table align="center" width="1100" height="150" border=1>

<tr bgcolor="white">
<td>LeaveID</td>
<td>EmployeeID</td>
<td>Username</td>
<td>Email</td>
<td>Phone</td>
<td>Department</td>
<td>Reason for Leave</td>
<td>Start Date</td>
<td>End Date</td>
<td>Number of Leave Days</td>
<td>Action</td>
</tr>

<%
Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);
Object ob = session.getAttribute("id");
int id = (Integer)ob;

String department = (String) session.getAttribute("department");

PreparedStatement ps = con.prepareStatement("select * from leavereq where department=?");
ps.setString(1 , department);
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
<td><%=rs.getString("reasonforleave") %>
<td><%=rs.getString("startdate")%></td>
<td><%=rs.getString("enddate")%></td>
<td><%=rs.getInt("leavedays")%></td>
<td><a href="accept.jsp?id=<%=rs.getInt("lid")%>">Accept</a>
<a href="deny.jsp?id=<%=rs.getInt("lid")%>">Deny</a> </td>
</tr>

<%
 }
%>

</table>

</body>
</html>