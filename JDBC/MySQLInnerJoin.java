import java.sql.*;
// Package import
import JdbcConnectionPackage.*;

public class MySQLInnerJoin {
	public static void main(String[] args) {
		try {
			InnerJoinSQL in = new InnerJoinSQL();
			System.out.println("\nAvailable Tables in MySQL JNIT Database");
			in.view_table();
			System.out.println("\nInner Joined Tables");
			in.jnit_table();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class InnerJoinSQL
{
	JDBCMySQLConnection jd = new JDBCMySQLConnection();
	Connection con = jd.MySQLConnection();
	Statement st = con.createStatement();

	InnerJoinSQL() throws SQLException, ClassNotFoundException {
	}
	
		public void view_table() throws Exception
		{
			ResultSet rs = st.executeQuery("select * from jnit_emp");
			System.out.println("ID\tName\tSalary");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
			}
			
			System.out.println("\n");
			
			ResultSet ra = st.executeQuery("select * from jnit_dept_manager");
			System.out.println("ID\tName");
			while(ra.next())
			{
				System.out.println(ra.getInt(1) + "\t" + ra.getString(2));
			}
			System.out.println("\n");
			
			ResultSet a = st.executeQuery("select * from jnit_dept");
			System.out.println("ID\tDeptID\tManager Name");
			while(a.next())
			{
				System.out.println(a.getInt(1) + "\t" + a.getInt(2) + "\t" + a.getString(3));
			}
		}
		
		public void jnit_table() throws SQLException, ClassNotFoundException
		{
			
			ResultSet rs = st.executeQuery("select a.id,a.name,a.salary,b.deptid,b.deptname,c.managername from jnit_emp a inner join jnit_dept b on a.id=b.id inner join jnit_dept_manager c on b.deptid = c.deptid");
			System.out.println("ID\tName\tSalary\tDeptID\tDeptName\tManagerName");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getInt(4)
									+ "\t" + rs.getString(5) + "\t\t" + rs.getString(6) );
			}
		}
}