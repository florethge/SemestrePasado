public class Rectangulo implements Figura, Comparable{
			//extends
			//vas a implementar cada metodo de la interface
	protected double largo;
	protected double ancho;
	
	public Rectangulo(double largo, double ancho){
		this.largo= largo;
		this.ancho= ancho;
	}

	public Rectangulo(){
		this(3.0, 2.0);
		// manda esos valores al de arriba
	}

	public double perimetro(){
		return 2.0*(this.largo+this.ancho);
	}

	public double area(){
		return this.largo*this.ancho;
	}
	
	public double volumen(){
		return 0.0;
	}

	public String toString(){
		return "Rectangulo de largo"+ this.largo+" y ancho "+this.ancho;
	}

	public int compareTo( Object o){
		Rectangulo r= (Rectangulo)o;
		if (this.r()>r.area()){
			return 1;
		}
		else if (this.area()<r.area()){
			return -1
		}
		else{
			return 0;
		}
		//return (int)(this.area()-r.area());

	}	

	public static void main (String [] args){
		Figura[] figuras= new Figura[3];
		figuras[0]= new Rectangulo();
		figuras[1]= new Cuadrado(7.0);
		figuras[2]= new Caja();

		for (int i=0; i<figuras.length;i++){
			System.out.println(figuras[i]);
                	System.out.println("Perimetro "+figuras[i].perimetro());
                	System.out.println("Area "+ figuras[i].area());
                	System.out.println("Volumen "+figuras[i].volumen());
                	System.out.println();
		
			if(i==2 //figuras[i]instanceof Caja){
				Caja c=(Caja)figuras[i];
				c.saluda();
				//ó ((Caja)figuras[i]).saluda();
			}
		}
	}
}
