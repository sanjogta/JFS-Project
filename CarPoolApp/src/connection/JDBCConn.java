package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConn {
  public static void main(String[] args) throws ClassNotFoundException, SQLException
  {
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost/my_first_schema","root","sanju123");
	  System.out.println("Connection established successfully");
	  con.close();
	  System.out.println("Connection closed");
  }
}
