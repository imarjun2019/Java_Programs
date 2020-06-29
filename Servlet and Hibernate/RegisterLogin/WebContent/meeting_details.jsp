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
<h1>Meeting Details</h1>
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
<td>MeetingID</td>
<td>Username</td>
<td>Email</td>
<td>Phone</td>
<td>Department</td>
<td>Meeting Date</td>
<td>Meeting Time</td>
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
PreparedStatement ps = con.prepareStatement("select * from employee_meeting where department=?");
ps.setString(1 , department);
ResultSet rs = ps.executeQuery(); 

 while(rs.next())
 {
	
%>
<tr>
<td><%=rs.getInt("mid") %></td>
<td><%=rs.getString("username")%></td>
<td><%=rs.getString("email")%></td>
<td><%=rs.getLong("phone")%></td>
<td><%=rs.getString("department")%></td>
<td><%=rs.getString("meeting_date")%></td>
<td><%=rs.getString("meeting_time")%></td>
<td><a href="accept.jsp?id=<%=rs.getInt("mid")%>">Accept</a></td>



</tr>

<%
 }
%>

</table>

</body>
</html>