<%@page import="com.mvc.LoginMVCClass"%>

<html>
<body bgcolor="darkslategray">

<h1 style="color:white;background-color:chocolate" align="center">Success Page</h1>

<a href="Index.jsp" style="color:white;border-style:solid;font-size:25px">Logout</a>&nbsp;&nbsp;


<h3 style="color:black;background-color:floralwhite" align="center">You are successfully logged in as 

<%
Object o = session.getAttribute("bean");
LoginMVCClass lc = (LoginMVCClass)o;


%>
<%=lc.getUsername() %>

</h3>



</body>


</html>