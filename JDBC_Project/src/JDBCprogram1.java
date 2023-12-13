//1.import java.sql package
import java.sql.*;
public class JDBCprogram1 {

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "test";
      
		try {
			 //	2. Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully");
			
			// 3. Establish the connection
			DriverManager.getConnection(url, username, password);
			System.out.println("Connection establish succesfully");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
