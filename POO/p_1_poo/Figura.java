public interface Figura{
	//class

	//*public double perimetro(){
		return 0.0;
	}

	public double area(){
		return 0.0;
	}

	public double volumen(){
		return 0.0;
	}

	public String toString(){
		return "Figura abstracta";
	}//*

	

	public static void main (String [] args){
		//*Figura a= new Figura();
		System.out.println(a);
		System.out.println("Perimetro "+a.perimetro());
		System.out.println("Area "+ a.area());
		System.out.println("Volumen "+a.volumen());
		System.out.println();//*

		Rectangulo b= new Rectangulo();
                System.out.println(b);
                System.out.println("Perimetro "+b.perimetro());
                System.out.println("Area "+ b.area());
                System.out.println("Volumen "+b.volumen());
                System.out.println();

		Cuadrado c= new Cuadrado();
                System.out.println(c);
                System.out.println("Perimetro "+c.perimetro());
                System.out.println("Area "+ c.area());
                System.out.println("Volumen "+c.volumen());
                System.out.println();

		Caja d= new Caja();
                System.out.println(d);
                System.out.println("Perimetro "+d.perimetro());
                System.out.println("Area "+ d.area());
                System.out.println("Volumen "+d.volumen());
                System.out.println();		  	
	}
}
