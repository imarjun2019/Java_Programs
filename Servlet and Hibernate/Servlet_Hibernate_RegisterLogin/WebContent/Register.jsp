<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>

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
	border: 3px solid;
}


</style>
</head>
<body bgcolor="87CEEB">
<h1>Student Register Page</h1>
<table border="5"> <tr style="background-color:white"><td><a href = "index.jsp">Home</a></td></tr></table>
<br><br><br>
<form action="./register_servlet" method="post">
Username:<input type="text" name="user">  
Password:<input type="password" name="pass">
Email:<input type="email" name="email">

<input type="submit" value="Register"> 
</form>

</body >
</html>