<%@page import="java.sql.*" %>

<%
Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);

String user = request.getParameter("user");
String email = request.getParameter("email");
Long phone = Long.parseLong(request.getParameter("phone"));
String city = request.getParameter("department");
String meeting_date = request.getParameter("meeting_date");
String meeting_time = request.getParameter("meeting_time");

Object o = session.getAttribute("id");
int id = (Integer)o;

PreparedStatement ps = con.prepareStatement("insert into employee_meeting (username,email,phone,department,meeting_date,meeting_time,id) values (?,?,?,?,?,?,?)");

ps.setString(1,user);
ps.setString(2,email);
ps.setLong(3,phone);
ps.setString(4,city);
ps.setString(5,meeting_date);
ps.setString(6,meeting_time);
ps.setInt(7,id);

int x = ps.executeUpdate();

if (x!=0)
	response.sendRedirect("./employee_home.html?msg=MeetingSet");

%>