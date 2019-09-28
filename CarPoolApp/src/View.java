import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;

public class View {
  public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
  {
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost/my_first_schema","root","sanju123");
	  System.out.println("Connection established successfully");
	  System.out.println();
	  
	  /* Open the login page */
	  String login = "C:\\xampp\\htdocs\\JFS Pro\\login.htm";
	  File file = new File(login);
	  Desktop.getDesktop().browse(file.toURI());
	  
	  /* Parse the login page */
	  Document doc = Jsoup.parse(new File(login),"ISO-8859-1");
	  Elements val = doc.select("datalist.mydiv#users");  //Not Working.
	  String str = val.text();
	  System.out.println(str);
	  openPage(str);
	  
	  con.close();
	  System.out.println("Connection Closed");
  }
  
  public static void openPage(String user) throws IOException
  {
	  String url = "";
	  File htmlFile = null;
	  if(user=="ADMIN")
	  {
		  url = "C:\\xampp\\htdocs\\JFS Pro\\custdetails.htm ";
		  htmlFile = new File(url);
		  Desktop.getDesktop().browse(htmlFile.toURI());
	  }
	  else if(user=="CUSTOMER")
	  {
		  url = "C:\\xampp\\htdocs\\JFS Pro\\profile.htm";
		  htmlFile = new File(url);
		  Desktop.getDesktop().browse(htmlFile.toURI());
	  }
	  
  }
}
