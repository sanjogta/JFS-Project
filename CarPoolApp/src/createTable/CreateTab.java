package createTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTab {
  public static void main(String[] args) throws ClassNotFoundException, SQLException
  {
	
     //Step 1: Register the JDBC driver.
     Class.forName("com.mysql.jdbc.Driver"); 
	  
     //Step 2: Create a connection with Mysql.
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost/my_first_schema","root","sanju123");
     System.out.println("Connection established successfully");
	
     final String CREATE_EMP="CREATE TABLE EMP_DETAILS (EMPID VARCHAR(6),NAME VARCHAR(50)NOT NULL,CONTACT INTEGER(10) NOT NULL,PASSWORD VARCHAR(8)NOT NULL,DT DATE NOT NULL, PRIMARY KEY (EMPID))";
     //The createStatement() method of Connection interface is used to create statement. 
     Statement stmt = con.createStatement();
	  
     //The object of statement is responsible to execute queries with the database.	  
     stmt.executeUpdate(CREATE_EMP);
     	  
     System.out.println("Created table in given database...");
     con.close();
     System.out.println("Connection closed");
  }
}
