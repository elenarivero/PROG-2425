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
			jugador1 = reader.next().toUpperCase();
		} while (!jugador1.equals(PIEDRA) 
				&& !jugador1.equals(TIJERAS)
				&& !jugador1.equals(PAPEL));
		
		do {
			// Pedimos la jugada al jugador 2
			System.out.println("Jugador 2: Introduzca PIEDRA, PAPEL O TIJERAS");
			jugador2 = reader.next().toUpperCase();
		} while (!jugador2.equals(PIEDRA) 
				&& !jugador2.equals(TIJERAS)
				&& !jugador2.equals(PAPEL));


		// Si introducen el mismo valor están empatados
		if(jugador1.equals(jugador2)) {
			System.out.println("Empate");
		} else if(jugador1.equals(PIEDRA) && jugador2.equals(TIJERAS) ||
				jugador1.equals(TIJERAS) && jugador2.equals(PAPEL) ||
				jugador1.equals(PAPEL) && jugador2.equals(PIEDRA)) {
			// Si se da alguna combinación para que gane el jugador 1
			System.out.println("Gana el jugador 1");
		} else {
			// Si no se han dado ninguna de las condiciones anteriores,
			// entonces gana el jugador 2
			System.out.println("Gana el jugador 2");
		}
		
		
		// Cerramos el scanner
		reader.close();

	}

}
