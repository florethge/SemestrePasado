public class MyDivisionException{
	public static int division (int a, int b){
		return a/b;
	}

	public static void main (String [] args){
		String strnum= JOptionPane.showInputDialog("Escribe el numerador");
		String strden= JOptionPane.showInputDialog("Escribe el denominador");
		
	int num= Integer.parseInt(strNum);
	int den= Integer.parseInt(strDen);
	//pedir todos los datos hasta que los escriba bien en usuario utilizar la estructura de excepciones

	System.out.println ("El resultado de dividir "+num+"/"+den+" es "division(num, den));
	}

}
