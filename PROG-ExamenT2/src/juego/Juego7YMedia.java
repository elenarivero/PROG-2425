package juego;

import java.util.Random;
import java.util.Scanner;

public class Juego7YMedia {

	public static void main(String[] args) {
		// Scanner para leer datos del teclado
		Scanner reader = new Scanner(System.in);

		// Creamos un objeto random para crear números aleatorios
		Random rand = new Random();

		// Variable donde almacenar el valor de la carta
		int carta;

		// Variable donde almacenar el palo de la carta
		int palo;

		// Variable donde almacenar los puntos en general
		double puntos = 0;

		// Variable donde almacenar la puntuación del jugador 1. Inicialmente tiene 0
		// puntos.
		double puntosJ1 = 0;

		// Variable donde almacenar la puntuación del jugador 2. Inicialmente tiene 0
		// puntos.
		double puntosJ2 = 0;

		// Variable donde almacenar la respuesta de si quiere más cartas o no
		String respuesta = "";

		// Constante para indicar el número de cartas que tenemos
		final int NUM_CARTAS = 10;

		// Constante para indicar el número de palos que tenemos
		final int NUM_PALOS = 4;
		
		// Constante para el valor de las figuras
		final double FIGURA = 0.5;

		// Damos la bienvenida
		System.out.println("Bienvenido al juego de las Siete y Media");

		for (int turno = 1; turno <= 2; turno++) {
			System.out.println();
			// Se inicializa a 0 la puntuación
			puntos = 0;

			// Se imprime de quién es el turno
			System.out.println("Es el turno del JUGADOR " + turno);

			do { // mientras la respuesta del usuario no sea correcta
				try {
					// Le preguntamos que si quiere carta
					System.out.println("¿Quiere sacar una carta?");
					respuesta = reader.next();
					// comprobamos si la respuesta es s o n
					assert respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")
							: "ERROR: Debe introducir S o N";
				} catch (AssertionError e) {
					System.err.println(e.getMessage());
				} finally {
					reader.nextLine();
				}
			} while (!"s".equalsIgnoreCase(respuesta) && !"n".equalsIgnoreCase(respuesta));

			while (respuesta.equalsIgnoreCase("s") && puntos <= 7.5) {

				// Generamos una carta aleatoriamente
				carta = rand.nextInt(1, NUM_CARTAS + 1);

				// Generamos un palo aleatoriamente
				palo = rand.nextInt(1, NUM_PALOS + 1);

				System.out.print("Tu carta es ");

				// Le asignamos a puntos el valor de la carta correspondiente
				puntos += switch (carta) {
				case 8 -> { // Si es 8 se trata de una sota y el valor es 0.5
					System.out.print("sota");
					yield 0.5;
				}
				case 9 -> { // Si es 9 se trata de un caballo y el valor es 0.5
					System.out.print("caballo");
					yield 0.5;
				}
				case 10 -> { // Si es 10 se trata de un rey y el valor es 0.5
					System.out.print("rey");
					yield FIGURA;
				}
				default -> { // Nos quedamos con cualquier otro valor que no sea una figura
					System.out.print(carta);
					yield carta;
				}
				};

				// Decidimos cuál es el palo: 1 para oros, 2 para copas, 3 para espadas, 4 para bastos
				switch (palo) {
				case 1 -> System.out.println(" de oros");
				case 2 -> System.out.println(" de copas");
				case 3 -> System.out.println(" de espadas");
				case 4 -> System.out.println(" de bastos");
				}

				// Si estamos en el primer turno le asigno los puntos al jugador 1
				if (turno == 1) {
					puntosJ1 = puntos;
				} else { // Si estamos en el segundo turno le asigno los puntos al jugador 2
					puntosJ2 = puntos;
				}

				
				// Mostramos la puntuación que lleva el jugador
				System.out.println("Tu puntuación es " + puntos);

				// Le preguntamos si quiere carta si todavía no se ha pasado de 7.5
				if (puntos <= 7.5) {
					do {
						try {
							// Le preguntamos que si quiere carta
							System.out.println("¿Quiere sacar una carta?");
							respuesta = reader.next();
							assert respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")
									: "ERROR: Debe introducir S o N";
						} catch (AssertionError e) {
							System.err.println(e.getMessage());
						} finally {
							reader.nextLine();
						}
					} while (!"s".equalsIgnoreCase(respuesta) && !"n".equalsIgnoreCase(respuesta));

				} else {
					// Le decimos que se ha pasado cuando su puntuación sea >7.5
					System.out.println("¡Te has pasado!");
				}
			}
		}

		// Resumen de puntuaciones
		System.out.println("El JUGADOR 1 tiene " + puntosJ1 + " puntos y el JUGADOR 2 tiene " + puntosJ2 + " puntos.");
		
		if (puntosJ1 >= 7.5 && puntosJ2 >= 7.5) {
			// Si ambos jugadores se pasan
			System.out.println("Ambos jugadores se han pasado de puntuación. Ambos pierden");
		} else if (puntosJ1 >= 7.5) {
			// Sólo se pasa el jugador 1, gana el jugador 2
			System.out.println("El jugador 1 se ha pasado. Gana el Jugador 2");
		} else if (puntosJ2 >= 7.5) {
			// Sólo se pasa el jugador 2, gana el jugador 1
			System.out.println("El jugador 2 se ha pasado. Gana el Jugador 1");
		} else if (puntosJ1 > puntosJ2) {
			// El jugador 1 tiene más puntos que el jugador 2
			System.out.println("Gana el Jugador 1");
		} else if (puntosJ2 > puntosJ1) {
			// El jugador 2 tiene más puntos que el jugador 1
			System.out.println("Gana el Jugador 2");
		} else {
			// Tienen la misma puntuación
			System.out.println("EMPATE");
		}
		
		// Cerramos el scanner
		reader.close();

	}

}
