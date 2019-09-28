package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		  System.out.println("Driver Successfully Registered");
		  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","sanju123");
		  System.out.println("Successfully Connected to Oracle"); 
		  
	}
	
	public static void insertValues(Connection con) throws SQLException
	{
		Statement stmt = con.createStatement();
		stmt.executeUpdate("");
	}
}
