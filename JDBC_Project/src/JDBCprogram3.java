//import java.sql package
import java.sql.*;
public class JDBCprogram3 {

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "test";
		
		String query = "insert into student values(1,'RAJ'),(2,'AMIT') ";
		
      
		try {
			
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
