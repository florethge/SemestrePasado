public class Agenda{
	private contacto [] agenda;

	public Agenda(){
		this.agenda= new contacto[10];
	}

	public void Añadir(String Nombre, int Telefono){
		boolean noAñadir = false;
		for(int i=0; i< this.agenda.length; i++){
			if(this.agenda[i]!=null){
				if(this.agenda[i].getNombre()== Nombre){
					noAñadir = true;
					System.out.println("Este contacto ya existe");
					break;	
				}
			}
		}
		if(noAñadir==false){
			for(int j=0; j< this.agenda.length; j++){
                		if(this.agenda[j]==null){
                        		this.agenda[j]= new contacto(Nombre, Telefono);
                                	System.out.println();
					break;
                        	}
                	}
		}
	}
	
	public void Buscar(String Nombre){
		 for(int i=0; i< this.agenda.length; i++){
			if(this.agenda[i] != null){
				if(this.agenda[i].getNombre()== Nombre){
					System.out.println(Nombre);
				}
			}
		}
	}

	public void Eliminar(String Nombre){
		for(int i=0; i< this.agenda.length; i++){
			if(this.agenda[i] != null){
				if(this.agenda[i].getNombre()== Nombre){
					this.agenda[i]= null;			
				}
			}
		}

	}

	public void Vaciar(){
		 for(int i=0; i< this.agenda.length; i++){
                        if(this.agenda[i] != null){
				this.agenda[i]= null;
			}
		}
	}



	public static void main (String [] args){
		Agenda A1= new Agenda ();
		A1.Añadir("Pedro", 122);
		A1.Añadir("Pedro", 122);
		A1.Buscar("Pedro");
	
	}

}

