<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Profile</title>

<style>


h1 {
  background-color: black;
  color: white;
  text-align:center;
}


</style>
</head>
<body bgcolor="aqua">
<h1>Employee Profile</h1>
<table border="5"> <tr style="background-color:white"><td><a href = "index.html">Home</a></td></tr></table>
<br><br>
<table>
<tr><td><a href="Employee_Profile.jsp">Profile</a> &nbsp;&nbsp;
</td><td><a href = "index.html">Logout</a></td>
</tr>
</table>

<br><br><br>

<%@page import="java.sql.*" %>
<table align="center" width="500" height="150" border="1">

<tr style="background-color:white">
<td>EmployeeID</td>
<td>Username</td>
<td>Email</td>
<td>Phone</td>
<td>City</td>
<td>ZipCode</td>
<td>Department</td>
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
PreparedStatement ps = con.prepareStatement("select * from employee where id=?");
ps.setInt(1,id);

ResultSet rs = ps.executeQuery(); 

 while(rs.next()){
	
%>
<tr>
<td><%=rs.getInt("id") %></td>
<td><%=rs.getString("username")%></td>
<td><%=rs.getString("email")%></td>
<td><%=rs.getLong("phone")%></td>
<td><%=rs.getString("city")%></td>
<td><%=rs.getString("zipcode")%></td>
<td><%=rs.getString("department")%></td>
<td><a href="updateprofile_employee.jsp?id=<%=rs.getInt("id")%>">Update</a></td>
</tr>

<%
 }
%>

</table>

</body>
</html>