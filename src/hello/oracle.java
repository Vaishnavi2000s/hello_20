package hello;
import java.sql.*;  
public class oracle {
	public static void main(String args[])
	{
	
		try {
			
	Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@//localhost:1521/orcl.iiht.tech";
			
			String userName = "scott";
			
			String password = "tiger";
			
			Connection con = DriverManager.getConnection(url,userName,password);
		
			Statement stmt = con.createStatement();
			
			
			ResultSet rs = stmt.executeQuery("select * from hello");
					while(rs.next())
		{
			System.out.println(rs.getString(1)+":"+rs.getString(2)+
			":"+rs.getString(3));
			
		}
			
		con.close();  
	
			  
			
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		
	}
		
}