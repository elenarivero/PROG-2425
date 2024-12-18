package strings.boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Array de caracteres inicio
		char[] conj1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conj2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		String frase = "";
		
		String fraseCodificada = "";
		
		System.out.println("Introduzca una frase");
		frase = reader.nextLine();
		
		for(int i=0; i<frase.length(); i++) {
			fraseCodificada += codifica2(conj1, conj2, frase.charAt(i));
		}
		

		System.out.println(fraseCodificada);
		
		// Cerramos el Scanner
		reader.close();
	}

	static char codifica(char conjunto1[], char conjunto2[], char c) {

		// Inicializo el carácter codificado a c en minúscula
		char charCoded = Character.toLowerCase(c);

		// Paso los conjuntos a String
		String conj1Cad = String.valueOf(conjunto1);
		String conj2Cad = String.valueOf(conjunto2);

		// Busco en qué posición está el carácter en el conjunto1
		int pos = conj1Cad.indexOf(charCoded);

		if (pos >= 0) {
			// Si está en el conjunto 1 me quedo con la misma posición del conjunto 2
			charCoded = conj2Cad.charAt(pos);
		}

		// Devuelvo el carácter codificado
		return charCoded;
	}
	
	static char codifica2(char conjunto1[], char conjunto2[], char c) {

		// Inicializo el carácter codificado a c en minúscula
		char charCoded = Character.toLowerCase(c);		

		// Busco en qué posición está el carácter en el conjunto1
		int i = 0;
		
		// Boolean para saber si lo he encontrado
		boolean enc = false;

		// While para buscar el carácter en el conjunto 1
		while(i<conjunto1.length && !enc) {
			
			// Si la posición i del conjunto 1 coincide con el carácter
			if(conjunto1[i] == charCoded) {
				// Asigno al carácter codificado la posición i del conjunto 2
				charCoded = conjunto2[i];
				// Ponemos encontrado a true para no seguir recorriendo el array
				enc = true;
			}
			
			// Incrementamos el índice
			i++;
		}

		// Devuelvo el carácter codificado
		return charCoded;
	}

}
