//JDBC Oracle Connection
import java.sql.*;
import java.util.*;

public class OracleSelect
{
	public static void main (String args[]) throws Exception
	{
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","orcl","Arjun226");
			if (con!=null)
				System.out.println("Connection Established");
		
		
		Statement st = con.createStatement();
		
		Scanner sc = new Scanner (System.in);
		int id, salary;
		String name, temp;
		/*
		do
		{
			System.out.print("Enter the id: ");
			id = sc.nextInt();
			System.out.print("Enter the name: ");
			name = sc.next();
			System.out.print("Enter the salary: ");
			salary = sc.nextInt();
			int x = st.executeUpdate("insert into jnit values ("+id+",'"+name+"',"+salary+")");
			if (x!=0)
			{
				System.out.println();
			}
			System.out.print("Do you want to continue");
			temp = sc.next();
		}while(temp.contentEquals("y"));
		*/

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
		System.out.println("\n\n");
		
		ResultSet a = st.executeQuery("select * from jnit_dept");
		System.out.println("ID\tDeptID\tName");
		while(a.next())
		{
			System.out.println(a.getInt(1) + "\t" + a.getInt(2) + "\t" + a.getString(3));
		}



		/*
		ResultSet rs = st.executeQuery("select a.id,a.name,a.salary,b.deptid,b.deptname,c.name from jnit_emp a inner join jnit_dept b on a.id=b.id inner join jnit_dept_manager c on b.deptid = c.deptid");
		System.out.println("ID\tName\tSalary\tDeptID\tDeptName\tManager Name");
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + rs.getInt(4)
					+ "\t" + rs.getString(5) + "\t" + rs.getString(6) );
		}

		 */






	}
	
}
