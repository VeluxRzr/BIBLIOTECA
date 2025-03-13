package biblioteca.demo.run;

public class Prestamo {
		
	private int socio; 
	private int libro;
	private int fechaPrestamo;
	private int fechaDevolucion;
	

	public int getSocio() {
		return socio;
	}

	public void setSocio(int socio) {
		this.socio = socio;
	}

	public int getLibro() {
		return libro;
	}

	public void setLibro(int libro) {
		this.libro = libro;
	}

	public int getFechaPrestamo() {  // get devuelve el valor que le he asignado al atributo autor
		return fechaPrestamo;
	}

	public void setFechaPrestamo(int fechaPrestamo) { //set asigna el valor que le estoy dando a "autor" al atributo autor
		this.fechaPrestamo = fechaPrestamo; 
	}

	public int getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(int fechadevolucion) { //al poner el tipo void no es necesaria la sentencia return
		this.fechaDevolucion = fechaDevolucion; //asigna al atributo edicion el valor que paso como argumento en la llamada al metodo
	}
}


