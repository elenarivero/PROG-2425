package criptograma;

import java.util.Random;

public class Criptograma {

	public static char[][] abecedario = { { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
			{ 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q' }, { 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' } };

	public static String fraseReal = "las guerras seguiran mientras el color de la piel siga siendo mas importante que el de los ojos";
	public static String fraseCodificada = "";

	public static void desordenaAbecedario() {
		char aux;
		int filaRandom;
		int colRandom;
		Random rand = new Random();

		for (int i = 0; i < abecedario.length; i++) {
			for (int j = 0; j < abecedario[i].length; j++) {
				filaRandom = rand.nextInt(0, abecedario.length);
				colRandom = rand.nextInt(0, abecedario[i].length);
				aux = abecedario[i][j];
				abecedario[i][j] = abecedario[filaRandom][colRandom];
				abecedario[filaRandom][colRandom] = aux;

			}
		}

	}

	public static void codificaFrase() {
		int fila = 0;
		int col = 0;
		boolean enc = false;
		char caracter;

		for (int i = 0; i < fraseReal.length(); i++) {
			fila = 0;
			caracter = fraseReal.charAt(i);
			enc = false;

			if (caracter == ' ') {
				fraseCodificada += "  ";
			} else {
				// Búsqueda en la tabla abecedario
				while (fila < abecedario.length && !enc) {
					col = 0;

					while (col < abecedario[fila].length && !enc) {
						if (abecedario[fila][col] == caracter) {
							fraseCodificada += fila + "" + col + " ";
							enc = true;
						}
						col++;
					}

					fila++;
				}

			}

		}
	}

}
