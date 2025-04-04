package ejercicio4;

public class NegativePriceException extends Exception {
	public String toString() {
		return "El precio no puede ser negativo";
	}
	
	public String getMessage() {
		return "El precio no puede ser negativo";
	}
}
