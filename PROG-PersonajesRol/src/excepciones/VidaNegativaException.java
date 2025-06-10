package excepciones;

public class VidaNegativaException extends Exception {

	public String getMessage() {
		return "La vida del personaje no puede ser negativa";
	}
}
