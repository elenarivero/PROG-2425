package parte1.ejercicio2;

/**
 * Clase que representa a una Persona
 */
public class Persona {

	/**
	 * DNI de la persona
	 */
	String dni;
	
	/**
	 * Nombre de la persona
	 */
	String nombre;
	
	/**
	 * Apellidos de la persona
	 */
	String apellidos;
	
	/**
	 * Edad de la persona
	 */
	int edad;
	
	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 */
	public Persona(String dni, String nombre, String apellidos) {
		// id(dni!=null && !dni.equals(""))
		if(dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	/**
	 * Constructor con todos los parámetros
	 * @param dni DNI de la persona
	 * @param nombre Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param edad Edad de la persona
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		if(this.edad >=0) {
			this.edad = edad;
		}
	}
}
