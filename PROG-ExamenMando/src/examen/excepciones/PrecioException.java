package examen.excepciones;

public class PrecioException extends Exception {

	public String toString() {
		return "El precio debe ser positivo";
	}
	
	public String getMessage() {
		return "El precio debe ser positivo";
	}
}
