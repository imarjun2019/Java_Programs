/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-21 21:34:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Employee_005fProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Employee Profile</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("body\r\n");
      out.write("{\r\n");
      out.write("\tbackground-color:\"green\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("  background-color: black;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table{\r\n");
      out.write("\tborder: 4px solid;\r\n");
      out.write("\talign:center; \r\n");
      out.write("\twidth:700;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"aqua\">\r\n");
      out.write("<h1>Employee Profile</h1>\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td><a href=\"Employee_Home.jsp\">EmployeeHome</a> &nbsp;&nbsp;</td>\r\n");
      out.write("<td><a href = \"index.html\">Logout</a>&nbsp;&nbsp;&nbsp;&nbsp;</td> \r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table border=\"3px\" width=\"700\" height=\"100\" align=\"center\">\r\n");
      out.write("<tr bgcolor=\"white\">\r\n");
      out.write("<td>EID</td>\r\n");
      out.write("<td>Username</td>\r\n");
      out.write("<td>Email</td>\r\n");
      out.write("<td>Phone</td>\r\n");
      out.write("<td>Department</td>\r\n");
      out.write("<td>Remaining Leave Days</td>\r\n");
      out.write("<td>Action</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/lr";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);

Object o = session.getAttribute("id");
int id = (Integer)o;

PreparedStatement ps = con.prepareStatement("select * from emp where eid=?");
ps.setInt(1,id);
ResultSet rs = ps.executeQuery();

while(rs.next()) 
{

      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>");
      out.print(rs.getInt("eid"));
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString("username") );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString("email") );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getLong("phone") );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString("department") );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString("remainingleavedays") );
      out.write("</td>\r\n");
      out.write("<td><a href=\"Employee_Update.jsp?id=");
      out.print(rs.getInt("eid"));
      out.write("\">Update</a></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
