public class EjemploExceptions{
	public void metodoA() throws MyExceptions{
		metodoB();
	}
	
	public void metodoB() throws MyExceptions{
		metodoC();
	}
	
	public void metodoC() throws MyExceptions{
		metodoD();
	}
	
	public void metodoD() throws MyExceptions{
		throw new RuntimeException("Upps ocurrión un error");
	}

	public static void main (String [] args){
		try{
			EjemploException a= new EjemploException();
			a.metodoA();
		}
		catch (MyException e){
			System.out.println ("Error ")+e;
			e.printStackTrace;
		}
	}
}
