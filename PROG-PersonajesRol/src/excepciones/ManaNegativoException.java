package excepciones;

public class ManaNegativoException extends Exception {

	public String getMessage() {
		return "El maná del personaje no puede ser negativo";
	}
	
	@Override
	public String toString() {
		return "El maná del personaje no puede ser negativo";
	}
}
