public class naipe{
	private int palo; //0-espadas, 1-corazones, 2-treboles, 3-diamantes
	private int valor; //0-as, 1-2, 2-3, 3-4, 4-5, 5-6, 6-7, 7-8, 8-9, 9-10, 10-J, 11-Q, 12-K

	private final static String[] nPalo={"espadas","corazones","treboles","diamantes"};	
	private final static String[] nValor={"as","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","Joto","Reina","Rey"};	

	public naipe(int palo, int valor){
		this.palo=palo;
		this.valor=valor;
	}

	public String toString(){
		return this.nvalor[this.valor]+" de "+ this.nPalo[this.palo];
	}

	public static void main (String [] args){
		//naipe asCorazones= new naipe(1,0);
		//naipe reyEspadas= new naipe(0,12);
		//System.out.println(ascorazones);
		baraja Bar= new baraja();
		System.out.print(baraja);
	}
	
}
