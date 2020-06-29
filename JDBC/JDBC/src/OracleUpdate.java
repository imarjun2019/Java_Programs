import java.sql.*;

public class OracleUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","orcl","Arjun226");
		if (con!=null)
			System.out.println("Connection Established");
	
	
		Statement st = con.createStatement();
		
		int x = st.executeUpdate("update jnit set salary = salary+5000 where id in (1,2)");
		if (x!=0)
			System.out.println("Record Upated");
		
		int y = st.executeUpdate("delete from jnit where id in (3,4)");
		if (y!=0)
			System.out.println("Record deleted");
	}

}
