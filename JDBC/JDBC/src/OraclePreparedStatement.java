
import java.sql.*;
import JdbcConnectionPackage.*;

public class OraclePreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		JDBCOracleConnection jd = new JDBCOracleConnection();
		Connection con = jd.OracleConnection();
		
		PreparedStatement st = con.prepareStatement("insert into jnit values (?,?,?)");
		st.setInt(1,1122);
		st.setString(2, "Tiger");
		st.setInt(3, 505050);
		
		int x = st.executeUpdate();
		if (x!=0)
			System.out.println("Record Inserted");
		
		PreparedStatement u = con.prepareStatement("update jnit set name=?, salary=? where id=?");
		u.setString(1,"Rock");
		u.setInt(2, 5555555);
		u.setInt(3, 12);
		
		int y = u.executeUpdate();
		if (y!=0)
			System.out.println("Record Updated");
		
		PreparedStatement d = con.prepareStatement("delete from jnit where id=?");
		d.setInt(1, 12451);
		
		int z = d.executeUpdate();
		if (z!=0)
			System.out.println("Record Deleted");
	}

}
