package biblioteca.demo.run;

public class Socio {
	
	private int numSocio; //asociada a la clave primaria de DB
	private String nombreCompleto;
	private int esTrabajador;
	private int masInfo;
	private int fechaNac;

	public int getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getEsTrabajador() {  // get devuelve el valor que le he asignado al atributo autor
		return esTrabajador;
	}

	public void setEsTrabajador(int esTrabajador) { //set asigna el valor que le estoy dando a "autor" al atributo autor
		this.esTrabajador = esTrabajador; 
	}

	public int getMasInfo() {
		return masInfo;
	}

	public void setMasInfo(int masInfo) { //al poner el tipo void no es necesaria la sentencia return
		this.masInfo = masInfo; //asigna al atributo edicion el valor que paso como argumento en la llamada al metodo
	}
	public int getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(int fechaNac) { //al poner el tipo void no es necesaria la sentencia return
		this.fechaNac = fechaNac; //asigna al atributo edicion el valor que paso como argumento en la llamada al metodo
	}
}

