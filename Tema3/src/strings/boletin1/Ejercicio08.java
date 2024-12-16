package strings.boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// String frase introducida por el usuario
		String frase;
		
		// Array donde almacenar la frase dividida por palabras
		String[] palabras;
		
		// Le pido una frase al usuario
		System.out.println("Introduzca una frase");
		frase = reader.nextLine().toLowerCase();
		
		// Separamos la frase por espacios
		palabras = frase.split(" ");
		
		// Ordenamos el array de palabras
		Arrays.sort(palabras);
		
		// Imprimimos el array ordenado
		for(String palabra : palabras) {
			System.out.print(palabra + " ");
		}
		
		
		// Cerramos el Scanner
		reader.close();

	}

	
}
