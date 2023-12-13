//import java.sql package
import java.sql.*;
public class JDBCprogram2 {

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "test";
		
		String query = "CREATE TABLE STUDENT(ROLL INT, NAME VARCHAR(10))";
		
      
		try {
			 // Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully");
			
			// Establish the connection
			Connection con =DriverManager.getConnection(url, username, password);
			System.out.println("Connection establish succesfully");
			
			// creating the statement
			Statement stmt = con.createStatement();
			
			// Executing the query
			stmt.execute(query);
			System.out.println("Query is executed ");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
