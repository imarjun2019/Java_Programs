package JdbcConnectionPackage;
import java.sql.*;

public class JDBCOracleConnection 
{
	public Connection OracleConnection() throws ClassNotFoundException, SQLException
	{
		
	 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","orcl","Arjun226");
		if (con!=null)
			System.out.println("Connection Established");
	
		Statement st = con.createStatement();
		//return con;
	
	 return con;
	 
	}
	
	

	 	
}
