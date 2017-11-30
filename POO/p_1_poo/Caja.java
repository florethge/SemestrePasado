public class Caja extends Rectangulo{


	protected double alto;
	
	public Caja(double ancho, double largo, double alto){
		super(largo,ancho);
		//manda a llamar a constructor de rectangulo 
		this.alto= alto;
	}

	public Caja(){
		this(3.0, 4.0, 5.0);
		//manda a llamar al contructor de arriba
	}

	public double perimetro(){
		return (this.largo*4)+(this.ancho*2)+(this.alto*8);
	}
	public double area(){
		return (super.area()*2)+ ((this.largo*this.alto)*2)+ ((this.alto*this.ancho)*2);		
					
	}

	public double volumen (){
		return (super.area()*this.alto);	
		
	}
	
	public String toString(){
		return "Caja de largo "+ this.largo+ " Caja de ancho "+this.ancho+ " Caja de alto "+ this.alto;
	}	
	
	public void saluda(){
		System.out.println("Hola!");
	}
	//que es una interface (parecido a una clase)

}
