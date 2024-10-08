package boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Constantes para las distintas opciones del juego
		final String PIEDRA	= "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";
		
		// Variables donde almacenar las jugadas de los jugadores
		String jugador1;
		String jugador2;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Turno del jugador 1
		System.out.println("Jugador 1: Eliga PIEDRA, PAPEL o TIJERAS");
		jugador1 = reader.next();
		
		// Turno del jugador 2
		System.out.println("Jugador 2: Eliga PIEDRA, PAPEL o TIJERAS");
		jugador2 = reader.next();
		
		// Si introducen la misma cadena
		if(jugador1.equalsIgnoreCase(jugador2)) {
			System.out.println("EMPATE");
		} else if(jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(TIJERAS)
				|| jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(PIEDRA)
				|| jugador1.equalsIgnoreCase(TIJERAS) && jugador2.equalsIgnoreCase(PAPEL)) {
			System.out.println("Gana el jugador 1");
		} else {
			System.out.println("Gana el jugador 2");
		}
		
		// Cerramos el Scanner
		reader.close();
	}

}
