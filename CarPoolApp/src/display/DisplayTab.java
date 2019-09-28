package display;

/**
 * THIS TABLE SHOULD BE VISIBLE ONLY TO THE ADMIN.
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connection.JDBCConn;

public class DisplayTab {
	public static void main(String []args) throws ClassNotFoundException, SQLException
	{
		 Class.forName("com.mysql.jdbc.Driver");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost/my_first_schema","root","sanju123");
		  System.out.println("Connection established successfully");
		  System.out.println();
		  System.out.println("EMP_DETAILS Records :");
		  System.out.println("===========================================================");
		  displayRecords(con);
		  con.close();
		  System.out.println("===========================================================");
		  System.out.println();
		  System.out.println("Connection closed");
	}
	public static void displayRecords(Connection con)
	{
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int index = 1;
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery("Select * from EMP_DETAILS");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		  try {
			while(rs.next()){  
				  System.out.println(index+") "+rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
				  index++;
				  }
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
