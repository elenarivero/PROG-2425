package strings.boletin1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variable donde almacenar la primera frase
		String frase1;
		
		// Variable donde almacenar la segunda frase
		String frase2;
		
		// Creamos el scanner para leer de consola
		Scanner reader = new Scanner(System.in);
		
		// Pedimos la primera frase al usuario
		System.out.println("Introduzca la primera frase:");
		frase1 = reader.nextLine();
		
		// Pedimos la segunda frase al usuario
		System.out.println("Introduzca la segunda frase:");
		frase2 = reader.nextLine();
		
		if(frase1.length()<frase2.length()) {
			// La frase1 tiene menos caracteres
			System.out.println("La primera frase es la más corta");
		} else if (frase2.length()<frase1.length()){
			// La frase2 tiene menos caracteres
			System.out.println("La segunda frase es la más corta");
		} else {
			// Ambas frases tienen la misma cantidad de caracteres
			System.out.println("Ambas frases tienen la misma longitud");
		}
				

		reader.close();
	}

}
