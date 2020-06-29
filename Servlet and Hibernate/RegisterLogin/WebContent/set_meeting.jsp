 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set Meeting</title>

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
<h1>Set Meeting</h1>
<table border="5"> <tr style="background-color:white"><td><a href = "index.html">Home</a></td></tr></table>
<form action="./meeting_set.jsp" method="post">
<table align ="center">

<tr>
<td>Username:</td>
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
<td>Meeting Date:</td>
<td><input type="date" name="meeting_date"></td>
</tr>

<tr>
<td>Meeting Time:</td>
<td><input type="text" name="meeting_time"></td>
</tr>

<tr>
<td align="center"><input type="submit" value="Set Meeting"></td>
</tr>
</table>


</form>
</body>
</html>