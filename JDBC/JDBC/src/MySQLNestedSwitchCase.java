import JdbcConnectionPackage.*;
import java.sql.*;
import java.util.*;

public class MySQLNestedSwitchCase {
	public static void main(String[] args) 
	{
		try {
			switchcase.switchcase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}

class switchcase
{
	public static void switchcase() throws ClassNotFoundException, SQLException {
		
		JDBCOracleConnection jd = new JDBCOracleConnection();
		Connection conn = jd.OracleConnection();
		Statement st = conn.createStatement();
		PreparedStatement ps = null;
		
		Scanner sc = new Scanner(System.in);
		int id,salary;
		String c,name,Uname;
		do
		{
			System.out.print("Enter your choice (1.Insert 2.Display 3.Delete 4.Update): ");
			int choice = sc.nextInt();
			switch (choice)
			{
				case 1:
					System.out.print("Enter the choice (1.All columns 2.Particular Column(id,salary)): ");
					choice = sc.nextInt();
					switch (choice)
					{
						case 1:
							System.out.print("Enter the id: ");
							id = sc.nextInt();
							System.out.print("Enter the name: ");
							name = sc.next();
							System.out.print("Enter the salary: ");
							salary = sc.nextInt();
							ps = conn.prepareStatement("insert into jnit values (?,?,?)");
							ps.setInt(1, id);
							ps.setString(2, name);
							ps.setInt(3, salary);
							int x = ps.executeUpdate();
							if(x!=0)
								System.out.println("All Record inserted successfully");
							break;
						case 2: 
							ps = conn.prepareStatement("insert into jnit (id,salary) values (?,?)");
							System.out.print("Enter the id: ");
							id = sc.nextInt();
							System.out.print("Enter the salary: ");
							salary = sc.nextInt();
							ps.setInt(1, id);
							ps.setInt(2, salary);
							int y = ps.executeUpdate();
							if (y!=0)
								System.out.println("Id and Salary Inserted Successfully");
							break;
						default:
							System.out.println("Sorry Wrong Choice!!");
							break;
					}
					break;
				case 2:
					System.out.print("Enter the choice (1.All Rows and All Columns 2.Particular Row(id search)): ");
					choice = sc.nextInt();
					switch (choice)
					{
						case 1:
							ps = conn.prepareStatement("select * from jnit");
							ResultSet rs = ps.executeQuery();
							System.out.println("ID\tName\tSalary");
							while (rs.next())
							{
								System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
							}
							break;
						case 2: 
							ps = conn.prepareStatement("select * from jnit where id = ?");
							System.out.print("Enter the id whose record you want to search: ");
							id = sc.nextInt();
							ps.setInt(1, id);
							ResultSet rt = ps.executeQuery();
							boolean bool = rt.next();
							if (bool)
							{
								System.out.println("ID\tName\tSalary");
								System.out.println(rt.getInt(1) + "\t" + rt.getString(2) + "\t" + rt.getInt(3));
								while(rt.next())
								{
									System.out.println(rt.getInt(1) + "\t" + rt.getString(2) + "\t" + rt.getInt(3));
									continue;
									
								}
							}
							
							else 
							{
								System.out.println("No record found under the user id " + id);		
							}
							break;
					}
					break;
				case 3:
					System.out.print("Enter the choice (1.All Rows 2.Particular Row): ");
					choice = sc.nextInt();
					switch (choice)
					{
						case 1:
							ps = conn.prepareStatement("delete from jnit");
							int a = ps.executeUpdate();
							if (a!=0)
								System.out.println("All rows deleted from jnit table");
							break;
						case 2: 
							ps = conn.prepareStatement("delete from jnit where id = ?");
							System.out.print("Enter the id you want to delete: ");
							id = sc.nextInt();
							ps.setInt(1, id);
							int b = ps.executeUpdate();
							if (b!=0)
							{
								System.out.println(id + " got deleted successfully.");
							}
							else
							{
								System.out.println(id + " not found.");
							}
							
							break;
					}
					break;
				case 4:
					System.out.print("Enter the choice (1.Name 2.Salary): ");
					choice = sc.nextInt();	
					switch (choice)
					{
						case 1:
							ps = conn.prepareStatement("update jnit set name = ? where name = ?");
							System.out.print("Enter the name you want to update: ");
							name = sc.next();
							System.out.print("Enter the name you want to update to: ");
							Uname = sc.next();
							ps.setString(1, Uname);
							ps.setString(2, name);
							int d = ps.executeUpdate();
							if (d!=0)
							{
								System.out.println("Employee of name " + name + " updated to new name " + Uname);
							}
							else
							{
								System.out.println("Sorry, no record found under the name, " + name);
							}
							break;
						case 2: 
							ps = conn.prepareStatement("update jnit set salary = ? where id = ?");
							System.out.print("Enter the id whose salary you want to update: ");
							id = sc.nextInt();
							System.out.print("Enter the salary you want to update to: ");
							salary = sc.nextInt();
							ps.setInt(1, salary);
							ps.setInt(2, id);
							int e = ps.executeUpdate();
							if (e!=0)
							{
								System.out.println("Employee of id " + id + " salary updated to new salary of " + salary);
							}
							else
							{
								System.out.println("Sorry, no record found under the id, " + id);
							}
							break;
					}
					break;
				default:
					System.out.println("Sorry wrong choice");
					break;
			}
			System.out.print("\nDo you want to continue (y/n):");
			c = sc.next();
		}while(c.equalsIgnoreCase("y"));
		System.out.println("Thank you for using our application!");
	}
}
