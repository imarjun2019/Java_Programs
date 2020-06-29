<%@page import="java.sql.*,java.text.*,java.util.*"%>

<%
Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);
/*
String id = request.getParameter("id");
int mid = Integer.parseInt(id);
PreparedStatement ps = con.prepareStatement("update leavereq set action='Accepted' where lid=?");
ps.setInt(1,mid);
int x = ps.executeUpdate();
if (x!=0)
	response.sendRedirect("./Leave_Applications.jsp?msg=Accepted");
*/


String id = request.getParameter("id");
int lid = Integer.parseInt(id);


PreparedStatement ps = con.prepareStatement("select a.lid,a.eid,a.username,a.email,a.department,a.leavedays,b.remainingleavedays from leavereq a inner join emp b on a.eid=b.eid where lid=?;");
ps.setInt(1,lid);
ResultSet rs = ps.executeQuery();

if(rs.next())
{
	int a = rs.getInt("remainingleavedays");
	int b = rs.getInt("leavedays");
	int c = rs.getInt("eid");
	int d = rs.getInt("lid");
	if(b<a)
	{
		PreparedStatement ps1 = con.prepareStatement("update emp set remainingleavedays=(?-?) where eid=?");
		ps1.setInt(1,a);
		ps1.setInt(2,b);
		ps1.setInt(3,c);
		int x = ps1.executeUpdate();
		
		PreparedStatement ps2 = con.prepareStatement("update leavereq set action='Accepted' where lid=?");
		ps2.setInt(1,d);
		int y = ps2.executeUpdate();
		
		if (x!=0 && y!=0)
			response.sendRedirect("./Leave_Applications.jsp?msg=Accepted");
		
	}
	else
	{
		PreparedStatement ps2 = con.prepareStatement("update leavereq set action = 'Denied!! Exceeded your Total Leave Days' where lid=?");
		ps2.setInt(1,lid);
		
		int y = ps2.executeUpdate();
		if (y!=0)
			response.sendRedirect("./Leave_Applications.jsp?msg=Denied! Exceeded your total leave days");

			
	}

}

















%> 