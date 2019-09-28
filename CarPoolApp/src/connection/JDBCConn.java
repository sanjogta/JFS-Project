package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConn {
  public static void main(String[] args) throws ClassNotFoundException, SQLException
  {
	  //Step 1: Register the JDBC driver.
	  Class.forName("com.mysql.jdbc.Driver"); 
	  
	  //Step 2: Create a connection with Mysql.
	  //Here the first String parameter is the database name, second String parameter is the username and last
	  // one is the password.
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost/my_first_schema","root","sanju123");
	  System.out.println("Connection established successfully");
	  
	  //Step 3: Close the connection.
	  con.close();
	  System.out.println("Connection closed");
  }
}
