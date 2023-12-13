//import java.sql package
import java.sql.*;
public class JDBCprogram6 {

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "test";
		
		String query = "SELECT * FROM STUDENT";
		
      
		try {
			 // Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully");
			
			// Establish the connection
			Connection con =DriverManager.getConnection(url, username, password);
			System.out.println("Connection establish succesfully");
			
			// creating the statement
			Statement stmt = con.createStatement();
			
			// Executing the query and getting the result set
			ResultSet rs = stmt.executeQuery(query);
			
			// Fetching the data using Result Set
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
