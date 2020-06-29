<html>
<head>
<title> Index Page </title>
</head>
<body bgcolor="darkslategray">

<a href="Index.jsp" style="color:white;border-style:solid;font-size:25px">Home</a>&nbsp;&nbsp;&nbsp
<a href="Login.jsp" style="color:white;border-style:solid;font-size:25px">Login</a>


<h1 style="color:white;background-color:chocolate" align="center">Registration Page</h1>


<table border="5" align="center">

<form action="./register" method="post">

<tr><td bgcolor="white" style="color:red">Username: </td><td><input type="text" name="username" placeholder="Enter the Username"></td></tr>
<tr><td bgcolor="white" style="color:red">Password: </td><td><input type="password" name="password" placeholder="Enter the password"></td></tr>
<tr><td bgcolor="white" style="color:red">Email: </td><td><input type="text" name="email" placeholder="Enter the email"></td></tr>
<tr><td bgcolor="white" style="color:red">Phone: </td><td><input type="text" name="phone" placeholder="Enter the phone number"></td></tr>
<tr><td bgcolor="white" style="color:red">Department: </td><td><input type="text" name="department" placeholder="Enter the department"></td></tr>
<tr><td bgcolor="white" style="color:red">Gender: </td><td><input type="radio" id="male" name="gender" value="male">
<label for="male">Male</label><br>
<input type="radio" id="female" name="gender" value="female">
<label for="female">Female</label><br>
<input type="radio" id="other" name="gender" value="other">
<label for="other">Other</label><br>
</td></tr>
<tr><td align="center" bgcolor="black"><input type="submit" value="Register"></td></tr>


</table>


</form>




</body>




</html>