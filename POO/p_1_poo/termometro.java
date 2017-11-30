public class termometro
{
	private int temp;
	 //otra clase no lo puede acceder de manera directa..atributos siempre privados
	//construct por default(que no recibe parámetros

	public termometro() //(metodo tipo constructor, publicos, no estatico)
	{
		temp=25; //atributo
	}
	public termometro(int t)
	{
		temp=t;
	}
	public void settemp(int t)
	{
		temp=t;
	}
	public int gettemp()
	{
		return temp;
	}

public class usatermometro
{
	public static void main (String[]args)
	{
		termometro sin =new termometro();
		termotero gdl= new terometro(18);

		gdl.setemp(20);
		int tg=gdl.gettemp();
		
		System.out.println(tg);

	}
}



}
