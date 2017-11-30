import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class P_writer {

	public static void main(String[] args) throws IOException {
		File file = new File ("/Users/florethgonzalez/Desktop/texto.txt");
		PrintWriter printWriter = new PrintWriter ("texto.txt");
		printWriter.println ("Buenos");
		printWriter.close ();       
  	}
}
