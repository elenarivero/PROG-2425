package boletin5;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Constante para PIEDRA
		final String PIEDRA = "PIEDRA";

		// Constante para PAPEL
		final String PAPEL = "PAPEL";

		// Constante para TIJERAS
		final String TIJERAS = "TIJERAS";

		// Variable donde almacenar la jugada del jugador 1
		String jugador1;

		// Variable donde almacenar la jugada del jugador 2
		String jugador2;

		// Scanner para leer datos
		Scanner reader = new Scanner(System.in);

		do {
			// Pedimos la jugada al jugador 1
			System.out.println("Jugador 1: Introduzca PIEDRA, PAPEL O TIJERAS");
			jugador1 = reader.next();
		} while (!jugador1.equalsIgnoreCase(PIEDRA) 
				&& !jugador1.equalsIgnoreCase(TIJERAS)
				&& !jugador1.equalsIgnoreCase(PAPEL));

		System.out.println("Jugada del jugador 1: " + jugador1);
		
		
		
		// Cerramos el scanner
		reader.close();

	}

}
