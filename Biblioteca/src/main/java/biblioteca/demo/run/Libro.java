package biblioteca.demo.run;

public class Libro {

	private int isbn; //asociada a la clave primaria de DB
	private String titulo;
	private String autor;
	private int edicion;
	

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {  // get devuelve el valor que le he asignado al atributo autor
		return autor;
	}

	public void setAutor(String autor) { //set asigna el valor que le estoy dando a "autor" al atributo autor
		this.autor = autor; 
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) { //al poner el tipo void no es necesaria la sentencia return
		this.edicion = edicion; //asigna al atributo edicion el valor que paso como argumento en la llamada al metodo
	}

}
