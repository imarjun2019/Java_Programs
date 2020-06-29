// JDBC Oracle Connection
import java.sql.*;
import java.util.*;

public class JdbcOracle
{
	public static void main (String args[]) throws Exception
	{
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","orcl","Arjun226");
			if (con!=null)
				System.out.println("Connection Established");
		
		
		Statement st = con.createStatement();
		
		
		int x = st.executeUpdate("insert into jnit values (15,'Donny',121000)");
		if (x!=0)
			System.out.println("Record Inserted Successfully");
		
		
		int y = st.executeUpdate("update jnit set salary=15000 where id=13");
		if (y!=0)
			System.out.println("Record Updated Successfully");
		
		int z = st.executeUpdate("delete from jnit where id=14");
		if (z!=0)
			System.out.println("Record Deleted Successfully");
		
		
		/*
		Scanner console = new Scanner(System.in);
		
		int x=0, id, salary;
		String name;
		for (int i = 1; i<=3; i++)
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