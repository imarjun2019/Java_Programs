import java.sql.*;

import JdbcConnectionPackage.*;

public class DatabaseMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException { 
		
		JDBCOracleConnection jd = new JDBCOracleConnection();
		Connection con = jd.OracleConnection();
		Statement st = con.createStatement();
		PreparedStatement ps = null;
		//Scanner sc = new Scanner(System.in);
		
		ps = con.prepareStatement("select * from jnit");
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmd =  rs.getMetaData();
		System.out.println("Total Column = " + rsmd.getColumnCount());
		System.out.println("Column name of 1st : " + rsmd.getColumnName(1));
		System.out.println("Type " + rsmd.getColumnTypeName(2));
		
		DatabaseMetaData dmd = con.getMetaData();
			
	}
}
