package parte1.ejercicio2;

/**
 * Clase que representa a una Persona
 */
class Persona {

	/**
	 * DNI de la persona
	 */
	private String dni;

	/**
	 * Nombre de la persona
	 */
	private String nombre;

	/**
	 * Apellidos de la persona
	 */
	private String apellidos;

	/**
	 * Edad de la persona
	 */
	private int edad;

	/**
	 * Constructor con parámetros. Crea un objeto Persona a partir del dni, nombre y
	 * apellidos
	 * 
	 * @param dni       DNI de la persona. No puede ser null ni espacios en blanco
	 * @param nombre    Nombre de la persona. No puede ser null ni espacios en
	 *                  blanco
	 * @param apellidos Apellidos de la persona. No puede ser null ni espacios en
	 *                  blanco
	 */
	public Persona(String dni, String nombre, String apellidos) {
		// id(dni!=null && !dni.equals(""))
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
	}

	/**
	 * Constructor con todos los parámetros
	 * 
	 * @param dni       DNI de la persona
	 * @param nombre    Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param edad      Edad de la persona
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		if (this.edad >= 0) {
			this.edad = edad;
		}
	}

	/**
	 * Devuelve el dni
	 * 
	 * @return El dni de la persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre.
	 * 
	 * @param nombre Cadena con el nombre de la persona. No puede ser ni null ni
	 *               espacios en blanco
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean esMayorEdad() {
		boolean res = false;
		if (edad >= 18) {
			res = true;
		}
		return res;
	}

	@Override
	public String toString() {
		String res = "Nombre: " + nombre + "\n";
		res += "Apellidos: " + apellidos + "\n";
		res += "DNI: " + dni + "\n";
		res += "Edad: " + edad + "\n";
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;

		Persona nuevaPersona = (Persona) obj;

		if (this.dni.equals(nuevaPersona.dni)) {
			res = true;
		}
		return res;
	}
}
