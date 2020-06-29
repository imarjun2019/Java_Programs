import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import JdbcConnectionPackage.*;

public class OracleSwitchCase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException { 
		
		JDBCOracleConnection jd = new JDBCOracleConnection();
		Connection con = jd.OracleConnection();
		Statement st = con.createStatement();
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the choice (1.Insert  2. Display  3. Delete) :");
		int choice = sc.nextInt();
		switch (choice)
		{
		case 1:
			ps = con.prepareStatement("insert into jnit values (?,?,?)");
			ps.setInt(1, 11);
			ps.setString(2, "Mukesh");
			ps.setInt(3, 4565000);
			int x = ps.executeUpdate();
			if (x!=0)
				System.out.println("Record Inserted!");
			break;
		case 2:
			ps = con.prepareStatement("select * from jnit");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
			}
			break;
			
		case 3:
			ps = con.prepareStatement("delete from jnit where id=?");
			ps.setInt(1,1122);
			int y = ps.executeUpdate();
			if (y!=0)
				System.out.println("Record Deleted");
			else
				System.out.println("No record found!");
			break;
		}
		
	}
	

	

}
