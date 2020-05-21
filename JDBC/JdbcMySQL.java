// JDBC MySQL Connection
import java.sql.*;
import java.util.*;

public class JdbcMySQL
{
	public static void main (String args[]) throws Exception
	{
		Scanner console = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jnit";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url,username,password);
		if (con!=null)
			System.out.println("Connection Established");
		
		Statement st = con.createStatement();
		
		
		int x = st.executeUpdate("insert into jnit values (3,'Dravid',12000)");
		if (x!=0)
			System.out.println("Record Inserted Successfully");
		
		int y = st.executeUpdate("update jnit set salary=15000 where id=2");
		if (y!=0)
			System.out.println("Record Updated Successfully");
		
		int z = st.executeUpdate("delete from jnit where id=2");
		if (z!=0)
			System.out.println("Record Deleted Successfully");
		/*
		int x=0, id, salary;
		String name;
		for (int i = 1; i<=5; i++)
		{
		System.out.print("\nEnter employee id: ");
		id = console.nextInt();
		System.out.print("Enter employee name: ");
		name = console.next();
		System.out.print("Enter employee salary: ");
		salary = console.nextInt();
		x = st.executeUpdate("insert into jnit values ("+id+",'"+name+"',"+salary+")");
		}
		
		if (x!=0)
			System.out.println("Record Inserted Successfully");
		*/

			
		
		
		
		
		

		
	}
	
}