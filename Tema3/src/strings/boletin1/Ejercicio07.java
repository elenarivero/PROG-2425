package strings.boletin1;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Frase introducida por el usuario
		String fraseUsu;
		
		// Palabra introducida por el usuario
		String palabraUsu;
		
		// Variable donde almacenar el número de veces que aparece la palabra
		int contPalabra;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Le pedimos una frase al usuario
		System.out.println("Introduzca una frase");
		fraseUsu = reader.nextLine();
		
		// Le pedimos una palabra al usuario
		System.out.println("Introduzca una palabra");
		palabraUsu = reader.next().toLowerCase();
		
		// Llamamos a la función y guardamos el resultado en la variable
		contPalabra = cuentaPalabra(fraseUsu, palabraUsu);
		
		System.out.println("La palabra aparece " + contPalabra + " veces.");
		
		// Cerramos el Scanner
		reader.close();

	}

	static int cuentaPalabra(String frase, String palabra) {
		// Contador para ver cuántas veces aparece la palabra
		int cont = 0;

		// Tomamos la posición en la que la palabra aparece en la frase
		int pos = frase.indexOf(palabra);

		// Si la posición es >=0 significa que está en la frase
		while (pos >= 0) {
			// Añadimos 1 al contador
			cont++;
			// Volvemos a buscar la palabra en la frase en la posición justo posterior a la
			// palabra.
			pos = frase.indexOf(palabra, pos + palabra.length());
		}

		// Devolvemos el contador
		return cont;
	}
}
