public class MyException extends Exception{
	public MyException(){
		super("Ocurrio MyException");
	}
	
	public MyException (String maj){
		super(maj);
	}
