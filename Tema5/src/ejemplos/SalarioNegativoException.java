package ejemplos;

public class SalarioNegativoException extends Exception{
	
	public String toString() {
		return "El salario no puede ser negativo";
	}
	
	public String getMessage() {
		return "El salario no puede ser negativo";
	}
	
}
