package insert;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class InsertData {

	public static void main(String[] args) throws IOException
        {
		String url = "C:\\xampp\\htdocs\\JFS Pro\\insert.php";
		File htmlFile = new File(url);
		Desktop.getDesktop().browse(htmlFile.toURI());  
	}
}
