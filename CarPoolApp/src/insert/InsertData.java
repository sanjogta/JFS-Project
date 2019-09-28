package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "C:\\xampp\\htdocs\\JFS Pro\\insert.php";
		File htmlFile = new File(url);
		Desktop.getDesktop().browse(htmlFile.toURI());  
	}
}
