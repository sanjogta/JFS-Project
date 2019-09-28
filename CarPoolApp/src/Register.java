import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Register {

	public static void main(String[] args) throws IOException
	{
		String url = "C:\\xampp\\htdocs\\JFS Pro\\register.htm";
		File htmlFile = new File(url);
		Desktop.getDesktop().browse(htmlFile.toURI());
	}
}
