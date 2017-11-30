
public class libro
{
	public String titulo;
	public String autor;
	public String editorial;
	public String isbn;
	
	public libro(){
		titulo = "Basico";
		autor = "Anonimo";
		editorial = "Patito";
		isbn = "A123";
	}
	
	public libro(String titulo_in, String autor_in, String editorial_in, String isbn_in){
		titulo= titulo_in;
		autor= autor_in;
		editorial= editorial_in;
		isbn= isbn_in;	
	} 
	public String getTitulo(){
		return this.titulo;
	}
	public String getAutor(){
		return this.autor;
	} 
	public String getEditorial(){
		return this.editorial;
	}
	public String getIsbn(){
		return this.isbn;
	}
	
	public void setTitulo(String nuevoTitulo){
		this.titulo = nuevoTitulo;
	}
	public void setAutor(String nuevoAutor){
		this.autor= nuevoAutor;
	}
	 public void setEditorial(String nuevoEditorial){
                this.editorial= nuevoEditorial;
        }
	public void setIsbn(String nuevoIsbn){
                this.isbn= nuevoIsbn;
        }
	public static void main (String [] args){
		libro libro1 = new libro("100 años de soledad", "Gabriel García Márquez", "Castilla","0132686");
		System.out.println(libro1.getTitulo()+" "+libro1.getAutor()+" "+libro1.getEditorial()+" "+libro1.getIsbn());

		libro1.setTitulo("200 años de chafidad");
		libro1.setAutor("Gael Marcia Barques");
	 	libro1.setEditorial("Great Value");
		libro1.setIsbn("123456");

		System.out.println(libro1.getTitulo()+" "+libro1.getAutor()+" "+libro1.getEditorial()+" "+libro1.getIsbn());
	}

}

//System.out.println(libro1.getTitulo()+" "+libro1.autor+" "+libro1.getEditorial()+" "+libro1.getIsbn());
