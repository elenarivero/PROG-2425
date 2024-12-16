package strings.boletin1;

public class Ejercicio06 {

	public static void main(String[] args) {
		String cad1 = "Hola mundo";
		String cad2 = "Adiós a todos";
		String cad3 = "Dabale arroz a la zorra el aba";
		
		boolean res = esPalindroma(cad3);
		
		System.out.println(res ? "Es palíndroma": "No es palíndroma");
	}

	
	static String invierteCadena(String cadena) {
		String res = "";
		
		for(int i=cadena.length()-1; i>=0; i--) {
			res += cadena.charAt(i);
		}
		
		return res;
	}
	
	
	static boolean esPalindroma(String frase) {
		// Resultado a devolver
		boolean res = false;
		
		// Le quito los espacios a la frase que recibo
		String fraseSinEspacios = frase.replace(" ", "");
		
		// Guardo en una variable la frase sin espacios invertida
		String fraseReves = invierteCadena(fraseSinEspacios);
		
		// Comparo ambas cadenas sin tener en cuenta mayúsculas y minúsculas
		res = fraseReves.equalsIgnoreCase(fraseSinEspacios);
		
		return res;
	}
}
