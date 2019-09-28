package createTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTab {
  public static void main(String[] args) throws ClassNotFoundException, SQLException
  {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/my_first_schema","root","sanju123");
	System.out.println("Connection established successfully");
	
	final String CREATE_EMP="CREATE TABLE EMP_DETAILS (EMPID VARCHAR(6),NAME VARCHAR(50)NOT NULL,CONTACT INTEGER(10) NOT NULL,PASSWORD VARCHAR(8)NOT NULL,DT DATE NOT NULL, PRIMARY KEY (EMPID))";
    Statement stmt = con.createStatement();
    stmt.executeUpdate(CREATE_EMP);
     	  
	System.out.println("Created table in given database...");
	con.close();
	System.out.println("Connection closed");
  }
}
