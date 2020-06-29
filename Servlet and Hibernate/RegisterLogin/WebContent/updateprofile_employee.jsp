<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>



<style>

table{
	border:3px solid;
	
}

tr{
	text-align:center;
}

body
{
	background-color: aqua;

}

h1 {
  background-color: black;
  color: white;
  text-align:center;
}


</style>
</head>
<body>
<h1> Employee Profile Update </h1>
<table border="5"> <tr style="background-color:white"><td><a href = "index.html">Home</a></td></tr></table>

<%@page import="java.sql.*" %>

<%
Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);

String id = request.getParameter("id");
int x = Integer.parseInt(id);

PreparedStatement ps = con.prepareStatement("select * from employee where id = ?");
ps.setInt(1,x);
ResultSet rs = ps.executeQuery();

if(rs.next())
{
%>

<form action="./employeeprofile_update.jsp" method="post">
<table align ="center">

<tr>
<td><input type="hidden" name="id" value="<%=rs.getString("id") %>"></td>
</tr>

<tr>
<td>Username:</td>
<td><input type="text" name="user" value="<%=rs.getString("username") %>"></td>
</tr>

<tr>
<td>Email:</td>
<td><input type="text" name="email" value="<%=rs.getString("email") %>"></td>
</tr>

<tr>
<td>Phone:</td>
<td><input type="text" name="phone" value="<%=rs.getString("phone") %>"></td>
</tr>

<tr>
<td>City:</td>
<td><input type="text" name="city" value="<%=rs.getString("city") %>"></td>
</tr>
 
 <tr>
<td>ZipCode:</td>
<td><input type="text" name="zip" value="<%=rs.getString("zipcode") %>"></td>
</tr>

 <tr>
<td>Department:</td>
<td><input type="text" name="department" value="<%=rs.getString("department") %>"></td>
</tr>

<tr>
<td align="center"><input type="submit" value="Update"></td>
</tr>
</table>

</form>

<%
}
%>




</body>
</html>