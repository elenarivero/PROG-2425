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

	private static boolean obstaculosAlrededor(int iObst, int jObst) {
		boolean res = false;
		int i = (iObst - 1) < 0 ? iObst + 1 : (iObst - 1);
		int j;

		while (i <= iObst + 1 && i < tablero.length && !res) {
			j = (jObst - 1) < 0 ? jObst + 1 : (jObst - 1);
			while (j <= jObst + 1 && j < tablero[i].length && !res) {

				if (tablero[i][j] == '*') {
					res = true;
				}

				j += 2;
			}
			i += 2;
		}
		return res;
	}

	public static void generaPosicionJugador() {
		Random rand = new Random();

		do {
			posI = rand.nextInt(0, tablero.length);
			posJ = rand.nextInt(0, tablero[0].length);
		} while (tablero[posI][posJ] != ' ');

	}
	
	
	public static void pintaTablero() {
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (posI == i && posJ == j) {
					System.out.print("\tJ");
				} else if (tablero[i][j] == 'X') {
					System.out.print("\t");
				} else {
					System.out.print("\t" + tablero[i][j]);
				}
			}
		}
	}

	
}
