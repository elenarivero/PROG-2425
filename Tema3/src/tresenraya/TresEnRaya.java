package tresenraya;

import java.util.Arrays;

public class TresEnRaya {

	static char[][] tablero = { { 'X', 'O', 'X' }, { 'O', 'X', 'O' }, { 'X', 'O', 'O' } };

	/**
	 * Inicializamos el tablero a guión medio (-)
	 */
	public static void inicializaTablero() {
		for (char[] fila : tablero) {
			Arrays.fill(fila, '-');
		}
	}

	public static boolean winner(char jugador) {
		return filasBooleanos(jugador) 
				|| columnasBooleanos(jugador) 
				|| diagonal1Booleanos(jugador)
				|| diagonal2Booleanos(jugador);
	}

	public static boolean filasBooleanos(char jugador) {
		int i = 0;
		boolean res = false;
		boolean auxRes = true;
		int j;

		while (i < tablero.length && !res) {
			j = 0;
			while (j < tablero[i].length && auxRes) {
				if (tablero[i][j] != jugador) {
					auxRes = false;
				}
				j++;
			}
			res = auxRes;
			auxRes = true;
			i++;
		}

		return res;
	}

	public static boolean columnasBooleanos(char jugador) {
		int j = 0;
		int i;

		boolean res = false;
		boolean auxRes = true;

		while (j < tablero[0].length && !res) {
			i = 0;

			while (i < tablero.length && auxRes) {
				if (tablero[i][j] != jugador) {
					auxRes = false;
				}

				i++;
			}

			res = auxRes;
			auxRes = true;
			j++;
		}

		return res;
	}

	public static boolean diagonal1Booleanos(char jugador) {
		int i = 0;
		boolean res = true;

		while (i < tablero.length && res) {
			if (tablero[i][i] != jugador) {
				res = false;
			}
			i++;
		}

		return res;
	}

	public static boolean diagonal2Booleanos(char jugador) {

		boolean res = true;
		int i = 0;

		while (i < tablero.length && res) {
			if (tablero[i][tablero.length - i - 1] != jugador) {
				res = false;
			}
			i++;
		}

		return res;

	}

	/**
	 * Método que comprueba si el jugador ha ganado
	 * 
	 * @param jugador Carácter con el que juega el jugador
	 * @return true si el jugador tiene sus tres fichas iguales por línea, columna o
	 *         en alguna de las diagonales
	 */
	public static boolean winnerCount(char jugador) {
		return comprobarFilas(jugador) || compruebaColumnas(jugador) || diagonalIzquierdaDerecha(jugador)
				|| diagonalDerechaIzquierda(jugador);
	}

	private static boolean comprobarFilas(char jugador) {
		int cont = 0;
		int i = 0;

		// Comprobación por filas
		while (i < tablero.length && cont < 3) {
			cont = 0;
			for (char caracter : tablero[i]) {
				if (caracter == jugador) {
					cont++;
				}
			}
			i++;
		}
		return cont == 3;
	}

	public static boolean compruebaColumnas(char jugador) {
		// Comprobación por columnas
		int j = 0;
		int cont = 0;

		while (j < tablero[0].length && cont < 3) {
			cont = 0;
			for (int i = 0; i < tablero.length; i++) {
				if (tablero[i][j] == jugador) {
					cont++;
				}
			}

			j++;
		}
		return cont == 3;
	}

	public static boolean diagonalIzquierdaDerecha(char jugador) {
		int cont = 0;

		for (int i = 0; i < tablero.length; i++) {
			if (tablero[i][i] == jugador) {
				cont++;
			}
		}

		return cont == 3;
	}

	public static boolean diagonalDerechaIzquierda(char jugador) {
		// comprobación diagonal de derecha a izquierda

		int cont = 0;
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[i][tablero.length - i - 1] == jugador) {
				cont++;
			}
		}

		return cont == 3;
	}

}
