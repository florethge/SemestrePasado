import java.io.*;
public class LeerArchivo {

	public static void main(String[]args) throws IOException{

		FileReader in = new FileReader("/Users/florethgonzalez/Desktop/texto.txt");
		BufferedReader br = new BufferedReader(in);
    		String line;
    		while ((line = br.readLine())!= null) {
        		System.out.println(line);
    		}
		br.close();
	}
}
