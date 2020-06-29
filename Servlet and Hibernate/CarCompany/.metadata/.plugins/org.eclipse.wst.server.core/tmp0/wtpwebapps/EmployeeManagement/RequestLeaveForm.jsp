<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave Registration</title>



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
<h1> Leave Application </h1>
<table border="5"> <tr style="background-color:white"><td><a href = "index.html">Home</a></td></tr></table>
<br><br>
<table>
<tr>
<td><a href="Employee_Profile.jsp">MyProfile</a> &nbsp;&nbsp;</td>
<td><a href="Employee_Home.jsp">EmployeeHome</a> &nbsp;&nbsp;</td>
</tr>
</table>

<form action="./RequestLeave.jsp" method="post">
<table align ="center">


<tr>
<td><input type="hidden" name="lid"></td>
</tr>

<tr>
<td>Username: </td>
<td><input type="text" name="user"></td>
</tr>


<tr>
<td>Email:</td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td>Phone:</td>
<td><input type="text" name="phone"></td>
</tr>

<tr>
<td>Department:</td>
<td><input type="text" name="department"></td>
</tr>

<tr>
<td>Reason for Leave:</td>
<td><input type="text" name="reasonforleave"></td>
</tr>

<tr>
<td>Start Date:</td>
<td><input type="date" name="startdate"></td>
</tr>

<tr>
<td>End Date:</td>
<td><input type="date" name="enddate"></td>
</tr>


<tr>
<td align="center"><input type="submit" value="Submit Application"></td>
</tr>
</table>

</form>

</body>
</html>