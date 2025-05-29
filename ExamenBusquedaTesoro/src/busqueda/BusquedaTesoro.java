package busqueda;

import java.util.Arrays;
import java.util.Random;

public class BusquedaTesoro {

	public static char[][] tablero;

	public static int posI = 0;
	public static int posJ = 0;

	public static void inicializaTablero(int numFilas, int numColumnas) {
		tablero = new char[numFilas][numColumnas];
		for (char[] fila : tablero) {
			Arrays.fill(fila, ' ');
		}
	}

	public static void generaPosicionTesoro() {
		Random rand = new Random();
		int randomI = rand.nextInt(0, tablero.length);
		int randomJ = rand.nextInt(0, tablero[0].length);

		tablero[randomI][randomJ] = 'X';
	}

	public static void generaObstaculos(int numObstaculos) {
		Random rand = new Random();
		int randomI;
		int randomJ;
		char caracter;

		int cont = 0;

		while (cont < numObstaculos) {
			randomI = rand.nextInt(0, tablero.length);
			randomJ = rand.nextInt(0, tablero[0].length);

			caracter = tablero[randomI][randomJ];

			if (caracter == ' ' && !obstaculosAlrededor(randomI, randomJ)) {
				tablero[randomI][randomJ] = '*';
				cont++;
			}
		}
	}

	/**
	 * Método que comprueba si hay obstáculos en la diagonal de una posición dada
	 * 
	 * @param iObst Posición i
	 * @param jObst Posición j
	 * @return Devuelve true si hay algún obstáculo en la diagonal, false si no hay
	 *         ninguno
	 */
	private static boolean obstaculosAlrededor(int iObst, int jObst) {
		// De inicio no hemos encontrado ningún obstáculo
		boolean enc = false;

		// Inicializamos la i a la posición -1 para comprobar la diagonal hacia arriba
		int i = iObst - 1;
		int j;

		// Si la i tiene un valor negativo la inicializamos a uno más, diagonal hacia
		// abajo
		if (i < 0) {
			i = iObst + 1;
		}

		// Recorremos la i. Comprobamos que no nos salimos del tablero y que no nos
		// pasamos de la diagonal. También se comprueba que no hemos encontrado todavía
		// ningún obstáculo
		while (i < tablero.length && i <= iObst + 1 && !enc) {
			// Inicializamos la j. Si el jObst-1 <0 significa que nos salimos por la
			// izquierda del tablero, y en ese caso inicializamos a un valor +1, la diagonal
			// hacia la derecha
			j = (jObst - 1) < 0 ? jObst + 1 : (jObst - 1);

			// Mientras no lleguemos al límite del tablero y no nos pasemos de la diagonal.
			// También comprobamos que no hayamos encontrado un obstáculo previamente
			while (j < tablero[i].length && j <= jObst + 1 && !enc) {

				// Si en la posición que estamos consultando hay un obstáculo ponemos enc=true y
				// así salirnos de ambos bucles
				if (tablero[i][j] == '*') {
					// Una vez hemos encontrado un obstáculo no hay que seguir buscando
					enc = true;
				}

				// Sumamos 2 para irnos a la diagonal derecha
				j += 2;
			}

			// Sumamos 2 para irnos a la diagonal hacia abajo
			i += 2;
		}

		// Devolvemos si se ha encontrado obstáculo o no
		return enc;
	}

	public static void generaPosicionJugador() {
		Random rand = new Random();

		do {
			posI = rand.nextInt(0, tablero.length);
			posJ = rand.nextInt(0, tablero[0].length);
		} while (tablero[posI][posJ] != ' ');

	}

	public static void pintaTablero() {
		// bucle para pintar la primera fila que son los números de las columnas
		for (int i = 0; i < tablero[0].length; i++) {
			System.out.print("\t" + (char) (i + 'A'));
		}

		// Salto de línea para empezar a pintar la segunda línea
		System.out.println();

		// Hacemos un recorrido normal de toda la tabla
		// Bucle para recorrer las filas
		for (int i = 0; i < tablero.length; i++) {
			// Por cada fila lo primero que se pinta es el número de fila
			System.out.print(i + 1);

			// Recorremos las columnas de la fila i
			for (int j = 0; j < tablero[i].length; j++) {
				if (posI == i && posJ == j) {
					// Si nos encontramos en la posición del jugador pintamos una J
					System.out.print("\tJ");
				} else if (tablero[i][j] == 'X') {
					// Si en la posición actual se encuentra el tesoro no pintamos nada, sólo el
					// tabulador
					System.out.print("\t");
				} else {
					// En cualquier otro caso pintamos el contenido de la tabla, que puede ser o
					// espacios u obstáculos
					System.out.print("\t" + tablero[i][j]);
				}
			}

			// Al final de cada línea se pinta un salto de línea para volver a comenzar a
			// pintar la fila siguiente
			System.out.println();
		}
	}

	/**
	 * Método encargado del movimiento del jugador, recibirá una cadena que indicará
	 * cómo se debe mover y devolverá un valor entero para representar el resultado
	 * del movimiento
	 * 
	 * @param movimiento Representa al movimiento del jugador. Los valores posibles
	 *                   son ARRIBA, ABAJO, IZQUIERDA, DERECHA. No distingue entre
	 *                   mayúsculas o minúsculas
	 * @return Devuelve un valor entero atendiendo al resultado del movimiento: 0 si
	 *         el movimiento es correcto y el jugador se ha movido; -1 si el
	 *         movimiento es correcto pero el jugador no se ha podido mover por
	 *         encontrarse un obstáculo o el borde del tablero; -2 si el movimiento
	 *         introducido no es válido
	 */
	public static int mueveJugador(String movimiento) {
		int res = -1;

		switch (movimiento.toUpperCase()) {
		case "ARRIBA" -> {
			if (posI - 1 >= 0 && tablero[posI - 1][posJ] != '*') {
				posI--;
				res = 0;
			}
		}
		case "ABAJO" -> {
			if (posI + 1 < tablero.length && tablero[posI + 1][posJ] != '*') {
				posI++;
				res = 0;
			}
		}
		case "DERECHA" -> {
			if (posJ + 1 < tablero[0].length && tablero[posI][posJ + 1] != '*') {
				posJ++;
				res = 0;
			}
		}
		case "IZQUIERDA" -> {
			if (posJ - 1 >= 0 && tablero[posI][posJ - 1] != '*') {
				posJ--;
				res = 0;
			}
		}
		default -> res = -2;
		}

		return res;
	}
}
