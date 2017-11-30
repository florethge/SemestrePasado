public class contacto{
	private String Nombre;
	private int Telefono;

	public contacto(String Nombre, int Telefono){
		this.Nombre= Nombre;
		this.Telefono= Telefono;
	}
	
	public contacto(){
		this.Nombre= "Pancho";
		this.Telefono= 122; 
	}

	public String getNombre(){
		return Nombre;
	}

	public void setNombre( String Nombre){
		this.Nombre= Nombre;
	}

	public int getTelefono(){
		return Telefono;
	}
	
	public void setTelefono (int Telefono){
		this.Telefono= Telefono;
	}

	public void Modificar (String Nombre, int Telefono){
		this.setNombre(Nombre);
		this.setTelefono(Telefono);
	}

	
	



}
