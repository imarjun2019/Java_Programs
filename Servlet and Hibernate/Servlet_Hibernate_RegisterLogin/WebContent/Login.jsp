 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login</title>

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
<body bgcolor="87CEEB">
<h1>Student Login</h1>
<table border="5"> <tr style="background-color:white"><td><a href = "index.jsp">Home</a></td></tr></table>
<form action="./Login_Servlet" method="post">
<table align ="center">

<tr>
<td>Username:</td>
<td><input type="text" name="user"></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="password" name="pass"></td>
</tr>


<tr>
<td align="center"><input type="submit" value="Login"></td>
</tr>
</table>


</form>
</body>
</html>