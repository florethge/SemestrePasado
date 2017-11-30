import java.util.stringTokeniser;

public class CalculaNomina {
	public static void main (String [] args){
		stringTokeniser st= new stringTokeniser("Hola,como,estas,espero,que,bien");
		while(st.hasMoreTokens()){
			System.out.println(st.NextToken());
		 }
	}
//dime la ruta del archivo
}
