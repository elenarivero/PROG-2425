package pruebas;

public class Excepciones {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		double c;
		
		try {
			c = a / b;
			System.out.println("Resultado de la operación: " + c);
		} catch (ArithmeticException pepito) {
			System.out.println(pepito.getMessage());
			
			System.out.println("División por cero");
			c = 0;
		} finally {
			System.out.println("Bloque finally");
		}
		
		System.out.println(c);

	}

}
