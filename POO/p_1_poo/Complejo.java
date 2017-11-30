 
public class Complejo{
	private double real;
	private double imaginaria;

	public Complejo (){
		real = 1;
		imaginaria = 1; 
	}

	public Complejo (double r, double i){
		real = r;
		imaginaria = i; 
	}

	public double getReal(){
		return this.real;
	}

	public double getImaginaria(){
		return this.imaginaria;
	}

	public void establecer (double r, double i){
		this.real = r;
		this.imaginaria = i;
	}	
	public void imprimir (){
		if (this.imaginaria>=0){
			System.out.println (this.real+"+"+this.imaginaria+"i");
		}else{
			System.out.println(this.real +" "+ this.imaginaria + "i");
		}
	
	}

	public void agregar (Complejo A){
		this.real = this.real + A.getReal();
		this.imaginaria = this.imaginaria + A.getImaginaria();
	}

	public void agregar (double r, double i){
		this.real = this.real + r;
		this.imaginaria = this.imaginaria + i;
	}

	public Complejo suma (Complejo B){
		double nuevo_r = this.real + B.getReal();
		double nuevo_i = this.imaginaria + B.getImaginaria();
		Complejo nuevo = new Complejo(nuevo_r,nuevo_i);
		return nuevo;
	}
	
	public Complejo resta (Complejo B){
                double nuevo_r = this.real - B.getReal();
                double nuevo_i = this.imaginaria - B.getImaginaria();
                Complejo nuevo = new Complejo(nuevo_r,nuevo_i);
                return nuevo;
        }

	public Complejo multiplicacion (Complejo B){
                double nuevo_r = this.real * B.getReal()+ (this.imaginaria*B.getImaginaria())*-1;
                double nuevo_i = this.imaginaria + B.getReal()+ this.real*B.getImaginaria();
                Complejo nuevo = new Complejo(nuevo_r,nuevo_i);
                return nuevo;
        }

	public Complejo multiplicacion (double B){
                double nuevo_r = this.real * B;
                double nuevo_i = this.imaginaria * B;
                Complejo nuevo = new Complejo(nuevo_r,nuevo_i);
                return nuevo;
        }

	public Complejo conjugado(){
		double nuevo_r = this.real;
                double nuevo_i = this.imaginaria*-1;
                Complejo nuevo = new Complejo(nuevo_r,nuevo_i);
                return nuevo;
	}
}
