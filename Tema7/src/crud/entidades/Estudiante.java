package crud.entidades;

public class Estudiante {

	private int id;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String email;
	private String telefono;

	public Estudiante(String nombre, String apellido, String fechaNacimiento, String email, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
