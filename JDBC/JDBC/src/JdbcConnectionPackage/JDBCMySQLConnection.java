package JdbcConnectionPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCMySQLConnection {
	public Connection MySQLConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jnit";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url,username,password);
		if (con!=null)
			System.out.println("Connection Established");
		return con;
	}
}

