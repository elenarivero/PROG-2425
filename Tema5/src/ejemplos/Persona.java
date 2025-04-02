package ejemplos;

public abstract class Persona implements Sonido, Comparable<Persona>{

	protected String dni;
	protected String nombre;
	protected int edad;
	
	
	public Persona(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		String cadena = this.dni + " - " + this.nombre + " - ";
		cadena += this.edad;
		return cadena;
	}


	
/**
 * @return 0 si dos Personas son iguales, es decir, cuando los dnis son iguales
 * >0 Cuando el dni esta Persona sea alfabéticamente mayor que el dni de la persona introducida
 * <0 Cuando el dni esta Persona sea alfabéticamente menor que el dni de la persona introducida
 */
	@Override
	public int compareTo(Persona o) {
		return this.dni.compareTo(o.dni);
	}
	
//	public void antiguedad() {
//		this.edad++;
//	}
	
}
