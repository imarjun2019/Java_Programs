<%@page import="java.sql.*,java.util.*,java.text.*" %>

<%
Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);

String user = request.getParameter("user");
String email = request.getParameter("email");
String mobile = request.getParameter("phone");
Long phone = Long.parseLong(mobile);
String department = request.getParameter("department");
String rfl = request.getParameter("reasonforleave");
String stdt = request.getParameter("startdate");
String eddt = request.getParameter("enddate");

SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
long diff = (dt.parse(eddt)).getTime()-(dt.parse(stdt)).getTime();
int ld = (int) (diff/(24*60*60*1000));
int leavedays;
if (ld<0)
	leavedays=0;
else
	leavedays=ld;

Object o = session.getAttribute("id");
int id = (Integer)o;

PreparedStatement ps = con.prepareStatement("insert into leavereq (eid,username,email,phone,department,reasonforleave,startdate,enddate,leavedays) values (?,?,?,?,?,?,?,?,?)");

ps.setInt(1,id);
ps.setString(2,user);
ps.setString(3,email);
ps.setLong(4, phone);
ps.setString(5, department);
ps.setString(6,rfl );
ps.setString(7,stdt);
ps.setString(8,eddt);
ps.setInt(9,leavedays);



int x = ps.executeUpdate();

if(x!=0)
{
	response.sendRedirect("./Employee_Profile.jsp");
}

%>