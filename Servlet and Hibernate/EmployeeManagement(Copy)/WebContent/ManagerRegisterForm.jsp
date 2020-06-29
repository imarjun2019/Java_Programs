<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Registration</title>



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
<h1> Manager Registration Page </h1>
<table border="5"> <tr style="background-color:white"><td><a href = "index.html">Home</a></td></tr></table>
<form action="./ManagerRegister.jsp" method="post">
<table align ="center">

<tr>
<td><input type="hidden" name="mid"></td>
</tr>

<tr>
<td>Username:</td>
<td><input type="text" name="user"></td>
</tr>


<tr>
<td>Password:</td>
<td><input type="password" name="pass"></td>
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
<td><input type="hidden" name="leavedays"></td>
</tr>

<tr>
<td align="center"><input type="submit" value="Register"></td>
</tr>
</table>

</form>

</body>
</html>