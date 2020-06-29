<%@page import = "java.sql.* "%>

<%

Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);

String user = request.getParameter("user");

String email = request.getParameter("email");

String phone = request.getParameter("phone");
Long mobile = Long.parseLong(phone);

String city = request.getParameter("city");

String zip = request.getParameter("zip");
int zipcode = Integer.parseInt(zip);

String department = request.getParameter("department");

String x = request.getParameter("id");
int id = Integer.parseInt(x);

PreparedStatement ps = con.prepareStatement("update employee set username=?, email=?, phone=?, city=?, zipcode=?, department=? where id=?");

ps.setString(1,user);
ps.setString(2,email);
ps.setLong(3,mobile);
ps.setString(4,city);
ps.setInt(5,zipcode);
ps.setString(6,department);
ps.setInt(7,id);

int k = ps.executeUpdate();
if (k!=0)
{
	response.sendRedirect("./Employee_Profile.jsp");
}
%>