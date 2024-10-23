package boletin5;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Cadena donde almacenar el valor del dado 1
		String dado1;

		// Cadena donde almacenar el valor del dado 2
		String dado2;

		// Variable donde almacenar el valor del dado1
		int tirada1 = 0;

		// Variable donde almacenar el valor del dado2
		int tirada2 = 0;

		// Variable para salir de los bucles
		boolean salir = true;

		// Creación del scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos el valor del dado 1
		do {
			salir = true;
			// Pedimos el valor del dado 1
			System.out.println("Introduzca el valor del dado 1");
			dado1 = reader.next();

			switch (dado1.toUpperCase()) {
			case "UNO" -> tirada1 = 1;
			case "DOS" -> tirada1 = 2;
			case "TRES" -> tirada1 = 3;
			case "CUATRO" -> tirada1 = 4;
			case "CINCO" -> tirada1 = 5;
			case "SEIS" -> tirada1 = 6;
			default -> salir = false;
			}
			// Mientras el valor del dado no sea correcto se repetirá el bucle
		} while (!salir);

		// Pedimos el valor del dado 2
		do {
			salir = true;
			// Pedimos el valor del dado 2
			System.out.println("Introduzca el valor del dado 2");
			dado2 = reader.next();

			switch (dado2.toUpperCase()) {
			case "UNO" -> tirada2 = 1;
			case "DOS" -> tirada2 = 2;
			case "TRES" -> tirada2 = 3;
			case "CUATRO" -> tirada2 = 4;
			case "CINCO" -> tirada2 = 5;
			case "SEIS" -> tirada2 = 6;
			default -> salir = false;
			}
		} while (!salir);

		System.out.println("La suma de los dados es: " + (tirada1 + tirada2));
		// Cierre del scanner
		reader.close();

	}

}
